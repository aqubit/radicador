/*
 * EstadoCorrespondenciaVo.java
 *
 * Created on 5 de marzo de 2006, 10:45 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.correspondencia.voh;
import com.unal.convenio.sip.common.vo.BaseVo;   
import com.unal.convenio.sip.admin.voh.TablaReferenciaVo;
import com.unal.convenio.sip.admin.voh.PersonaVo;
/**
 *
 * @author MB
 */
public class EstadoCorrespondenciaVo extends BaseVo {
    
    /** Creates a new instance of EstadoCorrespondenciaVo */
    public EstadoCorrespondenciaVo() {
    }
     public EstadoCorrespondenciaVo(Integer id_estado_correspondencia, TablaReferenciaVo estado, java.sql.Date fecha, Integer id_correspondencia ) {
         this.id_correspondencia = id_correspondencia;
         this.idref_estado= estado;
         this.fecha=fecha;
         this.id_estado_correspondencia=id_estado_correspondencia;
    }

    /**
     * Conserva el valor de la propiedad id_estado_correspondencia.
     */
    private Integer id_estado_correspondencia;

 
    /**
     * Getter para propiedad id_estado_correspondencia.
     * @return Valor de la propiedad id_estado_correspondencia.
     */
    public Integer getId_estado_correspondencia() {

        return this.id_estado_correspondencia;
    }

    /**
     * Setter para propiedad id_estado_correspondencia.
     * @param id_estado_correspondencia Nuevo valor de la propiedad id_estado_correspondencia.
     */
    public void setId_estado_correspondencia(Integer id_estado_correspondencia){
        this.id_estado_correspondencia = id_estado_correspondencia;
    }

    /**
     * Conserva el valor de la propiedad id_correspondencia.
     */
    private Integer id_correspondencia;

    /**
     * Getter para propiedad id_correspondencia.
     * @return Valor de la propiedad id_correspondencia.
     */
    public Integer getId_correspondencia() {

        return this.id_correspondencia;
    }

    /**
     * Setter para propiedad id_correspondencia.
     * @param id_correspondencia Nuevo valor de la propiedad id_correspondencia.
     */
    public void setId_correspondencia(Integer id_correspondencia) {

        this.id_correspondencia = id_correspondencia;
    }

    /**
     * Conserva el valor de la propiedad fecha.
     */
    private java.sql.Date fecha;

    /**
     * Getter para propiedad fecha.
     * @return Valor de la propiedad fecha.
     */
    public java.sql.Date getFecha() {

        return this.fecha;
    }

    /**
     * Setter para propiedad fecha.
     * @param fecha Nuevo valor de la propiedad fecha.
     */
    public void setFecha(java.sql.Date fecha) {
        this.fecha = fecha;
    }
    
    public String toString(){
        if( this.idref_estado != null ) return this.idref_estado.getNombre();
        else return "";
    }
   
    public Integer getId(){
        if( this.idref_estado != null ) return this.idref_estado.getId_referencia();
        return null;
    }
    public String getEtiqueta(){
        if( this.idref_estado != null ) return this.idref_estado.getNombre();
        else return "";
    }

    /**
     * Conserva el valor de la propiedad idref_estado.
     */
    private com.unal.convenio.sip.admin.voh.TablaReferenciaVo idref_estado;

    /**
     * Getter para propiedad idref_estado.
     * @return Valor de la propiedad idref_estado.
     */
    public com.unal.convenio.sip.admin.voh.TablaReferenciaVo getIdref_estado() {

        return this.idref_estado;
    }

    /**
     * Setter para propiedad idref_estado.
     * @param idref_estado Nuevo valor de la propiedad idref_estado.
     */
    public void setIdref_estado(com.unal.convenio.sip.admin.voh.TablaReferenciaVo idref_estado) {

        this.idref_estado = idref_estado;
    }
    
    /**
     * Conserva el valor de la propiedad id_correspondencia.
     */
    private PersonaVo persona;

    /**
     * Getter para propiedad id_correspondencia.
     * @return Valor de la propiedad id_correspondencia.
     */
    public PersonaVo getPersona() {

        return this.persona;
    }

    /**
     * Setter para propiedad id_correspondencia.
     * @param id_correspondencia Nuevo valor de la propiedad id_correspondencia.
     */
    public void setPersona(PersonaVo persona) {

        this.persona = persona;
    }    
    
}
