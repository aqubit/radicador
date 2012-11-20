/*
 * usuarios.java
 *
 * Created on 1 de marzo de 2006, 05:05 PM
 * Copyright César
 */
package sip.modulos.admin;
import com.sun.data.provider.RowKey;
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
import javax.faces.component.html.HtmlPanelGrid;
import com.sun.rave.web.ui.component.PanelLayout;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Table;
import com.sun.rave.web.ui.component.TableRowGroup;
import com.sun.rave.web.ui.component.TableColumn;
import com.sun.rave.web.ui.component.RadioButton;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.PasswordField;
import com.sun.rave.web.ui.event.TableSelectPhaseListener;
import com.unal.convenio.sip.admin.voh.UsuarioVo;
import com.unal.convenio.sip.common.service.SipDataProvider;
import javax.faces.convert.IntegerConverter;
import com.sun.rave.web.ui.component.MessageGroup;
import com.unal.convenio.sip.admin.service.AdminSvc;
import com.unal.util.*;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.component.UISelectItems;
import java.util.ResourceBundle;
import java.util.ArrayList;
import com.sun.rave.web.ui.component.Checkbox;
import javax.faces.convert.BooleanConverter;
import com.unal.convenio.sip.security.ToolBoxCripto;
import com.sun.rave.web.ui.component.ImageHyperlink;
/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class usuarios extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
    private int __placeholder;
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        tblElementos.setInternalVirtualForm(true);
    }
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
    private TextField txtfldUsuario = new TextField();
    public TextField getTxtfldUsuario() {
        return txtfldUsuario;
    }
    public void setTxtfldUsuario(TextField tf) {
        this.txtfldUsuario = tf;
    }
    private Label label1 = new Label();
    public Label getLabel1() {
        return label1;
    }
    public void setLabel1(Label l) {
        this.label1 = l;
    }
    private Label label2 = new Label();
    public Label getLabel2() {
        return label2;
    }
    public void setLabel2(Label l) {
        this.label2 = l;
    }
    private HtmlPanelGrid pnlPrincipal = new HtmlPanelGrid();
    public HtmlPanelGrid getPnlPrincipal() {
        return pnlPrincipal;
    }
    public void setPnlPrincipal(HtmlPanelGrid hpg) {
        this.pnlPrincipal = hpg;
    }
    private PanelLayout pnlBotones = new PanelLayout();
    public PanelLayout getPnlBotones() {
        return pnlBotones;
    }
    public void setPnlBotones(PanelLayout pl) {
        this.pnlBotones = pl;
    }
    private Button btnEditar = new Button();
    public Button getBtnEditar() {
        return btnEditar;
    }
    public void setBtnEditar(Button b) {
        this.btnEditar = b;
    }
    private Button btnAgregar = new Button();
    public Button getBtnAgregar() {
        return btnAgregar;
    }
    public void setBtnAgregar(Button b) {
        this.btnAgregar = b;
    }
    private Button btnBorrar = new Button();
    public Button getBtnBorrar() {
        return btnBorrar;
    }
    public void setBtnBorrar(Button b) {
        this.btnBorrar = b;
    }
    private Table tblElementos = new Table();
    public Table getTblElementos() {
        return tblElementos;
    }
    public void setTblElementos(Table t) {
        this.tblElementos = t;
    }
    private TableRowGroup tableRowGroup1 = new TableRowGroup();
    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }
    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }
    private TableColumn tableColumn1 = new TableColumn();
    public TableColumn getTableColumn1() {
        return tableColumn1;
    }
    public void setTableColumn1(TableColumn tc) {
        this.tableColumn1 = tc;
    }
    private RadioButton radioButton1 = new RadioButton();
    public RadioButton getRadioButton1() {
        return radioButton1;
    }
    public void setRadioButton1(RadioButton rb) {
        this.radioButton1 = rb;
    }
    private TableColumn tableColumn2 = new TableColumn();
    public TableColumn getTableColumn2() {
        return tableColumn2;
    }
    public void setTableColumn2(TableColumn tc) {
        this.tableColumn2 = tc;
    }
    private StaticText staticText1 = new StaticText();
    public StaticText getStaticText1() {
        return staticText1;
    }
    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
    }
    private TableColumn tableColumn3 = new TableColumn();
    public TableColumn getTableColumn3() {
        return tableColumn3;
    }
    public void setTableColumn3(TableColumn tc) {
        this.tableColumn3 = tc;
    }
    private StaticText staticText2 = new StaticText();
    public StaticText getStaticText2() {
        return staticText2;
    }
    public void setStaticText2(StaticText st) {
        this.staticText2 = st;
    }
    private Label label3 = new Label();
    public Label getLabel3() {
        return label3;
    }
    public void setLabel3(Label l) {
        this.label3 = l;
    }
    private IntegerConverter integerDDConverter = new IntegerConverter();
    public IntegerConverter getIntegerDDConverter() {
        return integerDDConverter;
    }
    // </editor-fold>
    private MessageGroup messageGroup1 = new MessageGroup();
    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }
    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    private HtmlSelectOneMenu ddPersona = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdPersona() {
        return ddPersona;
    }
    public void setDdPersona(HtmlSelectOneMenu hsom) {
        this.ddPersona = hsom;
    }
    private ArrayList ddPersonaItems = new ArrayList();
    public ArrayList getDdPersonaItems() {
        return ddPersonaItems;
    }
    public void setDdPersonaItems(ArrayList dsia) {
        this.ddPersonaItems = dsia;
    }
    private UISelectItems dropdown1SelectItems = new UISelectItems();
    public UISelectItems getDropdown1SelectItems() {
        return dropdown1SelectItems;
    }
    public void setDropdown1SelectItems(UISelectItems uisi) {
        this.dropdown1SelectItems = uisi;
    }
    private Checkbox chbxDisabled = new Checkbox();
    public Checkbox getChbxDisabled() {
        return chbxDisabled;
    }
    public void setChbxDisabled(Checkbox c) {
        this.chbxDisabled = c;
    }
    private BooleanConverter booleanConverter1 = new BooleanConverter();
    public BooleanConverter getBooleanConverter1() {
        return booleanConverter1;
    }
    public void setBooleanConverter1(BooleanConverter bc) {
        this.booleanConverter1 = bc;
    }
    private TableColumn tableColumn4 = new TableColumn();
    public TableColumn getTableColumn4() {
        return tableColumn4;
    }
    public void setTableColumn4(TableColumn tc) {
        this.tableColumn4 = tc;
    }
    private Checkbox checkbox1 = new Checkbox();
    public Checkbox getCheckbox1() {
        return checkbox1;
    }
    public void setCheckbox1(Checkbox c) {
        this.checkbox1 = c;
    }
    private HtmlPanelGrid pnlControles = new HtmlPanelGrid();
    public HtmlPanelGrid getPnlControles() {
        return pnlControles;
    }
    public void setPnlControles(HtmlPanelGrid hpg) {
        this.pnlControles = hpg;
    }
    private PanelLayout layoutPanel2 = new PanelLayout();
    public PanelLayout getLayoutPanel2() {
        return layoutPanel2;
    }
    public void setLayoutPanel2(PanelLayout pl) {
        this.layoutPanel2 = pl;
    }
    private Label label4 = new Label();
    public Label getLabel4() {
        return label4;
    }
    public void setLabel4(Label l) {
        this.label4 = l;
    }
    private Button btnNuevo = new Button();
    public Button getBtnNuevo() {
        return btnNuevo;
    }
    public void setBtnNuevo(Button b) {
        this.btnNuevo = b;
    }
    private PasswordField txtfldContrasena2 = new PasswordField();
    public PasswordField getTxtfldContrasena2() {
        return txtfldContrasena2;
    }
    public void setTxtfldContrasena2(PasswordField pf) {
        this.txtfldContrasena2 = pf;
    }
    private Label label5 = new Label();
    public Label getLabel5() {
        return label5;
    }
    public void setLabel5(Label l) {
        this.label5 = l;
    }
    private PasswordField txtfldContrasena = new PasswordField();
    public PasswordField getTxtfldContrasena() {
        return txtfldContrasena;
    }
    public void setTxtfldContrasena(PasswordField pf) {
        this.txtfldContrasena = pf;
    }
    private ImageHyperlink imageHyperlink1 = new ImageHyperlink();
    public ImageHyperlink getImageHyperlink1() {
        return imageHyperlink1;
    }
    public void setImageHyperlink1(ImageHyperlink ih) {
        this.imageHyperlink1 = ih;
    }
    /**
     * <p>Construir una instancia de bean de página.</p>
     */
    public usuarios() {
    }
    /**
     * <p>Devolver una referencia al bean de datos con ámbito.</p>
     */
    protected sip.UserInfoSessionBean getUserInfoSessionBean() {
        return (sip.UserInfoSessionBean)getBean("UserInfoSessionBean");
    }
    /**
     * <p>Devolver una referencia al bean de datos con ámbito.</p>
     */
    protected sip.CorrespondenciaSessionBean getCorrespondenciaSessionBean() {
        return (sip.CorrespondenciaSessionBean)getBean("CorrespondenciaSessionBean");
    }
    /**
     * <p>Devolver una referencia al bean de datos con ámbito.</p>
     */
    protected sip.ApplicationBean1 getApplicationBean1() {
        return (sip.ApplicationBean1)getBean("ApplicationBean1");
    }
    /**
     * <p>Devolver una referencia al bean de datos con ámbito.</p>
     */
    protected sip.AdminSessionBean getAdminSessionBean() {
        return (sip.AdminSessionBean)getBean("AdminSessionBean");
    }
    /**
     * <p>Método de devolución de llamada al que se llama cuando se navega hasta esta página,
     * ya sea directamente mediante un URL o de manera indirecta a través de la navegación de páginas.
     * Puede personalizar este método para adquirir recursos que se necesitarán
     * para los controladores de eventos y métodos del proceso, sin tener en cuenta si esta
     * página realiza procesamiento de devolución de envíos.</p>
     *
     * <p>Tenga en cuenta que si la petición actual es una devolución de envío, los valores
     * de propiedad de los componentes <strong>no</strong> representan ningún
     * valor enviado con esta petición.  En su lugar, representan los
     * valores de propiedades que se guardaron para esta vista cuando se procesó.</p>
     */
    private ResourceBundle guiMessages;
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
            log("usuarios Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Efectúe la inicialización de aplicación que debe completarse
        // *después* de inicializar los componentes gestionados
        // TODO - agregue aquí su propio código de inicialización
        //Mensajes del sistema
        AdminSvc svc = getAdminSessionBean().getAdminSvc();
        guiMessages = getApplicationBean1().getGuiMessages();
        tablaUsuarioDataProvider = getAdminSessionBean().getTablaUsuarioDataProvider();
        usuario = getAdminSessionBean().getUsuarioEnEdicion();
        ToolBox.poblarDropDown(ddPersonaItems, svc.getPersonas());
    }
    /**
     * <p>Método de devolución de llamada al que se llama cuando el árbol de componentes se ha
     * restaurado, pero antes de que se produzca el procesamiento de cualquier evento.  Este método
     * <strong>sólo</strong> se llamará en una petición de devolución de envío que
     * esté procesando el envío de un formulario.  Puede personalizar este método para asignar
     * recursos necesarios para los controladores de eventos.</p>
     */
    public void preprocess() {
    }
    /**
     * <p>Método de devolución de llamada al que se llama justo antes del procesamiento.
     * <strong>Sólo</strong> se llamará a este método en la página que
     * se procesa, no se llamará, por ejemplo, en una página que
     * ha procesado una devolución de envío y a continuación ha navegado hasta otra página.  Puede personalizar
     * este método para asignar recursos necesarios para procesar
     * esta página.</p>
     */
    public void prerender() {
       //Poblar los componentes con datos
        AdminSvc svc = getAdminSessionBean().getAdminSvc();
        UsuarioVo usuarioLogged = getAdminSessionBean().getUsuarioLogged();
        tablaUsuarioDataProvider.setList( svc.getUsuarios(usuarioLogged) );
        txtfldContrasena.setValue(null);
        txtfldContrasena2.setValue(null);
    }
    /**
     * <p>Método de devolución de llamada al que se llama cuando se completa el procesamiento de
     * esta petición, si se llamó al método <code>init()</code> (sin tener en cuenta
     * si se trata de la página que se ha procesado o no).  Puede personalizar este
     * método para liberar los recursos adquiridos en los métodos <code>init()</code>,
     * <code>preprocess()</code> o <code>prerender()</code> (o
     * durante la ejecución de un controlador de eventos).</p>
     */
    public void destroy() {
    }
    /*
     *  Como seleccionar una sola línea en la tabla y mantener su valor
     *
     *
     */
    private TableSelectPhaseListener tablePhaseListener = new TableSelectPhaseListener();
    public void setSelected(Object object) {
        RowKey rowKey = (RowKey)getValue("#{currentRow.tableRow}");
        if (rowKey != null) {
            tablePhaseListener.setSelected(rowKey, object);
        }
    }
    public Object getSelected(){
        RowKey rowKey = (RowKey)getValue("#{currentRow.tableRow}");
        return tablePhaseListener.getSelected(rowKey);
    }
    public Object getSelectedValue() {
        RowKey rowKey = (RowKey)getValue("#{currentRow.tableRow}");
        return (rowKey != null) ? rowKey.getRowId() : null;
    }
    public boolean getSelectedState() {
        RowKey rowKey = (RowKey)getValue("#{currentRow.tableRow}");
        return tablePhaseListener.isSelected(rowKey);
    }
    /*
     *  Properties
     *
     *
     */
    private UsuarioVo usuario;
    public UsuarioVo getUsuario() {
        return this.usuario;
    }
    public void setUsuario(UsuarioVo usuario) {
        this.usuario = usuario;
        getAdminSessionBean().setUsuarioEnEdicion(usuario);
    }
    private SipDataProvider tablaUsuarioDataProvider;
    public SipDataProvider getTablaUsuarioDataProvider() {
        return tablaUsuarioDataProvider;
    }
    /*
     *  ActionListeners
     *
     *
     */
    public String btnEditar_action() {
        int selectedRows = getTableRowGroup1().getSelectedRowsCount();
        RowKey[] selectedRowKeys = getTableRowGroup1().getSelectedRowKeys();
        if( selectedRowKeys.length > 0 ){
            UsuarioVo tmp = (UsuarioVo)tablaUsuarioDataProvider.getObject(selectedRowKeys[0]);
            setUsuario(tmp);
            ddPersona.setValue( usuario.getPersona().getId_persona() );
            form1.discardSubmittedValues("agregar");
        }
        return null;
    }
    public String btnAgregar_action() {
       boolean bError = false;
       AdminSvc svc = getAdminSessionBean().getAdminSvc();
       Integer idPersona = (Integer)ddPersona.getValue();
       Integer idUsuario = usuario.getId_usuario();
       String strContrasena1 = (String)txtfldContrasena.getText();
       String strContrasena2 = (String)txtfldContrasena2.getText();
       if( !strContrasena1.equals(strContrasena2)){
           error(guiMessages.getString("errorContrasenaNoCoincide"));
           return null;
       }
       if( strContrasena1.length() < svc.getLongitudMinimaContrasena() ){
           error(guiMessages.getString("errorContrasenaNoValida"));
           return null;
       }
       String passwdEncrypted = ToolBoxCripto.encrypt(strContrasena1 );
       usuario.setPersona(svc.getPersona(idPersona));
       try{
            usuario.setPassword(passwdEncrypted.getBytes("ISO-8859-1"));
       }catch(Exception ex){
            bError = true;
            SipLog.getLogger().error(ex);
            error(guiMessages.getString("errorEncriptandoPassword"));
       }
       if( !bError){
           usuario.setIdUsuario(getAdminSessionBean().getUsuarioLogged().getId_usuario());
           if( !svc.persistirUsuario(usuario) ){
                error(guiMessages.getString("errorUsuarioYaExiste"));
                //Si la transacción falla, hibernate no deja la entidad con el id
                //original(edición) o null (inserción)
               usuario.setId_usuario(idUsuario);
           }else{
                resetComponentes();
           }
       }
       return null;
    }
    public String btnBorrar_action() {
       AdminSvc svc = getAdminSessionBean().getAdminSvc();
       int selectedRows = getTableRowGroup1().getSelectedRowsCount();
       RowKey[] selectedRowKeys = getTableRowGroup1().getSelectedRowKeys();
       if( selectedRowKeys.length > 0 ){
           UsuarioVo ob = (UsuarioVo)tablaUsuarioDataProvider.getObject(selectedRowKeys[0]);
           ob.setIdUsuario(getAdminSessionBean().getUsuarioLogged().getId_usuario());
           if( !svc.deleteUsuario(ob)){
               error(guiMessages.getString("errorUsuarioYaRelacionado"));
           }else{
               resetComponentes();
               form1.discardSubmittedValues("agregar");
           }
       }
       return null;
    }
    //Helpers
    private void resetComponentes(){
        setUsuario(new UsuarioVo());
        ddPersona.setValue(null);
        txtfldContrasena.setValue(null);
        chbxDisabled.setValue(null);
    }
    public String btnNuevo_action() {
        resetComponentes();
        form1.discardSubmittedValues("agregar");
        return null;
    }
}
