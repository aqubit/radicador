/*
 * entConsulta.java
 *
 * Created on 17 de febrero de 2006, 11:12 AM
 * Copyright MB  & CESAR
 */
package sip.modulos.correspondencia;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import com.unal.convenio.sip.correspondencia.dao.CorrespondenciaDAO;
import com.unal.convenio.sip.correspondencia.service.CorrespondenciaSvc;
import com.unal.convenio.sip.correspondencia.voh.CorrespondenciaVo;
import com.unal.util.ToolBox;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.Button;
import com.sun.jsfcl.convert.SqlTimestampConverter;
import com.sun.data.provider.impl.ObjectArrayDataProvider;
import com.sun.rave.web.ui.component.Table;
import com.sun.rave.web.ui.component.TableRowGroup;
import com.sun.rave.web.ui.model.DefaultTableDataProvider;
import com.sun.rave.web.ui.component.TableColumn;
import com.sun.rave.web.ui.component.StaticText;
import javax.faces.convert.DateTimeConverter;
import com.sun.rave.web.ui.component.Hyperlink;
import javax.faces.component.html.HtmlPanelGrid;
import com.sun.rave.web.ui.component.PanelLayout;
import com.sun.rave.web.ui.component.TextField;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.component.UISelectItems;
/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class infodetallada extends AbstractPageBean {
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
    private Label label7 = new Label();
    public Label getLabel7() {
        return label7;
    }
    public void setLabel7(Label l) {
        this.label7 = l;
    }
    private Label label9 = new Label();
    public Label getLabel9() {
        return label9;
    }
    public void setLabel9(Label l) {
        this.label9 = l;
    }
    private Label label10 = new Label();
    public Label getLabel10() {
        return label10;
    }
    public void setLabel10(Label l) {
        this.label10 = l;
    }
    private Label label11 = new Label();
    public Label getLabel11() {
        return label11;
    }
    public void setLabel11(Label l) {
        this.label11 = l;
    }
    private Label label12 = new Label();
    public Label getLabel12() {
        return label12;
    }
    public void setLabel12(Label l) {
        this.label12 = l;
    }
    private Label label13 = new Label();
    public Label getLabel13() {
        return label13;
    }
    public void setLabel13(Label l) {
        this.label13 = l;
    }
    private Label label14 = new Label();
    public Label getLabel14() {
        return label14;
    }
    public void setLabel14(Label l) {
        this.label14 = l;
    }
    private Button btnAceptar = new Button();
    public Button getBtnAceptar() {
        return btnAceptar;
    }
    public void setBtnAceptar(Button b) {
        this.btnAceptar = b;
    }
    private Label lblRemitente = new Label();
    public Label getLblRemitente() {
        return lblRemitente;
    }
    public void setLblRemitente(Label l) {
        this.lblRemitente = l;
    }
    private Label lblDestinatario = new Label();
    public Label getLblDestinatario() {
        return lblDestinatario;
    }
    public void setLblDestinatario(Label l) {
        this.lblDestinatario = l;
    }
    private Label lblEstado = new Label();
    public Label getLblEstado() {
        return lblEstado;
    }
    public void setLblEstado(Label l) {
        this.lblEstado = l;
    }
    private Label lblId = new Label();
    public Label getLblId() {
        return lblId;
    }
    public void setLblId(Label l) {
        this.lblId = l;
    }
    private Label lblAsunto = new Label();
    public Label getLblAsunto() {
        return lblAsunto;
    }
    public void setLblAsunto(Label l) {
        this.lblAsunto = l;
    }
    private Label lblFecEntrega = new Label();
    public Label getLblFecEntrega() {
        return lblFecEntrega;
    }
    public void setLblFecEntrega(Label l) {
        this.lblFecEntrega = l;
    }
    private Label lblNroRadicacion = new Label();
    public Label getLblNroRadicacion() {
        return lblNroRadicacion;
    }
    public void setLblNroRadicacion(Label l) {
        this.lblNroRadicacion = l;
    }
    private Label lblNroContrato = new Label();
    public Label getLblNroContrato() {
        return lblNroContrato;
    }
    public void setLblNroContrato(Label l) {
        this.lblNroContrato = l;
    }
    private Label lblUltimaModif = new Label();
    public Label getLblUltimaModif() {
        return lblUltimaModif;
    }
    public void setLblUltimaModif(Label l) {
        this.lblUltimaModif = l;
    }
    private Label lblCaracter = new Label();
    public Label getLblCaracter() {
        return lblCaracter;
    }
    public void setLblCaracter(Label l) {
        this.lblCaracter = l;
    }
    private SqlTimestampConverter sqlTimestampConverter1 = new SqlTimestampConverter();
    public SqlTimestampConverter getSqlTimestampConverter1() {
        return sqlTimestampConverter1;
    }
    public void setSqlTimestampConverter1(SqlTimestampConverter stc) {
        this.sqlTimestampConverter1 = stc;
    }
    private SqlTimestampConverter sqlTimestampConverter2 = new SqlTimestampConverter();
    public SqlTimestampConverter getSqlTimestampConverter2() {
        return sqlTimestampConverter2;
    }
    public void setSqlTimestampConverter2(SqlTimestampConverter stc) {
        this.sqlTimestampConverter2 = stc;
    }
    private Label lblFechaVence = new Label();
    public Label getLblFechaVence() {
        return lblFechaVence;
    }
    public void setLblFechaVence(Label l) {
        this.lblFechaVence = l;
    }
    private SqlTimestampConverter sqlTimestampConverter3 = new SqlTimestampConverter();
    public SqlTimestampConverter getSqlTimestampConverter3() {
        return sqlTimestampConverter3;
    }
    public void setSqlTimestampConverter3(SqlTimestampConverter stc) {
        this.sqlTimestampConverter3 = stc;
    }
    private Button btnActualizar = new Button();
    public Button getBtnActualizar() {
        return btnActualizar;
    }
    public void setBtnActualizar(Button b) {
        this.btnActualizar = b;
    }
    private Label label6 = new Label();
    public Label getLabel6() {
        return label6;
    }
    public void setLabel6(Label l) {
        this.label6 = l;
    }
    private Label lblClase = new Label();
    public Label getLblClase() {
        return lblClase;
    }
    public void setLblClase(Label l) {
        this.lblClase = l;
    }
    private ObjectArrayDataProvider objectArrayDataProviderEstados = new ObjectArrayDataProvider();
    public ObjectArrayDataProvider getObjectArrayDataProviderEstados() {
        return objectArrayDataProviderEstados;
    }
    public void setObjectArrayDataProviderEstados(ObjectArrayDataProvider oadp) {
        this.objectArrayDataProviderEstados = oadp;
    }
    private Table table1 = new Table();
    public Table getTable1() {
        return table1;
    }
    public void setTable1(Table t) {
        this.table1 = t;
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
    private StaticText staticText1 = new StaticText();
    public StaticText getStaticText1() {
        return staticText1;
    }
    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
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
    private Table table2 = new Table();
    public Table getTable2() {
        return table2;
    }
    public void setTable2(Table t) {
        this.table2 = t;
    }
    private TableRowGroup tableRowGroup2 = new TableRowGroup();
    public TableRowGroup getTableRowGroup2() {
        return tableRowGroup2;
    }
    public void setTableRowGroup2(TableRowGroup trg) {
        this.tableRowGroup2 = trg;
    }
    private ObjectArrayDataProvider objectArrayDataProviderHilo = new ObjectArrayDataProvider();
    public ObjectArrayDataProvider getObjectArrayDataProviderHilo() {
        return objectArrayDataProviderHilo;
    }
    public void setObjectArrayDataProviderHilo(ObjectArrayDataProvider oadp) {
        this.objectArrayDataProviderHilo = oadp;
    }
    private TableColumn tableColumn7 = new TableColumn();
    public TableColumn getTableColumn7() {
        return tableColumn7;
    }
    public void setTableColumn7(TableColumn tc) {
        this.tableColumn7 = tc;
    }
    private StaticText staticText7 = new StaticText();
    public StaticText getStaticText7() {
        return staticText7;
    }
    public void setStaticText7(StaticText st) {
        this.staticText7 = st;
    }
    private DateTimeConverter dateTimeConverter1 = new DateTimeConverter();
    public DateTimeConverter getDateTimeConverter1() {
        return dateTimeConverter1;
    }
    public void setDateTimeConverter1(DateTimeConverter dtc) {
        this.dateTimeConverter1 = dtc;
    }
    private TableColumn tableColumn10 = new TableColumn();
    public TableColumn getTableColumn10() {
        return tableColumn10;
    }
    public void setTableColumn10(TableColumn tc) {
        this.tableColumn10 = tc;
    }
    private TableColumn tableColumn12 = new TableColumn();
    public TableColumn getTableColumn12() {
        return tableColumn12;
    }
    public void setTableColumn12(TableColumn tc) {
        this.tableColumn12 = tc;
    }
    private StaticText staticText11 = new StaticText();
    public StaticText getStaticText11() {
        return staticText11;
    }
    public void setStaticText11(StaticText st) {
        this.staticText11 = st;
    }
    private TableColumn tableColumn13 = new TableColumn();
    public TableColumn getTableColumn13() {
        return tableColumn13;
    }
    public void setTableColumn13(TableColumn tc) {
        this.tableColumn13 = tc;
    }
    private StaticText staticText12 = new StaticText();
    public StaticText getStaticText12() {
        return staticText12;
    }
    public void setStaticText12(StaticText st) {
        this.staticText12 = st;
    }
    private TableColumn tableColumn14 = new TableColumn();
    public TableColumn getTableColumn14() {
        return tableColumn14;
    }
    public void setTableColumn14(TableColumn tc) {
        this.tableColumn14 = tc;
    }
    private StaticText staticText13 = new StaticText();
    public StaticText getStaticText13() {
        return staticText13;
    }
    public void setStaticText13(StaticText st) {
        this.staticText13 = st;
    }
    private TableColumn tableColumn15 = new TableColumn();
    public TableColumn getTableColumn15() {
        return tableColumn15;
    }
    public void setTableColumn15(TableColumn tc) {
        this.tableColumn15 = tc;
    }
    private StaticText staticText14 = new StaticText();
    public StaticText getStaticText14() {
        return staticText14;
    }
    public void setStaticText14(StaticText st) {
        this.staticText14 = st;
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
    private Hyperlink hyperlink1 = new Hyperlink();
    public Hyperlink getHyperlink1() {
        return hyperlink1;
    }
    public void setHyperlink1(Hyperlink h) {
        this.hyperlink1 = h;
    }
    private Label label5 = new Label();
    public Label getLabel5() {
        return label5;
    }
    public void setLabel5(Label l) {
        this.label5 = l;
    }
    private Hyperlink downloadLink1 = new Hyperlink();
    public Hyperlink getDownloadLink1() {
        return downloadLink1;
    }
    public void setDownloadLink1(Hyperlink h) {
        this.downloadLink1 = h;
    }
    private PanelLayout layoutPanel2 = new PanelLayout();
    public PanelLayout getLayoutPanel2() {
        return layoutPanel2;
    }
    public void setLayoutPanel2(PanelLayout pl) {
        this.layoutPanel2 = pl;
    }
    private Label label16 = new Label();
    public Label getLabel16() {
        return label16;
    }
    public void setLabel16(Label l) {
        this.label16 = l;
    }
    private Label label18 = new Label();
    public Label getLabel18() {
        return label18;
    }
    public void setLabel18(Label l) {
        this.label18 = l;
    }
    private Label lblAnoContrato = new Label();
    public Label getLblAnoContrato() {
        return lblAnoContrato;
    }
    public void setLblAnoContrato(Label l) {
        this.lblAnoContrato = l;
    }
    private Label lblDependenciaContrato = new Label();
    public Label getLblDependenciaContrato() {
        return lblDependenciaContrato;
    }
    public void setLblDependenciaContrato(Label l) {
        this.lblDependenciaContrato = l;
    }
    private Label label19 = new Label();
    public Label getLabel19() {
        return label19;
    }
    public void setLabel19(Label l) {
        this.label19 = l;
    }
    private Label lblGrupoPropietario = new Label();
    public Label getLblGrupoPropietario() {
        return lblGrupoPropietario;
    }
    public void setLblGrupoPropietario(Label l) {
        this.lblGrupoPropietario = l;
    }
    private Label label20 = new Label();
    public Label getLabel20() {
        return label20;
    }
    public void setLabel20(Label l) {
        this.label20 = l;
    }
    private Label lblConsecutivo = new Label();
    public Label getLblConsecutivo() {
        return lblConsecutivo;
    }
    public void setLblConsecutivo(Label l) {
        this.lblConsecutivo = l;
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
    private Label label15 = new Label();
    public Label getLabel15() {
        return label15;
    }
    public void setLabel15(Label l) {
        this.label15 = l;
    }
    private Label lblTipo = new Label();
    public Label getLblTipo() {
        return lblTipo;
    }
    public void setLblTipo(Label l) {
        this.lblTipo = l;
    }
    private PanelLayout layoutPanel3 = new PanelLayout();
    public PanelLayout getLayoutPanel3() {
        return layoutPanel3;
    }
    public void setLayoutPanel3(PanelLayout pl) {
        this.layoutPanel3 = pl;
    }
    private Label label8 = new Label();
    public Label getLabel8() {
        return label8;
    }
    public void setLabel8(Label l) {
        this.label8 = l;
    }
    private Label lblFechaRadicacion = new Label();
    public Label getLblFechaRadicacion() {
        return lblFechaRadicacion;
    }
    public void setLblFechaRadicacion(Label l) {
        this.lblFechaRadicacion = l;
    }
    private Label label17 = new Label();
    public Label getLabel17() {
        return label17;
    }
    public void setLabel17(Label l) {
        this.label17 = l;
    }
    private PanelLayout layoutPanel4 = new PanelLayout();
    public PanelLayout getLayoutPanel4() {
        return layoutPanel4;
    }
    public void setLayoutPanel4(PanelLayout pl) {
        this.layoutPanel4 = pl;
    }
    private Label lblNroRadicacionInvias = new Label();
    public Label getLblNroRadicacionInvias() {
        return lblNroRadicacionInvias;
    }
    public void setLblNroRadicacionInvias(Label l) {
        this.lblNroRadicacionInvias = l;
    }
    private Label lblFechaInvias = new Label();
    public Label getLblFechaInvias() {
        return lblFechaInvias;
    }
    public void setLblFechaInvias(Label l) {
        this.lblFechaInvias = l;
    }
    private Label lblFechaRadicacionInvias = new Label();
    public Label getLblFechaRadicacionInvias() {
        return lblFechaRadicacionInvias;
    }
    public void setLblFechaRadicacionInvias(Label l) {
        this.lblFechaRadicacionInvias = l;
    }
    // </editor-fold>
    /**
     * <p>Construir una instancia de bean de página.</p>
     */
    public infodetallada() {
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
            log("entConsulta Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Efectúe la inicialización de aplicación que debe completarse
        // *después* de inicializar los componentes gestionados
        // TODO - agregue aquí su propio código de inicialización
        //Puede el usuario ver esta página
        CorrespondenciaVo tmp = getCorrespondenciaSessionBean().getCorrespondenciaActual();
        CorrespondenciaSvc svc = getCorrespondenciaSessionBean().getCorrespondenciaSvc();
        lblGrupoPropietario.setText( svc.getGrupoPropietario( tmp));
        objectArrayDataProviderEstados.setArray((java.lang.Object[])getCorrespondenciaSessionBean().getEstadosCorrespondenciaActual());
        objectArrayDataProviderHilo.setArray((java.lang.Object[])getCorrespondenciaSessionBean().getCorrespondenciasList());
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
        CorrespondenciaSvc svc = getCorrespondenciaSessionBean().getCorrespondenciaSvc();
        objectArrayDataProviderEstados.setArray((java.lang.Object[])getCorrespondenciaSessionBean().getEstadosCorrespondenciaActual());
        objectArrayDataProviderHilo.setArray((java.lang.Object[])getCorrespondenciaSessionBean().getCorrespondenciasList());
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
    public String btnActualizar_action() {
        getUserInfoSessionBean().setSubTabCorrespondenciaSelected("go.correspondencia.actualizar");
        return "go.correspondencia.actualizar";
    }
    public String btnAceptar_action() {
        getCorrespondenciaSessionBean().setCorrespondenciaActual(null);
        getCorrespondenciaSessionBean().setCorrespondenciasList(null);
        getUserInfoSessionBean().setSubTabCorrespondenciaSelected("go.correspondencia.consultar");
        return "go.correspondencia.consultar";
    }
     public String hyperlink1_action() {
        CorrespondenciaSvc svc =  getCorrespondenciaSessionBean().getCorrespondenciaSvc();
        String val = this.hyperlink1.getText().toString();
        Integer idCorrespondencia = Integer.valueOf(val.substring(4));
        CorrespondenciaVo tmp = svc.getCorrespondencia(idCorrespondencia);
        getCorrespondenciaSessionBean().setCorrespondenciaActual(tmp);
        getCorrespondenciaSessionBean().setCorrespondenciasList(svc.getCorrespondenciasPorGrupo(tmp.getGrupo()));
        return null;
    }
}
