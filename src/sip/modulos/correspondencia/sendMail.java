/*
 * sendMail.java
 *
 * Created on 9 de marzo de 2006, 01:25 PM
 * Copyright MB
 */
package sip.modulos.correspondencia;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import com.unal.util.SipLog;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.component.TextArea;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.Button;
import com.unal.util.mail.*;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.sql.rowset.CachedRowSetXImpl;
/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class sendMail extends AbstractPageBean {
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
    private Label label3 = new Label();
    public Label getLabel3() {
        return label3;
    }
    public void setLabel3(Label l) {
        this.label3 = l;
    }
    private TextField txtFrom = new TextField();
    public TextField getTxtFrom() {
        return txtFrom;
    }
    public void setTxtFrom(TextField tf) {
        this.txtFrom = tf;
    }
    private TextField txtTo = new TextField();
    public TextField getTxtTo() {
        return txtTo;
    }
    public void setTxtTo(TextField tf) {
        this.txtTo = tf;
    }
    private TextArea txaMsg = new TextArea();
    public TextArea getTxaMsg() {
        return txaMsg;
    }
    public void setTxaMsg(TextArea ta) {
        this.txaMsg = ta;
    }
    private TextField txtSubject = new TextField();
    public TextField getTxtSubject() {
        return txtSubject;
    }
    public void setTxtSubject(TextField tf) {
        this.txtSubject = tf;
    }
    private Button button1 = new Button();
    public Button getButton1() {
        return button1;
    }
    public void setButton1(Button b) {
        this.button1 = b;
    }
    private TextField txtmailserver = new TextField();
    public TextField getTxtmailserver() {
        return txtmailserver;
    }
    public void setTxtmailserver(TextField tf) {
        this.txtmailserver = tf;
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
    // </editor-fold>
    /**
     * <p>Construir una instancia de bean de p�gina.</p>
     */
    public sendMail() {
    }
    /**
     * <p>Devolver una referencia al bean de datos con �mbito.</p>
     */
    protected sip.UserInfoSessionBean getUserInfoSessionBean() {
        return (sip.UserInfoSessionBean)getBean("UserInfoSessionBean");
    }
    private com.unal.util.mail.MailInfoVo vo = new com.unal.util.mail.MailInfoVo();
    public com.unal.util.mail.MailInfoVo getVo(){return vo;}
    public void setVo(com.unal.util.mail.MailInfoVo vo){this.vo=vo;}
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
            log("sendMail Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Efect�e la inicializaci�n de aplicaci�n que debe completarse
        // *despu�s* de inicializar los componentes gestionados
        // TODO - agregue aqu� su propio c�digo de inicializaci�n
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
    public String enciar_action(){
        /*String from = "cjacunac@gmail.com";
        String to = "cjacunac@unal.edu.co";
        try {
           MailInfoVo correo = new MailInfoVo();
           correo.setFrom(from);
           correo.setTo(to);
           correo.setMessage(txaMsg.getText().toString());
           /*java.io.PrintStream message = client.startMessage();
           message.println("To: " + to);
           // TODO: definir la l�nea de tema
           message.println("Subject: Customer Comments");
           // TODO: definir el cuerpo del mensaje
           message.println(txaMsg.getText().toString());
           SendEmailSvc.send(correo);
        } catch (Exception e) {
           // en caso de producirse una excepci�n, imprima un mensaje en el registro de salida
           SipLog.getLogger().error("Error enviando correo de prueba");
        }*/
        return null;
    }
}
