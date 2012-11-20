/*
 * DAOFactory.java
 *
 * Created on 20 de febrero de 2006, 09:14 AM
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
public abstract class DAOFactory {       
  // List of DAO types supported by the factory
  public static final int HIBERNATE = 1;
  // There will be a method for each DAO that can be 
  // created. The concrete factories will have to 
  // implement these methods.
  public abstract TablaReferenciaDAO getTablaReferenciasDAO();    
  public abstract TipoReferenciaDAO getTipoReferenciaDAO();
  public abstract PersonaDAO getPersonaDAO();
  public abstract RolDAO getRolDAO();
  public abstract RecursoDAO getRecursoDAO();
  public abstract UsuarioDAO getUsuarioDAO();

  public static DAOFactory getDAOFactory(
      int whichFactory) { 
    switch (whichFactory) {
      case HIBERNATE: 
          return new HibernateDAOFactory();
      default           : 
          return null;
    }
  }    
}
