/*
 * HibernateTipoReferenciaDAO.java
 *
 * Created on 24 de febrero de 2006, 12:43 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.admin.dao;
import com.unal.convenio.sip.common.service.HibernateSvc;
import com.unal.convenio.sip.admin.voh.TipoReferenciaVo;
import com.unal.convenio.sip.admin.voh.TablaReferenciaVo;
import com.unal.convenio.sip.common.service.HibernateSvc;
import java.util.List;
import java.util.ArrayList;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author César
 */
public class HibernateTipoReferenciaDAO implements TipoReferenciaDAO {
    
    /** Creates a new instance of HibernateTipoReferenciaDAO */
    public HibernateTipoReferenciaDAO() {
    }

    public java.util.List findAll() {
        List resultados = HibernateSvc.consultarTabla(
                    TipoReferenciaVo.class, 
                    null,
                    null, 
                    Property.forName("nombre").asc(),
                    0, 
                    com.unal.util.Constantes.TODOS);
        return resultados;
    }    
    
    public List findReferenciasPorTipo(String nombreTipo) {
        TipoReferenciaVo resultado = null;
        List restricciones = null;
        List joins = null;
        joins = new ArrayList();
        restricciones = new ArrayList();
        joins.add("referencias");
        restricciones.add(Restrictions.eq("nombre", nombreTipo));
        resultado = (TipoReferenciaVo)HibernateSvc.find(
                    TipoReferenciaVo.class, 
                    restricciones,
                    joins,
                    null);
        return new ArrayList(resultado.getReferencias());             
    }    


    public List findReferenciasPorTipo(Integer idTipo) {
        TipoReferenciaVo resultado = null;
        List restricciones = null;
        List joins = null;
        joins = new ArrayList();
        restricciones = new ArrayList();
        joins.add("referencias");
        resultado = (TipoReferenciaVo)HibernateSvc.find(
                    TipoReferenciaVo.class, 
                    null,
                    joins,
                    idTipo);
        return new ArrayList(resultado.getReferencias());             
    }    
    
    public TipoReferenciaVo find(Integer id) {
        return (TipoReferenciaVo)HibernateSvc.find(TipoReferenciaVo.class, null, null, id);        
    }    
    
    public boolean saveUpdate(TipoReferenciaVo ob) {
        return false;
    }

    public boolean delete(TipoReferenciaVo ob) {
        return false;
    }         
}
