/*
 * RecursoDAO.java
 *
 * Created on 1 de marzo de 2006, 10:39 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.admin.dao;
import com.unal.convenio.sip.admin.voh.RecursoVo;
import java.util.List;
import java.util.Set;

/**
 *
 * @author César
 */
public interface RecursoDAO {
    public List findAll();
    public RecursoVo findRecurso(Integer idRecurso);
    public List findRecursos(RecursoVo ob);
    public boolean saveUpdate(RecursoVo ob);
    public boolean delete(RecursoVo ob);
    public List findObjetosGranted(Integer idUsuario, String strTipoPermiso);
    public List findPermisos(Integer idRecurso);
}
