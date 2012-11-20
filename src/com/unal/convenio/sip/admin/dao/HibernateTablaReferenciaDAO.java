/*
 * HibernateTablaReferenciasDAO.java
 *
 * Created on 17 de febrero de 2006, 10:15 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.admin.dao;

import com.unal.convenio.sip.admin.voh.TablaReferenciaVo;
import com.unal.convenio.sip.common.service.HibernateSvc;
import com.unal.util.SipLog;
import java.util.List;
import java.util.ArrayList;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Property;
/**
 *
 * @author César
 */
public class HibernateTablaReferenciaDAO implements TablaReferenciaDAO{
    
    /** Creates a new instance of HibernateTablaReferenciasDAO */
    public HibernateTablaReferenciaDAO() {
    }
       
    public java.util.List findAll(TablaReferenciaVo ob) { 
        List lRestricciones = null;
        if( ob != null){            
            lRestricciones = new ArrayList();
            if( ob.getId_tiporeferencia() != null){
                lRestricciones.add(Restrictions.eq("id_tiporeferencia", ob.getId_tiporeferencia()));
            }
        } 
        List resultatos = HibernateSvc.consultarTabla(
                    TablaReferenciaVo.class, 
                    lRestricciones,
                    null,
                    Property.forName("nombre").asc(),
                    0,
                    com.unal.util.Constantes.TODOS);
        return resultatos;
    }

    public TablaReferenciaVo find(Integer id) {
        return (TablaReferenciaVo)HibernateSvc.find(TablaReferenciaVo.class, null, null, id);        
    }    
    
    public boolean saveUpdate(TablaReferenciaVo ob) {
        return HibernateSvc.saveUpdate(ob);
    }
    
    public boolean delete(TablaReferenciaVo ob) {
        return HibernateSvc.delete(ob);
    }
}
