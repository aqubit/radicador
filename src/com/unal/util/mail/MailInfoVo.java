/*
 * MailInfoVo.java
 *
 * Created on 9 de marzo de 2006, 02:38 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.util.mail;

/**
 *
 * @author MB
 */
public class MailInfoVo {
    
    /** Creates a new instance of MailInfoVo */
    public MailInfoVo() {
    }

    /**
     * Conserva el valor de la propiedad from.
     */
    private String from;

    /**
     * Getter para propiedad from.
     * @return Valor de la propiedad from.
     */
    public String getFrom() {

        return this.from;
    }

    /**
     * Setter para propiedad from.
     * @param from Nuevo valor de la propiedad from.
     */
    public void setFrom(String from) {

        this.from = from;
    }

    /**
     * Conserva el valor de la propiedad to.
     */
    private java.util.Set to;

    /**
     * Getter para propiedad to.
     * @return Valor de la propiedad to.
     */
    public java.util.Set getTo() {

        return this.to;
    }

    /**
     * Setter para propiedad to.
     * @param to Nuevo valor de la propiedad to.
     */
    public void setTo(java.util.Set to) {

        this.to = to;
    }

    /**
     * Conserva el valor de la propiedad subject.
     */
    private String subject;

    /**
     * Getter para propiedad subject.
     * @return Valor de la propiedad subject.
     */
    public String getSubject() {

        return this.subject;
    }

    /**
     * Setter para propiedad subject.
     * @param subject Nuevo valor de la propiedad subject.
     */
    public void setSubject(String subject) {

        this.subject = subject;
    }

    /**
     * Conserva el valor de la propiedad message.
     */
    private String message;

    /**
     * Getter para propiedad message.
     * @return Valor de la propiedad message.
     */
    public String getMessage() {

        return this.message;
    }

    /**
     * Setter para propiedad message.
     * @param message Nuevo valor de la propiedad message.
     */
    public void setMessage(String message) {

        this.message = message;
    }   
    
    public String toString(){
        return "INFORMACION DE MAIL/n from " + from + " to " + to + " /nMENSAJE:  "+ message;
    
    }
}
