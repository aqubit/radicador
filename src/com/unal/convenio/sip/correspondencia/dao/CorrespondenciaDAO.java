/*
 * TablaPersonaDAO.java
 *
 * Created on 26 de febrero de 2006, 10:19 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.correspondencia.dao;
import com.unal.convenio.sip.correspondencia.voh.CorrespondenciaVo;
import com.unal.convenio.sip.correspondencia.voh.DocumentoVo;
import java.util.List;
/**
 *
 * @author César
 */
public interface CorrespondenciaDAO {   
  public boolean saveUpdate(CorrespondenciaVo ob);
  public boolean delete(CorrespondenciaVo ob);
  public List findAll(CorrespondenciaVo filtro);    
  public List findAllBase(CorrespondenciaVo filtro); 
  public CorrespondenciaVo find(Integer id);    
  public boolean saveUpdateDocumento(DocumentoVo doc, CorrespondenciaVo correspondencia);
}
