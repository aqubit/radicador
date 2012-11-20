/*
 * DocumentoVo.java
 *
 * Created on 4 de marzo de 2006, 11:51 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.correspondencia.voh;
/**
 *
 * @author César
 */
public class DocumentoVo{

    CorrespondenciaVo correspondencia;
    String nombre_documento;
    byte[] documento;
    Integer id;

    public DocumentoVo() {
    }
    public CorrespondenciaVo getCorrespondencia() {
        return this.correspondencia;
    }
    public void setCorrespondencia(CorrespondenciaVo correspondencia) {

        this.correspondencia = correspondencia;
    }
    public String getNombre_documento() {

        return this.nombre_documento;
    }
    public void setNombre_documento(String nombre_documento) {

        this.nombre_documento = nombre_documento;
    }
    public java.lang.Integer getId() {

        return this.id;
    }
    public void setId(java.lang.Integer id) {

        this.id = id;
    }
    public byte[] getArchivo(){
             return(documento);
    }    
    public void setArchivo(byte[] documento ){
             this.documento = documento;
    }
    
}
