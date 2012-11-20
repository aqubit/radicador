
package com.unal.convenio.sip.security;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.digester.Digester;
import org.apache.commons.digester.RuleSetBase;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class SecurityFilter implements Filter{
    protected FilterConfig _config;
    private ServletContext _context;
    private String _loginPage;
    private String _httpPort;
    private String _httpsPort;
    private String _serverName;
    private Digester _digester;
    private SecurityConfig _securityConfig;
    
    /** Creates a new instance of SecurityFilter */
    private final static String FILTER_APPLIED = "_security_filter_applied";
    
    public SecurityFilter() {
        _digester = new Digester();
        _digester.setValidating(false);
        _digester.addRuleSet(new SecurityRuleSet());
    }
    
    
    public void init(FilterConfig config)throws ServletException {
        _config = config;
        _context = config.getServletContext();
        String configFile = config.getInitParameter("configFile");
        URL url = Thread.currentThread().getContextClassLoader().getResource(configFile);
        try{
            _securityConfig = (SecurityConfig)_digester.parse(url.openStream());
        }catch(Exception ex){
            throw new ServletException(ex);
        }
        _loginPage = _securityConfig.getLoginPage();
        _httpPort = _securityConfig.getHttpPort();
        _httpsPort = _securityConfig.getHttpsPort();

    }
    
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws java.io.IOException, ServletException{
        
        HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse res = (HttpServletResponse)response;
        HttpSession session = req.getSession();
        String requestedPage = req.getRequestURL().toString();
        URL pageURL = new URL(requestedPage);
        
        boolean bAutenticado = isUserAuthenticated(session);
        boolean bIsSecure = req.isSecure();
        boolean bIsLoginPage = requestedPage.endsWith(_loginPage) && bIsSecure;
        boolean bRequiresSSL = requiresSSL(requestedPage);
        _serverName = request.getServerName();

        if( bAutenticado && bRequiresSSL && !bIsSecure){
            res.sendRedirect(switchToHttps(pageURL.getPath()));
            return;
        }else if( bAutenticado && !bRequiresSSL && bIsSecure){
            res.sendRedirect(switchToHttp(pageURL.getPath()));
            return;
        }else if( !bAutenticado && !bIsLoginPage && ( request.getAttribute(FILTER_APPLIED) == null ) ){
            request.setAttribute(FILTER_APPLIED, Boolean.TRUE);
            res.sendRedirect(switchToHttps(_loginPage));
            return;
        }
        //deliver request to next filter
        chain.doFilter(request, response);        
    }
    
    public void destroy(){
    }

    /**************************************************************************
     * Helpers
     *
     **************************************************************************/
    
    private boolean requiresSSL(String requestedPage){
        boolean bRequires = false;
        List protegidas = _securityConfig.getPaginas();
        Iterator it = protegidas.iterator();
        while( it.hasNext() && !bRequires ){
            Pagina page = (Pagina)it.next();
            bRequires = requestedPage.endsWith(page.getUri());
        }
        return bRequires;
    }
    
    private boolean isUserAuthenticated(HttpSession session){
        boolean bAutenticated = false;
        sip.AdminSessionBean adminBean = (sip.AdminSessionBean)session.getAttribute("AdminSessionBean");
        if( adminBean != null && adminBean.getUsuarioLogged() != null){
            bAutenticated = true;
        }
        return bAutenticated;
    }

    private String switchToHttp(String pageURI) {
      //redirect to http URL
      String port = _httpPort.equalsIgnoreCase("80") ? "" : ":" + _httpPort;
      String url = "http://" + _serverName + port + pageURI;
      return url;          
    }

    private String switchToHttps(String pageURI) {
      String port = _httpsPort.equalsIgnoreCase("443") ? "" : ":" + _httpsPort;
      String url = "https://" + _serverName + port + pageURI;
      return url;
    }    
    
    /**************************************************************************
     * Configuración de digester para cargar la configuración del xml
     *
     **************************************************************************/

    class SecurityRuleSet extends RuleSetBase {
        public void addRuleInstances(Digester d) {
          d.addObjectCreate("config", SecurityConfig.class);
          d.addSetProperties( "config", "loginPage", "loginPage" );
          d.addSetProperties( "config", "httpPort", "httpPort" );
          d.addSetProperties( "config", "httpsPort", "httpsPort" );
          d.addObjectCreate("config/pagina", Pagina.class);
          d.addSetProperties( "config/pagina", "uri", "uri" );
          d.addSetNext("config/pagina", "addPagina");
        }
    }
}