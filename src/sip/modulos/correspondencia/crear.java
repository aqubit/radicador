/*
 * entcrear.java
 *
 * Created on 15 de febrero de 2006, 12:42 PM
 * Copyright MB & CESAR
 */
package sip.modulos.correspondencia;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import com.unal.convenio.sip.correspondencia.service.CrearCorrespondenciaException;
import com.unal.convenio.sip.correspondencia.service.CrearEstadoCorrespondenciaException;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.component.TextArea;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputText;
import com.sun.rave.web.ui.component.HiddenField;
import com.sun.rave.web.ui.component.Message;
import com.sun.rave.web.ui.component.MessageGroup;
import java.util.*;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.faces.application.FacesMessage;
import javax.faces.event.ValueChangeEvent;
import javax.faces.convert.IntegerConverter;
import javax.faces.validator.LongRangeValidator;
import com.sun.rave.web.ui.component.Listbox;
import com.sun.rave.web.ui.model.DefaultOptionsList;
import com.unal.convenio.sip.correspondencia.voh.CorrespondenciaVo;
import javax.faces.component.html.HtmlSelectOneMenu;
import com.sun.jsfcl.data.DefaultSelectItemsArray;
import javax.faces.component.UISelectItems;
import sip.CorrespondenciaSessionBean;
import com.unal.convenio.sip.correspondencia.service.CorrespondenciaSvc;
import com.unal.convenio.sip.correspondencia.voh.*;
import com.unal.util.*;
import javax.faces.component.html.HtmlPanelGrid;
import com.sun.rave.web.ui.component.PanelGroup;
import com.sun.rave.web.ui.component.PanelLayout;
import com.unal.convenio.sip.admin.service.AdminSvc;
import com.unal.convenio.sip.admin.voh.*;
import com.sun.rave.web.ui.component.ImageHyperlink;
import com.sun.rave.web.ui.component.Calendar;
/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class crear extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
    private int __placeholder;
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
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
    private TextArea txaAsunto = new TextArea();
    public TextArea getTxaAsunto() {
        return txaAsunto;
    }
    public void setTxaAsunto(TextArea ta) {
        this.txaAsunto = ta;
    }
    private Button btnCancel = new Button();
    public Button getBtnCancel() {
        return btnCancel;
    }
    public void setBtnCancel(Button b) {
        this.btnCancel = b;
    }
    private Label label6 = new Label();
    public Label getLabel6() {
        return label6;
    }
    public void setLabel6(Label l) {
        this.label6 = l;
    }
    private Label label7 = new Label();
    public Label getLabel7() {
        return label7;
    }
    public void setLabel7(Label l) {
        this.label7 = l;
    }
    private Label label8 = new Label();
    public Label getLabel8() {
        return label8;
    }
    public void setLabel8(Label l) {
        this.label8 = l;
    }
    private Label lbltipo = new Label();
    public Label getLbltipo() {
        return lbltipo;
    }
    public void setLbltipo(Label l) {
        this.lbltipo = l;
    }
    private IntegerConverter integerConverter1 = new IntegerConverter();
    public IntegerConverter getIntegerConverter1() {
        return integerConverter1;
    }
    public void setIntegerConverter1(IntegerConverter ic) {
        this.integerConverter1 = ic;
    }
    private LongRangeValidator longRangeValidator1 = new LongRangeValidator();
    public LongRangeValidator getLongRangeValidator1() {
        return longRangeValidator1;
    }
    public void setLongRangeValidator1(LongRangeValidator lrv) {
        this.longRangeValidator1 = lrv;
    }
    private Button btnRegistrar = new Button();
    public Button getBtnRegistrar() {
        return btnRegistrar;
    }
    public void setBtnRegistrar(Button b) {
        this.btnRegistrar = b;
    }
    private HtmlSelectOneMenu ddRemitente = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdRemitente() {
        return ddRemitente;
    }
    public void setDdRemitente(HtmlSelectOneMenu hsom) {
        this.ddRemitente = hsom;
    }
    private UISelectItems dropdown1SelectItems = new UISelectItems();
    public UISelectItems getDropdown1SelectItems() {
        return dropdown1SelectItems;
    }
    public void setDropdown1SelectItems(UISelectItems uisi) {
        this.dropdown1SelectItems = uisi;
    }
    private HtmlSelectOneMenu ddClase = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdClase() {
        return ddClase;
    }
    public void setDdClase(HtmlSelectOneMenu hsom) {
        this.ddClase = hsom;
    }
    private DefaultSelectItemsArray ddRemitenteItems = new DefaultSelectItemsArray();
    public DefaultSelectItemsArray getDdRemitenteItems() {
        return ddRemitenteItems;
    }
    public void setDdRemitenteItems(DefaultSelectItemsArray dsia) {
        this.ddRemitenteItems = dsia;
    }
    private UISelectItems dropdown1SelectItems1 = new UISelectItems();
    public UISelectItems getDropdown1SelectItems1() {
        return dropdown1SelectItems1;
    }
    public void setDropdown1SelectItems1(UISelectItems uisi) {
        this.dropdown1SelectItems1 = uisi;
    }
    private DefaultSelectItemsArray ddRemitenteDefaultItems = new DefaultSelectItemsArray();
    public DefaultSelectItemsArray getDdRemitenteDefaultItems() {
        return ddRemitenteDefaultItems;
    }
    public void setDdRemitenteDefaultItems(DefaultSelectItemsArray dsia) {
        this.ddRemitenteDefaultItems = dsia;
    }
    private DefaultSelectItemsArray ddClaseDefaultItems = new DefaultSelectItemsArray();
    public DefaultSelectItemsArray getDdClaseDefaultItems() {
        return ddClaseDefaultItems;
    }
    public void setDdClaseDefaultItems(DefaultSelectItemsArray dsia) {
        this.ddClaseDefaultItems = dsia;
    }
    private HtmlSelectOneMenu ddCaracter = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdCaracter() {
        return ddCaracter;
    }
    public void setDdCaracter(HtmlSelectOneMenu hsom) {
        this.ddCaracter = hsom;
    }
    private DefaultSelectItemsArray ddTipoItems = new DefaultSelectItemsArray();
    public DefaultSelectItemsArray getDdTipoDefaultItems() {
        return ddTipoItems;
    }
    public void setDdTipoDefaultItems(DefaultSelectItemsArray dsia) {
        this.ddTipoItems = dsia;
    }
    private DefaultSelectItemsArray ddCaracterItems = new DefaultSelectItemsArray();
    public DefaultSelectItemsArray getDdCaracterDefaultItems() {
        return ddCaracterItems;
    }
    public void setDdCaracterDefaultItems(DefaultSelectItemsArray dsia) {
        this.ddCaracterItems = dsia;
    }
    private UISelectItems dropdown2SelectItems = new UISelectItems();
    public UISelectItems getDropdown2SelectItems() {
        return dropdown2SelectItems;
    }
    public void setDropdown2SelectItems(UISelectItems uisi) {
        this.dropdown2SelectItems = uisi;
    }
    private Label label3 = new Label();
    public Label getLabel3() {
        return label3;
    }
    public void setLabel3(Label l) {
        this.label3 = l;
    }
    private HtmlPanelGrid pnlControles = new HtmlPanelGrid();
    public HtmlPanelGrid getPnlControles() {
        return pnlControles;
    }
    public void setPnlControles(HtmlPanelGrid hpg) {
        this.pnlControles = hpg;
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
    private PanelLayout layoutPanel2 = new PanelLayout();
    public PanelLayout getLayoutPanel2() {
        return layoutPanel2;
    }
    public void setLayoutPanel2(PanelLayout pl) {
        this.layoutPanel2 = pl;
    }
    private MessageGroup messageGroup1 = new MessageGroup();
    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }
    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    private Label label1 = new Label();
    public Label getLabel1() {
        return label1;
    }
    public void setLabel1(Label l) {
        this.label1 = l;
    }
    private HtmlSelectOneMenu ddRol = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdRol() {
        return ddRol;
    }
    public void setDdRol(HtmlSelectOneMenu hsom) {
        this.ddRol = hsom;
    }
    private ArrayList ddRolItems = new ArrayList();
    public ArrayList getDdRolItems() {
        return ddRolItems;
    }
    public void setDdRolItems(ArrayList dsia) {
        this.ddRolItems = dsia;
    }
    private UISelectItems dropdown1SelectItems2 = new UISelectItems();
    public UISelectItems getDropdown1SelectItems2() {
        return dropdown1SelectItems2;
    }
    public void setDropdown1SelectItems2(UISelectItems uisi) {
        this.dropdown1SelectItems2 = uisi;
    }
    private ImageHyperlink imageHyperlink1 = new ImageHyperlink();
    public ImageHyperlink getImageHyperlink1() {
        return imageHyperlink1;
    }
    public void setImageHyperlink1(ImageHyperlink ih) {
        this.imageHyperlink1 = ih;
    }
    private HtmlSelectOneMenu ddTipo = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdTipo() {
        return ddTipo;
    }
    public void setDdTipo(HtmlSelectOneMenu hsom) {
        this.ddTipo = hsom;
    }
    private UISelectItems dropdown2SelectItems1 = new UISelectItems();
    public UISelectItems getDropdown2SelectItems1() {
        return dropdown2SelectItems1;
    }
    public void setDropdown2SelectItems1(UISelectItems uisi) {
        this.dropdown2SelectItems1 = uisi;
    }
    private Label label2 = new Label();
    public Label getLabel2() {
        return label2;
    }
    public void setLabel2(Label l) {
        this.label2 = l;
    }
    private TextField txtNroRadicacion = new TextField();
    public TextField getTxtNroRadicacion() {
        return txtNroRadicacion;
    }
    public void setTxtNroRadicacion(TextField tf) {
        this.txtNroRadicacion = tf;
    }
    private Label label10 = new Label();
    public Label getLabel10() {
        return label10;
    }
    public void setLabel10(Label l) {
        this.label10 = l;
    }
    private Calendar calFechaRadicacion = new Calendar();
    public Calendar getCalFechaRadicacion() {
        return calFechaRadicacion;
    }
    public void setCalFechaRadicacion(Calendar c) {
        this.calFechaRadicacion = c;
    }
    private HtmlPanelGrid gridPanel3 = new HtmlPanelGrid();
    public HtmlPanelGrid getGridPanel3() {
        return gridPanel3;
    }
    public void setGridPanel3(HtmlPanelGrid hpg) {
        this.gridPanel3 = hpg;
    }
    private HtmlPanelGrid gridPanel4 = new HtmlPanelGrid();
    public HtmlPanelGrid getGridPanel4() {
        return gridPanel4;
    }
    public void setGridPanel4(HtmlPanelGrid hpg) {
        this.gridPanel4 = hpg;
    }
    private Label label4 = new Label();
    public Label getLabel4() {
        return label4;
    }
    public void setLabel4(Label l) {
        this.label4 = l;
    }
    private PanelLayout layoutPanel3 = new PanelLayout();
    public PanelLayout getLayoutPanel3() {
        return layoutPanel3;
    }
    public void setLayoutPanel3(PanelLayout pl) {
        this.layoutPanel3 = pl;
    }
    private HtmlSelectOneMenu ddDestinatario = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdDestinatario() {
        return ddDestinatario;
    }
    public void setDdDestinatario(HtmlSelectOneMenu hsom) {
        this.ddDestinatario = hsom;
    }
    private UISelectItems dropdown1SelectItems3 = new UISelectItems();
    public UISelectItems getDropdown1SelectItems3() {
        return dropdown1SelectItems3;
    }
    public void setDropdown1SelectItems3(UISelectItems uisi) {
        this.dropdown1SelectItems3 = uisi;
    }
    private ImageHyperlink imageHyperlink2 = new ImageHyperlink();
    public ImageHyperlink getImageHyperlink2() {
        return imageHyperlink2;
    }
    public void setImageHyperlink2(ImageHyperlink ih) {
        this.imageHyperlink2 = ih;
    }
    // </editor-fold>
    /**
     * <p>Construir una instancia de bean de página.</p>
     */
    public crear() {
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
    protected sip.AdminSessionBean getAdminSessionBean() {
        return (sip.AdminSessionBean)getBean("AdminSessionBean");
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
    }    /**
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
    private CorrespondenciaVo vo= new CorrespondenciaVo();
    public CorrespondenciaVo getVo(){
        return vo;
    }
    public void setVo(CorrespondenciaVo vo){
        this.vo = vo;
    }
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
            log("entcrear Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Efectúe la inicialización de aplicación que debe completarse
        // *después* de inicializar los componentes gestionados
        guiMessages = getApplicationBean1().getGuiMessages();
        CorrespondenciaSvc svc = getCorrespondenciaSessionBean().getCorrespondenciaSvc();
        AdminSvc svcAdmin = getAdminSessionBean().getAdminSvc();
        Map remitentes = svc.getRemitentesMap();
        Map clases = svc.getClasesMap();
        ToolBox.poblarDropDown(ddClaseDefaultItems, clases);
        ToolBox.poblarDropDown(ddRemitenteDefaultItems, remitentes);
        ToolBox.poblarDropDown(ddCaracterItems, svc.getCaracteresMap());
        ToolBox.poblarDropDown(ddTipoItems, svc.getTipos());
        ToolBox.poblarDropDown(ddRolItems,svcAdmin.getRoles());
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
    }
    /**
     * <p>Método de devolución de llamada al que se llama cuando se completa el procesamiento de
     * esta petición, si se llamó al método <code>init()</code> (sin tener en cuenta
     * si se trata de la página que se ha procesado o no).  Puede personalizar este
     * método para liberar los recursos adquiridos en los métodos <code>init()</code>,
     * <code>preprocess()</code> o <code>prerender()</code> (o
     * durante la ejecución de un controlador de eventos).</p>
     */    public void destroy() {
    }
    public String btnRegistrar_action() {
        try{
           CorrespondenciaSvc svc = getCorrespondenciaSessionBean().getCorrespondenciaSvc();
           UsuarioVo usuario = getAdminSessionBean().getUsuarioLogged();
           vo.setIdUsuario(usuario.getId_usuario());
           vo = svc.crear( vo, usuario.getPersona() );
        }catch(CrearCorrespondenciaException e){
            error( "No se pudo registrar la correspondencia " + e.toString());
            return null;
        }catch(CrearEstadoCorrespondenciaException e){
            error( "No se pudo crear el estado de la correspondencia " + e.toString());
            return null;
        }
        getCorrespondenciaSessionBean().setCorrespondenciaActual(vo);
        getUserInfoSessionBean().setSubTabCorrespondenciaSelected("go.correspondencia.actualizar");
        return "go.correspondencia.actualizar";
    }
    public java.util.Date getMinDateRadicacion(){
        java.util.Date fecha = new java.util.Date();
        fecha.setTime(1000*60*60*24*365*35);
        return fecha;
    }
   public java.util.Date getMaxDate(){
        java.util.Date fecha = new java.util.Date();
        return fecha;
    }
    public void calValidatePosterior(FacesContext context, UIComponent component, Object value) {
      // TODO: Reemplazar con código del usuario
	java.util.Date fecha = (java.util.Date)value;
        java.util.Date maxFecha = getMaxDate();
        if( fecha.after(maxFecha)){
                String strError = guiMessages.getString("errorFechaPosteriorHoy");
                error(strError);
		throw new ValidatorException(new FacesMessage(strError));
	}
    }
}
