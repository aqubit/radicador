/*
 * HibernatePersonaDAO.java
 *
 * Created on 24 de febrero de 2006, 12:43 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.admin.dao;
import com.unal.convenio.sip.common.service.HibernateSvc;
import com.unal.convenio.sip.admin.voh.PersonaVo;
import com.unal.convenio.sip.common.service.HibernateSvc;
import java.util.List;
import java.util.ArrayList;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.MatchMode;
/**
 *
 * @author César
 */
public class HibernatePersonaDAO implements PersonaDAO {
    
    /** Creates a new instance of HibernateTipoReferenciaDAO */
    public HibernatePersonaDAO() {
    }
   
    public List findAll(PersonaVo ob) {
        List restricciones = null;
        List joins = null;
        joins = new ArrayList();
        restricciones = new ArrayList();
        if( ob != null && ob.getNombre1() != null){
            restricciones.add(Restrictions.ilike("nombre1", ob.getNombre1(), MatchMode.START));
        }
        if( ob != null && ob.getNombre2() != null){
            restricciones.add(Restrictions.ilike("nombre2", ob.getNombre2(), MatchMode.START));
        }
        if( ob != null && ob.getApellido1() != null){
            restricciones.add(Restrictions.ilike("apellido1", ob.getApellido1(), MatchMode.START));
        }
        if( ob != null && ob.getApellido2() != null){
            restricciones.add(Restrictions.ilike("apellido2", ob.getApellido2(), MatchMode.START));
        }
        if( ob != null && ob.getEmail() != null){
            restricciones.add(Restrictions.ilike("email", ob.getEmail(), MatchMode.START));
        }
        if( ob != null && ob.getTelefono() != null){
            restricciones.add(Restrictions.ilike("telefono", ob.getTelefono(), MatchMode.START));
        }       
        if( ob != null && ob.getIdref_tipodocumento() != null && ob.getIdref_tipodocumento().getId_referencia()!=null){
            restricciones.add(Restrictions.eq("idref_tipodocumento", ob.getIdref_tipodocumento()));
        }       
        if( ob != null && ob.getIdref_tipopersona() != null && ob.getIdref_tipopersona().getId_referencia()!=null){
            restricciones.add(Restrictions.eq("idref_tipopersona", ob.getIdref_tipopersona()));
        }              
        if( ob != null && ob.getDocumento() != null){
            restricciones.add(Restrictions.ilike("documento", ob.getDocumento(), MatchMode.START));
        }
        List resultados = HibernateSvc.consultarTabla(
                    PersonaVo.class, 
                    restricciones,
                    joins,
                    Property.forName("nombre1").asc(),
                    0,
                    com.unal.util.Constantes.TODOS);
        return resultados;               
    }
    

    public PersonaVo find(Integer id) {
        return (PersonaVo)HibernateSvc.find(PersonaVo.class,null,null,id);        
    }    
    
    
    public boolean saveUpdate(PersonaVo ob) {
        return HibernateSvc.saveUpdate(ob);
    }

    public boolean delete(PersonaVo ob) {
        return HibernateSvc.delete(ob);
    }
    
}
