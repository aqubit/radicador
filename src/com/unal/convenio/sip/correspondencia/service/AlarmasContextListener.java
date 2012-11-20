/*
 * AlarmasContextListener.java
 *
 * Created on 9 de marzo de 2006, 07:11 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.correspondencia.service;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContext;

import javax.servlet.*;
/**
 *
 * @author MB
 */
public class AlarmasContextListener implements ServletContextListener{
    ServletContext ctx =null;
    /** Creates a new instance of AlarmasContextListener */
    public AlarmasContextListener() {
    }
    public void contextInitialized(ServletContextEvent servletContextEvent)
    {
        ctx = servletContextEvent.getServletContext();
        Integer tiempoActivacionEnMiliSegundos = Integer.valueOf(ctx.getInitParameter("tiempocorreo"));
        AlarmasProcess alarma = new AlarmasProcess();
        alarma.setTiempoActivacionEnMiliSegundos(tiempoActivacionEnMiliSegundos);
        ctx.setAttribute("alarma", alarma);
        alarma.start();
    }
    public void contextDestroyed(ServletContextEvent servletContextEvent)
    {
        ctx = servletContextEvent.getServletContext();
        AlarmasProcess alarma = (AlarmasProcess)ctx.getAttribute("alarma");
        if( alarma != null){
            alarma.stop();
        }
    }
    
}
