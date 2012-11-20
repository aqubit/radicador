/*
 * HibernateLogDAO.java
 *
 * Created on 24 de febrero de 2006, 12:43 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.common.dao;
import com.unal.convenio.sip.common.service.HibernateSvc;
import com.unal.convenio.sip.common.voh.LogVo;
import com.unal.util.SipLog;
import java.util.List;
import java.util.ArrayList;
import org.hibernate.Hibernate;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Criteria;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.hibernate.FetchMode;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.MatchMode;
/**
 *
 * @author César
 */
public class HibernateLogDAO implements LogDAO {
    
    /** Creates a new instance of HibernateTipoReferenciaDAO */
    public HibernateLogDAO() {
    }
   
    public List findAll(LogVo ob) {
        if(ob==null)return null;
        List resultados = null;
        boolean bOk = true;
        Session session = null;
        // [1] Creamos una Session        
        try{
            session = com.unal.convenio.sip.common.service.HibernateSvc.currentSession();
        }catch(HibernateException e){
            bOk = false;
            SipLog.getLogger().error("No se puede crear una sesión hibernate.", e);            
        }        
        if( bOk ){
            Transaction tx = null;
            try {
            
                // [2] Iniciamos una unidad de trabajo
                tx = session.beginTransaction();                
                // [3] Consultamos el objeto en la base de datos               
                Criteria criteria = session.createCriteria( LogVo.class );  
                if(ob.getId_log()!=null )               
                    criteria.add(Restrictions.eq("id_log", ob.getId_log()));
                if(ob.getId_usuario()!=null )               
                    criteria.add(Restrictions.eq("id_usuario", ob.getId_usuario()));
                if(ob.getOperacion()!=null )               
                    criteria.add(Restrictions.ilike("operacion", ob.getOperacion(), MatchMode.START));
                if(ob.getNombre_tabla()!=null)   
                    criteria.add(Restrictions.ilike("nombre_tabla", ob.getNombre_tabla()));
                if(ob.getId_registro()!=null)      
                    criteria.add(Restrictions.eq("id_registro", ob.getId_registro()));
                
                if(ob.getFecha()!=null && ob.getFechaFin()==null)    
                    criteria.add(Restrictions.eq("fecha", ob.getFecha()));
                else if(ob.getFecha()!=null && ob.getFechaFin()!=null){
                            criteria.add(Restrictions.ge("fecha_vencimiento", ob.getFecha()));
                            criteria.add(Restrictions.le("fecha_vencimiento", ob.getFechaFin()));
                }
                
                
                criteria.addOrder( Property.forName("id_log").asc() );                    
                // [3] Consultamos el objeto en la base de datos
                resultados = criteria.list();    
                
                
      
                    // [4] Confirmamos la transacción
                tx.commit();
            } catch (HibernateException e) {
                if (tx != null) {
                    try {
                        tx.rollback();
                    } catch (HibernateException e2) {
                        SipLog.getLogger().error("No se puede hacer rollback a la transacción.", e2);            
                    }
                }
                bOk = false;
                SipLog.getLogger().error("No se puede finalizar la transacción.", e);            
            }finally {
                try {
                    //[5] Cerramos la sesión
                    com.unal.convenio.sip.common.service.HibernateSvc.closeSession();
                } catch (HibernateException e) {
                    SipLog.getLogger().error("No se puede cerrar una sesión hibernate.", e);            
                }
            }
            
        }
        return resultados;
    }
   
 
    public LogVo find(Integer id) {
       return (LogVo)HibernateSvc.find(LogVo.class, null, null, id);
    }    
    
    
    public boolean saveUpdate(LogVo ob) {
        return HibernateSvc.saveUpdate(ob);
    }

    public boolean delete(LogVo ob) {
        return HibernateSvc.delete(ob);
    }
    
}
