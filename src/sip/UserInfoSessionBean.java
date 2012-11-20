/*
 * UserInfoSessionBean.java
 *
 * Created on 17 de septiembre de 2006, 19:27
 * Copyright Administrador
 */
package sip;

import com.sun.rave.web.ui.appbase.AbstractSessionBean;
import javax.faces.FacesException;
import com.unal.convenio.sip.admin.voh.UsuarioVo;
import javax.faces.context.FacesContext;
import com.unal.convenio.sip.admin.service.AdminSvc;
import com.unal.convenio.sip.admin.service.AdminSvcImpl;
import com.unal.util.SipLog;
import java.util.Iterator;
import java.util.*;
import javax.servlet.http.HttpServletResponse;
import javax.faces.context.ExternalContext;
/**
 * <p>Session scope data bean for your application.  Create properties
 *  here to represent cached data that should be made available across
 *  multiple HTTP requests for an individual user.</p>
 *
 * <p>An instance of this class will be created for you automatically,
 * the first time your application evaluates a value binding expression
 * or method binding expression that references a managed bean using
 * this class.</p>
 */
public class UserInfoSessionBean extends AbstractSessionBean {
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
     * <p>Construir una instancia de bean de datos de la sesi�n.</p>
     */
    public UserInfoSessionBean() {
    }

    /** 
     * <p>Devolver una referencia al bean de datos con �mbito.</p>
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1)getBean("ApplicationBean1");
    }

    protected AdminSessionBean getAdminSessionBean() {
        return (AdminSessionBean)getBean("AdminSessionBean");
    }

    /** 
     * <p>Se llama a este m�todo al agregar este bean al
     * �mbito de la sesi�n.  Normalmente, esto ocurre como resultado de la evaluaci�n
     * de una expresi�n de enlace de valores o de m�todos, que utiliza la
     * funci�n de bean administrado para crear una instancia de este bean y almacenarla en el
     * �mbito de la sesi�n.</p>
     * 
     * <p>Puede personalizar este m�todo para inicializar y almacenar en cach� los valores
     * o recursos necesarios para el ciclo de duraci�n de una
     * sesi�n de usuario en particular.</p>
     */
    private Map permisos = new myMap();
    
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
            log("UserInfoSessionBean Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Realizar inicio de aplicaci�n que debe finalizar
        // *despu�s* de que se inicien los componentes administrados
        inicializarPermisos();
    }

    /** 
     * <p>Se llama a este m�todo cuando la sesi�n que lo contiene est� apunto de
     * configurarse en modo pasivo.  Normalmente, esto ocurre en un contenedor de servlet distribuido
     * cuando la sesi�n est� apunto de transferirse a otra
     * instancia de contenedor, despu�s de la cual se llamar� al m�todo <code>activate()</code>
     * para indicar que la transferencia se ha completado.</p>
     * 
     * <p>Puede personalizar este m�todo para liberar las referencias a datos
     * o recursos de sesi�n que no pueden serializarse con la propia sesi�n.</p>
     */
    public void passivate() {
    }

    /** 
     * <p>Se llama a este m�todo cuando la sesi�n que lo contiene se
     * reactiva.</p>
     * 
     * <p>Puede personalizar este m�todo para volver a adquirir las referencias a
     * datos o recursos de la sesi�n que no pudieron serializarse con la
     * propia sesi�n.</p>
     */
    public void activate() {
    }

    /** 
     * <p>Se llama a este m�todo al eliminar este bean del
     * �mbito de la sesi�n.  Normalmente, esto ocurre cuando
     * se supera el tiempo de espera de la sesi�n o la aplicaci�n la finaliza.</p>
     * 
     * <p>Puede personalizar este m�todo para limpiar los recursos asignados
     * durante la ejecuci�n del m�todo <code>init()</code> o
     * m�s adelante durante el ciclo de vida de la aplicaci�n.</p>
     */
    public void destroy() {
    }
    
    public void inicializarPermisos(){
        AdminSvc svc = new AdminSvcImpl();
        UsuarioVo usuario = getAdminSessionBean().getUsuarioLogged();
        List resources = svc.getObjetosGranted(usuario.getId_usuario(),"VER");
        Iterator it = resources.iterator();
        while( it.hasNext()){
            permisos.put( it.next() , new Boolean(true));
        }
    }  
    
    public boolean isAdministrador() {
        AdminSvc adminSvc = new AdminSvcImpl();
        UsuarioVo usuario = getAdminSessionBean().getUsuarioLogged();
        return adminSvc.isAdministrador(usuario);
    }
    
    public Map getPermiso(){
        return permisos;
    }
    
    private class myMap extends java.util.HashMap{
        public myMap(){
            super();
        }        

        public Object get(Object key) {
            Object resultado = super.get(key);
            if( resultado == null){
                resultado = new Boolean(false);
            }
            return resultado;
        }
    }

    // Esto permite recordar Tab y subTab seleccionadas

    private String tabSelected = "";
    private String subTabAdminSelected = "go.admin.personas";
    private String subTabCorrespodenciaSelected = "go.correspondencia.consultar";
    private String subTabAyudaSelected = "go.ayuda.general";

    
    public String getTabSelected(){
        return tabSelected;
    }

    public void setTabSelected(String tab){
        tabSelected = tab;
    }
    
    public String getSubTabAdminSelected() {

        return this.subTabAdminSelected;
    }

    public void setSubTabAdminSelected(String subTab) {

        this.subTabAdminSelected = subTab;
    }
    
    public String getSubTabCorrespondenciaSelected() {

        return this.subTabCorrespodenciaSelected;
    }

    public void setSubTabCorrespondenciaSelected(String subTab) {

        this.subTabCorrespodenciaSelected = subTab;
    }
    public String getSubTabAyudaSelected() {

        return this.subTabAyudaSelected;
    }

    public void setSubTabAyudaSelected(String subTab) {

        this.subTabAyudaSelected = subTab;
    }
    
}
