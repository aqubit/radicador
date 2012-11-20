/*
 * noautorizado.java
 *
 * Created on 19 de septiembre de 2006, 8:43
 * Copyright Administrador
 */
package sip;

import com.sun.rave.web.ui.appbase.AbstractFragmentBean;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.Alert;

/**
 * <p>Fragment bean that corresponds to a similarly named JSP page
 * fragment.  This class contains component definitions (and initialization
 * code) for all components that you have defined on this fragment, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class noautorizado extends AbstractFragmentBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }

    private Alert alert1 = new Alert();

    public Alert getAlert1() {
        return alert1;
    }

    public void setAlert1(Alert a) {
        this.alert1 = a;
    }
    // </editor-fold>
    
    public noautorizado() {
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
     * <p>Devolver una referencia al bean de datos con �mbito.</p>
     */
    protected sip.CorrespondenciaSessionBean getCorrespondenciaSessionBean() {
        return (sip.CorrespondenciaSessionBean)getBean("CorrespondenciaSessionBean");
    }


    /** 
     * <p>Devolver una referencia al bean de datos con �mbito.</p>
     */
    protected sip.UserInfoSessionBean getUserInfoSessionBean() {
        return (sip.UserInfoSessionBean)getBean("UserInfoSessionBean");
    }


    /** 
     * <p>M�todo de devoluci�n de llamada al que se llama cuando se navega hasta una p�gina que contiene
     * este fragmento, ya sea directamente mediante de un URL,
     * o indirectamente a trav�s de la navegaci�n de p�ginas.  Puede anular este m�todo para adquirir
     * recursos que necesitar�n los controladores de eventos y m�todos del ciclo de vida.</p>
     * 
     * <p>La implementaci�n predeterminada no hace nada.</p>
     */
    public void init() {
        // Realizar iniciaciones heredadas de la superclase
        super.init();
        // Realizar inicio de aplicaci�n que debe finalizar
        // *antes* de que se inicien los componentes administrados
        // TODO - Agregar c�digo de inicio propio aqu�

        // <editor-fold defaultstate="collapsed" desc="Inicio de componente administrado por el programa">
        // Iniciar componentes administrados autom�ticamente
        // *Nota* - esta l�gica NO debe modificarse
        try {
            _init();
        } catch (Exception e) {
            log("noautorizado Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Realizar inicio de aplicaci�n que debe finalizar
        // *despu�s* de que se inicien los componentes administrados
        // TODO - Agregar c�digo de inicio propio aqu�

    }

    /** 
     * <p>M�todo de devoluci�n de llamada al que se llama cuando se completa el procesamiento de
     * esta petici�n, si se ha llamado a <code>init()</code>.  Puede anular este
     * m�todo para liberar los recursos adquiridos en los recursos <code>init()</code>
     * que necesitar�n los controladores de eventos y m�todos del ciclo de vida.</p>
     * 
     * <p>La implementaci�n predeterminada no hace nada.</p>
     */
    public void destroy() {
    }
}
