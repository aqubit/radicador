/*
 * TablaReferenciasDAO.java
 *
 * Created on 17 de febrero de 2006, 10:00 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.admin.dao;

import com.unal.convenio.sip.admin.voh.TablaReferenciaVo;
import java.util.List;

/**
 *
 * @author César
 */
public interface TablaReferenciaDAO {   
  public boolean saveUpdate(TablaReferenciaVo ob);
  public boolean delete(TablaReferenciaVo ob);
  public List findAll(TablaReferenciaVo ob);
  public TablaReferenciaVo find(Integer id);
}
