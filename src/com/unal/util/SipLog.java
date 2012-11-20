/*
 * SipLog.java
 *
 * Created on 20 de febrero de 2006, 08:57 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.util;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

/**
 *
 * @author César
 */
public class SipLog {    
    public static final ThreadLocal session = new ThreadLocal();
    
    /** Creates a new instance of SipLog */
    private SipLog() {
    }
    
    public static Log getLogger(){
        Log l = (Log) session.get();
        // Abrir nuevo log, si la tarea no tiene uno 
        if (l == null) {
            l = LogFactory.getLog("SIPLOG");
            session.set(l);
        }
        return l;        
    }        
}
