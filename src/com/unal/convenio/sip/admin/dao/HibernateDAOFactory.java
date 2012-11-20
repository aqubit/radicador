/*
 * HibernateDAOFactory.java
 *
 * Created on 20 de febrero de 2006, 09:15 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.admin.dao;
/**
 *
 * @author César
 */
public class HibernateDAOFactory extends DAOFactory{
    
    /** Creates a new instance of HibernateDAOFactory */
    public HibernateDAOFactory() {
    }

    public TablaReferenciaDAO getTablaReferenciasDAO() {
        return new HibernateTablaReferenciaDAO();
    }          
    
    public TipoReferenciaDAO getTipoReferenciaDAO() {
        return new HibernateTipoReferenciaDAO();
    }              

    public PersonaDAO getPersonaDAO() {
        return new HibernatePersonaDAO();
    }           

    public UsuarioDAO getUsuarioDAO() {
        return new HibernateUsuarioDAO();
    }

    public RolDAO getRolDAO() {
        return new HibernateRolDAO();
    }

    public RecursoDAO getRecursoDAO() {
        return new HibernateRecursoDAO();
    }
}
