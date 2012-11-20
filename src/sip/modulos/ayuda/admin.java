/*
 * admin.java
 *
 * Created on 25 de septiembre de 2006, 7:19
 * Copyright Administrador
 */
package sip.modulos.ayuda;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlPanelGrid;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class admin extends AbstractPageBean {
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

    private Link link2 = new Link();

    public Link getLink2() {
        return link2;
    }

    public void setLink2(Link l) {
        this.link2 = l;
    }
    
    // </editor-fold>


    /** 
     * <p>Construir una instancia de bean de página.</p>
     */
    public admin() {
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
        // Realizar iniciaciones heredadas de la superclase
        super.init();
        // Realizar inicio de aplicación que debe finalizar
        // *antes* de que se inicien los componentes administrados
        // TODO - Agregar código de inicio propio aquí

        // <editor-fold defaultstate="collapsed" desc="Inicio de componente administrado por el programa">
        // Iniciar componentes administrados automáticamente
        // *Nota* - esta lógica NO debe modificarse
        try {
            _init();
        } catch (Exception e) {
            log("admin Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Realizar inicio de aplicación que debe finalizar
        // *después* de que se inicien los componentes administrados
        // TODO - Agregar código de inicio propio aquí

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
}

