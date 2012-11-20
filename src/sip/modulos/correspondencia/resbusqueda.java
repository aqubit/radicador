/*
 * consultaLst.java
 *
 * Created on 19 de febrero de 2006, 12:51 PM
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
import com.unal.convenio.sip.correspondencia.service.CorrespondenciaSvc;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.data.provider.impl.ObjectArrayDataProvider;
import com.sun.rave.web.ui.component.Table;
import com.sun.rave.web.ui.component.TableRowGroup;
import com.sun.rave.web.ui.model.DefaultTableDataProvider;
import com.sun.rave.web.ui.component.TableColumn;
import com.sun.jsfcl.convert.SqlTimestampConverter;
import com.sun.rave.web.ui.component.ImageHyperlink;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Hyperlink;
import javax.faces.convert.DateTimeConverter;
import com.unal.convenio.sip.correspondencia.voh.CorrespondenciaVo;
import com.sun.rave.web.ui.component.Label;
import javax.faces.component.html.HtmlPanelGrid;
/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class resbusqueda extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
    private int __placeholder;
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        objectArrayDataProvider1.setArray((java.lang.Object[])getValue("#{CorrespondenciaSessionBean.correspondenciasList}"));
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
    private SqlTimestampConverter sqlTimestampConverter1 = new SqlTimestampConverter();
    public SqlTimestampConverter getSqlTimestampConverter1() {
        return sqlTimestampConverter1;
    }
    public void setSqlTimestampConverter1(SqlTimestampConverter stc) {
        this.sqlTimestampConverter1 = stc;
    }
    private DateTimeConverter dateTimeConverter1 = new DateTimeConverter();
    public DateTimeConverter getDateTimeConverter1() {
        return dateTimeConverter1;
    }
    public void setDateTimeConverter1(DateTimeConverter dtc) {
        this.dateTimeConverter1 = dtc;
    }
    private ObjectArrayDataProvider objectArrayDataProvider1 = new ObjectArrayDataProvider();
    public ObjectArrayDataProvider getObjectArrayDataProvider1() {
        return objectArrayDataProvider1;
    }
    public void setObjectArrayDataProvider1(ObjectArrayDataProvider oadp) {
        this.objectArrayDataProvider1 = oadp;
    }
    private TableColumn tableColumn1 = new TableColumn();
    public TableColumn getTableColumn1() {
        return tableColumn1;
    }
    public void setTableColumn1(TableColumn tc) {
        this.tableColumn1 = tc;
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
    private Hyperlink hyperlink1 = new Hyperlink();
    public Hyperlink getHyperlink1() {
        return hyperlink1;
    }
    public void setHyperlink1(Hyperlink h) {
        this.hyperlink1 = h;
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
    private Link link2 = new Link();
    public Link getLink2() {
        return link2;
    }
    public void setLink2(Link l) {
        this.link2 = l;
    }
    private TableColumn tableColumn12 = new TableColumn();
    public TableColumn getTableColumn12() {
        return tableColumn12;
    }
    public void setTableColumn12(TableColumn tc) {
        this.tableColumn12 = tc;
    }
    private StaticText staticText9 = new StaticText();
    public StaticText getStaticText9() {
        return staticText9;
    }
    public void setStaticText9(StaticText st) {
        this.staticText9 = st;
    }
    private TableColumn tableColumn2 = new TableColumn();
    public TableColumn getTableColumn2() {
        return tableColumn2;
    }
    public void setTableColumn2(TableColumn tc) {
        this.tableColumn2 = tc;
    }
    private StaticText staticText10 = new StaticText();
    public StaticText getStaticText10() {
        return staticText10;
    }
    public void setStaticText10(StaticText st) {
        this.staticText10 = st;
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
    private TableColumn tableColumn8 = new TableColumn();
    public TableColumn getTableColumn8() {
        return tableColumn8;
    }
    public void setTableColumn8(TableColumn tc) {
        this.tableColumn8 = tc;
    }
    private StaticText staticText11 = new StaticText();
    public StaticText getStaticText11() {
        return staticText11;
    }
    public void setStaticText11(StaticText st) {
        this.staticText11 = st;
    }

    private HtmlPanelGrid pnlPrincipal = new HtmlPanelGrid();

    public HtmlPanelGrid getPnlPrincipal() {
        return pnlPrincipal;
    }

    public void setPnlPrincipal(HtmlPanelGrid hpg) {
        this.pnlPrincipal = hpg;
    }
    // </editor-fold>    /**
     /* <p>Construir una instancia de bean de página.</p>
     */
    public resbusqueda() {
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
    protected sip.ApplicationBean1 getApplicationBean1() {
        return (sip.ApplicationBean1)getBean("ApplicationBean1");
    }    /**
     * <p>Devolver una referencia al bean de datos con ámbito.</p>
     */
    protected sip.CorrespondenciaSessionBean getCorrespondenciaSessionBean() {
        return (sip.CorrespondenciaSessionBean)getBean("CorrespondenciaSessionBean");
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
            log("newPage Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Efectúe la inicialización de aplicación que debe completarse
        // *después* de inicializar los componentes gestionados
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
     * durante la ejecución de un controlador de eventos).</p>     */
    public void destroy() {
    }    
    
    public String btnDetalle_action() {
        return null;
    }    
    
    public String hyperlink1_action() {
        String val = this.hyperlink1.getText().toString();
        Integer idCorrespondencia = Integer.valueOf(val.substring(4));
        CorrespondenciaSvc svc = getCorrespondenciaSessionBean().getCorrespondenciaSvc();
        CorrespondenciaVo vo = svc.getCorrespondencia(idCorrespondencia);
        if( vo != null ){
            getCorrespondenciaSessionBean().setCorrespondenciaActual(vo);
            getCorrespondenciaSessionBean().setCorrespondenciasList(svc.getCorrespondenciasPorGrupo(vo.getGrupo()));
        }
        getUserInfoSessionBean().setSubTabCorrespondenciaSelected("go.correspondencia.infodetallada");
        return "go.correspondencia.infodetallada";
    }
}
