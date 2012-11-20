/*
 * entact.java
 *
 * Created on 16 de febrero de 2006, 10:49 AM
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
import com.unal.convenio.sip.admin.voh.TablaReferenciaVo;
import com.unal.convenio.sip.common.service.SipDataProvider;
import com.unal.convenio.sip.correspondencia.service.NoCambiaException;
import com.unal.convenio.sip.correspondencia.service.SubirArchivoException;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.TextArea;
import com.sun.rave.web.ui.component.Checkbox;
import com.sun.rave.web.ui.component.Message;
import com.sun.rave.web.ui.component.HiddenField;
import java.util.*;
import javax.faces.convert.DateTimeConverter;
import com.sun.jsfcl.convert.SqlTimestampConverter;
import javax.faces.event.ValueChangeEvent;
import com.sun.rave.web.ui.component.Calendar;
import com.sun.rave.web.ui.component.MessageGroup;
import sip.CorrespondenciaSessionBean;
import com.unal.convenio.sip.correspondencia.service.*;
import com.unal.convenio.sip.correspondencia.voh.*;
import com.unal.convenio.sip.admin.voh.*;
import com.unal.util.*;
import javax.faces.component.html.HtmlSelectOneMenu;
import com.sun.jsfcl.data.DefaultSelectItemsArray;
import javax.faces.component.UISelectItems;
import javax.faces.convert.IntegerConverter;
import javax.faces.component.html.HtmlPanelGrid;
import com.sun.rave.web.ui.component.PanelLayout;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.faces.application.FacesMessage;
import com.sun.rave.web.ui.component.PanelGroup;
import com.unal.convenio.sip.admin.service.AdminSvc;
import com.sun.rave.web.ui.component.Hyperlink;
import com.sun.rave.web.ui.component.Upload;
import com.sun.rave.web.ui.model.UploadedFile;
import java.io.File;
import javax.servlet.ServletContext;
import javax.faces.component.html.HtmlOutputLink;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlCommandLink;
import com.sun.rave.web.ui.component.ImageHyperlink;
/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class actualizar extends AbstractPageBean {
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
    private Label label14 = new Label();
    public Label getLabel14() {
        return label14;
    }
    public void setLabel14(Label l) {
        this.label14 = l;
    }
    private Label label19 = new Label();
    public Label getLabel19() {
        return label19;
    }
    public void setLabel19(Label l) {
        this.label19 = l;
    }
    private DateTimeConverter dateTimeConverter1 = new DateTimeConverter();
    public DateTimeConverter getDateTimeConverter1() {
        return dateTimeConverter1;
    }
    public void setDateTimeConverter1(DateTimeConverter dtc) {
        this.dateTimeConverter1 = dtc;
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
    private Label lblFecVence = new Label();
    public Label getLblFecVence() {
        return lblFecVence;
    }
    public void setLblFecVence(Label l) {
        this.lblFecVence = l;
    }
    private Calendar calendar1 = new Calendar();
    public Calendar getCalendar1() {
        return calendar1;
    }
    public void setCalendar1(Calendar c) {
        this.calendar1 = c;
    }
    private TextArea txaAsunto = new TextArea();
    public TextArea getTxaAsunto() {
        return txaAsunto;
    }
    public void setTxaAsunto(TextArea ta) {
        this.txaAsunto = ta;
    }
    private Label lblFecRegistro = new Label();
    public Label getLblFecRegistro() {
        return lblFecRegistro;
    }
    public void setLblFecRegistro(Label l) {
        this.lblFecRegistro = l;
    }
    private Label lblFecUltima = new Label();
    public Label getLblFecUltima() {
        return lblFecUltima;
    }
    public void setLblFecUltima(Label l) {
        this.lblFecUltima = l;
    }
    private Label lableID = new Label();
    public Label getLableID() {
        return lableID;
    }
    public void setLableID(Label l) {
        this.lableID = l;
    }
    private Button btnActualizar = new Button();
    public Button getBtnActualizar() {
        return btnActualizar;
    }
    public void setBtnActualizar(Button b) {
        this.btnActualizar = b;
    }
    private Button btnCancelar = new Button();
    public Button getBtnCancelar() {
        return btnCancelar;
    }
    public void setBtnCancelar(Button b) {
        this.btnCancelar = b;
    }
    private MessageGroup messageGroup1 = new MessageGroup();
    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }
    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    private TextField txtNroRadicacion = new TextField();
    public TextField getTxtNroRadicacion() {
        return txtNroRadicacion;
    }
    public void setTxtNroRadicacion(TextField tf) {
        this.txtNroRadicacion = tf;
    }
    private HtmlSelectOneMenu ddDestinatario = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdDestinatario() {
        return ddDestinatario;
    }
    public void setDdDestinatario(HtmlSelectOneMenu hsom) {
        this.ddDestinatario = hsom;
    }
    private DefaultSelectItemsArray ddRemitenteDefaultItems = new DefaultSelectItemsArray();
    public DefaultSelectItemsArray getDdRemitenteDefaultItems() {
        return ddRemitenteDefaultItems;
    }
    public void setDdRemitenteDefaultItems(DefaultSelectItemsArray dsia) {
        this.ddRemitenteDefaultItems = dsia;
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
    private DefaultSelectItemsArray ddEstadoActDefaultItems = new DefaultSelectItemsArray();
    public DefaultSelectItemsArray getDdEstadoActDefaultItems() {
        return ddEstadoActDefaultItems;
    }
    public void setDdEstadoActDefaultItems(DefaultSelectItemsArray dsia) {
        this.ddEstadoActDefaultItems = dsia;
    }
    private UISelectItems dropdown2SelectItems = new UISelectItems();
    public UISelectItems getDropdown2SelectItems() {
        return dropdown2SelectItems;
    }
    public void setDropdown2SelectItems(UISelectItems uisi) {
        this.dropdown2SelectItems = uisi;
    }
    private HtmlSelectOneMenu ddPadre = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdPadre() {
        return ddPadre;
    }
    public void setDdPadre(HtmlSelectOneMenu hsom) {
        this.ddPadre = hsom;
    }    private DefaultSelectItemsArray ddRolItems = new DefaultSelectItemsArray();
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
    private DefaultSelectItemsArray ddPadreDefaultItems = new DefaultSelectItemsArray();
    public DefaultSelectItemsArray getDdPadreDefaultItems() {
        return ddPadreDefaultItems;
    }
    public void setDdPadreDefaultItems(DefaultSelectItemsArray dsia) {
        this.ddPadreDefaultItems = dsia;
    }
    private UISelectItems dropdown3SelectItems = new UISelectItems();
    public UISelectItems getDropdown3SelectItems() {
        return dropdown3SelectItems;
    }
    public void setDropdown3SelectItems(UISelectItems uisi) {
        this.dropdown3SelectItems = uisi;
    }
    private IntegerConverter integerConverter1 = new IntegerConverter();
    public IntegerConverter getIntegerConverter1() {
        return integerConverter1;
    }
    public void setIntegerConverter1(IntegerConverter ic) {
        this.integerConverter1 = ic;
    }
    private Label label13 = new Label();
    public Label getLabel13() {
        return label13;
    }
    public void setLabel13(Label l) {
        this.label13 = l;
    }
    private HtmlPanelGrid pnlControles = new HtmlPanelGrid();
    public HtmlPanelGrid getPnlControles() {
        return pnlControles;
    }
    public void setPnlControles(HtmlPanelGrid hpg) {
        this.pnlControles = hpg;
    }
    private PanelLayout layoutPanel1 = new PanelLayout();
    public PanelLayout getLayoutPanel1() {
        return layoutPanel1;
    }
    public void setLayoutPanel1(PanelLayout pl) {
        this.layoutPanel1 = pl;
    }
    private PanelLayout layoutPanel2 = new PanelLayout();
    public PanelLayout getLayoutPanel2() {
        return layoutPanel2;
    }
    public void setLayoutPanel2(PanelLayout pl){
        this.layoutPanel2 = pl;
    }
    private PanelLayout pnlBotones = new PanelLayout();
    public PanelLayout getPnlBotones() {
        return pnlBotones;
    }
    public void setPnlBotones(PanelLayout pl) {
        this.pnlBotones = pl;
    }
    private PanelLayout layoutPanel4 = new PanelLayout();
    public PanelLayout getLayoutPanel4() {
        return layoutPanel4;
    }
    public void setLayoutPanel4(PanelLayout pl) {
        this.layoutPanel4 = pl;
    }
    private HtmlPanelGrid pnlPrincipal = new HtmlPanelGrid();
    public HtmlPanelGrid getPnlPrincipal() {
        return pnlPrincipal;
    }
    public void setPnlPrincipal(HtmlPanelGrid hpg) {
        this.pnlPrincipal = hpg;
    }
    private Button btnBuscarPadre = new Button();
    public Button getBtnBuscarPadre() {
        return btnBuscarPadre;
    }
    public void setBtnBuscarPadre(Button b) {
        this.btnBuscarPadre = b;
    }
    private TextField txtfldCorrespondenciaPadre = new TextField();
    public TextField getTxtfldCorrespondenciaPadre() {
        return txtfldCorrespondenciaPadre;
    }
    public void setTxtfldCorrespondenciaPadre(TextField tf) {
        this.txtfldCorrespondenciaPadre = tf;
    }
    private Label label6 = new Label();
    public Label getLabel6() {
        return label6;
    }
    public void setLabel6(Label l) {
        this.label6 = l;
    }
    private PanelLayout layoutPanel5 = new PanelLayout();
    public PanelLayout getLayoutPanel5() {
        return layoutPanel5;
    }
    public void setLayoutPanel5(PanelLayout pl) {
        this.layoutPanel5 = pl;
    }
    private Upload fileUpload = new Upload();
    public Upload getFileUpload() {
        return fileUpload;
    }
    public void setFileUpload(Upload u) {
        this.fileUpload = u;
    }
    private Hyperlink downloadLink = new Hyperlink();
    public Hyperlink getDownloadLink() {
        return downloadLink;
    }
    public void setDownloadLink(Hyperlink h) {
        this.downloadLink = h;
    }
    private PanelLayout layoutPanel6 = new PanelLayout();
    public PanelLayout getLayoutPanel6() {
        return layoutPanel6;
    }
    public void setLayoutPanel6(PanelLayout pl) {
        this.layoutPanel6 = pl;
    }
    private TextField txtNroContrato1 = new TextField();
    public TextField getTxtNroContrato1() {
        return txtNroContrato1;
    }
    public void setTxtNroContrato1(TextField tf) {
        this.txtNroContrato1 = tf;
    }
    private Label label15 = new Label();
    public Label getLabel15() {
        return label15;
    }
    public void setLabel15(Label l) {
        this.label15 = l;
    }
    private HtmlSelectOneMenu ddAno = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdAno() {
        return ddAno;
    }
    public void setDdAno(HtmlSelectOneMenu hsom) {
        this.ddAno = hsom;
    }
    private UISelectItems dropdown1SelectItems1 = new UISelectItems();
    public UISelectItems getDropdown1SelectItems1() {
        return dropdown1SelectItems1;
    }
    public void setDropdown1SelectItems1(UISelectItems uisi) {
        this.dropdown1SelectItems1 = uisi;
    }
    private Label label16 = new Label();
    public Label getLabel16() {
        return label16;
    }
    public void setLabel16(Label l) {
        this.label16 = l;
    }
    private HtmlSelectOneMenu ddDependencia = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdDependencia() {
        return ddDependencia;
    }
    public void setDdDependencia(HtmlSelectOneMenu hsom) {
        this.ddDependencia = hsom;
    }
    private UISelectItems dropdown1SelectItems2 = new UISelectItems();
    public UISelectItems getDropdown1SelectItems2() {
        return dropdown1SelectItems2;
    }
    public void setDropdown1SelectItems2(UISelectItems uisi) {
        this.dropdown1SelectItems2 = uisi;
    }
    private Label label17 = new Label();
    public Label getLabel17() {
        return label17;
    }
    public void setLabel17(Label l) {
        this.label17 = l;
    }
    private HtmlSelectOneMenu ddRol = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdRol() {
        return ddRol;
    }
    public void setDdRol(HtmlSelectOneMenu hsom) {
        this.ddRol = hsom;
    }
    private UISelectItems dropdown1SelectItems3 = new UISelectItems();
    public UISelectItems getDropdown1SelectItems3() {
        return dropdown1SelectItems3;
    }
    public void setDropdown1SelectItems3(UISelectItems uisi) {
        this.dropdown1SelectItems3 = uisi;
    }
    private Label label18 = new Label();
    public Label getLabel18() {
        return label18;
    }
    public void setLabel18(Label l) {
        this.label18 = l;
    }
    private Label lableID1 = new Label();
    public Label getLableID1() {
        return lableID1;
    }
    public void setLableID1(Label l) {
        this.lableID1 = l;
    }
    private Button btnBorrarDocumento = new Button();
    public Button getBtnBorrarDocumento() {
        return btnBorrarDocumento;
    }
    public void setBtnBorrarDocumento(Button b) {
        this.btnBorrarDocumento = b;
    }
    private PanelLayout layoutPanel7 = new PanelLayout();
    public PanelLayout getLayoutPanel7() {
        return layoutPanel7;
    }
    public void setLayoutPanel7(PanelLayout pl) {
        this.layoutPanel7 = pl;
    }
    private HtmlSelectOneMenu ddRemitente = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdRemitente() {
        return ddRemitente;
    }
    public void setDdRemitente(HtmlSelectOneMenu hsom) {
        this.ddRemitente = hsom;
    }
    private UISelectItems dropdown1SelectItems4 = new UISelectItems();
    public UISelectItems getDropdown1SelectItems4() {
        return dropdown1SelectItems4;
    }
    public void setDropdown1SelectItems4(UISelectItems uisi) {
        this.dropdown1SelectItems4 = uisi;
    }
    private ImageHyperlink imageHyperlink1 = new ImageHyperlink();
    public ImageHyperlink getImageHyperlink1() {
        return imageHyperlink1;
    }
    public void setImageHyperlink1(ImageHyperlink ih) {
        this.imageHyperlink1 = ih;
    }
    private ImageHyperlink imageHyperlink2 = new ImageHyperlink();
    public ImageHyperlink getImageHyperlink2() {
        return imageHyperlink2;
    }
    public void setImageHyperlink2(ImageHyperlink ih) {
        this.imageHyperlink2 = ih;
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
    private HtmlSelectOneMenu ddCaracter = new HtmlSelectOneMenu();
    public HtmlSelectOneMenu getDdCaracter() {
        return ddCaracter;
    }
    public void setDdCaracter(HtmlSelectOneMenu hsom) {
        this.ddCaracter = hsom;
    }
    private UISelectItems dropdown2SelectItems2 = new UISelectItems();
    public UISelectItems getDropdown2SelectItems2() {
        return dropdown2SelectItems2;
    }
    public void setDropdown2SelectItems2(UISelectItems uisi) {
        this.dropdown2SelectItems2 = uisi;
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
    private Label label20 = new Label();
    public Label getLabel20() {
        return label20;
    }
    public void setLabel20(Label l) {
        this.label20 = l;
    }
    private Label label21 = new Label();
    public Label getLabel21() {
        return label21;
    }
    public void setLabel21(Label l) {
        this.label21 = l;
    }
    private Calendar calFechaRadicacion = new Calendar();
    public Calendar getCalFechaRadicacion() {
        return calFechaRadicacion;
    }
    public void setCalFechaRadicacion(Calendar c) {
        this.calFechaRadicacion = c;
    }
    private Label label22 = new Label();
    public Label getLabel22() {
        return label22;
    }
    public void setLabel22(Label l) {
        this.label22 = l;
    }
    private TextField txtNroRadicacionInvias = new TextField();
    public TextField getTxtNroRadicacionInvias() {
        return txtNroRadicacionInvias;
    }
    public void setTxtNroRadicacionInvias(TextField tf) {
        this.txtNroRadicacionInvias = tf;
    }
    private Label label23 = new Label();
    public Label getLabel23() {
        return label23;
    }
    public void setLabel23(Label l) {
        this.label23 = l;
    }
    private Calendar calFechaRadicacionInvias = new Calendar();
    public Calendar getCalFechaRadicacionInvias() {
        return calFechaRadicacionInvias;
    }
    public void setCalFechaRadicacionInvias(Calendar c) {
        this.calFechaRadicacionInvias = c;
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

    private Label lablClase = new Label();

    public Label getLablClase() {
        return lablClase;
    }

    public void setLablClase(Label l) {
        this.lablClase = l;
    }

    private HtmlPanelGrid gridPanel1 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel1() {
        return gridPanel1;
    }

    public void setGridPanel1(HtmlPanelGrid hpg) {
        this.gridPanel1 = hpg;
    }

    private TextArea textArea1 = new TextArea();

    public TextArea getTextArea1() {
        return textArea1;
    }

    public void setTextArea1(TextArea ta) {
        this.textArea1 = ta;
    }
    // </editor-fold>
    /**
     * <p>Construir una instancia de bean de página.</p>
     */
    public actualizar() {
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
        // <editor-fold defaultstate="collapsed" desc="Inicio de componente administrado por el programa">
        // Inicialice los componentes gestionados automáticamente
        // *Nota* - esta lógica *NO* debe modificarse
        try {
            _init();
        } catch (Exception e) {
            log("entact Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Efectúe la inicialización de aplicación que debe completarse
        // *después* de inicializar los componentes gestionados
        guiMessages = getApplicationBean1().getGuiMessages();
        CorrespondenciaSvc svc = getCorrespondenciaSessionBean().getCorrespondenciaSvc();
        AdminSvc svcAdmin = getAdminSessionBean().getAdminSvc();
        CorrespondenciaVo currentVo = getCorrespondenciaSessionBean().getCorrespondenciaActual();
        Map remitentes = svc.getRemitentesMap();
        Map estadosAct = (currentVo.getClase().startsWith("E"))?svc.getEstadosEntMap():svc.getEstadosSalMap();
        CorrespondenciaVo filtro = new CorrespondenciaVo();
        filtro.setRol_propietario(currentVo.getRol_propietario());
        Map corresp = svc.getCorrespondenciasBaseMap(currentVo.getId_correspondencia(),filtro);
        ToolBox.poblarDropDown(ddRemitenteDefaultItems, remitentes);
        ToolBox.poblarDropDown(ddEstadoActDefaultItems, estadosAct);
        ToolBox.poblarDropDown(ddPadreDefaultItems, corresp);
        ToolBox.poblarDropDown(ddRolItems, svcAdmin.getRoles());
        ToolBox.poblarDropDown(ddAnoItems, svc.getAnosContratos());
        ToolBox.poblarDropDown(ddDependenciaItems, svc.getDependenciasContratos());
        ToolBox.poblarDropDown(ddCaracterItems, svc.getCaracteresMap());
        ToolBox.poblarDropDown(ddTipoItems, svc.getTipos());
        vo = currentVo.getCopia();
        if( vo.getDocumento() != null && vo.getDocumento().getNombre_documento() != null ){
            btnBorrarDocumento.setVisible(true);
        }else{
            btnBorrarDocumento.setVisible(false);
        }
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
     */
    public void destroy() {
    }
    //TODO explicación
    public String btnUpdate_action(){
        CorrespondenciaVo voActual = getCorrespondenciaSessionBean().getCorrespondenciaActual();
        CorrespondenciaSvc svc = getCorrespondenciaSessionBean().getCorrespondenciaSvc();
        AdminSvc svcAdmin = getAdminSessionBean().getAdminSvc();
        UsuarioVo usuario = getAdminSessionBean().getUsuarioLogged();
        //Subir el documento al servidor
        UploadedFile uploadedFile = fileUpload.getUploadedFile();
        String uploadedFileName = uploadedFile.getOriginalName();
        if( !uploadedFileName.equals("") ){
            DocumentoVo nuevo = new DocumentoVo();
            byte[] byArrDocumento = uploadDocument();
            if( byArrDocumento == null ){
                return null;
            }
            String justFileName = uploadedFileName.substring
                ( uploadedFileName.lastIndexOf(File.separatorChar) + 1 );
            nuevo.setNombre_documento(justFileName);
            nuevo.setArchivo(byArrDocumento);
            vo.setDocumento(nuevo);
        }else if( !btnBorrarDocumento.isVisible() ){
            //El usuario borro el documento ?
            vo.setDocumento(null);
        }
        //Usuario que hace los cambios
        vo.setIdUsuario( usuario.getId_usuario());
        //Actualizar la correspondencia
        boolean bCambia = true;
        try{
            vo = svc.actualizar(voActual, vo, usuario.getPersona() );
        }catch(CambiaEstadoException e){
            error(guiMessages.getString("errorCambiandoEstadoCorrespondencia"));
            return null;
        }catch(NoCambiaException e){
            bCambia = false;
        }catch(SubirArchivoException e){
            error(guiMessages.getString("errorUploadingDocument"));
            return null;
        }
        if( bCambia ){
            getCorrespondenciaSessionBean().setCorrespondenciaActual(vo);
            getCorrespondenciaSessionBean().setCorrespondenciasList(
                svc.getCorrespondenciasPorGrupo( vo.getGrupo() )
            );
        }
        getUserInfoSessionBean().setSubTabCorrespondenciaSelected("go.correspondencia.infodetallada");
        return "go.correspondencia.infodetallada";
    }
    public String btnCancel_action() {
        getUserInfoSessionBean().setSubTabCorrespondenciaSelected("go.correspondencia.infodetallada");
          return "go.correspondencia.infodetallada";
    }
    public String btnBorrarDocumento_action() {
        vo.setDocumento(null);
        btnBorrarDocumento.setVisible(false);
        downloadLink.setVisible(false);
        return null;
    }
    public String btnBuscarPadre_action() {
        CorrespondenciaSvc svc = getCorrespondenciaSessionBean().getCorrespondenciaSvc();
        CorrespondenciaVo voActual = getCorrespondenciaSessionBean().getCorrespondenciaActual();
        CorrespondenciaVo filtro = new CorrespondenciaVo();
        String patron = ( txtfldCorrespondenciaPadre.getText() != null ? txtfldCorrespondenciaPadre.getText().toString() : null );
        if( patron != null && !patron.equals("") ){
            String[] strValores = patron.split("%");
            if( strValores.length > 0 ){
                try{
                    Integer iId = Integer.valueOf(strValores[0]);
                    filtro.setId_correspondencia(iId);
                }catch(NumberFormatException e){
                }
            }
            if( strValores.length > 1 && strValores[1] != null && !strValores[1].equals("")){
                filtro.setNro_radicacion(strValores[1]);
            }
            if( strValores.length > 2 && strValores[2] != null && !strValores[2].equals("")){
                filtro.setNro_contrato(strValores[2]);
            }
        }
        //Por defecto mostrar únicamente la correspondencia del grupo
        filtro.setRol_propietario(voActual.getRol_propietario());
        Map corresp = svc.getCorrespondenciasBaseMap(voActual.getId_correspondencia(),filtro);
        ToolBox.poblarDropDown(ddPadreDefaultItems, corresp);
        return null;
    }
  public java.util.Date getMinDateRadicacion(){
        java.util.Date fecha = new java.util.Date();
        fecha.setTime(1000*60*60*24*365*35);
        return fecha;
    }
    public java.util.Date getMinDateVencimiento(){
        java.util.Date fecha = new java.util.Date();
        fecha.setTime(fecha.getTime()-(1000*60*60*24));
        return fecha;
    }
    //Validators
    public void txtfldCorrespondenciaPadre_validate(FacesContext context, UIComponent component, Object value) {
        String filtro = (String)value;
        String strError = guiMessages.getString("errorFiltroCorrespondenciaPadre");
        if( filtro != null){
            String[] strValores = filtro.split("%");
            if( strValores.length > 0 && strValores[0] != null && !strValores[0].equals("")){
                try{
                    Integer iId = Integer.valueOf(strValores[0]);
                }catch(NumberFormatException e){
                    error(strError);
                    throw new ValidatorException(new FacesMessage(strError));
                }
            }
            if( strValores.length > 3 ){
                    error(strError);
                    throw new ValidatorException(new FacesMessage(strError));
            }
        }
    }
    //Helper para subir archivos al servidor
    private byte[] uploadDocument(){
        byte[] byArrDocumento = null;
        String strError = guiMessages.getString("errorUploadingDocument");
        String strErrorTipo = guiMessages.getString("errorUploadingDocumentType");
        UploadedFile uploadedFile = fileUpload.getUploadedFile();
        String uploadedFileName = uploadedFile.getOriginalName();
        // some browsers return complete path name, some don't
        // make sure we only have the file name
        String justFileName = uploadedFileName.substring
          ( uploadedFileName.lastIndexOf(File.separatorChar) + 1 );
        Long uploadedFileSize = new Long(uploadedFile.getSize());
        String uploadedFileType = uploadedFile.getContentType();
        //Si se cambian los tipos, cambia download as well
        if ( uploadedFileType.equals("image/jpeg")
           || uploadedFileType.equals("image/pjpeg")
           || uploadedFileType.equals("application/msword")
           || uploadedFileType.equals("application/pdf")) {
            try {
                   // get the path to the /uploaded directory
                   // from the servlet context
                   ServletContext theApplicationsServletContext =
                      (ServletContext) this.getExternalContext().getContext();
                   String realPath =
                      theApplicationsServletContext.getRealPath
                      ("/uploaded");
                   byArrDocumento = uploadedFile.getBytes();
            } catch (Exception ex) {
                   error( strError + " " + justFileName);
            }
        }else{
            error(strErrorTipo);
        }
        return byArrDocumento;
    }
    public java.util.Date getMaxDate(){
        java.util.Date fecha = new java.util.Date();
        return fecha;
    }
    public void calValidateAnterior(FacesContext context, UIComponent component, Object value) {
	java.util.Date fecha = (java.util.Date)value;
        java.util.Date minFecha = getMinDateVencimiento();
        boolean bVencida = getCorrespondenciaSessionBean().getEstaVencidaCorrespondenciaActual();
        if( fecha.before(minFecha) && !bVencida){
            String strError = guiMessages.getString("errorFechaAnteriorHoy");
            error(strError);
            throw new ValidatorException(new FacesMessage(strError));
	}
    }
    public void calValidatePosterior(FacesContext context, UIComponent component, Object value) {
	java.util.Date fecha = (java.util.Date)value;
        java.util.Date maxFecha = getMaxDate();
        if( fecha.after(maxFecha)){
            String strError = guiMessages.getString("errorFechaPosteriorHoy");
            error(strError);
            throw new ValidatorException(new FacesMessage(strError));
	}
    }
}
