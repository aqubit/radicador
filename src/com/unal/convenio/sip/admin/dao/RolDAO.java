/*
 * RolDAO.java
 *
 * Created on 1 de marzo de 2006, 10:32 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.admin.dao;
import com.unal.convenio.sip.admin.voh.RolVo;
import java.util.List;

/**
 *
 * @author César
 */
public interface RolDAO {
    public List findAll();
    public List findUsuariosPorRol(Integer id);
    public RolVo find(Integer id);
    public boolean saveUpdate(RolVo ob);
    public boolean delete(RolVo ob);
}
