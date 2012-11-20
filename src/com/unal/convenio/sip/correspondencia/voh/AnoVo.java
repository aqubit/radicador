/*
 * Ano.java
 *
 * Created on 28 de mayo de 2006, 08:20 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.correspondencia.voh;

import com.unal.convenio.sip.common.vo.BaseVo;

/**
 *
 * @author César
 */
public class AnoVo extends BaseVo{
    
    Integer ano;
    /** Creates a new instance of Ano */
    public AnoVo(Integer ano) {
        this.ano = ano;
    }
    public void setAno(Integer ano){
        this.ano = ano;
    }
    public Integer getAno(){
        return ano;
    }
    public Integer getId() {
        return ano;
    }
    public String getEtiqueta() {
        return ano.toString();
    }
}
