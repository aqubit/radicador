package sip;
import com.sun.rave.web.ui.appbase.AbstractSessionBean;
import com.unal.convenio.sip.admin.service.AdminSvc;
import com.unal.convenio.sip.admin.service.AdminSvcImpl;
import com.unal.convenio.sip.admin.voh.UsuarioVo;
import javax.faces.FacesException;
import com.unal.convenio.sip.correspondencia.service.CorrespondenciaSvc;
import com.unal.convenio.sip.correspondencia.service.CorrespondenciaSvcImpl;
import com.unal.convenio.sip.correspondencia.voh.CorrespondenciaVo;
import com.unal.convenio.sip.correspondencia.voh.DocumentoVo;
import com.unal.convenio.sip.correspondencia.voh.EstadoCorrespondenciaVo;

/**
 * <p>Session scope data bean for your application.  Create properties
 *  here to represent cached data that should be made available across
 *  multiple HTTP requests for an individual user.</p>
 */
public class CorrespondenciaSessionBean extends AbstractSessionBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
    private int __placeholder;

    /** 
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {

    } 
    // </editor-fold>


    /** 
     * <p>Construct a new session data bean instance.</p>
     */
    
    private CorrespondenciaSvc correspondenciaSvc ;
   
    
    
    // </editor-fold>
    public CorrespondenciaSessionBean() {
        this.correspondenciaSvc = new CorrespondenciaSvcImpl();
    }

    /** 
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1)getBean("ApplicationBean1");
    }

    protected AdminSessionBean getAdminSessionBean() {
        return (AdminSessionBean)getBean("AdminSessionBean");
    }
    

    /** 
     * <p>This method is called when this bean is initially added to
     * session scope.  Typically, this occurs as a result of evaluating
     * a value binding or method binding expression, which utilizes the
     * managed bean facility to instantiate this bean and store it into
     * session scope.</p>
     * 
     * <p>You may customize this method to initialize and cache data values
     * or resources that are required for the lifetime of a particular
     * user session.</p>
     */
    public void init() {
            // Efectúe las inicializaciones heredadas de nuestra superclase
            super.init();
        //get the login configuration and set the loginConfig property for the session:
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here

        // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("SessionBean1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
            
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        }


    /** 
     * <p>This method is called when the session containing it is about to be
     * passivated.  Typically, this occurs in a distributed servlet container
     * when the session is about to be transferred to a different
     * container instance, after which the <code>activate()</code> method
     * will be called to indicate that the transfer is complete.</p>
     * 
     * <p>You may customize this method to release references to session data
     * or resources that can not be serialized with the session itself.</p>
     */
    public void passivate() {
    }

    /** 
     * <p>This method is called when the session containing it was
     * reactivated.</p>
     * 
     * <p>You may customize this method to reacquire references to session
     * data or resources that could not be serialized with the
     * session itself.</p>
     */
    public void activate() {
    }


    /** 
     * <p>This method is called when this bean is removed from
     * session scope.  Typically, this occurs as a result of
     * the session timing out or being terminated by the application.</p>
     * 
     * <p>You may customize this method to clean up resources allocated
     * during the execution of the <code>init()</code> method, or
     * at any later time during the lifetime of the application.</p>
     */
    public void destroy() {
    }
    
    public com.unal.convenio.sip.correspondencia.service.CorrespondenciaSvc getCorrespondenciaSvc(){
        return correspondenciaSvc;
    }

    /**
     * Correspondencia Actual
     */
    private CorrespondenciaVo correspondenciaActual;

    /**
     * Getter para propiedad correspondenciaActual.
     * @return Valor de la propiedad correspondenciaActual.
     */
    public CorrespondenciaVo getCorrespondenciaActual() {

        return this.correspondenciaActual;
    }

    /**
    * Setter para propiedad correspondenciaActual.
     * @param correspondenciaActual Nuevo valor de la propiedad correspondenciaActual.
     */
    public void setCorrespondenciaActual(CorrespondenciaVo correspondenciaActual) {
        this.correspondenciaActual = correspondenciaActual;
    }

    /**
     * Conserva el valor de la propiedad correspondenciasList.
     */
    private CorrespondenciaVo[] correspondenciasList;

    /**
     * Getter para propiedad correspondenciasList.
     * @return Valor de la propiedad correspondenciasList.
     */
    public CorrespondenciaVo[] getCorrespondenciasList() {

        return this.correspondenciasList;
    }

    /**
     * Setter para propiedad correspondenciasList.
     * @param correspondenciasList Nuevo valor de la propiedad correspondenciasList.
     */
    public void setCorrespondenciasList(CorrespondenciaVo[] correspondenciasList) {

        this.correspondenciasList = correspondenciasList;
    }
    /**
     * Estados de la correspondencia actual
     */
    public EstadoCorrespondenciaVo[] getEstadosCorrespondenciaActual() {
        if ( this.correspondenciaActual == null ){
            return null;
        }
        return this.correspondenciaSvc.getEstadosPorCorrespondencia(this.correspondenciaActual.getId_correspondencia());
    }
    
    public DocumentoVo getDocumentoCorrespondenciaActual() {
        if ( correspondenciaActual == null ){
            return null;
        }
        return correspondenciaActual.getDocumento();
    }    
    
    //Filtro de la ventana de consulta
    
    CorrespondenciaVo vo = new CorrespondenciaVo();
    
    public CorrespondenciaVo getFiltro(){
        return vo;
    }

    public void setFiltro(CorrespondenciaVo vo){
        this.vo = vo;
    }    

    //Puede el usuario actualizar la correspondencia actual ?
    public boolean getEstaVencidaCorrespondenciaActual() {
        CorrespondenciaSvc svc = new CorrespondenciaSvcImpl();
        return svc.estaVencida(correspondenciaActual);
    }

    
    //Puede el usuario actualizar la correspondencia actual ?
    public boolean getPuedeActualizarCorrespondenciaActual() {
        CorrespondenciaSvc svc = new CorrespondenciaSvcImpl();
        UsuarioVo usuarioActual = getAdminSessionBean().getUsuarioLogged();
        return svc.puedeActualizarCorrespondencia( usuarioActual, correspondenciaActual);
    }
}
