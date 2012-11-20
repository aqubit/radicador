/*
 * menu.java
 *
 * Created on 19 de septiembre de 2006, 9:17
 * Copyright Administrador
 */
package sip;

import com.sun.rave.web.ui.appbase.AbstractFragmentBean;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlPanelGrid;
import com.sun.rave.web.ui.component.TabSet;
import com.sun.rave.web.ui.component.Tab;
import com.sun.rave.web.ui.component.PanelLayout;
import com.sun.rave.web.ui.component.Hyperlink;
import javax.faces.context.FacesContext;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.PageSeparator;
import com.sun.rave.web.ui.component.ImageComponent;

/**
 * <p>Fragment bean that corresponds to a similarly named JSP page
 * fragment.  This class contains component definitions (and initialization
 * code) for all components that you have defined on this fragment, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class menu extends AbstractFragmentBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }

    private TabSet tabSetSipol = new TabSet();

    public TabSet getTabSetSipol() {
        return tabSetSipol;
    }

    public void setTabSetSipol(TabSet ts) {
        this.tabSetSipol = ts;
    }

    private Tab tabAdmin = new Tab();

    public Tab getTabAdmin() {
        return tabAdmin;
    }

    public void setTabAdmin(Tab t) {
        this.tabAdmin = t;
    }

    private PanelLayout layoutPanel1 = new PanelLayout();

    public PanelLayout getLayoutPanel1() {
        return layoutPanel1;
    }

    public void setLayoutPanel1(PanelLayout pl) {
        this.layoutPanel1 = pl;
    }

    private HtmlPanelGrid gridPanel1 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel1() {
        return gridPanel1;
    }

    public void setGridPanel1(HtmlPanelGrid hpg) {
        this.gridPanel1 = hpg;
    }

    private Hyperlink hyplnkPermisos = new Hyperlink();

    public Hyperlink getHyplnkPermisos() {
        return hyplnkPermisos;
    }

    public void setHyplnkPermisos(Hyperlink h) {
        this.hyplnkPermisos = h;
    }

    private Hyperlink hyplnkPerfiles = new Hyperlink();

    public Hyperlink getHyplnkPerfiles() {
        return hyplnkPerfiles;
    }

    public void setHyplnkPerfiles(Hyperlink h) {
        this.hyplnkPerfiles = h;
    }

    private Hyperlink hyplnkPersonas = new Hyperlink();

    public Hyperlink getHyplnkPersonas() {
        return hyplnkPersonas;
    }

    public void setHyplnkPersonas(Hyperlink h) {
        this.hyplnkPersonas = h;
    }

    private Hyperlink hyplnkTablas = new Hyperlink();

    public Hyperlink getHyplnkTablas() {
        return hyplnkTablas;
    }

    public void setHyplnkTablas(Hyperlink h) {
        this.hyplnkTablas = h;
    }

    private Hyperlink hyplnkRecursos = new Hyperlink();

    public Hyperlink getHyplnkRecursos() {
        return hyplnkRecursos;
    }

    public void setHyplnkRecursos(Hyperlink h) {
        this.hyplnkRecursos = h;
    }

    private Hyperlink hyplnkRoles = new Hyperlink();

    public Hyperlink getHyplnkRoles() {
        return hyplnkRoles;
    }

    public void setHyplnkRoles(Hyperlink h) {
        this.hyplnkRoles = h;
    }

    private Hyperlink hyplnkUsuarios = new Hyperlink();

    public Hyperlink getHyplnkUsuarios() {
        return hyplnkUsuarios;
    }

    public void setHyplnkUsuarios(Hyperlink h) {
        this.hyplnkUsuarios = h;
    }

    private Tab tabCorrespondencia = new Tab();

    public Tab getTabCorrespondencia() {
        return tabCorrespondencia;
    }

    public void setTabCorrespondencia(Tab t) {
        this.tabCorrespondencia = t;
    }

    private PanelLayout layoutPanel2 = new PanelLayout();

    public PanelLayout getLayoutPanel2() {
        return layoutPanel2;
    }

    public void setLayoutPanel2(PanelLayout pl) {
        this.layoutPanel2 = pl;
    }

    private HtmlPanelGrid gridPanel2 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel2() {
        return gridPanel2;
    }

    public void setGridPanel2(HtmlPanelGrid hpg) {
        this.gridPanel2 = hpg;
    }

    private Hyperlink hyplnkConsultar = new Hyperlink();

    public Hyperlink getHyplnkConsultar() {
        return hyplnkConsultar;
    }

    public void setHyplnkConsultar(Hyperlink h) {
        this.hyplnkConsultar = h;
    }

    private Hyperlink hyplnkRegistrar = new Hyperlink();

    public Hyperlink getHyplnkRegistrar() {
        return hyplnkRegistrar;
    }

    public void setHyplnkRegistrar(Hyperlink h) {
        this.hyplnkRegistrar = h;
    }

    private Link link3 = new Link();

    public Link getLink3() {
        return link3;
    }

    public void setLink3(Link l) {
        this.link3 = l;
    }

    private Tab tabAyuda = new Tab();

    public Tab getTabAyuda() {
        return tabAyuda;
    }

    public void setTabAyuda(Tab t) {
        this.tabAyuda = t;
    }

    private PanelLayout layoutPanel3 = new PanelLayout();

    public PanelLayout getLayoutPanel3() {
        return layoutPanel3;
    }

    public void setLayoutPanel3(PanelLayout pl) {
        this.layoutPanel3 = pl;
    }

    private HtmlPanelGrid gridPanel3 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel3() {
        return gridPanel3;
    }

    public void setGridPanel3(HtmlPanelGrid hpg) {
        this.gridPanel3 = hpg;
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

    private HtmlPanelGrid gridPanel4 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel4() {
        return gridPanel4;
    }

    public void setGridPanel4(HtmlPanelGrid hpg) {
        this.gridPanel4 = hpg;
    }

    private ImageComponent image3 = new ImageComponent();

    public ImageComponent getImage3() {
        return image3;
    }

    public void setImage3(ImageComponent ic) {
        this.image3 = ic;
    }

    private Hyperlink hyplnkLogout = new Hyperlink();

    public Hyperlink getHyplnkLogout() {
        return hyplnkLogout;
    }

    public void setHyplnkLogout(Hyperlink h) {
        this.hyplnkLogout = h;
    }

    private HtmlPanelGrid gridPanel5 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel5() {
        return gridPanel5;
    }

    public void setGridPanel5(HtmlPanelGrid hpg) {
        this.gridPanel5 = hpg;
    }

    private Hyperlink hyplnkCorrespondencia = new Hyperlink();

    public Hyperlink getHyplnkCorrespondencia() {
        return hyplnkCorrespondencia;
    }

    public void setHyplnkCorrespondencia(Hyperlink h) {
        this.hyplnkCorrespondencia = h;
    }

    private Hyperlink hyplnkAdmin = new Hyperlink();

    public Hyperlink getHyplnkAdmin() {
        return hyplnkAdmin;
    }

    public void setHyplnkAdmin(Hyperlink h) {
        this.hyplnkAdmin = h;
    }

    private Hyperlink hyplnkGeneral = new Hyperlink();

    public Hyperlink getHyplnkGeneral() {
        return hyplnkGeneral;
    }

    public void setHyplnkGeneral(Hyperlink h) {
        this.hyplnkGeneral = h;
    }
    // </editor-fold>
    
    public menu() {
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
    protected CorrespondenciaSessionBean getCorrespondenciaSessionBean() {
        return (CorrespondenciaSessionBean)getBean("CorrespondenciaSessionBean");
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
    
    static java.util.Map menus;
    static String[] subTabsAdmin = { 
                             "/modulos/admin/personas.jsp",
                             "/modulos/admin/perfiles.jsp",
                             "/modulos/admin/permisos.jsp",
                             "/modulos/admin/recursos.jsp",
                             "/modulos/admin/roles.jsp",
                             "/modulos/admin/tablas.jsp",
                             "/modulos/admin/usuarios.jsp"
    };
                             
    static String[] subTabsCorrespondencia = { 
                             "/modulos/correspondencia/consultar.jsp",
                             "/modulos/correspondencia/crear.jsp"
    };

    static String[] subTabsAyuda = { 
                             "/modulos/ayuda/general.jsp",
                             "/modulos/ayuda/admin.jsp",
                             "/modulos/ayuda/correspondencia.jsp"
    };    
    
    static{
        menus = new java.util.HashMap();
        menus.put( "tabAdmin", subTabsAdmin);
        menus.put( "tabCorrespondencia", subTabsCorrespondencia);
        menus.put( "tabAyuda", subTabsAyuda);        
        
    }
    
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
            log("menu Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Realizar inicio de aplicación que debe finalizar
        // *después* de que se inicien los componentes administrados
        tabSetSipol.setSelected(getUserInfoSessionBean().getTabSelected());

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

    
    private int getSelectedIndex() {
         FacesContext fc = getFacesContext();
         String viewId = fc.getViewRoot().getViewId();
         String tabSelected = tabSetSipol.getSelected();
         String[] subTabs = (String[])menus.get(tabSelected);
         for (int i = 0; i < subTabs.length; i++) {
             if (viewId.equals(subTabs[i])) {
                 return i;
             }
         }
         return-1;
    }

    public String getColClasses() {
        StringBuffer sb = new StringBuffer();
        //Se asume que este método solo puede ser llamado
        //una vez se selecciona un tab. Por tanto getSelected
        //nunca retornara null
        String tabSelected = tabSetSipol.getSelected();
        String[] subTabs = (String[])menus.get(tabSelected);
        int sel = getSelectedIndex();
        for (int i = 0; i < sel; i++) {
            sb.append("notselected,");
        }
        if( sel != -1 )sb.append("selected,");
        for (int i = sel+1; i < subTabs.length; i++) {
            sb.append("notselected,");
        }
        return sb.toString();
    }
    


    public String hyplnkLogout_action() {
        getAdminSessionBean().logout();
        return "go.logout";
    }


    public String hyplnkPerfiles_action() {
        getUserInfoSessionBean().setSubTabAdminSelected("go.admin.perfiles");
        return "go.admin.perfiles";
    }


    public String hyplnkPermisos_action() {
        getUserInfoSessionBean().setSubTabAdminSelected("go.admin.permisos");
        return "go.admin.permisos";        
    }


    public String hyplnkConsultar_action() {
        getUserInfoSessionBean().setSubTabCorrespondenciaSelected("go.correspondencia.consultar");
        return "go.correspondencia.consultar";        
    }


    public String hyplnkRegistrar_action() {
        getUserInfoSessionBean().setSubTabCorrespondenciaSelected("go.correspondencia.registrar");
        return "go.correspondencia.registrar"; 
    }


    public String hyplnkUsuarios_action() {
        getUserInfoSessionBean().setSubTabAdminSelected("go.admin.usuarios");
        return "go.admin.usuarios";   
    }


    public String hyplnkTablas_action() {
        getUserInfoSessionBean().setSubTabAdminSelected("go.admin.tablas");
        return "go.admin.tablas";   
    }


    public String hyplnkRoles_action() {
        getUserInfoSessionBean().setSubTabAdminSelected("go.admin.roles");
        return "go.admin.roles";   
    }


    public String hyplnkRecursos_action() {
        getUserInfoSessionBean().setSubTabAdminSelected("go.admin.recursos");
        return "go.admin.recursos";   
    }

    public String hyplnkPersonas_action() {
        getUserInfoSessionBean().setSubTabAdminSelected("go.admin.personas");
        return "go.admin.personas";   
    }


    public String hyplnkGeneral_action() {
        getUserInfoSessionBean().setSubTabAyudaSelected("go.ayuda.general");
        return "go.ayuda.general";   
    }


    public String hyplnkAdmin_action() {
        getUserInfoSessionBean().setSubTabAyudaSelected("go.ayuda.admin");
        return "go.ayuda.admin";   
    }


    public String hyplnkCorrespondencia_action() {
        getUserInfoSessionBean().setSubTabAyudaSelected("go.ayuda.correspondencia");
        return "go.ayuda.correspondencia";           
    }

    public String tabAdmin_action() {
        getUserInfoSessionBean().setTabSelected("tabAdmin");
        return getUserInfoSessionBean().getSubTabAdminSelected();
    }


    public String tabCorrespondencia_action() {
        getUserInfoSessionBean().setTabSelected("tabCorrespondencia");
        return getUserInfoSessionBean().getSubTabCorrespondenciaSelected();
    }

    public String tabAyuda_action() {
        getUserInfoSessionBean().setTabSelected("tabAyuda");
        return getUserInfoSessionBean().getSubTabAyudaSelected();
    }
}
