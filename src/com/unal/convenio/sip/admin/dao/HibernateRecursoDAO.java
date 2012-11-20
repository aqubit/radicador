/*
 * HibernateRecursoDAO.java
 *
 * Created on 1 de marzo de 2006, 10:39 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.admin.dao;
import com.unal.convenio.sip.admin.voh.RecursoVo;
import com.unal.convenio.sip.admin.voh.RolPermisoVo;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import com.unal.util.SipLog;
import org.hibernate.Hibernate;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.criterion.MatchMode;
import com.unal.convenio.sip.common.service.HibernateSvc;

/**
 *
 * @author César
 */
public class HibernateRecursoDAO implements RecursoDAO {
    
    /** Creates a new instance of HibernateRolDAO */
    public HibernateRecursoDAO() {
    }
    
    public List findAll() {
        List resultatos = HibernateSvc.consultarTabla(
                    RecursoVo.class, 
                    null,
                    null, 
                    Property.forName("nombre").asc(),
                    0, 
                    com.unal.util.Constantes.TODOS);
        return resultatos;
    }

    public List findRecursos(RecursoVo ob){
        List lRestricciones = null;
        if( ob != null){            
            lRestricciones = new ArrayList();
            if( ob.getIdref_tiporecurso () != null){
                lRestricciones.add(Restrictions.eq("idref_tiporecurso", ob.getIdref_tiporecurso()));
            }
            if( ob.getNombre () != null){
                lRestricciones.add(Restrictions.ilike("nombre", ob.getNombre(), MatchMode.START));
            }

        } 
        List resultatos = HibernateSvc.consultarTabla(
                    RecursoVo.class, 
                    lRestricciones,
                    null,
                    Property.forName("nombre").asc(),
                    0,
                    com.unal.util.Constantes.TODOS);
        return resultatos;       
    }
    
    

    public List findObjetosGranted(Integer idUsuario, String strTipoPermiso){
        if( idUsuario == null || strTipoPermiso == null){
            return null;
        }
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
                Query query = session.getNamedQuery("queryRestricciones"); 
                query.setParameter("id_usuario",idUsuario);
                query.setParameter("permiso",strTipoPermiso);
                resultados = query.list();
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

    public List findPermisos(Integer idRecurso){
        RecursoVo resultado = null;
        List joins = null;
        joins = new ArrayList();
        joins.add("permisos");
        resultado = (RecursoVo)HibernateSvc.find(
                    RecursoVo.class, 
                    null,
                    joins,
                    idRecurso);
        return new ArrayList(resultado.getPermisos());             
    }    
    
    public RecursoVo findRecurso(Integer idRecurso) {
        RecursoVo resultado = null;
        List joins = null;
        joins = new ArrayList();
        joins.add("permisos");
        resultado = (RecursoVo)HibernateSvc.find(
                    RecursoVo.class, 
                    null,
                    joins,
                    idRecurso);
        return resultado;             
    }    

    public boolean saveUpdate(RecursoVo ob) {
        return HibernateSvc.saveUpdate(ob);
    }

    public boolean delete(RecursoVo ob) {
        return HibernateSvc.delete(ob);
    }    
}

