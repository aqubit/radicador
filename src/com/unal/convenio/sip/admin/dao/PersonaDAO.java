/*
 * TablaPersonaDAO.java
 *
 * Created on 26 de febrero de 2006, 10:19 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.admin.dao;
import com.unal.convenio.sip.admin.voh.PersonaVo;
import java.util.List;
/**
 *
 * @author César
 */
public interface PersonaDAO {   
  public boolean saveUpdate(PersonaVo ob);
  public boolean delete(PersonaVo ob);
  public List findAll(PersonaVo ob);    
  public PersonaVo find(Integer id);    
}
