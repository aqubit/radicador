/*
 * UsuarioDAO.java
 *
 * Created on 1 de marzo de 2006, 10:39 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.admin.dao;
import com.unal.convenio.sip.admin.voh.UsuarioVo;
import java.util.List;

/**
 *
 * @author César
 */
public interface UsuarioDAO {
    
    /**
     * 
     * @return Todos los usuarios de la aplicación.
     */
    public List findAll();
    public UsuarioVo find(Integer id);
    public UsuarioVo findUsuarioPasswd(String login);
    public boolean saveUpdate(UsuarioVo ob);
    public boolean delete(UsuarioVo ob);
}

