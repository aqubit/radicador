/*
 * HibernateCorrespondenciaDAO.java
 *
 * Created on 24 de febrero de 2006, 12:43 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.correspondencia.dao;
import com.unal.convenio.sip.admin.voh.TablaReferenciaVo;
import com.unal.convenio.sip.admin.voh.PersonaVo;
import com.unal.convenio.sip.common.service.HibernateSvc;
import com.unal.convenio.sip.correspondencia.voh.CorrespondenciaVo;
import com.unal.convenio.sip.correspondencia.voh.DocumentoVo;
import com.unal.convenio.sip.correspondencia.voh.EstadoCorrespondenciaVo;
import com.unal.convenio.sip.common.service.*;
import com.unal.convenio.sip.common.voh.LogVo;
import com.unal.convenio.sip.common.vo.BaseVo;
import com.unal.util.SipLog;
import java.util.List;
import java.util.Iterator;
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
public class HibernateCorrespondenciaDAO implements CorrespondenciaDAO {
    
    /** Creates a new instance of HibernateTipoReferenciaDAO */
    public HibernateCorrespondenciaDAO() {
    }
    
    public List findAll(CorrespondenciaVo filtro) {
        if( filtro == null ){
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
                Criteria criteria = session.createCriteria( CorrespondenciaVo.class );  
                if(filtro.getId_correspondencia()!=null )               
                    criteria.add(Restrictions.eq("id_correspondencia", filtro.getId_correspondencia()));
                if(filtro.getGrupo()!=null )               
                    criteria.add(Restrictions.eq("grupo", filtro.getGrupo()));
                if(filtro.getClase()!=null )               
                    criteria.add(Restrictions.ilike("clase", filtro.getClase(), MatchMode.START));
                if(filtro.getCaracter()!=null )               
                    criteria.add(Restrictions.ilike("caracter", filtro.getCaracter(), MatchMode.START));
                TablaReferenciaVo tmpRef = filtro.getIdref_estadoactual();
                if( tmpRef != null && tmpRef.getId_referencia()!=null )   
                    criteria.add(Restrictions.eq("idref_estadoactual", filtro.getIdref_estadoactual()));
                tmpRef = filtro.getDependencia();
                if( tmpRef != null && tmpRef.getId_referencia() != null )   
                    criteria.add(Restrictions.eq("dependencia", tmpRef));                    
                tmpRef = filtro.getIdref_tipo();
                if( tmpRef != null && tmpRef.getId_referencia() != null )   
                    criteria.add(Restrictions.eq("idref_tipo", tmpRef));
                PersonaVo tmpPersona = filtro.getIdper_remitente();
                if( tmpPersona != null && tmpPersona.getId_persona() != null)      
                    criteria.add(Restrictions.eq("idper_remitente", tmpPersona));
                tmpPersona = filtro.getIdper_destinatario();
                if( tmpPersona != null && tmpPersona.getId_persona() != null)      
                    criteria.add(Restrictions.eq("idper_destinatario", tmpPersona));
                if(filtro.getNro_contrato() != null )          
                    criteria.add(Restrictions.ilike("nro_contrato", filtro.getNro_contrato(), MatchMode.START));
                if(filtro.getConsecutivo() != null )          
                    criteria.add(Restrictions.ilike("consecutivo", filtro.getConsecutivo(), MatchMode.START));
                if(filtro.getAno_contrato() != null )          
                    criteria.add(Restrictions.eq("ano_contrato", filtro.getAno_contrato()));
                if(filtro.getRol_propietario() != null )          
                    criteria.add(Restrictions.eq("rol_propietario", filtro.getRol_propietario()));
                if(filtro.getNro_radicacion() != null )          
                    criteria.add(Restrictions.ilike("nro_radicacion", filtro.getNro_radicacion(), MatchMode.START));
                if(filtro.getNro_radicacion_invias() != null )          
                    criteria.add(Restrictions.ilike("nro_radicacion_invias", filtro.getNro_radicacion_invias(), MatchMode.START));
                if(filtro.getUltima_modificacion() != null && filtro.getUltimaModificacion2() != null){
                   java.sql.Date rango2 = new java.sql.Date( filtro.getUltimaModificacion2().getTime() );
                   criteria.add(Restrictions.ge("ultima_modificacion", filtro.getUltima_modificacion()));
                   criteria.add(Restrictions.le("ultima_modificacion",rango2));                    
                }   
                if(filtro.getFecha_radicacion() != null && filtro.getFechaRadicacion2() != null){
                   java.sql.Date rango2 = new java.sql.Date( filtro.getFechaRadicacion2().getTime() );
                   criteria.add(Restrictions.ge("fecha_radicacion", filtro.getFecha_radicacion()));
                   criteria.add(Restrictions.le("fecha_radicacion",rango2));                    
                }   
                if(filtro.getFecha_radicacion_invias() != null && filtro.getFechaRadicacionInvias2() != null){
                   java.sql.Date rango2 = new java.sql.Date( filtro.getFechaRadicacionInvias2().getTime() );
                   criteria.add(Restrictions.ge("fecha_radicacion_invias", filtro.getFecha_radicacion_invias()));
                   criteria.add(Restrictions.le("fecha_radicacion_invias",rango2));                    
                }   
                if(filtro.getFecha_vencimiento() != null ){
                    java.util.Calendar cal =  java.util.Calendar.getInstance();
                    cal.clear(java.util.Calendar.MILLISECOND);
                    cal.clear(java.util.Calendar.SECOND);
                    cal.clear(java.util.Calendar.MINUTE);
                    cal.clear(java.util.Calendar.HOUR);
                    java.sql.Date hoy = new java.sql.Date( cal.getTime().getTime() );
                    java.sql.Date vence = filtro.getFecha_vencimiento();
                    int resultado = vence.compareTo(hoy);
                    if( resultado > 0 ){
                       criteria.add(Restrictions.gt("fecha_vencimiento", hoy));
                       criteria.add(Restrictions.le("fecha_vencimiento",vence));
                    }else if( resultado < 0 ){
                        criteria.add(Restrictions.lt("fecha_vencimiento", hoy));
                       
                    }else{
                       criteria.add(Restrictions.eq("fecha_vencimiento", vence));  
                    }
                }   
                criteria.setFetchMode("idref_estadoactual",FetchMode.JOIN);
                criteria.setFetchMode("idper_remitente",FetchMode.JOIN);
                criteria.setFetchMode("idper_destinatario",FetchMode.JOIN);               
                criteria.setFetchMode("idref_tipo",FetchMode.JOIN);
                criteria.setFetchMode("dependencia",FetchMode.JOIN);
                criteria.addOrder( Property.forName("id_correspondencia").asc() );        
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
    
    public List findAllBase(CorrespondenciaVo filtro) {
        List restricciones = null;
        restricciones = new ArrayList();
        if( filtro != null){
            if( filtro.getRol_propietario() != null){
                restricciones.add(Restrictions.eq("rol_propietario", filtro.getRol_propietario()));
            }        
            if( filtro.getId_correspondencia() != null){
                restricciones.add(Restrictions.eq("id_correspondencia", filtro.getId_correspondencia()));
            }        
            if( filtro.getNro_radicacion() != null){
                restricciones.add(Restrictions.ilike("nro_radicacion", filtro.getNro_radicacion(), MatchMode.ANYWHERE));
            }        
            if( filtro.getNro_contrato() != null){
                restricciones.add(Restrictions.ilike("nro_contrato", filtro.getNro_contrato(), MatchMode.ANYWHERE));
            }        
        }
        List resultados = HibernateSvc.consultarTabla(
                    CorrespondenciaVo.class, 
                    restricciones,
                    null, 
                    null,
                    0, 
                    com.unal.util.Constantes.TODOS);
        return resultados;
    }
 
 
    public CorrespondenciaVo find(Integer id) {
        List joins = null;
        joins = new ArrayList();
        joins.add("idref_estadoactual");
        joins.add("idper_remitente");
        joins.add("idper_destinatario");
        joins.add("idref_tipo");        
        joins.add("dependencia");
        joins.add("documento");
        return (CorrespondenciaVo)HibernateSvc.find(CorrespondenciaVo.class, null, joins, id);        
    }    
    
    
    public boolean saveUpdate(CorrespondenciaVo ob) {
        return HibernateSvc.saveUpdate(ob);
    }

    public boolean delete(CorrespondenciaVo ob) {
        return HibernateSvc.delete(ob);
    }

    public boolean saveUpdateDocumento(DocumentoVo doc, CorrespondenciaVo correspondencia) {
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
                Criteria criteria = session.createCriteria(DocumentoVo.class);
                criteria.add(Restrictions.eq("id", correspondencia.getId()));  
                DocumentoVo docbd = (DocumentoVo)criteria.uniqueResult();
                    //Si la correspondencia no tiene un documento asociado
                if( docbd == null && doc != null ){
                    doc.setCorrespondencia(correspondencia);
                    session.saveOrUpdate(doc);
                }else if( docbd != null && doc == null){
                    //Si ya tiene un doc asociado y se le quiere eliminar
                    session.delete(docbd);                    
                }else if( docbd != null && doc != null){
                    //Si ya tiene un doc asociado y se le quiere reemplazar
                    docbd.setArchivo(doc.getArchivo());
                    docbd.setNombre_documento(doc.getNombre_documento());
                    session.saveOrUpdate(docbd);
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
                    HibernateSvc.closeSession();
                } catch (HibernateException e) {
                    SipLog.getLogger().error("No se puede cerrar una sesión hibernate.", e);            
                }
            }
        }
        return bOk;
   }
}
