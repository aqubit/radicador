/*
 * HibernateUsuarioDAO.java
 *
 * Created on 1 de marzo de 2006, 10:40 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.admin.dao;
import com.unal.convenio.sip.admin.voh.UsuarioVo;
import com.unal.convenio.sip.common.service.HibernateSvc;
import java.util.List;
import java.util.ArrayList;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author César
 */
public class HibernateUsuarioDAO implements UsuarioDAO {
    
    /** Creates a new instance of HibernateRolDAO */
    public HibernateUsuarioDAO() {
    }
    
    
    public List findAll() {
        List joins = null;
        joins = new ArrayList();
        joins.add("persona");
        List resultados = HibernateSvc.consultarTabla(
                    UsuarioVo.class, 
                    null,
                    joins,
                    Property.forName("login").asc(),
                    0,
                    com.unal.util.Constantes.TODOS);
        return resultados;        
    }
       
    public UsuarioVo find(Integer id) {
        UsuarioVo resultado = null;
        List joins = null;
        joins = new ArrayList();
        joins.add("persona");
        joins.add("roles");
        resultado = (UsuarioVo)HibernateSvc.find(
                    UsuarioVo.class, 
                    null, 
                    joins,
                    id);
        return resultado;        
    }    

    public UsuarioVo findUsuarioPasswd(String login) {
        UsuarioVo resultado = null;
        List restricciones = null;
        List joins = null;
        joins = new ArrayList();
        restricciones = new ArrayList();
        restricciones.add(Restrictions.eq("login", login));
        resultado = (UsuarioVo)HibernateSvc.find(
                    UsuarioVo.class, 
                    restricciones,
                    joins,
                    null);
        return resultado;         
    }    
    
    
    public boolean saveUpdate(UsuarioVo ob) {
        return HibernateSvc.saveUpdate(ob);
    }

    public boolean delete(UsuarioVo ob) {
        return HibernateSvc.delete(ob);
    }    
}