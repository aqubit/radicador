/*
 * TablaPersonaDAO.java
 *
 * Created on 26 de febrero de 2006, 10:19 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.common.dao;
import com.unal.convenio.sip.common.voh.LogVo;
import java.util.List;
/**
 *
 * @author César
 */
public interface LogDAO {   
  public boolean saveUpdate(LogVo ob);
  public boolean delete(LogVo ob);
  public List findAll(LogVo ob);    
  public LogVo find(Integer id);    
}
