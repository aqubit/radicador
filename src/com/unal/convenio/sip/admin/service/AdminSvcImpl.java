/*
 * AdminSvcImpl.java
 *
 * Created on 15 de febrero de 2006, 12:45 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.admin.service;
import com.unal.convenio.sip.admin.dao.DAOFactory;
import com.unal.convenio.sip.admin.dao.RecursoDAO;
import com.unal.convenio.sip.admin.dao.RolDAO;
import com.unal.convenio.sip.admin.dao.TablaReferenciaDAO;
import com.unal.convenio.sip.admin.dao.UsuarioDAO;
import com.unal.convenio.sip.admin.dao.PersonaDAO;
import com.unal.convenio.sip.admin.dao.TipoReferenciaDAO;
import com.unal.convenio.sip.admin.voh.RolVo;
import com.unal.convenio.sip.admin.voh.UsuarioVo;
import com.unal.convenio.sip.admin.voh.PersonaVo;
import com.unal.convenio.sip.admin.voh.RecursoVo;
import com.unal.convenio.sip.admin.voh.TablaReferenciaVo;
import com.unal.convenio.sip.admin.voh.TipoReferenciaVo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/**
 *
 * @author César
 */
public class AdminSvcImpl implements AdminSvc, java.io.Serializable{   
    
    private static DAOFactory daoFactory = DAOFactory.getDAOFactory(DAOFactory.HIBERNATE);
    
    public List getRoles() {
       RolDAO dao = daoFactory.getRolDAO();
       return dao.findAll();
    }        

    public RolVo getRol(Integer id) {
       RolDAO dao = daoFactory.getRolDAO();
       return dao.find(id);        
    }

    public boolean persistirRol(RolVo rol) {
       RolDAO dao = daoFactory.getRolDAO();
       return dao.saveUpdate(rol);             
    }
    
    public boolean deleteRol(RolVo rol) {
       RolDAO dao = daoFactory.getRolDAO();
       return dao.delete(rol);             
    }
    
    public List getUsuarios(UsuarioVo usuario) {
       List resultado = null;
       UsuarioDAO dao = daoFactory.getUsuarioDAO();
       //Si el usuario es un administrador consultar todos los
       //usuarios
       if( isAdministrador(usuario) ){
           resultado = dao.findAll();
       }else{
           resultado = new ArrayList();
           resultado.add( usuario );
       }
       return resultado;
    }    
    
    public List getUsuariosPorRol(Integer id) {
       RolDAO dao = daoFactory.getRolDAO();
       return dao.findUsuariosPorRol(id);
    }        

    public UsuarioVo getUsuario(Integer id) {
       UsuarioDAO dao = daoFactory.getUsuarioDAO();
       return dao.find(id);        
    }

    public UsuarioVo getUsuarioPasswd(String login) {
       UsuarioDAO dao = daoFactory.getUsuarioDAO();
       return dao.findUsuarioPasswd(login);        
    }
    
    
    public boolean deleteUsuario(UsuarioVo usuario) {
       UsuarioDAO dao = daoFactory.getUsuarioDAO();
       return dao.delete(usuario);
    }

    public boolean persistirUsuario(UsuarioVo usuario) {
       UsuarioDAO dao = daoFactory.getUsuarioDAO();
       return dao.saveUpdate(usuario); 
    }

    public java.util.List getTipoReferencias() {
       TipoReferenciaDAO dao = daoFactory.getTipoReferenciaDAO();
       return dao.findAll();
    }

    
    public TablaReferenciaVo getReferencia(Integer id) {
       TablaReferenciaDAO dao = daoFactory.getTablaReferenciasDAO();
       return dao.find(id);        
    }
    
    public List getReferenciasPorTipo(String tipo){
        TipoReferenciaDAO dao = daoFactory.getTipoReferenciaDAO();
        return dao.findReferenciasPorTipo(tipo);              
    }

    public List getReferenciasPorTipo(Integer id){
        TipoReferenciaDAO daoTipo = daoFactory.getTipoReferenciaDAO();
        return daoTipo.findReferenciasPorTipo(id);              
    }

    
    public TipoReferenciaVo getTipoReferencia(Integer id) {
       TipoReferenciaDAO dao = daoFactory.getTipoReferenciaDAO();
       return dao.find(id);        
    }

    public boolean persistirReferencia(TablaReferenciaVo ref) {
        TablaReferenciaDAO dao = daoFactory.getTablaReferenciasDAO();
        return dao.saveUpdate(ref);               
    }

    public boolean deleteReferencia(TablaReferenciaVo ref) {
        TablaReferenciaDAO dao = daoFactory.getTablaReferenciasDAO();
        return dao.delete(ref);               
    }    
    
    public List getPersonas(){
        PersonaDAO dao = daoFactory.getPersonaDAO();
        return dao.findAll(null);        
    }    

    public List getPersonas(PersonaVo filtro){
        PersonaDAO dao = daoFactory.getPersonaDAO();
        return dao.findAll(filtro);        
    }    
    
    public PersonaVo getPersona(Integer id) {
       if( id == null )return null; 
       PersonaDAO dao = daoFactory.getPersonaDAO();
       return dao.find(id);        
    }
    
    public boolean persistirPersona(PersonaVo persona) {
        PersonaDAO dao = daoFactory.getPersonaDAO();
        return dao.saveUpdate(persona);               
    }

    public boolean deletePersona(PersonaVo persona) {
        PersonaDAO dao = daoFactory.getPersonaDAO();
        return dao.delete(persona);                
    }

    public List getRecursos(RecursoVo recurso) {
        RecursoDAO dao = daoFactory.getRecursoDAO();
        return dao.findRecursos(recurso);
    }

    public RecursoVo getRecurso(Integer id) {
       RecursoDAO dao = daoFactory.getRecursoDAO();
       return dao.findRecurso(id);        
    }
    
    public boolean persistirRecurso(RecursoVo recurso) {
        RecursoDAO dao = daoFactory.getRecursoDAO();
        return dao.saveUpdate(recurso);
    }

    public boolean deleteRecurso(RecursoVo recurso) {
        RecursoDAO dao = daoFactory.getRecursoDAO();
        return dao.delete(recurso);       
    }    

    public List getPermisos(Integer idRecurso) {
        RecursoDAO dao = daoFactory.getRecursoDAO();
        return dao.findPermisos(idRecurso);
    }
 
    public List getObjetosGranted(Integer idUsuario, String strTipoPermiso) {
        RecursoDAO dao = daoFactory.getRecursoDAO();
        return dao.findObjetosGranted(idUsuario, strTipoPermiso);
    }

    public boolean isAdministrador(UsuarioVo usuario) {
        boolean bResultado = false;
        RolVo rolAdmin = new RolVo();
        rolAdmin.setId_rol(new Integer(1));
        Set roles = usuario.getRoles();
        if( roles != null && roles.contains(rolAdmin) ){
           bResultado = true;
        }
       return bResultado;
    }
    
    public int getLongitudMinimaContrasena(){
        return 6;
    }
    
}
