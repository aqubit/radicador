/*
 * recursos.java
 *
 * Created on 1 de marzo de 2006, 09:10 AM
 * Copyright C�sar
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
import com.unal.convenio.sip.admin.voh.RecursoVo;
import com.unal.convenio.sip.admin.voh.TablaReferenciaVo;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.TextField;
import javax.faces.component.html.HtmlPanelGrid;
import com.sun.rave.web.ui.component.PanelLayout;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Table;
import com.sun.rave.web.ui.component.TableRowGroup;
import com.sun.rave.web.ui.component.TableColumn;
import com.sun.rave.web.ui.component.RadioButton;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.event.TableSelectPhaseListener;
import com.unal.convenio.sip.common.service.SipDataProvider;
import javax.faces.convert.IntegerConverter;
import javax.faces.event.ValueChangeEvent;
import com.sun.rave.web.ui.component.MessageGroup;
import com.unal.convenio.sip.admin.service.AdminSvc;
import java.util.ResourceBundle;
import com.unal.util.*;
import javax.faces.context.FacesContext;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.component.UISelectItems;
import java.util.ArrayList;
import java.util.Map;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class recursos extends AbstractPageBean {
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
    private Label label1 = new Label();
    public Label getLabel1() {
        return label1;
    }
    public void setLabel1(Label l) {
        this.label1 = l;
    }
    private TextField txtfldNombre = new TextField();
    public TextField getTxtfldNombre() {
        return txtfldNombre;
    }
    public void setTxtfldNombre(TextField tf) {
        this.txtfldNombre = tf;
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
    private TextField txtfldDescripcion = new TextField();
    public TextField getTxtfldDescripcion() {
        return txtfldDescripcion;
    }
    public void setTxtfldDescripcion(TextField tf) {
        this.txtfldDescripcion = tf;
    }
    private Label label4 = new Label();
    public Label getLabel4() {
        return label4;
    }
    public void setLabel4(Label l) {
        this.label4 = l;
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
    private HtmlSelectOneMenu ddTipoRecurso = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdTipoRecurso() {
        return ddTipoRecurso;
    }
    public void setDdTipoRecurso(HtmlSelectOneMenu hsom) {
        this.ddTipoRecurso = hsom;
    }
    private ArrayList ddTipoRecursoItems = new ArrayList();
    public ArrayList getDdTipoRecursoItems() {
        return ddTipoRecursoItems;
    }
    public void setDdTipoRecursoItems(ArrayList dsia) {
        this.ddTipoRecursoItems = dsia;
    }
    private UISelectItems dropdown1SelectItems = new UISelectItems();
    public UISelectItems getDropdown1SelectItems() {
        return dropdown1SelectItems;
    }
    public void setDropdown1SelectItems(UISelectItems uisi) {
        this.dropdown1SelectItems = uisi;
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
     * <p>Construir una instancia de bean de p�gina.</p>
     */
    public recursos() {
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
    protected sip.ApplicationBean1 getApplicationBean1() {
        return (sip.ApplicationBean1)getBean("ApplicationBean1");
    }
    /**
     * <p>Devolver una referencia al bean de datos con �mbito.</p>
     */
    protected sip.AdminSessionBean getAdminSessionBean() {
        return (sip.AdminSessionBean)getBean("AdminSessionBean");
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
            log("recursos Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Efect�e la inicializaci�n de aplicaci�n que debe completarse
        // *despu�s* de inicializar los componentes gestionados
        // TODO - agregue aqu� su propio c�digo de inicializaci�n
        AdminSvc svc = getAdminSessionBean().getAdminSvc();
        guiMessages = getApplicationBean1().getGuiMessages();
        //Traer objetos de la sesion
        tablaRecursoDataProvider = getAdminSessionBean().getTablaRecursoDataProvider();
        recurso  = getAdminSessionBean().getRecursoEnEdicion();
        //Poblar dropdown
        ToolBox.poblarDropDown(ddTipoRecursoItems,svc.getReferenciasPorTipo("TIPO_RECURSO"));
    }
    /**
     * <p>M�todo de devoluci�n de llamada al que se llama cuando el �rbol de componentes se ha
     * restaurado, pero antes de que se produzca el procesamiento de cualquier evento.  Este m�todo
     * <strong>s�lo</strong> se llamar� en una petici�n de devoluci�n de env�o que
     * est� procesando el env�o de un formulario.  Puede personalizar este m�todo para asignar
     * recursos necesarios para los controladores de eventos.</p>
     */
    public void preprocess() {
        FacesContext context = FacesContext.getCurrentInstance();
        Map map = context.getExternalContext().getRequestParameterMap();
        if (map.containsKey(btnAgregar.getClientId(context))) {
            ddTipoRecurso.setRequired(true);
        } else {
            ddTipoRecurso.setRequired(false);
        }
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
       AdminSvc svc = getAdminSessionBean().getAdminSvc();
       Integer iTipoRecursoId = (Integer)ddTipoRecurso.getValue();
       if( iTipoRecursoId != null ){
           RecursoVo filtro = new RecursoVo();
           TablaReferenciaVo rf = svc.getReferencia(iTipoRecursoId);
           filtro.setIdref_tiporecurso( rf );
           tablaRecursoDataProvider.setList( svc.getRecursos(filtro) );
           recurso.setIdref_tiporecurso(rf);
       }else{
            tablaRecursoDataProvider.clearObjectList();
       }
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
     *  Como seleccionar una sola l�nea en la tabla y mantener su valor
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
    private RecursoVo recurso;
    public RecursoVo getRecurso() {
        return this.recurso;
    }
    public void setRecurso(RecursoVo recurso) {
        this.recurso = recurso;
        getAdminSessionBean().setRecursoEnEdicion( recurso );
    }
    private SipDataProvider tablaRecursoDataProvider;
    public SipDataProvider getTablaRecursoDataProvider() {
        return tablaRecursoDataProvider;
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
            RecursoVo rec = (RecursoVo)tablaRecursoDataProvider.getObject(selectedRowKeys[0]);
            //Actualizar el objeto en la sesi�n
            setRecurso(rec);
            form1.discardSubmittedValues("agregar");
        }
        return null;
    }
    public String btnAgregar_action() {
        AdminSvc svc = getAdminSessionBean().getAdminSvc();
        Integer idRecurso = recurso.getId_recurso();
        recurso.setIdUsuario(getAdminSessionBean().getUsuarioLogged().getId_usuario());
        if( !svc.persistirRecurso(recurso)){
           error(guiMessages.getString("errorRecursoYaExiste"));
            //Si la transacci�n falla, hibernate no deja la entidad con el id
            //original(edici�n) o null (inserci�n)
           recurso.setId_recurso(idRecurso);
        }else{
            //Esto limpia los campos de texto
            resetComponentes();
        }
         return null;
    }
    public String btnBorrar_action() {
        AdminSvc svc = getAdminSessionBean().getAdminSvc();
        RowKey[] selectedRowKeys = getTableRowGroup1().getSelectedRowKeys();
        if( selectedRowKeys.length > 0 ){
           RecursoVo tmp = (RecursoVo)tablaRecursoDataProvider.getObject(selectedRowKeys[0]);
           tmp.setIdUsuario(getAdminSessionBean().getUsuarioLogged().getId_usuario());
           if( !svc.deleteRecurso(tmp)){
              error(guiMessages.getString("errorRecursoYaRelacionado"));
           }else{
                //Esto limpia los campos de texto
                resetComponentes();
                form1.discardSubmittedValues("agregar");
           }
        }
        return null;
    }
    public void ddTipoRecurso_processValueChange(ValueChangeEvent vce) {
        resetComponentes();
    }
    //Helpers
    private void resetComponentes(){
        recurso.setDescripcion(null);
        recurso.setNombre(null);
        recurso.setId_recurso(null);
    }
    public String btnNuevo_action() {
        // TODO: Procesar la acci�n de clic de bot�n. El valor de devoluci�n es un
        // nombre de caso de navegaci�n en el que un valor nulo devolver� la misma p�gina.
        resetComponentes();
        form1.discardSubmittedValues("agregar");
        return null;
    }
}
