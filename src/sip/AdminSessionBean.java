/*
 * AdminSessionBean.java
 *
 * Created on 24 de febrero de 2006, 10:11 PM
 * Copyright César
 */
package sip;

import com.sun.rave.web.ui.appbase.AbstractSessionBean;
import javax.security.auth.Subject;
import javax.security.auth.login.FailedLoginException;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import javax.security.auth.callback.*;
import com.unal.convenio.sip.security.SipCallbackHandler;
import com.unal.convenio.sip.security.UserIdPrincipal;
import com.unal.convenio.sip.admin.service.AdminSvc;
import com.unal.convenio.sip.admin.service.AdminSvcImpl;
import com.unal.convenio.sip.admin.voh.PersonaVo;
import com.unal.convenio.sip.admin.voh.RolVo;
import com.unal.convenio.sip.admin.voh.TablaReferenciaVo;
import com.unal.convenio.sip.admin.voh.UsuarioVo;
import com.unal.convenio.sip.admin.voh.RecursoVo;
import com.unal.convenio.sip.common.service.SipDataProvider;
import com.unal.convenio.sip.security.SecurityFilter;
import javax.faces.FacesException;
import java.util.Iterator;
import java.util.ArrayList;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 * <p>Session scope data bean for your application.  Create properties
 *  here to represent cached data that should be made available across
 *  multiple HTTP requests for an individual user.</p>
 *
 * <p>An instance of this class will be created for you automatically,
 * the first time your application evaluates a value binding expression
 * or method binding expression that references a managed bean using
 * this class.</p>
 */
public class AdminSessionBean extends AbstractSessionBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    // </editor-fold>


    /** 
     * <p>Construir una instancia de bean de datos de la sesión.</p>
     */
    public AdminSessionBean() {
        sipAdminSvc = new AdminSvcImpl();
    }

    /** 
     * <p>Devolver una referencia al bean de datos con ámbito.</p>
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1)getBean("ApplicationBean1");
    }
    
    /** 
     * <p>Se llama a este método al agregar este bean al
     * ámbito de la sesión.  Normalmente, esto ocurre como resultado de la evaluación
     * de una expresión de enlace de valores o de métodos, que utiliza la
     * función de bean administrado para crear una instancia de este bean y almacenarla en el
     * ámbito de la sesión.</p>
     * 
     * <p>Puede personalizar este método para inicializar y almacenar en caché los valores
     * o recursos necesarios para el ciclo de duración de una
     * sesión de usuario en particular.</p>
     */
    public void init() {
        // Efectúe las inicializaciones heredadas de nuestra superclase
        super.init();
        // Efectúe la inicialización de aplicación que debe completarse
        // *antes* de inicializar los componentes gestionados
        // TODO - agregue aquí su propio código de inicialización

        // <editor-fold defaultstate="collapsed" desc="Inicio de componente administrado por el programa">
        // Inicialice los componentes gestionados automáticamente
        // *Nota* - esta lógica *NO* debe modificarse
        try {
            _init();
        } catch (Exception e) {
            log("AdminSessionBean Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Efectúe la inicialización de aplicación que debe completarse
        // *después* de inicializar los componentes gestionados
        // TODO - agregue aquí su propio código de inicialización
        //get the login configuration and set the loginConfig property for the session:
        loginConfig = com.sun.security.auth.login.ConfigFile.getConfiguration().getAppConfigurationEntry(login_config)[0].getLoginModuleName();
        if (loginConfig == null) {
           error("Error: Login Configuration Not Found!\nPlease check to make sure you have configured you environment properly");
           log("Error: Login Configuration Not Found!\nPlease check to make sure you have configured you environment properly");
        }
    }

    /** 
     * <p>Se llama a este método cuando la sesión que lo contiene está apunto de
     * configurarse en modo pasivo.  Normalmente, esto ocurre en un contenedor de servlet distribuido
     * cuando la sesión está apunto de transferirse a otra
     * instancia de contenedor, después de la cual se llamará al método <code>activate()</code>
     * para indicar que la transferencia se ha completado.</p>
     * 
     * <p>Puede personalizar este método para liberar las referencias a datos
     * o recursos de sesión que no pueden serializarse con la propia sesión.</p>
     */
    public void passivate() {
    }

    /** 
     * <p>Se llama a este método cuando la sesión que lo contiene se
     * reactiva.</p>
     * 
     * <p>Puede personalizar este método para volver a adquirir las referencias a
     * datos o recursos de la sesión que no pudieron serializarse con la
     * propia sesión.</p>
     */
    public void activate() {
    }

    /** 
     * <p>Se llama a este método al eliminar este bean del
     * ámbito de la sesión.  Normalmente, esto ocurre como resultado del
     * se supera el tiempo de espera de la sesión o la aplicación la finaliza.</p>
     * 
     * <p>Puede personalizar este método para limpiar los recursos asignados
     * durante la ejecución del método <code>init()</code> o
     * más adelante durante el ciclo de vida de la aplicación.</p>
     */
    public void destroy() {
        tablaReferenciasDataProvider.clearObjectList();
    }
    
    /***************************************************************************************
     *
     *
     * Properties
     *
     *
     **************************************************************************************/
    
    private PersonaVo personaEnEdicion = new PersonaVo();

    public PersonaVo getPersonaEnEdicion() {
        return personaEnEdicion;
    }   

    public void setPersonaEnEdicion(PersonaVo persona) {
        this.personaEnEdicion = persona;
    }   
    
    private TablaReferenciaVo referenciaEnEdicion = new TablaReferenciaVo();

    public TablaReferenciaVo getReferenciaEnEdicion() {
        return referenciaEnEdicion;
    }   

    public void setReferenciaEnEdicion(TablaReferenciaVo referencia) {
        this.referenciaEnEdicion = referencia;
    }   

    private RolVo rolEnEdicion = new RolVo();

    public RolVo getRolEnEdicion() {
        return rolEnEdicion;
    }   

    public void setRolEnEdicion(RolVo rol) {
        this.rolEnEdicion = rol;
    }   

    private RecursoVo recursoEnEdicion = new RecursoVo();

    public RecursoVo getRecursoEnEdicion() {

        return this.recursoEnEdicion;
    }

    public void setRecursoEnEdicion(RecursoVo recurso) {

        this.recursoEnEdicion = recurso;
    }

    private UsuarioVo usuarioEnEdicion = new UsuarioVo();

    public UsuarioVo getUsuarioEnEdicion() {

        return this.usuarioEnEdicion;
    }

    public void setUsuarioEnEdicion(UsuarioVo usuario) {

        this.usuarioEnEdicion = usuario;
    }  
    
    /***************************************************************************************
     *
     *
     * Data providers
     *
     *
     **************************************************************************************/
    
    private SipDataProvider tablaReferenciasDataProvider = new SipDataProvider();

    public SipDataProvider getTablaReferenciasDataProvider() {
        return tablaReferenciasDataProvider;
    }

    private SipDataProvider tablaPersonaDataProvider = new SipDataProvider();

    public SipDataProvider getTablaPersonaDataProvider() {
        return tablaPersonaDataProvider;
    }

    private SipDataProvider tablaRolDataProvider = new SipDataProvider();

    public SipDataProvider getTablaRolDataProvider() {
        return tablaRolDataProvider;
    }

    private SipDataProvider tablaRecursoDataProvider = new SipDataProvider();

    public SipDataProvider getTablaRecursoDataProvider() {
        return tablaRecursoDataProvider;
    }

    private SipDataProvider tablaUsuarioDataProvider = new SipDataProvider();

    public SipDataProvider getTablaUsuarioDataProvider() {
        return tablaUsuarioDataProvider;
    } 

    private SipDataProvider tablaPerfilesDataProvider = new SipDataProvider();

    public SipDataProvider getTablaPerfilesDataProvider() {
        return tablaPerfilesDataProvider;
    } 

    public void setTablaPerfilesDataProvider(SipDataProvider dp) {
        tablaPerfilesDataProvider = dp;
    } 

    private SipDataProvider tablaPermisosDataProvider = new SipDataProvider();

    public SipDataProvider getTablaPermisosDataProvider() {
        return tablaPermisosDataProvider;
    } 

    private ArrayList listaRecursoItems = new ArrayList();

    public ArrayList getListaRecursoItems() {
        return listaRecursoItems;
    } 

    private SipDataProvider tablaFiltroPersonaProvider = new SipDataProvider();

    public SipDataProvider getTablaFiltroPersonaProvider() {
        return tablaFiltroPersonaProvider;
    } 
    
    /***************************************************************************************
     *
     *
     * Servicio
     *
     *
     **************************************************************************************/
    
    private AdminSvc sipAdminSvc; 
    
    public AdminSvc getAdminSvc(){
        return sipAdminSvc;
    }
    
    /***************************************************************************************
     *
     *
     * Seguridad
     *
     *
     **************************************************************************************/
    private static String login_config = "sipAuth";
    private transient LoginContext context = null;
    private UsuarioVo usuarioLogged = null;      
    
    public boolean initLoginContext(String username, String password){
        try{
            //Create a new instace of the callback handler to be passed to the context
            CallbackHandler cbh = new SipCallbackHandler(username, password);
            context = new LoginContext(login_config, cbh);
            log("SessionBean1::Login context created successfully");
            return true;            
        }catch(LoginException le){
            error("LoginException: "+ le.getMessage());
            return false;
                
        }catch(Exception e){
            error("Error Creating LoginContext, \n Please make sure your application has been configured properly.");
            log("SessionBean1::Exception Occured:" + e.getMessage());
            return false;

        }
        
    }
    /**
     * Call the login method on the Jaas Login Module
     *
     */
    
    public boolean login(){
        try{
            context.login();
            //load the user profile and save it in a User object and keep this object in the session
            usuarioLogged = loadUserProfile();
            return true;
         }catch(FailedLoginException fle){
            error( fle.getMessage());
            return false;
         }catch (LoginException le){
            error( le.getMessage());
            return false;
         }catch(Exception e){
            log("SessionBean1::Exception occured while logging in" + e.getMessage());
            error("Error Loggin In");
            return false;
        }
   }
    
    /**
     * Call the logout method on the Jaas Login Module
     * Set the username and currentRowkey to null for clean up purposes
     *
     */
    
    public boolean logout(){
        try{
            usuarioLogged = null;
            FacesContext facesContext = FacesContext.getCurrentInstance();
            HttpSession session = (HttpSession)facesContext.getExternalContext().getSession(false);
            context.logout();             
            session.invalidate();
        }catch(Exception e){
            log("SessionBean1::Exception occured while logging out" + e.getMessage());
            error("Error Loggin out");
            return false;
        }
        return true;
    }
    
    
    public UsuarioVo loadUserProfile(){
        Subject subject = null;
        UsuarioVo resultado = null;
        String strIdUsuario = null;
        try{
            subject = context.getSubject();
            if( subject != null ){
                 Iterator it = subject.getPrincipals().iterator();
                 if( it.hasNext()){
                     strIdUsuario = ((UserIdPrincipal)it.next()).getName();                     
                 }
                 if( strIdUsuario != null){
                     AdminSvc svc = new AdminSvcImpl();
                     Integer iIdUsuario = Integer.valueOf(strIdUsuario);
                     resultado = svc.getUsuario(iIdUsuario);
                 }
            }    
        }catch(Exception e){
            error(e.getMessage());
            log("SessionBean: "+ e.getMessage());
            e.printStackTrace();
        }
        return resultado;
    }
    
    public UsuarioVo getUsuarioLogged(){
       return this.usuarioLogged;
    }
    
    /**
     * Holds value of property loginConfig.
     */
    private String loginConfig;

    /**
     * Getter for property loginConfig.
     * @return Value of property loginConfig.
     */
    public String getLoginConfig() {
    
        return this.loginConfig;
    }

    /**
     * Setter for property loginConfig.
     * @param loginConfig New value of property loginConfig.
     */
    public void setLoginConfig(String loginConfig) {

        this.loginConfig = loginConfig;
    }  

    /**
     * Conserva el valor de la propiedad logSvc.
     */
    private com.unal.convenio.sip.common.service.LogSvc logSvc = new com.unal.convenio.sip.common.service.LogSvcImpl();

    /**
     * Getter para propiedad logSvc.
     * @return Valor de la propiedad logSvc.
     */
    public com.unal.convenio.sip.common.service.LogSvc getLogSvc() {

        return this.logSvc;
    }

    /**
     * Setter para propiedad logSvc.
     * @param logSvc Nuevo valor de la propiedad logSvc.
     */
    public void setLogSvc(com.unal.convenio.sip.common.service.LogSvc logSvc) {

        this.logSvc = logSvc;
    }
    
    /**
     * Conserva el valor de la propiedad logList.
     */
    private java.util.List logList;

    /**
     * Getter para propiedad logList.
     * @return Valor de la propiedad logList.
     */
    public java.util.List getLogList() {

        return this.logList;
    }

    /**
     * Setter para propiedad logList.
     * @param logList Nuevo valor de la propiedad logList.
     */
    public void setLogList(java.util.List logList) {

        this.logList = logList;
    }
     /**
     * Conserva el valor de la propiedad maxRows.
     */
    private int maxRows=20;

    /**
     * Getter para propiedad maxRows.
     * @return Valor de la propiedad maxRows.
     */
    public int getMaxRows() {

        return this.maxRows;
    }

    /**
     * Setter para propiedad maxRows.
     * @param maxRows Nuevo valor de la propiedad maxRows.
     */
    public void setMaxRows(int maxRows) {

        this.maxRows = maxRows;
    }
}
