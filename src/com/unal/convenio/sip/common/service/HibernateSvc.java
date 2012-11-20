/*
 * HibernateService.java
 *
 * Created on 19 de febrero de 2006, 11:49 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.common.service;

import org.hibernate.Criteria;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.MappingException;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;
import org.hibernate.Query;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.SimpleExpression;
import org.hibernate.FetchMode;
import org.hibernate.Hibernate;
import org.hibernate.ScrollableResults;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.persister.entity.AbstractEntityPersister;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import com.unal.convenio.sip.common.vo.BaseVo;
import com.unal.convenio.sip.common.voh.LogVo;
import com.unal.convenio.sip.admin.voh.TablaReferenciaVo;
import com.unal.convenio.sip.admin.voh.TipoReferenciaVo;
import com.unal.convenio.sip.admin.voh.PersonaVo;
import com.unal.convenio.sip.common.service.LogSvc;
import com.unal.convenio.sip.common.service.LogSvcImpl;
import com.unal.util.SipLog;

/**
 *
 * @author César
 */
public class HibernateSvc {

    public static final ThreadLocal session = new ThreadLocal();
    private static final SessionFactory sessionFactory;
    private static final LogSvc sipLogSvc = new LogSvcImpl();    
    
    /** Creates a new instance of HibernateService */
    public HibernateSvc() {
    }
    /************************************************************************/
    /*                                                                      */
    /*                                                                      */
    /*                                                                      */    
    /************************************************************************/     

    static {
        try {
            // Create the SessionFactory
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            SipLog.getLogger().error("Initial SessionFactory creation failed.", ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
        
    public static AbstractEntityPersister getMetaData( Class clase ){
        return (AbstractEntityPersister)sessionFactory.getClassMetadata(clase);        
    }
    /************************************************************************/
    /*                                                                      */
    /*                                                                      */
    /*                                                                      */    
    /************************************************************************/     

     public static Session currentSession() throws HibernateException {
        Session s = (Session) session.get();
        // Open a new Session, if this Thread has none yet
        if (s == null) {
            //s = sessionFactory.openSession(new AuditInterceptor());
            s = sessionFactory.openSession();
            session.set(s);
        }
        return s;
    }
    /************************************************************************/
    /*                                                                      */
    /*                                                                      */
    /*                                                                      */     
    /************************************************************************/     
    public static void closeSession() throws HibernateException {
        Session s = (Session) session.get();
        session.set(null);
        if (s != null)
            s.close();
    }    
    /************************************************************************/
    /*                                                                      */
    /*                                                                      */
    /*                                                                      */    
    /************************************************************************/     

    public static boolean delete(Object obj) {
        boolean bOk = true;
        Session session = null;
        // [1] Creamos una Session        
        try{
            session = currentSession();
        }catch(HibernateException e){
            bOk = false;
            SipLog.getLogger().error("No se puede crear una sesión hibernate.", e);            
        }        

        if( bOk ){
            Transaction tx = null;
            try {
                // [2] Iniciamos una unidad de trabajo
                tx = session.beginTransaction();
                // [3] Guardamos el objeto en la base de datos
                session.delete(obj);       
                if(obj instanceof BaseVo){
                    BaseVo baseVo = (BaseVo)obj;
                    session.saveOrUpdate(sipLogSvc.createLogVo(baseVo, LogSvc.OP_DELETE));
                }                
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
                SipLog.getLogger().error("No se puede borrar el objeto.", e);                           
            }
            finally {
                try {
                    //[5] Cerramos la sesión
                    closeSession();
                } catch (HibernateException e) {
                    SipLog.getLogger().error("No se puede cerrar una sesión hibernate.", e);            
                }
            }
        }
        return bOk;
    }//Fin save    
    
    /************************************************************************/
    /*                                                                      */
    /*                                                                      */
    /*                                                                      */    
    /************************************************************************/     
    
    public static boolean saveUpdate(Object obj) {
        boolean bOk = true;
        Session session = null;
        // [1] Creamos una Session        
        try{
            session = currentSession();
        }catch(HibernateException e){
            bOk = false;
            SipLog.getLogger().error("No se puede crear una sesión hibernate.", e);            
        }        

        if( bOk ){
            Transaction tx = null;
            try {
                // [2] Iniciamos una unidad de trabajo
                tx = session.beginTransaction();
                String op = null;
                BaseVo baseVo = null;
                boolean isBaseVo = obj instanceof com.unal.convenio.sip.common.vo.BaseVo;
                if(isBaseVo){
                    baseVo = (BaseVo)obj;
                    op = (baseVo.getId()==null)?LogSvc.OP_INSERT:LogSvc.OP_UPDATE;
                }
                session.saveOrUpdate(obj);
                if(isBaseVo){
                    session.save(sipLogSvc.createLogVo(baseVo, op));
                }
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
                SipLog.getLogger().error("No se puede persistir el objeto.", e);                           
            }
            finally {
                try {
                    //[5] Cerramos la sesión
                    closeSession();
                } catch (HibernateException e) {
                    SipLog.getLogger().error("No se puede cerrar una sesión hibernate.", e);            
                }
            }
        }
        return bOk;
    }//Fin save

    /************************************************************************/
    /*                                                                      */
    /*                                                                      */
    /*                                                                      */    
    /************************************************************************/     
    
    public static List consultarTabla(
            Class clase, 
            List  restricciones, 
            List  joins, 
            Order order, 
            int   iPrimerRegistro, 
            int   iNumRegistros
    ){
        List resultados = new ArrayList();
        boolean bOk = true;
        Session session = null;
        // [1] Creamos una Session        
        try{
            session = currentSession();
        }catch(HibernateException e){
            bOk = false;
            SipLog.getLogger().error("No se puede crear una sesión hibernate.", e);            
        }        

        if( bOk ){
            Transaction tx = null;
            try {                
                // [2] Iniciamos una unidad de trabajo
                tx = session.beginTransaction();                
                Criteria criteria = session.createCriteria( clase );                
                if( restricciones != null && !restricciones.isEmpty()  ){
                    Iterator it = restricciones.iterator();
                    Object tmp;
                    for(;it.hasNext();){
                        tmp = it.next();
                        if( tmp instanceof SimpleExpression ){
                            criteria.add((SimpleExpression)tmp);
                        }else if(tmp instanceof Criterion){
                            criteria.add((Criterion)tmp);
                        }
                    }                                 
                }                
                if( joins != null && !joins.isEmpty()  ){
                    Iterator it = joins.iterator();
                    for(;it.hasNext();){
                        criteria.setFetchMode((String)it.next(),FetchMode.JOIN);
                    }                                 
                }                
                if( order != null ){
                    criteria.addOrder( order );                    
                }   
                criteria.setFirstResult(iPrimerRegistro);
                if( iNumRegistros != com.unal.util.Constantes.TODOS){
                    criteria.setMaxResults(iNumRegistros);
                }                
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
            }
            finally {
                try {
                    //[5] Cerramos la sesión
                    closeSession();
                } catch (HibernateException e) {
                    SipLog.getLogger().error("No se puede cerrar una sesión hibernate.", e);            
                }
            }
        }
        return resultados;
    }//Fin consultar 

    
    
    /************************************************************************/
    /*                                                                      */
    /*                                                                      */
    /*                                                                      */    
    /************************************************************************/     
    public static Object find(
        Class clase, 
        List restricciones, 
        List joins, 
        Integer id
    ) {
        Object resultado = null;
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
                Criteria criteria = session.createCriteria( clase );        
                if( restricciones != null && !restricciones.isEmpty()  ){
                    Iterator it = restricciones.iterator();
                    Object tmp;
                    for(;it.hasNext();){
                        tmp = it.next();
                        if( tmp instanceof SimpleExpression ){
                            criteria.add((SimpleExpression)tmp);
                        }else if(tmp instanceof Criterion){
                            criteria.add((Criterion)tmp);
                        }
                    }                                 
                }                
                if( id != null){
                    criteria.add( Restrictions.idEq(id));
                }
                if( joins != null && !joins.isEmpty()  ){
                    Iterator it = joins.iterator();
                    for(;it.hasNext();){
                        criteria.setFetchMode((String)it.next(),FetchMode.JOIN);
                    }                                 
                }                
                resultado = criteria.uniqueResult();               
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
                    closeSession();
                } catch (HibernateException e) {
                    SipLog.getLogger().error("No se puede cerrar una sesión hibernate.", e);            
                }
            }
        }
        return resultado;
    }        
}