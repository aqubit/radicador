/*
 * header.java
 *
 * Created on 24 de septiembre de 2006, 20:29
 * Copyright Administrador
 */
package sip;

import com.sun.rave.web.ui.appbase.AbstractFragmentBean;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlPanelGrid;
import com.sun.rave.web.ui.component.ImageComponent;
import com.sun.rave.web.ui.component.TabSet;
import com.sun.rave.web.ui.component.Tab;
import com.sun.rave.web.ui.component.PageSeparator;
import com.sun.rave.web.ui.component.Link;

/**
 * <p>Fragment bean that corresponds to a similarly named JSP page
 * fragment.  This class contains component definitions (and initialization
 * code) for all components that you have defined on this fragment, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class header extends AbstractFragmentBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }

    private HtmlPanelGrid pnlHeader1 = new HtmlPanelGrid();

    public HtmlPanelGrid getPnlHeader1() {
        return pnlHeader1;
    }

    public void setPnlHeader1(HtmlPanelGrid hpg) {
        this.pnlHeader1 = hpg;
    }

    private HtmlPanelGrid gridPanel1 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel1() {
        return gridPanel1;
    }

    public void setGridPanel1(HtmlPanelGrid hpg) {
        this.gridPanel1 = hpg;
    }

    private ImageComponent image1 = new ImageComponent();

    public ImageComponent getImage1() {
        return image1;
    }

    public void setImage1(ImageComponent ic) {
        this.image1 = ic;
    }

    private ImageComponent image2 = new ImageComponent();

    public ImageComponent getImage2() {
        return image2;
    }

    public void setImage2(ImageComponent ic) {
        this.image2 = ic;
    }

    private ImageComponent image3 = new ImageComponent();

    public ImageComponent getImage3() {
        return image3;
    }

    public void setImage3(ImageComponent ic) {
        this.image3 = ic;
    }

    private PageSeparator pageSeparator1 = new PageSeparator();

    public PageSeparator getPageSeparator1() {
        return pageSeparator1;
    }

    public void setPageSeparator1(PageSeparator ps) {
        this.pageSeparator1 = ps;
    }

    private Link link1 = new Link();

    public Link getLink1() {
        return link1;
    }

    public void setLink1(Link l) {
        this.link1 = l;
    }
    // </editor-fold>
    
    public header() {
    }

    /** 
     * <p>Devolver una referencia al bean de datos con ámbito.</p>
     */
    protected CorrespondenciaSessionBean getCorrespondenciaSessionBean() {
        return (CorrespondenciaSessionBean)getBean("CorrespondenciaSessionBean");
    }


    /** 
     * <p>Devolver una referencia al bean de datos con ámbito.</p>
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1)getBean("ApplicationBean1");
    }


    /** 
     * <p>Devolver una referencia al bean de datos con ámbito.</p>
     */
    protected AdminSessionBean getAdminSessionBean() {
        return (AdminSessionBean)getBean("AdminSessionBean");
    }


    /** 
     * <p>Devolver una referencia al bean de datos con ámbito.</p>
     */
    protected UserInfoSessionBean getUserInfoSessionBean() {
        return (UserInfoSessionBean)getBean("UserInfoSessionBean");
    }


    /** 
     * <p>Método de devolución de llamada al que se llama cuando se navega hasta una página que contiene
     * este fragmento, ya sea directamente mediante de un URL,
     * o indirectamente a través de la navegación de páginas.  Puede anular este método para adquirir
     * recursos que necesitarán los controladores de eventos y métodos del ciclo de vida.</p>
     * 
     * <p>La implementación predeterminada no hace nada.</p>
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
            log("header Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Realizar inicio de aplicación que debe finalizar
        // *después* de que se inicien los componentes administrados
        // TODO - Agregar código de inicio propio aquí

    }

    /** 
     * <p>Método de devolución de llamada al que se llama cuando se completa el procesamiento de
     * esta petición, si se ha llamado a <code>init()</code>.  Puede anular este
     * método para liberar los recursos adquiridos en los recursos <code>init()</code>
     * que necesitarán los controladores de eventos y métodos del ciclo de vida.</p>
     * 
     * <p>La implementación predeterminada no hace nada.</p>
     */
    public void destroy() {
    }
}
