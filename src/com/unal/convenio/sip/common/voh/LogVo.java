/*
 * LogVo.java
 *
 * Created on 11 de marzo de 2006, 11:40 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.common.voh;

/**
 *
 * @author MB
 */
public class LogVo {
    
    /** Creates a new instance of LogVo */
    public LogVo() {
    }

    /**
     * Conserva el valor de la propiedad id_log.
     */
    private Integer id_log;

    /**
     * Getter para propiedad id_log.
     * @return Valor de la propiedad id_log.
     */
    public Integer getId_log() {

        return this.id_log;
    }

    /**
     * Setter para propiedad id_log.
     * @param id_log Nuevo valor de la propiedad id_log.
     */
    public void setId_log(Integer id_log) {

        this.id_log = id_log;
    }

    /**
     * Conserva el valor de la propiedad id_usuario.
     */
    private Integer id_usuario=new Integer(0 );

    /**
     * Getter para propiedad id_usuario.
     * @return Valor de la propiedad id_usuario.
     */
    public Integer getId_usuario() {

        return this.id_usuario;
    }

    /**
     * Setter para propiedad id_usuario.
     * @param id_usuario Nuevo valor de la propiedad id_usuario.
     */
    public void setId_usuario(Integer id_usuario) {

        this.id_usuario = id_usuario;
    }

    /**
     * Conserva el valor de la propiedad operacion.
     */
    private String operacion;

    /**
     * Getter para propiedad operacion.
     * @return Valor de la propiedad operacion.
     */
    public String getOperacion() {

        return this.operacion;
    }

    /**
     * Setter para propiedad operacion.
     * @param operacion Nuevo valor de la propiedad operacion.
     */
    public void setOperacion(String operacion) {

        this.operacion = operacion;
    }

    /**
     * Conserva el valor de la propiedad nombre_tabla.
     */
    private String nombre_tabla;

    /**
     * Getter para propiedad nombre_tabla.
     * @return Valor de la propiedad nombre_tabla.
     */
    public String getNombre_tabla() {

        return this.nombre_tabla;
    }

    /**
     * Setter para propiedad nombre_tabla.
     * @param nombre_tabla Nuevo valor de la propiedad nombre_tabla.
     */
    public void setNombre_tabla(String nombre_tabla) {

        this.nombre_tabla = nombre_tabla;
    }

    /**
     * Conserva el valor de la propiedad id_registro.
     */
    private Integer id_registro;

    /**
     * Getter para propiedad id_registro.
     * @return Valor de la propiedad id_registro.
     */
    public Integer getId_registro() {

        return this.id_registro;
    }

    /**
     * Setter para propiedad id_registro.
     * @param id_registro Nuevo valor de la propiedad id_registro.
     */
    public void setId_registro(Integer id_registro) {

        this.id_registro = id_registro;
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

    /**
     * Conserva el valor de la propiedad fechaFin.
     */
    private java.sql.Date fechaFin;

    /**
     * Getter para propiedad fechaFin.
     * @return Valor de la propiedad fechaFin.
     */
    public java.sql.Date getFechaFin() {

        return this.fechaFin;
    }

    /**
     * Setter para propiedad fechaFin.
     * @param fechaFin Nuevo valor de la propiedad fechaFin.
     */
    public void setFechaFin(java.sql.Date fechaFin) {

        this.fechaFin = fechaFin;
    }

    /**
     * Conserva el valor de la propiedad object.
     */
    private com.unal.convenio.sip.common.vo.BaseVo object;

    /**
     * Getter para propiedad object.
     * @return Valor de la propiedad object.
     */
    public com.unal.convenio.sip.common.vo.BaseVo getObject() {

        return this.object;
    }

    /**
     * Setter para propiedad object.
     * @param object Nuevo valor de la propiedad object.
     */
    public void setObject(com.unal.convenio.sip.common.vo.BaseVo object) {

        this.object = object;
    }

    /**
     * Conserva el valor de la propiedad estado_entidad.
     */
    private String estado_entidad;

    /**
     * Getter para propiedad estadoString.
     * @return Valor de la propiedad estadoString.
     */
    public String getEstado_entidad()  {

        return this.estado_entidad;
    }

    /**
     * Setter para propiedad estadoString.
     * @param estadoString Nuevo valor de la propiedad estadoString.
     */
    public void setEstado_entidad(String estado_entidad)  {

        this.estado_entidad = estado_entidad;
    }

    /**
     * Conserva el valor de la propiedad usuarioStr.
     */
    private String usuarioStr;

    /**
     * Getter para propiedad usuarioStr.
     * @return Valor de la propiedad usuarioStr.
     */
    public String getUsuarioStr() {

        return this.usuarioStr;
    }

    /**
     * Setter para propiedad usuarioStr.
     * @param usuarioStr Nuevo valor de la propiedad usuarioStr.
     */
    public void setUsuarioStr(String usuarioStr) {

        this.usuarioStr = usuarioStr;
    }
    
    
}
