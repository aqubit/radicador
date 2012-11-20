/*
 * HibernateCommonDAOFactory.java
 *
 * Created on 20 de febrero de 2006, 09:15 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.common.dao; 
/**
 *
 * @author César
 */
public class HibernateCommonDAOFactory extends CommonDAOFactory{
    
    /**
     * Creates a new instance of HibernateCommonDAOFactory 
     */
    public HibernateCommonDAOFactory() {
    }
               

    public LogDAO getLogDAO() {
        return new HibernateLogDAO();
    }           
}
