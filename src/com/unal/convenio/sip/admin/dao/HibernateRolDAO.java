/*
 * HibernateRolDAO.java
 *
 * Created on 1 de marzo de 2006, 10:35 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.admin.dao;
import com.unal.convenio.sip.admin.voh.UsuarioVo;
import com.unal.convenio.sip.admin.voh.PersonaVo;
import com.unal.convenio.sip.admin.voh.RolVo;
import com.unal.convenio.sip.common.service.HibernateSvc;
import com.unal.util.SipLog;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.HibernateException;
import org.hibernate.Criteria;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.hibernate.FetchMode;
import org.hibernate.Hibernate;

/**
 *
 * @author César
 */
public class HibernateRolDAO implements RolDAO {
    
    /** Creates a new instance of HibernateRolDAO */
    public HibernateRolDAO() {
    }
    
    public List findAll() {
        List resultatos = HibernateSvc.consultarTabla(
                    RolVo.class, 
                    null,
                    null, 
                    Property.forName("nombre").asc(),
                    0, 
                    com.unal.util.Constantes.TODOS);
        return resultatos;
    }
    
    public List findUsuariosPorRol(Integer id) {          
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
                Criteria criteria = session.createCriteria( RolVo.class );  
                criteria.setFetchMode("usuarios",FetchMode.JOIN);
                criteria.add( Restrictions.idEq(id));
                RolVo tmp = (RolVo)criteria.uniqueResult();
                if( tmp != null){
                    resultados = new ArrayList( tmp.getUsuarios());
                }
                //Cargar la persona asociada al usuario
                if( resultados != null && !resultados.isEmpty() ){
                    Iterator it = resultados.iterator();
                    for( ;it.hasNext();){
                        UsuarioVo u1 = (UsuarioVo)it.next();
                        Hibernate.initialize(u1.getPersona());
                    }
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
    
    public RolVo find(Integer id) {
        RolVo resultado = null;
        List joins = null;
        joins = new ArrayList();
        joins.add("usuarios");
        resultado = (RolVo)HibernateSvc.find(
                    RolVo.class, 
                    null, 
                    joins,
                    id);
        return resultado;            
    }    
    
    public boolean saveUpdate(RolVo ob) {
        return HibernateSvc.saveUpdate(ob);
    }

    public boolean delete(RolVo ob) {
        return HibernateSvc.delete(ob);
    }    
}
