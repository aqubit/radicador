/*
 * TipoReferenciaDAO.java
 *
 * Created on 24 de febrero de 2006, 12:41 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.admin.dao;
import com.unal.convenio.sip.admin.voh.TipoReferenciaVo;

import java.util.List;
/**
 *
 * @author César
 */
public interface TipoReferenciaDAO {
    public List findAll();
    public List findReferenciasPorTipo(String nombreTipo);
    public List findReferenciasPorTipo(Integer idTipo);
    public TipoReferenciaVo find(Integer id);
    public boolean saveUpdate(TipoReferenciaVo ob);
    public boolean delete(TipoReferenciaVo ob);
}
