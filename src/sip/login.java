package sip;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.PasswordField;
import com.sun.rave.web.ui.component.Button;
import javax.faces.component.html.HtmlPanelGrid;
import com.sun.rave.web.ui.component.MessageGroup;
import com.sun.rave.web.ui.component.HiddenField;
import com.sun.rave.web.ui.component.PanelLayout;
import javax.servlet.ServletContext;
import com.sun.rave.web.ui.component.ImageComponent;
import com.sun.rave.web.ui.component.TabSet;
import com.sun.rave.web.ui.component.Tab;
import com.sun.rave.web.ui.component.Hyperlink;
import com.sun.rave.web.ui.component.StaticText;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class login extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
    private int __placeholder;
    private Page page1 = new Page();
    public Page getPage1() {
        return page1;
    }
    public void setPage1(Page p) {
        this.page1 = p;
    }
    private Html html1 = new Html();
    public Html getHtml1() {
        return html1;
    }
    public void setHtml1(Html h) {
        this.html1 = h;
    }
    private Head head1 = new Head();
    public Head getHead1() {
        return head1;
    }
    public void setHead1(Head h) {
        this.head1 = h;
    }
    private Link link1 = new Link();
    public Link getLink1() {
        return link1;
    }
    public void setLink1(Link l) {
        this.link1 = l;
    }
    private Body body1 = new Body();
    public Body getBody1() {
        return body1;
    }
    public void setBody1(Body b) {
        this.body1 = b;
    }
    private Form form1 = new Form();
    public Form getForm1() {
        return form1;
    }
    public void setForm1(Form f) {
        this.form1 = f;
    }
    private MessageGroup messageGroup1 = new MessageGroup();
    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }
    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    private HtmlPanelGrid pnlPrincipal = new HtmlPanelGrid();
    public HtmlPanelGrid getPnlPrincipal() {
        return pnlPrincipal;
    }
    public void setPnlPrincipal(HtmlPanelGrid hpg) {
        this.pnlPrincipal = hpg;
    }
    private PanelLayout layoutPanel2 = new PanelLayout();
    public PanelLayout getLayoutPanel2() {
        return layoutPanel2;
    }
    public void setLayoutPanel2(PanelLayout pl) {
        this.layoutPanel2 = pl;
    }
    private Button btnLogin1 = new Button();
    public Button getBtnLogin1() {
        return btnLogin1;
    }
    public void setBtnLogin1(Button b) {
        this.btnLogin1 = b;
    }
    private HtmlPanelGrid gridPanel3 = new HtmlPanelGrid();
    public HtmlPanelGrid getGridPanel3() {
        return gridPanel3;
    }
    public void setGridPanel3(HtmlPanelGrid hpg) {
        this.gridPanel3 = hpg;
    }
    private Label label1 = new Label();
    public Label getLabel1() {
        return label1;
    }
    public void setLabel1(Label l) {
        this.label1 = l;
    }
    private TextField txtfldUsuario = new TextField();
    public TextField getTxtfldUsuario() {
        return txtfldUsuario;
    }
    public void setTxtfldUsuario(TextField tf) {
        this.txtfldUsuario = tf;
    }
    private Label label2 = new Label();
    public Label getLabel2() {
        return label2;
    }
    public void setLabel2(Label l) {
        this.label2 = l;
    }
    private PasswordField txtfldContrasena = new PasswordField();
    public PasswordField getTxtfldContrasena() {
        return txtfldContrasena;
    }
    public void setTxtfldContrasena(PasswordField pf) {
        this.txtfldContrasena = pf;
    }
    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public login() {
        // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Initialization">
        try {
        } catch (Exception e) {
            log("Login Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // TODO: Add your own initialization code here (optional)
    }
    /** 
     * <p>Devolver una referencia al bean de datos con ámbito.</p>
     */
    protected UserInfoSessionBean getUserInfoSessionBean() {
        return (UserInfoSessionBean)getBean("UserInfoSessionBean");
    }
    /** 
     * <p>Devolver una referencia al bean de datos con ámbito.</p>
     */
    protected CorrespondenciaSessionBean getCorrespondenciaSessionBean() {
        return (CorrespondenciaSessionBean)getBean("CorrespondenciaSessionBean");
    }
    /** 
     * <p>Devolver una referencia al bean de datos con ámbito.</p>
     */
    protected AdminSessionBean getAdminSessionBean() {
        return (AdminSessionBean)getBean("AdminSessionBean");
    }
    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1)getBean("ApplicationBean1");
    }
    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     *
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("Login Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }
    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    public void preprocess() {
    }
    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    public void prerender() {
        this.txtfldContrasena.setValue(null);
    }
    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    public void destroy() {
    }
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    public String login_btn_action() {
        String strUsuario = (String)txtfldUsuario.getValue();
        String strContrasena= (String)txtfldContrasena.getValue();
        log("Login.java:: Logging in user "+ strUsuario);
        try {
            //initiate the login context from the SessionBean which returns a boolean
            boolean context_created = getAdminSessionBean().initLoginContext(strUsuario,strContrasena);
            if(context_created){
                //call the login method for the Jaas Login Module configured
                boolean login_success = getAdminSessionBean().login();
                //Login Failed
                if(!login_success){
                    return null;
                }
            }else{
                log("Login.java::Error Creating login context.");
                return null;
            }
        } catch (Exception e) {
            log("Login.java::Exception occured "+ e.getMessage());
            error("Exception while logging in");
            return null;
        }
        return "go.main";
    }


    public String tabAdmin_action() {
        // TODO: Reemplazar con código del usuario
        
        return null;
    }


    public String hyplnkPersonas_action() {
        // TODO: Reemplazar con código del usuario
        
        return null;
    }


    public String hyplnkPerfiles_action() {
        // TODO: Reemplazar con código del usuario
        
        return null;
    }


    public String hyplnkPermisos_action() {
        // TODO: Reemplazar con código del usuario
        
        return null;
    }


    public String hyplnkRecursos_action() {
        // TODO: Reemplazar con código del usuario
        
        return null;
    }


    public String hyplnkRoles_action() {
        // TODO: Reemplazar con código del usuario
        
        return null;
    }


    public String hyplnkTablas_action() {
        // TODO: Reemplazar con código del usuario
        
        return null;
    }


    public String hyplnkUsuarios_action() {
        // TODO: Reemplazar con código del usuario
        
        return null;
    }


    public String tabCorrespondencia_action() {
        // TODO: Reemplazar con código del usuario
        
        return null;
    }


    public String hyplnkConsultar_action() {
        // TODO: Reemplazar con código del usuario
        
        return null;
    }


    public String hyplnkRegistrar_action() {
        // TODO: Reemplazar con código del usuario
        
        return null;
    }
}
