/*
 * AdminSvc.java
 *
 * Created on 15 de febrero de 2006, 12:44 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.admin.service;
import com.unal.convenio.sip.admin.voh.RolVo;
import com.unal.convenio.sip.admin.voh.TablaReferenciaVo;
import com.unal.convenio.sip.admin.voh.TipoReferenciaVo;
import com.unal.convenio.sip.admin.voh.UsuarioVo;
import com.unal.convenio.sip.admin.voh.PersonaVo;
import com.unal.convenio.sip.admin.voh.TablaReferenciaVo;
import com.unal.convenio.sip.admin.voh.RecursoVo;
import com.unal.convenio.sip.common.service.SipDataProvider;
import java.util.List;
import java.util.Set;
/**
 *
 * @author César
 */
public interface AdminSvc {   
    //Rol
    List    getRoles();
    RolVo   getRol(Integer id);
    boolean persistirRol(RolVo rol);
    boolean deleteRol(RolVo rol);
    //Usuario
    List    getUsuarios(UsuarioVo usuario);    
    UsuarioVo getUsuarioPasswd(String login);
    UsuarioVo getUsuario(Integer id);
    List    getUsuariosPorRol(Integer id);
    boolean deleteUsuario(UsuarioVo usuario);
    boolean persistirUsuario(UsuarioVo usuario);       
    boolean isAdministrador(UsuarioVo usuario);
    int getLongitudMinimaContrasena();
    //Persona
    List    getPersonas();
    List    getPersonas(PersonaVo filtro);
    PersonaVo getPersona(Integer id);
    boolean deletePersona(PersonaVo persona);
    boolean persistirPersona(PersonaVo persona);    
    //Referencias
    TipoReferenciaVo  getTipoReferencia(Integer id);
    List    getTipoReferencias();
    List    getReferenciasPorTipo(String tipo);
    List    getReferenciasPorTipo(Integer id);
    TablaReferenciaVo getReferencia(Integer id);
    public boolean    persistirReferencia(TablaReferenciaVo ref);
    public boolean    deleteReferencia(TablaReferenciaVo ref);
    //Recursos
    List        getRecursos(RecursoVo recurso);
    RecursoVo   getRecurso(Integer id);
    boolean     persistirRecurso(RecursoVo recurso);
    boolean     deleteRecurso(RecursoVo recurso);
    //Permisos
    public List getPermisos(Integer idRecurso);
    public List getObjetosGranted(Integer idUsuario, String strTipoPermiso);
}

