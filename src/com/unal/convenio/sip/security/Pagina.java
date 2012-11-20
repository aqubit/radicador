/*
 * Pagina.java
 *
 * Created on 22 de septiembre de 2006, 18:23
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.security;

/**
 *
 * @author Administrador
 */
public class Pagina {
    
    String uri;
    
    public Pagina(){
    }
    
    public void setUri(String uri){
        this.uri = uri;
    }
    public String getUri(){
        return uri;
    }
}