/*
 * HibernateCorrespondenciaDAOFactory.java
 *
 * Created on 20 de febrero de 2006, 09:15 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.correspondencia.dao; 
/**
 *
 * @author César
 */
public class HibernateCorrespondenciaDAOFactory extends CorrespondenciaDAOFactory{
    
    /**
     * Creates a new instance of HibernateCorrespondenciaDAOFactory 
     */
    public HibernateCorrespondenciaDAOFactory() {
    }
               

    public CorrespondenciaDAO getCorrespondenciaDAO() {
        return new HibernateCorrespondenciaDAO();
    }           
 

    public EstadoCorrespondenciaDAO getEstadoCorrespondenciaDAO() {
        return new HibernateEstadoCorrespondenciaDAO();
    }
 
}
