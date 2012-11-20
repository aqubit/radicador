/*
 * SecurityConfig.java
 *
 * Created on 22 de septiembre de 2006, 18:23
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.security;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CJ
 */
public class SecurityConfig {
    List _paginasSSL = new ArrayList();
    private String loginPage;
    private String httpPort;
    private String httpsPort;

    public SecurityConfig() {
    }

    public void addPagina(Pagina i) {
      _paginasSSL.add(i);
    }
    public List getPaginas() {
      return _paginasSSL;
    }

    public void setLoginPage(String loginPage){
        this.loginPage = loginPage;
    }
    public String getLoginPage(){
        return loginPage;
    }
    public void setHttpPort(String httpPort){
        this.httpPort = httpPort;
    }
    public String getHttpPort(){
        return httpPort;
    }
    public void setHttpsPort(String httpsPort){
        this.httpsPort = httpsPort;
    }
    public String getHttpsPort(){
        return httpsPort;
    }
}