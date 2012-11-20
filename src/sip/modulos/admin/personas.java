/*
 * personas.java
 *
 * Created on 25 de febrero de 2006, 08:44 PM
 * Copyright César
 */
package sip.modulos.admin;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextField;
import javax.faces.component.html.HtmlPanelGrid;
import com.sun.rave.web.ui.component.PanelLayout;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Table;
import com.sun.rave.web.ui.component.TableRowGroup;
import com.sun.rave.web.ui.component.TableColumn;
import com.sun.rave.web.ui.component.RadioButton;
import com.unal.convenio.sip.common.service.SipDataProvider;
import com.sun.rave.web.ui.event.TableSelectPhaseListener;
import com.sun.data.provider.RowKey;
import com.unal.convenio.sip.admin.voh.PersonaVo;
import com.sun.rave.web.ui.component.Label;
import javax.faces.convert.IntegerConverter;
import com.sun.rave.web.ui.component.MessageGroup;
import com.unal.convenio.sip.admin.service.AdminSvc;
import java.util.ResourceBundle;
import com.unal.util.*;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.component.UISelectItems;
import java.util.ArrayList;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class personas extends AbstractPageBean {
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
    private StaticText staticText2 = new StaticText();
    public StaticText getStaticText2() {
        return staticText2;
    }
    public void setStaticText2(StaticText st) {
        this.staticText2 = st;
    }
    private TableColumn tableColumn3 = new TableColumn();
    public TableColumn getTableColumn3() {
        return tableColumn3;
    }
    public void setTableColumn3(TableColumn tc) {
        this.tableColumn3 = tc;
    }
    private StaticText staticText3 = new StaticText();
    public StaticText getStaticText3() {
        return staticText3;
    }
    public void setStaticText3(StaticText st) {
        this.staticText3 = st;
    }
    private TableColumn tableColumn4 = new TableColumn();
    public TableColumn getTableColumn4() {
        return tableColumn4;
    }
    public void setTableColumn4(TableColumn tc) {
        this.tableColumn4 = tc;
    }
    private StaticText staticText4 = new StaticText();
    public StaticText getStaticText4() {
        return staticText4;
    }
    public void setStaticText4(StaticText st) {
        this.staticText4 = st;
    }
    private TableColumn tableColumn5 = new TableColumn();
    public TableColumn getTableColumn5() {
        return tableColumn5;
    }
    public void setTableColumn5(TableColumn tc) {
        this.tableColumn5 = tc;
    }
    private StaticText staticText5 = new StaticText();
    public StaticText getStaticText5() {
        return staticText5;
    }
    public void setStaticText5(StaticText st) {
        this.staticText5 = st;
    }
    private TableColumn tableColumn6 = new TableColumn();
    public TableColumn getTableColumn6() {
        return tableColumn6;
    }
    public void setTableColumn6(TableColumn tc) {
        this.tableColumn6 = tc;
    }
    private StaticText staticText14 = new StaticText();
    public StaticText getStaticText14() {
        return staticText14;
    }
    public void setStaticText14(StaticText st) {
        this.staticText14 = st;
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
    private HtmlPanelGrid pnlControles = new HtmlPanelGrid();
    public HtmlPanelGrid getPnlControles() {
        return pnlControles;
    }
    public void setPnlControles(HtmlPanelGrid hpg) {
        this.pnlControles = hpg;
    }
    private Button btnNuevo = new Button();
    public Button getBtnNuevo() {
        return btnNuevo;
    }
    public void setBtnNuevo(Button b) {
        this.btnNuevo = b;
    }
    // </editor-fold>
    /**
     * <p>Construir una instancia de bean de página.</p>
     */
    public personas() {
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
    protected sip.AdminSessionBean getAdminSessionBean() {
        return (sip.AdminSessionBean)getBean("AdminSessionBean");
    }
    /**
     * <p>Devolver una referencia al bean de datos con ámbito.</p>
     */
    protected sip.ApplicationBean1 getApplicationBean1() {
        return (sip.ApplicationBean1)getBean("ApplicationBean1");
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
            log("personas Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Efectúe la inicialización de aplicación que debe completarse
        // *después* de inicializar los componentes gestionados
        // TODO - agregue aquí su propio código de inicialización
        //Mensajes del sistema
        guiMessages = getApplicationBean1().getGuiMessages();
        //Poblar dropdowns
        AdminSvc svc = getAdminSessionBean().getAdminSvc();
        tablaPersonaDataProvider = getAdminSessionBean().getTablaPersonaDataProvider();
        persona = getAdminSessionBean().getPersonaEnEdicion();
        //Poblar los componentes con datos
        ToolBox.poblarDropDown(ddTipoIdentificacionItems,svc.getReferenciasPorTipo("TIPO_DOCUMENTO"));
        ToolBox.poblarDropDown(ddTipoPersonaItems,svc.getReferenciasPorTipo("TIPO_PERSONA"));
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
        AdminSvc svc = getAdminSessionBean().getAdminSvc();
        tablaPersonaDataProvider.setList( svc.getPersonas() );
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
     *  DataProviders
     *
     *
     */
    private PersonaVo persona;
    public PersonaVo getPersona() {
        return persona;
    }
    public void setPersona(PersonaVo per) {
        this.persona = per;
        getAdminSessionBean().setPersonaEnEdicion(per);
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
    public String btnEditar_action() {
        int selectedRows = getTableRowGroup1().getSelectedRowsCount();
        RowKey[] selectedRowKeys = getTableRowGroup1().getSelectedRowKeys();
        if( selectedRowKeys.length > 0 ){
            PersonaVo per = (PersonaVo)tablaPersonaDataProvider.getObject(selectedRowKeys[0]);
            setPersona(per);
            form1.discardSubmittedValues("agregar");
        }
        return null;
    }
    public String btnAgregar_action() {
        AdminSvc svc = getAdminSessionBean().getAdminSvc();
        Integer idPersona = persona.getId_persona();
        persona.setIdUsuario(getAdminSessionBean().getUsuarioLogged().getId_usuario());
        if( !svc.persistirPersona(persona)){
           error(guiMessages.getString("errorPersonaYaExiste"));
            //Si la transacción falla, hibernate no deja la entidad con el id
            //original(edición) o null (inserción)
           persona.setId_persona(idPersona);
        }else{
            //Esto limpia los campos de texto
            resetComponentes();
        }
         return null;
    }
    public String btnBorrar_action() {
        AdminSvc svc = getAdminSessionBean().getAdminSvc();
        int selectedRows = getTableRowGroup1().getSelectedRowsCount();
        RowKey[] selectedRowKeys = getTableRowGroup1().getSelectedRowKeys();
        if( selectedRowKeys.length > 0 ){
           PersonaVo tmp = (PersonaVo)tablaPersonaDataProvider.getObject(selectedRowKeys[0]);
           tmp.setIdUsuario(getAdminSessionBean().getUsuarioLogged().getId_usuario());
           if( !svc.deletePersona(tmp)){
              error(guiMessages.getString("errorPersonaYaRelacionada"));
           }else{
                //Esto limpia los campos de texto
                resetComponentes();
                form1.discardSubmittedValues("agregar");
           }
        }
        return null;
    }
    //Helpers
    private void resetComponentes(){
        setPersona(new PersonaVo());
    }
    public String btnNuevo_action() {
        // TODO: Procesar la acción de clic de botón. El valor de devolución es un
        // nombre de caso de navegación en el que un valor nulo devolverá la misma página.
        resetComponentes();
        form1.discardSubmittedValues("agregar");
        return null;
    }
}
