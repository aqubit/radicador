/*
 * BaseVo.java
 *
 * Created on 6 de marzo de 2006, 03:51 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.common.vo;

import java.io.Serializable;

/**
 *
 * @author MB
 */
public abstract class BaseVo implements Serializable{
    
    /** Creates a new instance of BaseVo */
    public BaseVo() {
    }
    public abstract Integer getId();
    public abstract String getEtiqueta();
    public String toString(){
        String id = (getId()!=null)?getId().toString():" ";
        String label = (getEtiqueta()!=null)?getEtiqueta():" ";
        return id + " - " + label;
    }

    /**
     * Conserva el valor de la propiedad idUsuario.
     */
    private Integer idUsuario;

    /**
     * Getter para propiedad idUsuario.
     * @return Valor de la propiedad idUsuario.
     */
    public Integer getIdUsuario() {

        return this.idUsuario;
    }

    /**
     * Setter para propiedad idUsuario.
     * @param idUsuario Nuevo valor de la propiedad idUsuario.
     */
    public void setIdUsuario(Integer idUsuario) {

        this.idUsuario = idUsuario;
    }
    
}
