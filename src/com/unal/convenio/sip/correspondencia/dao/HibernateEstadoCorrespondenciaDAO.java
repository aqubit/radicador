/*
 * HibernateEstadoCorrespondenciaDAO.java
 *
 * Created on 1 de marzo de 2006, 10:35 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.correspondencia.dao;
import com.unal.convenio.sip.correspondencia.voh.EstadoCorrespondenciaVo;
import com.unal.convenio.sip.common.service.HibernateSvc;
import com.unal.util.SipLog;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
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
import org.hibernate.Hibernate;

/**
 *
 * @author César
 */
public class HibernateEstadoCorrespondenciaDAO implements EstadoCorrespondenciaDAO {
    
    /**
     * Creates a new instance of HibernateEstadoCorrespondenciaDAO 
     */
    public HibernateEstadoCorrespondenciaDAO() {
    }
    
   public List findEstadosPorCorrespondencia(Integer id_correspondencia) {
        if(id_correspondencia==null)return null;
        List resultados = null;
        boolean bOk = true;
        Session session = null;
        // [1] Creamos una Session        
        try{
            session = HibernateSvc.currentSession();
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
                Criteria criteria = session.createCriteria( EstadoCorrespondenciaVo.class );         
                criteria.add(Restrictions.eq("id_correspondencia", id_correspondencia));
                criteria.setFetchMode("idref_estado",FetchMode.JOIN);
                criteria.setFetchMode("persona",FetchMode.JOIN);
                criteria.addOrder( Property.forName("id_estado_correspondencia").asc() );                    
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
                    HibernateSvc.closeSession();
                } catch (HibernateException e) {
                    SipLog.getLogger().error("No se puede cerrar una sesión hibernate.", e);            
                }
            }
            
        }
        return resultados;
    }    
       
    public boolean saveUpdate(EstadoCorrespondenciaVo ob) {
        return HibernateSvc.saveUpdate(ob);
    }

    public boolean delete(EstadoCorrespondenciaVo ob) {
        return HibernateSvc.delete(ob);
    }    
}
