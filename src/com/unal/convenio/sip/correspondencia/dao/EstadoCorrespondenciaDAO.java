/*
 * EstadoCorrespondenciaDAO.java
 *
 * Created on 1 de marzo de 2006, 10:32 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.correspondencia.dao;
import com.unal.convenio.sip.correspondencia.voh.EstadoCorrespondenciaVo;
import java.util.List;

/**
 *
 * @author César
 */
public interface EstadoCorrespondenciaDAO {
    public boolean saveUpdate(EstadoCorrespondenciaVo ob);
    public boolean delete(EstadoCorrespondenciaVo ob);
    public List findEstadosPorCorrespondencia(Integer id_correspondencia);
}
