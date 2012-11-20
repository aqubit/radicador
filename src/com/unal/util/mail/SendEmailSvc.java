/*
 * SendEmailSvc.java
 *
 * Created on 9 de marzo de 2006, 12:15 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.util.mail;

import com.unal.util.SipLog;
import java.io.IOException;
import java.util.Properties;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import com.unal.util.SipLog;
import java.util.ResourceBundle;
/**
 *
 * @author MB
 */
public class SendEmailSvc {
    
    private static String host;
    private static String user;
    private static String password;            

    static{
       ResourceBundle bundleSipApp = ResourceBundle.getBundle("sip.sipApp");
       host = bundleSipApp.getString("SIP.SERVIDORCORREO");       
       user = bundleSipApp.getString("SIP.SERVIDORCORREO.USUARIO");       
       password = bundleSipApp.getString("SIP.SERVIDORCORREO.PASSWORD");       
    }    
    
    /** Creates a new instance of SendEmailSvc */
    public SendEmailSvc() {
    }
    
    
    public static String send(MailInfoVo vo ){
         try {          
          java.util.Set to = vo.getTo();
          String message = vo.getMessage();
          String from = vo.getFrom();
          String subject = vo.getSubject();
          org.apache.commons.mail.Email correo = new org.apache.commons.mail.SimpleEmail();
          correo.setHostName(host);
          if( !user.equals("") && !password.equals("")){
            correo.setAuthentication( user , password);
          }
          //Existe un metodo setTo(Collection)...pero lanza una excepción...
          if( to != null){
              java.util.Iterator it = to.iterator();
              while( it.hasNext()){
                correo.addTo( it.next().toString());
              } 
          }
          correo.setFrom(vo.getFrom(),"Sistema de Información de Pólizas (SIPOL)");
          correo.setSubject(vo.getSubject());
          correo.setMsg(vo.getMessage());
          correo.send();                    
        }
        catch (EmailException ex) {
          SipLog.getLogger().error(ex);
        }        
        return "OK";
    }
}
