/*
 * buscarPersona.java
 *
 * Created on 9 de septiembre de 2006, 12:42
 * Copyright Administrador
 */
package sip.modulos.common;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import com.unal.convenio.sip.admin.dao.TablaReferenciaDAO;
import com.unal.convenio.sip.admin.voh.TablaReferenciaVo;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextField;
import javax.faces.component.html.HtmlPanelGrid;
import com.sun.rave.web.ui.component.PanelLayout;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Table;
import com.sun.rave.web.ui.component.TableRowGroup;
import com.sun.rave.web.ui.component.TableColumn;
import com.unal.convenio.sip.common.service.SipDataProvider;
import com.sun.rave.web.ui.event.TableSelectPhaseListener;
import com.sun.data.provider.RowKey;
import com.unal.convenio.sip.admin.dao.DAOFactory;
import com.unal.convenio.sip.admin.dao.PersonaDAO;
import com.unal.convenio.sip.admin.voh.PersonaVo;
import com.sun.rave.web.ui.component.Label;
import javax.faces.convert.IntegerConverter;
import com.sun.rave.web.ui.component.MessageGroup;
import com.unal.convenio.sip.admin.service.AdminSvc;
import java.util.ResourceBundle;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.faces.application.FacesMessage;
import com.unal.util.*;
import javax.faces.component.html.HtmlSelectOneMenu;
import com.sun.jsfcl.data.DefaultSelectItemsArray;
import javax.faces.component.UISelectItems;
import java.util.ArrayList;
import com.sun.rave.web.ui.component.HiddenField;
import javax.faces.convert.BooleanConverter;
import com.sun.rave.web.ui.component.Hyperlink;
/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class buscarPersona extends AbstractPageBean {
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
    private TextField txtfldNombre1 = new TextField();
    public TextField getTxtfldNombre1() {
        return txtfldNombre1;
    }
    public void setTxtfldNombre1(TextField tf) {
        this.txtfldNombre1 = tf;
    }
    private TextField txtfldIdentificacion = new TextField();
    public TextField getTxtfldIdentificacion() {
        return txtfldIdentificacion;
    }
    public void setTxtfldIdentificacion(TextField tf) {
        this.txtfldIdentificacion = tf;
    }
    private TextField txtfldNombre2 = new TextField();
    public TextField getTxtfldNombre2() {
        return txtfldNombre2;
    }
    public void setTxtfldNombre2(TextField tf) {
        this.txtfldNombre2 = tf;
    }
    private TextField txtfldApellido1 = new TextField();
    public TextField getTxtfldApellido1() {
        return txtfldApellido1;
    }
    public void setTxtfldApellido1(TextField tf) {
        this.txtfldApellido1 = tf;
    }
    private TextField txtfldApellido2 = new TextField();
    public TextField getTxtfldApellido2() {
        return txtfldApellido2;
    }
    public void setTxtfldApellido2(TextField tf) {
        this.txtfldApellido2 = tf;
    }
    private TextField txtfldEmail = new TextField();
    public TextField getTxtfldEmail() {
        return txtfldEmail;
    }
    public void setTxtfldEmail(TextField tf) {
        this.txtfldEmail = tf;
    }
    private TextField txtfldTelefono = new TextField();
    public TextField getTxtfldTelefono() {
        return txtfldTelefono;
    }
    public void setTxtfldTelefono(TextField tf) {
        this.txtfldTelefono = tf;
    }
    private HtmlPanelGrid gridPanel1 = new HtmlPanelGrid();
    public HtmlPanelGrid getGridPanel1() {
        return gridPanel1;
    }
    public void setGridPanel1(HtmlPanelGrid hpg) {
        this.gridPanel1 = hpg;
    }
    private PanelLayout layoutPanel1 = new PanelLayout();
    public PanelLayout getLayoutPanel1() {
        return layoutPanel1;
    }
    public void setLayoutPanel1(PanelLayout pl) {
        this.layoutPanel1 = pl;
    }
    private Button btnBuscar = new Button();
    public Button getBtnBuscar() {
        return btnBuscar;
    }
    public void setBtnBuscar(Button b) {
        this.btnBuscar = b;
    }
    private Table tblResultados = new Table();
    public Table getTblResultados() {
        return tblResultados;
    }
    public void setTblResultados(Table t) {
        this.tblResultados = t;
    }
    private TableRowGroup tableRowGroup1 = new TableRowGroup();
    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }
    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }
    private TableColumn tableColumn2 = new TableColumn();
    public TableColumn getTableColumn2() {
        return tableColumn2;
    }
    public void setTableColumn2(TableColumn tc) {
        this.tableColumn2 = tc;
    }
    private TableColumn tableColumn7 = new TableColumn();
    public TableColumn getTableColumn7() {
        return tableColumn7;
    }
    public void setTableColumn7(TableColumn tc) {
        this.tableColumn7 = tc;
    }
    private StaticText staticText15 = new StaticText();
    public StaticText getStaticText15() {
        return staticText15;
    }
    public void setStaticText15(StaticText st) {
        this.staticText15 = st;
    }
    private TableColumn tableColumn8 = new TableColumn();
    public TableColumn getTableColumn8() {
        return tableColumn8;
    }
    public void setTableColumn8(TableColumn tc) {
        this.tableColumn8 = tc;
    }
    private StaticText staticText16 = new StaticText();
    public StaticText getStaticText16() {
        return staticText16;
    }
    public void setStaticText16(StaticText st) {
        this.staticText16 = st;
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
    private Label label3 = new Label();
    public Label getLabel3() {
        return label3;
    }
    public void setLabel3(Label l) {
        this.label3 = l;
    }
    private Label label4 = new Label();
    public Label getLabel4() {
        return label4;
    }
    public void setLabel4(Label l) {
        this.label4 = l;
    }
    private Label label5 = new Label();
    public Label getLabel5() {
        return label5;
    }
    public void setLabel5(Label l) {
        this.label5 = l;
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
    private Label label9 = new Label();
    public Label getLabel9() {
        return label9;
    }
    public void setLabel9(Label l) {
        this.label9 = l;
    }
    private TableColumn tableColumn9 = new TableColumn();
    public TableColumn getTableColumn9() {
        return tableColumn9;
    }
    public void setTableColumn9(TableColumn tc) {
        this.tableColumn9 = tc;
    }
    private StaticText staticText1 = new StaticText();
    public StaticText getStaticText1() {
        return staticText1;
    }
    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
    }
    private TableColumn tableColumn10 = new TableColumn();
    public TableColumn getTableColumn10() {
        return tableColumn10;
    }
    public void setTableColumn10(TableColumn tc) {
        this.tableColumn10 = tc;
    }
    private StaticText staticText6 = new StaticText();
    public StaticText getStaticText6() {
        return staticText6;
    }
    public void setStaticText6(StaticText st) {
        this.staticText6 = st;
    }
    private IntegerConverter integerDDConverter = new IntegerConverter();
    public IntegerConverter getIntegerDDConverter() {
        return integerDDConverter;
    }
    private MessageGroup messageGroup1 = new MessageGroup();
    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }
    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    private HtmlSelectOneMenu ddTipoIdentificacion = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdTipoIdentificacion() {
        return ddTipoIdentificacion;
    }
    public void setDdTipoIdentificacion(HtmlSelectOneMenu hsom) {
        this.ddTipoIdentificacion = hsom;
    }
    private ArrayList ddTipoIdentificacionItems = new ArrayList();
    public ArrayList getDdTipoIdentificacionItems() {
        return ddTipoIdentificacionItems;
    }
    public void setDdTipoIdentificacionItems(ArrayList dsia) {
        this.ddTipoIdentificacionItems = dsia;
    }
    private UISelectItems dropdown1SelectItems = new UISelectItems();
    public UISelectItems getDropdown1SelectItems() {
        return dropdown1SelectItems;
    }
    public void setDropdown1SelectItems(UISelectItems uisi) {
        this.dropdown1SelectItems = uisi;
    }
    private HtmlSelectOneMenu ddTipoPersona = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdTipoPersona() {
        return ddTipoPersona;
    }
    public void setDdTipoPersona(HtmlSelectOneMenu hsom) {
        this.ddTipoPersona = hsom;
    }
    private ArrayList ddTipoPersonaItems = new ArrayList();
    public ArrayList getDdTipoPersonaItems() {
        return ddTipoPersonaItems;
    }
    public void setDdTipoPersonaItems(ArrayList dsia) {
        this.ddTipoPersonaItems = dsia;
    }
    private UISelectItems dropdown2SelectItems = new UISelectItems();
    public UISelectItems getDropdown2SelectItems() {
        return dropdown2SelectItems;
    }
    public void setDropdown2SelectItems(UISelectItems uisi) {
        this.dropdown2SelectItems = uisi;
    }
    private HtmlPanelGrid gridPanel2 = new HtmlPanelGrid();
    public HtmlPanelGrid getGridPanel2() {
        return gridPanel2;
    }
    public void setGridPanel2(HtmlPanelGrid hpg) {
        this.gridPanel2 = hpg;
    }
    private TableColumn tableColumn1 = new TableColumn();
    public TableColumn getTableColumn1() {
        return tableColumn1;
    }
    public void setTableColumn1(TableColumn tc) {
        this.tableColumn1 = tc;
    }
    private StaticText staticText3 = new StaticText();
    public StaticText getStaticText3() {
        return staticText3;
    }
    public void setStaticText3(StaticText st) {
        this.staticText3 = st;
    }
    private BooleanConverter booleanConverter1 = new BooleanConverter();
    public BooleanConverter getBooleanConverter1() {
        return booleanConverter1;
    }
    public void setBooleanConverter1(BooleanConverter bc) {
        this.booleanConverter1 = bc;
    }
    private Hyperlink hyperlink1 = new Hyperlink();
    public Hyperlink getHyperlink1() {
        return hyperlink1;
    }
    public void setHyperlink1(Hyperlink h) {
        this.hyperlink1 = h;
    }
    private HiddenField hdnTarget = new HiddenField();
    public HiddenField getHdnTarget() {
        return hdnTarget;
    }
    public void setHdnTarget(HiddenField hf) {
        this.hdnTarget = hf;
    }
    private Button btnReset = new Button();
    public Button getBtnReset() {
        return btnReset;
    }
    public void setBtnReset(Button b) {
        this.btnReset = b;
    }
    private Button btnCerrar = new Button();
    public Button getBtnCerrar() {
        return btnCerrar;
    }
    public void setBtnCerrar(Button b) {
        this.btnCerrar = b;
    }
    // </editor-fold>
    /**
     * <p>Construir una instancia de bean de p�gina.</p>
     */
    public buscarPersona() {
    }
    /**
     * <p>Devolver una referencia al bean de datos con �mbito.</p>
     */
    protected sip.UserInfoSessionBean getUserInfoSessionBean() {
        return (sip.UserInfoSessionBean)getBean("UserInfoSessionBean");
    }
    /**
     * <p>Devolver una referencia al bean de datos con �mbito.</p>
     */
    protected sip.CorrespondenciaSessionBean getCorrespondenciaSessionBean() {
        return (sip.CorrespondenciaSessionBean)getBean("CorrespondenciaSessionBean");
    }
    /**
     * <p>Devolver una referencia al bean de datos con �mbito.</p>
     */
    protected sip.AdminSessionBean getAdminSessionBean() {
        return (sip.AdminSessionBean)getBean("AdminSessionBean");
    }
    /**
     * <p>Devolver una referencia al bean de datos con �mbito.</p>
     */
    protected sip.ApplicationBean1 getApplicationBean1() {
        return (sip.ApplicationBean1)getBean("ApplicationBean1");
    }
    /**
     * <p>M�todo de devoluci�n de llamada al que se llama cuando se navega hasta esta p�gina,
     * ya sea directamente mediante un URL o de manera indirecta a trav�s de la navegaci�n de p�ginas.
     * Puede personalizar este m�todo para adquirir recursos que se necesitar�n
     * para los controladores de eventos y m�todos del proceso, sin tener en cuenta si esta
     * p�gina realiza procesamiento de devoluci�n de env�os.</p>
     *
     * <p>Tenga en cuenta que si la petici�n actual es una devoluci�n de env�o, los valores
     * de propiedad de los componentes <strong>no</strong> representan ning�n
     * valor enviado con esta petici�n.  En su lugar, representan los
     * valores de propiedades que se guardaron para esta vista cuando se proces�.</p>
     */
    private ResourceBundle guiMessages;
    private boolean bTablaRendered = false;
    public void init() {
        // Efect�e las inicializaciones heredadas de nuestra superclase
        super.init();
        // Efect�e la inicializaci�n de aplicaci�n que debe completarse
        // *antes* de inicializar los componentes gestionados
        // TODO - agregue aqu� su propio c�digo de inicializaci�n
        // <editor-fold defaultstate="collapsed" desc="Inicio de componente administrado por el programa">
        // Inicialice los componentes gestionados autom�ticamente
        // *Nota* - esta l�gica *NO* debe modificarse
        try {
            _init();
        } catch (Exception e) {
            log("buscarPersona Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Efect�e la inicializaci�n de aplicaci�n que debe completarse
        // *despu�s* de inicializar los componentes gestionados
        // TODO - agregue aqu� su propio c�digo de inicializaci�n
        //Mensajes del sistema
        guiMessages = getApplicationBean1().getGuiMessages();
        //Poblar los componentes con datos
        AdminSvc svc = getAdminSessionBean().getAdminSvc();
        tablaPersonaDataProvider = getAdminSessionBean().getTablaFiltroPersonaProvider();
        ToolBox.poblarDropDown(ddTipoIdentificacionItems,svc.getReferenciasPorTipo("TIPO_DOCUMENTO"));
        ToolBox.poblarDropDown(ddTipoPersonaItems,svc.getReferenciasPorTipo("TIPO_PERSONA"));
    }
    /**
     * <p>M�todo de devoluci�n de llamada al que se llama cuando el �rbol de componentes se ha
     * restaurado, pero antes de que se produzca el procesamiento de cualquier evento.  Este m�todo
     * <strong>s�lo</strong> se llamar� en una petici�n de devoluci�n de env�o que
     * est� procesando el env�o de un formulario.  Puede personalizar este m�todo para asignar
     * recursos necesarios para los controladores de eventos.</p>
     */
    public void preprocess() {
    }
    /**
     * <p>M�todo de devoluci�n de llamada al que se llama justo antes del procesamiento.
     * <strong>S�lo</strong> se llamar� a este m�todo en la p�gina que
     * se procesa, no se llamar�, por ejemplo, en una p�gina que
     * ha procesado una devoluci�n de env�o y a continuaci�n ha navegado hasta otra p�gina.  Puede personalizar
     * este m�todo para asignar recursos necesarios para procesar
     * esta p�gina.</p>
     */
    public void prerender() {
    }
    /**
     * <p>M�todo de devoluci�n de llamada al que se llama cuando se completa el procesamiento de
     * esta petici�n, si se llam� al m�todo <code>init()</code> (sin tener en cuenta
     * si se trata de la p�gina que se ha procesado o no).  Puede personalizar este
     * m�todo para liberar los recursos adquiridos en los m�todos <code>init()</code>,
     * <code>preprocess()</code> o <code>prerender()</code> (o
     * durante la ejecuci�n de un controlador de eventos).</p>
     */
    public void destroy() {
    }
    /*
     *  DataProviders
     *
     *
     */
    private PersonaVo filtro = new PersonaVo();
    public PersonaVo getFiltro() {
        return filtro;
    }
    private SipDataProvider tablaPersonaDataProvider;
    public SipDataProvider getTablaPersonaDataProvider() {
        return tablaPersonaDataProvider;
    }
    /*
     *  ActionListeners
     *
     *
     */
    public String btnBuscar_action() {
        AdminSvc svc = getAdminSessionBean().getAdminSvc();
        tablaPersonaDataProvider.setList( svc.getPersonas(filtro) );
        return null;
    }
}
