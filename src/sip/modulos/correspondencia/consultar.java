/*
 * consultaForm.java
 *
 * Created on 17 de febrero de 2006, 02:35 PM
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
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Calendar;
import com.sun.data.provider.impl.CompareFilterCriteria;
import java.util.*;
import com.unal.convenio.sip.correspondencia.voh.*;
import com.unal.convenio.sip.correspondencia.service.*;
import com.unal.util.*;
import javax.faces.component.html.HtmlSelectOneMenu;
import com.sun.jsfcl.data.DefaultSelectItemsArray;
import javax.faces.component.UISelectItems;
import javax.faces.convert.IntegerConverter;
import com.sun.rave.web.ui.component.MessageGroup;
import javax.faces.component.html.HtmlPanelGrid;
import com.sun.rave.web.ui.component.PanelLayout;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.faces.application.FacesMessage;
import com.unal.convenio.sip.admin.service.AdminSvc;
import javax.faces.convert.BigDecimalConverter;
import com.sun.rave.web.ui.component.ImageHyperlink;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.faces.event.ValueChangeEvent;
import com.sun.j2ee.blueprints.ui.selectvalue.SelectValueComponent;
import javax.faces.model.SelectItem;
/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class consultar extends AbstractPageBean {
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
    private Button btnConsultar = new Button();
    public Button getBtnConsultar() {
        return btnConsultar;
    }
    public void setBtnConsultar(Button b) {
        this.btnConsultar = b;
    }
    private Button btnReset = new Button();
    public Button getBtnReset() {
        return btnReset;
    }
    public void setBtnReset(Button b) {
        this.btnReset = b;
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
    private TextField txtID = new TextField();
    public TextField getTxtID() {
        return txtID;
    }
    public void setTxtID(TextField tf) {
        this.txtID = tf;
    }
    private Calendar calUltimaModif = new Calendar();
    public Calendar getCalUltimaModif() {
        return calUltimaModif;
    }
    public void setCalUltimaModif(Calendar c) {
        this.calUltimaModif = c;
    }
    private Label label8 = new Label();
    public Label getLabel8() {
        return label8;
    }
    public void setLabel8(Label l) {
        this.label8 = l;
    }
    private CompareFilterCriteria compareFilterCriteria1 = new CompareFilterCriteria();
    public CompareFilterCriteria getCompareFilterCriteria1() {
        return compareFilterCriteria1;
    }
    public void setCompareFilterCriteria1(CompareFilterCriteria cfc) {
        this.compareFilterCriteria1 = cfc;
    }
    private HtmlSelectOneMenu ddClase = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdClase() {
        return ddClase;
    }
    public void setDdClase(HtmlSelectOneMenu hsom) {
        this.ddClase = hsom;
    }
    private UISelectItems dropdown1SelectItems = new UISelectItems();
    public UISelectItems getDropdown1SelectItems() {
        return dropdown1SelectItems;
    }
    public void setDropdown1SelectItems(UISelectItems uisi) {
        this.dropdown1SelectItems = uisi;
    }
    private HtmlSelectOneMenu ddEstado = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdEstado() {
        return ddEstado;
    }
    public void setDdEstado(HtmlSelectOneMenu hsom) {
        this.ddEstado = hsom;
    }
    private UISelectItems dropdown1SelectItems1 = new UISelectItems();
    public UISelectItems getDropdown1SelectItems1() {
        return dropdown1SelectItems1;
    }
    public void setDropdown1SelectItems1(UISelectItems uisi) {
        this.dropdown1SelectItems1 = uisi;
    }
    private DefaultSelectItemsArray ddClaseDefaultItems = new DefaultSelectItemsArray();
    public DefaultSelectItemsArray getDdClaseDefaultItems() {
        return ddClaseDefaultItems;
    }
    public void setDdClaseDefaultItems(DefaultSelectItemsArray dsia) {
        this.ddClaseDefaultItems = dsia;
    }
    private HtmlSelectOneMenu ddRemitente = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdRemitente() {
        return ddRemitente;
    }
    public void setDdRemitente(HtmlSelectOneMenu hsom) {
        this.ddRemitente = hsom;
    }
    private UISelectItems dropdown1SelectItems2 = new UISelectItems();
    public UISelectItems getDropdown1SelectItems2() {
        return dropdown1SelectItems2;
    }
    public void setDropdown1SelectItems2(UISelectItems uisi) {
        this.dropdown1SelectItems2 = uisi;
    }
    private DefaultSelectItemsArray ddEstadoDefaultItems = new DefaultSelectItemsArray();
    public DefaultSelectItemsArray getDdEstadoDefaultItems() {
        return ddEstadoDefaultItems;
    }
    public void setDdEstadoDefaultItems(DefaultSelectItemsArray dsia) {
        this.ddEstadoDefaultItems = dsia;
    }
    private DefaultSelectItemsArray ddRemitenteDefaultItems = new DefaultSelectItemsArray();
    public DefaultSelectItemsArray getDdRemitenteDefaultItems() {
        return ddRemitenteDefaultItems;
    }
    public void setDdRemitenteDefaultItems(DefaultSelectItemsArray dsia) {
        this.ddRemitenteDefaultItems = dsia;
    }
    private HtmlSelectOneMenu ddDestinatario = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdDestinatario() {
        return ddDestinatario;
    }
    public void setDdDestinatario(HtmlSelectOneMenu hsom) {
        this.ddDestinatario = hsom;
    }
    private DefaultSelectItemsArray ddDestinatarioDefaultItems = new DefaultSelectItemsArray();
    public DefaultSelectItemsArray getDdDestinatarioDefaultItems() {
        return ddDestinatarioDefaultItems;
    }
    public void setDdDestinatarioDefaultItems(DefaultSelectItemsArray dsia) {
        this.ddDestinatarioDefaultItems = dsia;
    }
    private UISelectItems dropdown2SelectItems = new UISelectItems();
    public UISelectItems getDropdown2SelectItems() {
        return dropdown2SelectItems;
    }
    public void setDropdown2SelectItems(UISelectItems uisi) {
        this.dropdown2SelectItems = uisi;
    }
    private IntegerConverter integerConverter1 = new IntegerConverter();
    public IntegerConverter getIntegerConverter1() {
        return integerConverter1;
    }
    public void setIntegerConverter1(IntegerConverter ic) {
        this.integerConverter1 = ic;
    }
    private Label label9 = new Label();
    public Label getLabel9() {
        return label9;
    }
    public void setLabel9(Label l) {
        this.label9 = l;
    }
    private HtmlSelectOneMenu ddVencer = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdVencer() {
        return ddVencer;
    }
    public void setDdVencer(HtmlSelectOneMenu hsom) {
        this.ddVencer = hsom;
    }
    private DefaultSelectItemsArray ddVencerDefaultItems = new DefaultSelectItemsArray();
    public DefaultSelectItemsArray getDdVencerDefaultItems() {
        return ddVencerDefaultItems;
    }
    public void setDdVencerDefaultItems(DefaultSelectItemsArray dsia) {
        this.ddVencerDefaultItems = dsia;
    }
    private UISelectItems dropdown1SelectItems3 = new UISelectItems();
    public UISelectItems getDropdown1SelectItems3() {
        return dropdown1SelectItems3;
    }
    public void setDropdown1SelectItems3(UISelectItems uisi) {
        this.dropdown1SelectItems3 = uisi;
    }
    private MessageGroup messageGroup1 = new MessageGroup();
    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }
    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    private HtmlPanelGrid pnlControles = new HtmlPanelGrid();
    public HtmlPanelGrid getPnlControles() {
        return pnlControles;
    }
    public void setPnlControles(HtmlPanelGrid hpg) {
        this.pnlControles = hpg;
    }
    private PanelLayout pnlBotones = new PanelLayout();
    public PanelLayout getPnlBotones() {
        return pnlBotones;
    }
    public void setPnlBotones(PanelLayout pl) {
        this.pnlBotones = pl;
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
    private TextField txtNroContrato = new TextField();
    public TextField getTxtNroContrato() {
        return txtNroContrato;
    }
    public void setTxtNroContrato(TextField tf) {
        this.txtNroContrato = tf;
    }
    private Label label1 = new Label();
    public Label getLabel1() {
        return label1;
    }
    public void setLabel1(Label l) {
        this.label1 = l;
    }
    private HtmlSelectOneMenu ddAno = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdAno() {
        return ddAno;
    }
    public void setDdAno(HtmlSelectOneMenu hsom) {
        this.ddAno = hsom;
    }
    private UISelectItems dropdown1SelectItems4 = new UISelectItems();
    public UISelectItems getDropdown1SelectItems4() {
        return dropdown1SelectItems4;
    }
    public void setDropdown1SelectItems4(UISelectItems uisi) {
        this.dropdown1SelectItems4 = uisi;
    }
    private Label label10 = new Label();
    public Label getLabel10() {
        return label10;
    }
    public void setLabel10(Label l) {
        this.label10 = l;
    }
    private HtmlSelectOneMenu ddDependencia = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdDependencia() {
        return ddDependencia;
    }
    public void setDdDependencia(HtmlSelectOneMenu hsom) {
        this.ddDependencia = hsom;
    }
    private UISelectItems dropdown1SelectItems5 = new UISelectItems();
    public UISelectItems getDropdown1SelectItems5() {
        return dropdown1SelectItems5;
    }
    public void setDropdown1SelectItems5(UISelectItems uisi) {
        this.dropdown1SelectItems5 = uisi;
    }
    private Label label11 = new Label();
    public Label getLabel11() {
        return label11;
    }
    public void setLabel11(Label l) {
        this.label11 = l;
    }
    private HtmlSelectOneMenu ddRol = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdRol() {
        return ddRol;
    }
    public void setDdRol(HtmlSelectOneMenu hsom) {
        this.ddRol = hsom;
    }
    private UISelectItems dropdown1SelectItems6 = new UISelectItems();
    public UISelectItems getDropdown1SelectItems6() {
        return dropdown1SelectItems6;
    }
    public void setDropdown1SelectItems6(UISelectItems uisi) {
        this.dropdown1SelectItems6 = uisi;
    }
    private DefaultSelectItemsArray ddRolItems = new DefaultSelectItemsArray();
    public DefaultSelectItemsArray getDdRolItems() {
        return ddRolItems;
    }
    public void setDdRolItems(DefaultSelectItemsArray dsia) {
        this.ddRolItems = dsia;
    }
    private DefaultSelectItemsArray ddAnoItems = new DefaultSelectItemsArray();
    public DefaultSelectItemsArray getDdAnoItems() {
        return ddAnoItems;
    }
    public void setDdAnoItems(DefaultSelectItemsArray dsia) {
        this.ddAnoItems = dsia;
    }
    private DefaultSelectItemsArray ddDependenciaItems = new DefaultSelectItemsArray();
    public DefaultSelectItemsArray getDdDependenciaItems() {
        return ddDependenciaItems;
    }
    public void setDdDependenciaItems(DefaultSelectItemsArray dsia) {
        this.ddDependenciaItems = dsia;
    }
    private BigDecimalConverter bigDecimalConverter1 = new BigDecimalConverter();
    public BigDecimalConverter getBigDecimalConverter1() {
        return bigDecimalConverter1;
    }
    public void setBigDecimalConverter1(BigDecimalConverter bdc) {
        this.bigDecimalConverter1 = bdc;
    }
    private Label label12 = new Label();
    public Label getLabel12() {
        return label12;
    }
    public void setLabel12(Label l) {
        this.label12 = l;
    }
    private TextField txtConsecutivo = new TextField();
    public TextField getTxtConsecutivo() {
        return txtConsecutivo;
    }
    public void setTxtConsecutivo(TextField tf) {
        this.txtConsecutivo = tf;
    }
    private PanelLayout layoutPanel3 = new PanelLayout();
    public PanelLayout getLayoutPanel3() {
        return layoutPanel3;
    }
    public void setLayoutPanel3(PanelLayout pl) {
        this.layoutPanel3 = pl;
    }
    private ImageHyperlink imageHyperlink1 = new ImageHyperlink();
    public ImageHyperlink getImageHyperlink1() {
        return imageHyperlink1;
    }
    public void setImageHyperlink1(ImageHyperlink ih) {
        this.imageHyperlink1 = ih;
    }
    private PanelLayout layoutPanel4 = new PanelLayout();
    public PanelLayout getLayoutPanel4() {
        return layoutPanel4;
    }
    public void setLayoutPanel4(PanelLayout pl) {
        this.layoutPanel4 = pl;
    }
    private ImageHyperlink imageHyperlink2 = new ImageHyperlink();
    public ImageHyperlink getImageHyperlink2() {
        return imageHyperlink2;
    }
    public void setImageHyperlink2(ImageHyperlink ih) {
        this.imageHyperlink2 = ih;
    }
    private Label label13 = new Label();
    public Label getLabel13() {
        return label13;
    }
    public void setLabel13(Label l) {
        this.label13 = l;
    }
    private HtmlSelectOneMenu ddCaracter = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdCaracter() {
        return ddCaracter;
    }
    public void setDdCaracter(HtmlSelectOneMenu hsom) {
        this.ddCaracter = hsom;
    }
    private UISelectItems dropdown1SelectItems7 = new UISelectItems();
    public UISelectItems getDropdown1SelectItems7() {
        return dropdown1SelectItems7;
    }
    public void setDropdown1SelectItems7(UISelectItems uisi) {
        this.dropdown1SelectItems7 = uisi;
    }
    private Label label14 = new Label();
    public Label getLabel14() {
        return label14;
    }
    public void setLabel14(Label l) {
        this.label14 = l;
    }
    private HtmlSelectOneMenu ddTipo = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdTipo() {
        return ddTipo;
    }
    public void setDdTipo(HtmlSelectOneMenu hsom) {
        this.ddTipo = hsom;
    }
    private UISelectItems dropdown1SelectItems8 = new UISelectItems();
    public UISelectItems getDropdown1SelectItems8() {
        return dropdown1SelectItems8;
    }
    public void setDropdown1SelectItems8(UISelectItems uisi) {
        this.dropdown1SelectItems8 = uisi;
    }
    private Label label15 = new Label();
    public Label getLabel15() {
        return label15;
    }
    public void setLabel15(Label l) {
        this.label15 = l;
    }
    private TextField txtNroRadicacion = new TextField();
    public TextField getTxtNroRadicacion() {
        return txtNroRadicacion;
    }
    public void setTxtNroRadicacion(TextField tf) {
        this.txtNroRadicacion = tf;
    }
    private Label label16 = new Label();
    public Label getLabel16() {
        return label16;
    }
    public void setLabel16(Label l) {
        this.label16 = l;
    }
    private Calendar calFechaRadicacion = new Calendar();
    public Calendar getCalFechaRadicacion() {
        return calFechaRadicacion;
    }
    public void setCalFechaRadicacion(Calendar c) {
        this.calFechaRadicacion = c;
    }
    private Label label17 = new Label();
    public Label getLabel17() {
        return label17;
    }
    public void setLabel17(Label l) {
        this.label17 = l;
    }
    private TextField txtNroRadicacionInvias = new TextField();
    public TextField getTxtNroRadicacionInvias() {
        return txtNroRadicacionInvias;
    }
    public void setTxtNroRadicacionInvias(TextField tf) {
        this.txtNroRadicacionInvias = tf;
    }
    private Label label18 = new Label();
    public Label getLabel18() {
        return label18;
    }
    public void setLabel18(Label l) {
        this.label18 = l;
    }
    private Calendar calFechaRadicacionInvias = new Calendar();
    public Calendar getCalFechaRadicacionInvias() {
        return calFechaRadicacionInvias;
    }
    public void setCalFechaRadicacionInvias(Calendar c) {
        this.calFechaRadicacionInvias = c;
    }
    private DefaultSelectItemsArray ddCaracterItems = new DefaultSelectItemsArray();
    public DefaultSelectItemsArray getDdCaracterItems() {
        return ddCaracterItems;
    }
    public void setDdCaracterItems(DefaultSelectItemsArray dsia) {
        this.ddCaracterItems = dsia;
    }
    private DefaultSelectItemsArray ddTipoItems = new DefaultSelectItemsArray();
    public DefaultSelectItemsArray getDdTipoItems() {
        return ddTipoItems;
    }
    public void setDdTipoItems(DefaultSelectItemsArray dsia) {
        this.ddTipoItems = dsia;
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
    private HtmlPanelGrid gridPanel5 = new HtmlPanelGrid();
    public HtmlPanelGrid getGridPanel5() {
        return gridPanel5;
    }
    public void setGridPanel5(HtmlPanelGrid hpg) {
        this.gridPanel5 = hpg;
    }
    private HtmlPanelGrid gridPanel6 = new HtmlPanelGrid();
    public HtmlPanelGrid getGridPanel6() {
        return gridPanel6;
    }
    public void setGridPanel6(HtmlPanelGrid hpg) {
        this.gridPanel6 = hpg;
    }

    private HtmlPanelGrid gridPanel1 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel1() {
        return gridPanel1;
    }

    public void setGridPanel1(HtmlPanelGrid hpg) {
        this.gridPanel1 = hpg;
    }

    private Calendar calUltimaModif2 = new Calendar();

    public Calendar getCalUltimaModif2() {
        return calUltimaModif2;
    }

    public void setCalUltimaModif2(Calendar c) {
        this.calUltimaModif2 = c;
    }

    private Label label19 = new Label();

    public Label getLabel19() {
        return label19;
    }

    public void setLabel19(Label l) {
        this.label19 = l;
    }

    private Label label20 = new Label();

    public Label getLabel20() {
        return label20;
    }

    public void setLabel20(Label l) {
        this.label20 = l;
    }

    private Calendar calFechaRadicacion2 = new Calendar();

    public Calendar getCalFechaRadicacion2() {
        return calFechaRadicacion2;
    }

    public void setCalFechaRadicacion2(Calendar c) {
        this.calFechaRadicacion2 = c;
    }

    private Label label21 = new Label();

    public Label getLabel21() {
        return label21;
    }

    public void setLabel21(Label l) {
        this.label21 = l;
    }

    private Calendar calFechaRadicacionInvias2 = new Calendar();

    public Calendar getCalFechaRadicacionInvias2() {
        return calFechaRadicacionInvias2;
    }

    public void setCalFechaRadicacionInvias2(Calendar c) {
        this.calFechaRadicacionInvias2 = c;
    }
    // </editor-fold>
    /**
     * <p>Construir una instancia de bean de página.</p>
     */
    public consultar() {
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
    protected sip.CorrespondenciaSessionBean getCorrespondenciaSessionBean() {
        return (sip.CorrespondenciaSessionBean)getBean("CorrespondenciaSessionBean");
    }    /**
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

    CorrespondenciaVo vo = getVo();
    
    public CorrespondenciaVo getVo(){
        return vo;
    }
    public void setVo(CorrespondenciaVo vo){
        getCorrespondenciaSessionBean().setFiltro(vo);
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
            log("consultaForm Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Efectúe la inicialización de aplicación que debe completarse
        // *después* de inicializar los componentes gestionados
        guiMessages = getApplicationBean1().getGuiMessages();
        CorrespondenciaSvc svc = getCorrespondenciaSessionBean().getCorrespondenciaSvc();
        AdminSvc svcAdmin = getAdminSessionBean().getAdminSvc();
        Map clases = svc.getClasesMap();
        Map estados = new LinkedHashMap(svc.getEstadosEntMap());
        estados.putAll(svc.getEstadosSalMap());
        Map remitentes = svc.getRemitentesMap();
        Map destinatarios = svc.getDestinatariosMap();
        Map dias = new LinkedHashMap();
        for(int i = 5 ; i >=0 ; i--){
            Integer d = new Integer(i);
            dias.put(d, "A " + d + " dias");
        }
        dias.put(new Integer(-1), "Vencidos");
        ToolBox.poblarDropDown(ddClaseDefaultItems, clases);
        ToolBox.poblarDropDown(ddRemitenteDefaultItems, remitentes);
        ToolBox.poblarDropDown(ddDestinatarioDefaultItems, destinatarios);
        ToolBox.poblarDropDown(ddEstadoDefaultItems, estados);
        ToolBox.poblarDropDown(ddVencerDefaultItems, dias);
        ToolBox.poblarDropDown(ddRolItems,svcAdmin.getRoles());
        ToolBox.poblarDropDown(ddAnoItems,svc.getAnosContratos());
        ToolBox.poblarDropDown(ddDependenciaItems,svc.getDependenciasContratos());
        ToolBox.poblarDropDown(ddCaracterItems,svc.getCaracteresMap());
        ToolBox.poblarDropDown(ddTipoItems,svc.getTipos());
        vo = getCorrespondenciaSessionBean().getFiltro();
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
     *
     * durante la ejecución de un controlador de eventos).</p>     */
    public void destroy() {
    }
    public String btnConsultar_action() {
        CorrespondenciaSvc svc = getCorrespondenciaSessionBean().getCorrespondenciaSvc();
        AdminSvc svcAdmin = getAdminSessionBean().getAdminSvc();
        Integer iDias = (Integer)ddVencer.getValue();
        //Construir el filtro
        if( iDias != null ){
            java.util.Calendar cal =  new java.util.GregorianCalendar();
            cal.clear(java.util.Calendar.MILLISECOND);
            cal.clear(java.util.Calendar.SECOND);
            cal.clear(java.util.Calendar.MINUTE);
            cal.clear(java.util.Calendar.HOUR);
            java.sql.Date hoy = new java.sql.Date( cal.getTime().getTime() );
            java.sql.Date vence = new java.sql.Date(hoy.getTime()+(iDias.intValue()*24*60*60*1000) );
            vo.setFecha_vencimiento(vence);
        }else{
            vo.setFecha_vencimiento(null);
        }
        getCorrespondenciaSessionBean().setCorrespondenciasList(svc.getCorrespondencias(vo));
        getCorrespondenciaSessionBean().setFiltro(vo);
        getUserInfoSessionBean().setSubTabCorrespondenciaSelected("go.correspondencia.resbusqueda");
        return "go.correspondencia.resbusqueda";
    }
    public String btnReset_action() {
        return null;
    }
    public java.util.Date getMinDate(){
        java.util.Date fecha = new java.util.Date();
        fecha.setTime(1000*60*60*24*365*35);
        return fecha;
    }
    public java.util.Date getMaxDate(){
        java.util.Date fecha = new java.util.Date();
        return fecha;
    }    
    public void calValidateFecha1(FacesContext context, UIComponent component, Object value) {
        Calendar calendario2; //Control con el que se compara
        java.util.Date fecha1 = (java.util.Date)value;
        if( component.getId().equals("calUltimaModif")){
            calendario2 = calUltimaModif2;
        }else if(component.getId().equals("calFechaRadicacion")){
            calendario2 = calFechaRadicacion2;
        }else{
            calendario2 = calFechaRadicacionInvias2;
        }
        String strFecha2 = (String)calendario2.getSubmittedValue();
        DateFormat myDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date fecha2 = null;
        try {
             fecha2 = myDateFormat.parse(strFecha2);
        } catch (Exception e) {
             //Si la fecha está mal, el control2 debe verificarla
        }        
        java.util.Date maxFecha = getMaxDate();
        //Si la fecha1 es posterior a la fecha2
        if( fecha2 != null && fecha1 != null && fecha1.after(fecha2)){
            String strError = guiMessages.getString("errorFechaRango");
            error(strError);
            throw new ValidatorException(new FacesMessage(strError));
        }       
        //Si la fecha es posterior a la fecha de hoy
        if( fecha1 != null && fecha1.after(maxFecha)){
            String strError = guiMessages.getString("errorFechaPosteriorHoy");
            error(strError);
            throw new ValidatorException(new FacesMessage(strError));
        }
        if( (fecha1 != null) && ( fecha2 == null ) ){
            String strError = guiMessages.getString("errorFechaFalta");
            error(strError);
            throw new ValidatorException(new FacesMessage(strError));
        }        
    }
    
    public void calValidateFecha2(FacesContext context, UIComponent component, Object value) {
        Calendar calendario1; //Control con el que se compara
        if( component.getId().equals("calUltimaModif2")){
            calendario1 = calUltimaModif;
        }else if(component.getId().equals("calFechaRadicacion2")){
            calendario1 = calFechaRadicacion;
        }else{
            calendario1 = calFechaRadicacionInvias;
        }
        java.util.Date fecha2 = (java.util.Date)value;
        java.util.Date fecha1 = (java.util.Date)calendario1.getValue();
        java.util.Date maxFecha = getMaxDate();
        //Si la fecha es posterior a la fecha de hoy
        if( fecha2 != null && fecha2.after(maxFecha)){
            String strError = guiMessages.getString("errorFechaPosteriorHoy");
            error(strError);
            throw new ValidatorException(new FacesMessage(strError));
        }
        if( (fecha2 != null) && ( fecha1 == null ) ){
            String strError = guiMessages.getString("errorFechaFalta");
            error(strError);
            throw new ValidatorException(new FacesMessage(strError));
        }        
    }
}
