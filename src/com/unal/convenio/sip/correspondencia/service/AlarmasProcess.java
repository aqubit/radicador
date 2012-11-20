/**
 * AlarmasProcess.java
 *
 * Created on 9 de marzo de 2006, 07:03 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.correspondencia.service;
import com.unal.convenio.sip.correspondencia.voh.*;
/**
 *
 * @author MB
 */
public class AlarmasProcess implements Runnable{
    private volatile Thread blinker;
    private CorrespondenciaSvc svc;
    private int tiempoActivacion = 1000*60*60*12;
    
    public AlarmasProcess()  {
        svc = new CorrespondenciaSvcImpl();
    }
        
    public void run(){
        Thread thisThread = Thread.currentThread();
        com.unal.util.SipLog.getLogger().info("Hilo de envio de correo iniciado");
        while( blinker == thisThread ){
            try {
                thisThread.sleep(tiempoActivacion);
            } catch (InterruptedException e){
            }
            //Si el hilo no fue detenido 
            if( blinker == thisThread ){
                svc.enviarAlarmas();                        
            }
        }
        System.out.println("Hilo de envio de correo detenido");
    }

    public void setTiempoActivacionEnMiliSegundos( Integer tiempoActivacionEnMiliSegundos ){
        this.tiempoActivacion = tiempoActivacionEnMiliSegundos.intValue();
    }

    public void start(){
        blinker = new Thread(this);
        blinker.start();               
    }
    
    public synchronized void stop() {
        Thread moribund = blinker;
        blinker = null;
        moribund.interrupt();
    }    
}
