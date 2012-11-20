/*
 * CorrespondenciaVo.java
 *
 * Created on 4 de marzo de 2006, 11:51 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.correspondencia.voh;
import com.unal.convenio.sip.admin.voh.PersonaVo;
import com.unal.convenio.sip.admin.voh.RolVo;
import com.unal.convenio.sip.admin.voh.TablaReferenciaVo;
import com.unal.convenio.sip.common.vo.BaseVo;        
import com.unal.convenio.sip.correspondencia.dao.CorrespondenciaDAO;

/**
 *
 * @author CJ & MB
 */
//TODO en el mapping de hibernate colocar en not null los indicados

public class CorrespondenciaVo extends BaseVo{
    
    /** Creates a new instance of CorrespondenciaVo */
    public CorrespondenciaVo() {
    }

    /*------------------------------------------------------------------------*/
    
     /**
     * Conserva el valor de la propiedad id_correspondencia.
     */
    private java.lang.Integer id_correspondencia;

    /**
     * Getter para propiedad id_correspondencia.
     * @return Valor de la propiedad id_correspondencia.
     */
    public java.lang.Integer getId_correspondencia() {

        return this.id_correspondencia;
    }

    /**
     * Setter para propiedad id_correspondencia.
     * @param id_correspondencia Nuevo valor de la propiedad id_correspondencia.
     */
    public void setId_correspondencia(java.lang.Integer id_correspondencia) {

        this.id_correspondencia = id_correspondencia;
    }

    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad idper_remitente.
     */
    private PersonaVo idper_remitente  = new PersonaVo();

    /**
     * Getter para propiedad idper_remitente.
     * @return Valor de la propiedad idper_remitente.
     */
    public PersonaVo getIdper_remitente() {

        return this.idper_remitente;
    }

    /**
     * Setter para propiedad idper_remitente.
     * @param idper_remitente Nuevo valor de la propiedad idper_remitente.
     */
    public void setIdper_remitente(PersonaVo idper_remitente) {

        this.idper_remitente = idper_remitente;
    }
    
    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad idper_destinatario.
     */
    private PersonaVo idper_destinatario = new PersonaVo();

    /**
     * Getter para propiedad idper_destinatario.
     * @return Valor de la propiedad idper_destinatario.
     */
    public PersonaVo getIdper_destinatario() {

        return this.idper_destinatario;
    }

    /**
     * Setter para propiedad idper_destinatario.
     * @param idper_destinatario Nuevo valor de la propiedad idper_destinatario.
     */
    public void setIdper_destinatario(PersonaVo idper_destinatario) {

        this.idper_destinatario = idper_destinatario;
    }

    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad idref_estadoactual.
     */
    private TablaReferenciaVo idref_estadoactual = new TablaReferenciaVo();

    /**
     * Getter para propiedad estado.
     * @return Valor de la propiedad estado.
     */
    public TablaReferenciaVo getIdref_estadoactual()  {

        return this.idref_estadoactual;
    }

    /**
     * Setter para propiedad estado.
     * @param estado Nuevo valor de la propiedad estado.
     */
    public void setIdref_estadoactual(TablaReferenciaVo idref_estadoactual)  {

        this.idref_estadoactual = idref_estadoactual;
    }

    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad id_corresp_padre.
     */
    private Integer id_corresp_padre;

    /**
     * Getter para propiedad id_corresp_padre.
     * @return Valor de la propiedad id_corresp_padre.
     */
    public Integer getId_corresp_padre() {

        return this.id_corresp_padre;
    }

    /**
     * Setter para propiedad id_corresp_padre.
     * @param id_corresp_padre Nuevo valor de la propiedad id_corresp_padre.
     */
    public void setId_corresp_padre(Integer id_corresp_padre) {

        this.id_corresp_padre = id_corresp_padre;
    }

    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad caracter.
     */
    private String caracter;

    /**
     * Getter para propiedad caracter.
     * @return Valor de la propiedad caracter.
     */
    public String getCaracter() {

        return this.caracter;
    }

    /**
     * Setter para propiedad caracter.
     * @param caracter Nuevo valor de la propiedad caracter.
     */
    public void setCaracter(String caracter) {

        this.caracter = caracter;
    }
    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad clase.
     */
    private String clase;

    /**
     * Getter para propiedad clase.
     * @return Valor de la propiedad clase.
     */
    public String getClase() {

        return this.clase;
    }

    /**
     * Setter para propiedad clase.
     * @param clase Nuevo valor de la propiedad clase.
     */
    public void setClase(String clase) {

        this.clase = clase;
    }
    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad asunto.
     */
    private String asunto;

    /**
     * Getter para propiedad asunto.
     * @return Valor de la propiedad asunto.
     */
    public String getAsunto() {

        return this.asunto;
    }

    /**
     * Setter para propiedad asunto.
     * @param asunto Nuevo valor de la propiedad asunto.
     */
    public void setAsunto(String asunto) {

        this.asunto = asunto;
    }
    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad grupo.
     */
    private Integer grupo;

    /**
     * Getter para propiedad grupo.
     * @return Valor de la propiedad grupo.
     */
    public java.lang.Integer getGrupo() {

        return this.grupo;
    }

    /**
     * Setter para propiedad grupo.
     * @param grupo Nuevo valor de la propiedad grupo.
     */
    public void setGrupo(java.lang.Integer grupo) {

        this.grupo = grupo;
    }
    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad fecha_entrega.
     */
    private java.sql.Date fecha_entrega;

    /**
     * Getter para propiedad fecha_entreha.
     * @return Valor de la propiedad fecha_entreha.
     */
    public java.sql.Date getFecha_entrega()  {

        return this.fecha_entrega;
    }

    /**
     * Setter para propiedad fecha_entreha.
     * @param fecha_entreha Nuevo valor de la propiedad fecha_entreha.
     */
    public void setFecha_entrega(java.sql.Date fecha_entrega)  {

        this.fecha_entrega = fecha_entrega;
    }
    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad nro_radicacion.
     */
    private String nro_radicacion;

    /**
     * Getter para propiedad nro_radicacion.
     * @return Valor de la propiedad nro_radicacion.
     */
    public String getNro_radicacion() {

        return this.nro_radicacion;
    }

    /**
     * Setter para propiedad nro_radicacion.
     * @param nro_radicacion Nuevo valor de la propiedad nro_radicacion.
     */
    public void setNro_radicacion(String nro_radicacion) {

        this.nro_radicacion = nro_radicacion;
    }
    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad nro_contrato.
     */
    private String nro_contrato;

    /**
     * Getter para propiedad nro_contrato.
     * @return Valor de la propiedad nro_contrato.
     */
    public String getNro_contrato() {

        return this.nro_contrato;
    }

    /**
     * Setter para propiedad nro_contrato.
     * @param nro_contrato Nuevo valor de la propiedad nro_contrato.
     */
    public void setNro_contrato(String nro_contrato) {

        this.nro_contrato = nro_contrato;
    }
    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad fecha_vencimiento.
     */
    private java.sql.Date fecha_vencimiento;

    /**
     * Getter para propiedad fecha_vencimiento.
     * @return Valor de la propiedad fecha_vencimiento.
     */
    public java.sql.Date getFecha_vencimiento() {

        return this.fecha_vencimiento;
    }

    public void setFecha_vencimiento(java.sql.Date fecha_vencimiento) {

        this.fecha_vencimiento = fecha_vencimiento;
    }
    
    public java.util.Date getFechaVencimiento() {
            
        return fecha_vencimiento;
    }

    public void setFechaVencimiento(java.util.Date fechaVence) {
        fecha_vencimiento = ( fechaVence == null ? null : new java.sql.Date(fechaVence.getTime()));
    }
    
    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad ultima_modificacion.
     */
    private java.sql.Date ultima_modificacion;

    /**
     * Getter para propiedad ultima_modificacion.
     * @return Valor de la propiedad ultima_modificacion.
     */
    public java.sql.Date getUltima_modificacion() {

        return this.ultima_modificacion;
    }

    /**
     * Setter para propiedad ultima_modificacion.
     * @param ultima_modificacion Nuevo valor de la propiedad ultima_modificacion.
     */
    public void setUltima_modificacion(java.sql.Date ultima_modificacion) {

        this.ultima_modificacion = ultima_modificacion;
    }

    public java.util.Date getUltimaModificacion() {
            
        return this.ultima_modificacion;
    }

    public void setUltimaModificacion(java.util.Date fecha) {
        ultima_modificacion = ( fecha == null ? null : new java.sql.Date(fecha.getTime()));
    }

    //Utilizado para realizar consultas por rangos. No se almacena en la base
    //de datos.

    java.util.Date ultimaModificacion2;
            
    public java.util.Date getUltimaModificacion2(){
        return ultimaModificacion2;
    }
    //Método para utilizar con el objeto Calendar
    public void setUltimaModificacion2(java.util.Date fecha){
        ultimaModificacion2 = fecha;
    }

    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad correspondencias.
     */
    private java.util.List correspondencias;

    /**
     * Getter para propiedad correspondencias.
     * @return Valor de la propiedad correspondencias.
     */
    public java.util.List getCorrespondencias() {

        return this.correspondencias;
    }

    /**
     * Setter para propiedad correspondencias.
     * @param correspondencias Nuevo valor de la propiedad correspondencias.
     */
    public void setCorrespondencias(java.util.List correspondencias) {

        this.correspondencias = correspondencias;
    }
    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad documento.
     */
    private DocumentoVo documento;
    /**
     * Getter para propiedad documento.
     * @return Valor de la propiedad documento.
     */
    public DocumentoVo getDocumento(){
             return(documento);
    }    
    /**
     * Setter para propiedad documento.
     * @param documento Nuevo valor de la propiedad documento.
     */
    public void setDocumento(DocumentoVo documento ){
             this.documento = documento;
    }
    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad documento.
     */
    private TablaReferenciaVo dependencia = new TablaReferenciaVo();
    /**
     * Getter para propiedad documento.
     * @return Valor de la propiedad documento.
     */
    public TablaReferenciaVo getDependencia(){
             return(dependencia);
    }    
    /**
     * Setter para propiedad documento.
     * @param documento Nuevo valor de la propiedad dependencia.
     */
    public void setDependencia(TablaReferenciaVo dependencia ){
             this.dependencia = dependencia;
    }
    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad ano_contrato.
     */
    private Integer ano_contrato;
    /**
     * Getter para propiedad documento.
     * @return Valor de la propiedad documento.
     */
    public Integer getAno_contrato(){
             return(ano_contrato);
    }    
    /**
     * Setter para propiedad documento.
     * @param documento Nuevo valor de la propiedad documento.
     */
    public void setAno_contrato(Integer ano_contrato ){
             this.ano_contrato = ano_contrato;
    }    
    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad rol_propietario.
     */
    private Integer rol_propietario;
    /**
     * Getter para propiedad documento.
     * @return Valor de la propiedad documento.
     */
    public Integer getRol_propietario(){
             return(rol_propietario);
    }    
    /**
     * Setter para propiedad documento.
     * @param documento Nuevo valor de la propiedad dependencia.
     */
    public void setRol_propietario(Integer rol_propietario ){
             this.rol_propietario = rol_propietario;
    }    
    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad documento.
     */
    private String consecutivo;
    /**
     * Getter para propiedad documento.
     * @return Valor de la propiedad documento.
     */
    public String getConsecutivo(){
             return(consecutivo);
    }    
    /**
     * Setter para propiedad documento.
     * @param documento Nuevo valor de la propiedad dependencia.
     */
    public void setConsecutivo(String consecutivo ){
             this.consecutivo = consecutivo;
    }      
    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad asunto_borrar.
     */
    private String asunto_borrar;

    /**
     * Getter para propiedad asunto_borrar.
     * @return Valor de la propiedad asunto_borrar.
     */
    public String getAsunto_borrar() {

        return this.asunto_borrar;
    }
    
    public void setAsunto_borrar(String asunto) {

        this.asunto_borrar = asunto;
    }
    
    /*------------------------------------------------------------------------*/
    
    /**
     * Conserva el valor de la propiedad idref_tipo.
     */
    private TablaReferenciaVo idref_tipo = new TablaReferenciaVo();

    /**
     * Getter para propiedad estado.
     * @return Valor de la propiedad idref_tipo.
     */
    public TablaReferenciaVo getIdref_tipo()  {

        return this.idref_tipo;
    }

    /**
     * Setter para propiedad estado.
     * @param estado Nuevo valor de la propiedad idref_tipo.
     */
    public void setIdref_tipo(TablaReferenciaVo idref_tipo)  {

        this.idref_tipo = idref_tipo;
    }
    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad nro_radicacion_invias.
     */
    private String nro_radicacion_invias;

    /**
     * Getter para propiedad nro_radicacion_invias.
     * @return Valor de la propiedad nro_radicacion_invias.
     */
    public String getNro_radicacion_invias() {

        return this.nro_radicacion_invias;
    }

    /**
     * Setter para propiedad nro_radicacion_invias.
     * @param nro_radicacion_invias Nuevo valor de la propiedad nro_radicacion_invias.
     */
    public void setNro_radicacion_invias(String nro_radicacion_invias) {

        this.nro_radicacion_invias = nro_radicacion_invias;
    }
    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad fecha_radicacion.
     */
    private java.sql.Date fecha_radicacion;

    /**
     * Getter para propiedad fecha_radicacion.
     * @return Valor de la propiedad fecha_radicacion.
     */
    public java.sql.Date getFecha_radicacion()  {
        return this.fecha_radicacion;
    }

    /**
     * Setter para propiedad fecha_radicacion.
     * @param fecha_radicacion Nuevo valor de la propiedad fecha_radicacion.
     */
    public void setFecha_radicacion(java.sql.Date fecha_radicacion)  {
        this.fecha_radicacion = fecha_radicacion;
    }

    //Método para utilizar con el objeto Calendar
    public java.util.Date getFechaRadicacion(){
        return fecha_radicacion;
    }
    //Método para utilizar con el objeto Calendar
    public void setFechaRadicacion(java.util.Date fecha){
        fecha_radicacion = ( fecha == null ? null : new java.sql.Date(fecha.getTime()));
    }
    
    //Utilizado para realizar consultas por rangos. No se almacena en la base
    //de datos.

    java.util.Date fecha_radicacion2;
            
    public java.util.Date getFechaRadicacion2(){
        return fecha_radicacion2;
    }
    //Método para utilizar con el objeto Calendar
    public void setFechaRadicacion2(java.util.Date fecha){
        fecha_radicacion2 = fecha;
    }
    
    /*------------------------------------------------------------------------*/
    /**
     * Conserva el valor de la propiedad fecha_radicacion_invias.
     */
    private java.sql.Date fecha_radicacion_invias;

    /**
     * Getter para propiedad fecha_radicacion_invias.
     * @return Valor de la propiedad fecha_radicacion_invias.
     */
    public java.sql.Date getFecha_radicacion_invias()  {

        return this.fecha_radicacion_invias;
    }
    /**
     * Setter para propiedad fecha_radicacion.
     * @param fecha_radicacion Nuevo valor de la propiedad fecha_radicacion.
     */
    public void setFecha_radicacion_invias(java.sql.Date fecha_radicacion_invias)  {

        this.fecha_radicacion_invias = fecha_radicacion_invias;
    }

    //Método para utilizar con el objeto Calendar
    public java.util.Date getFechaRadicacionInvias(){
        return fecha_radicacion_invias;
    }
    //Método para utilizar con el objeto Calendar
    public void setFechaRadicacionInvias(java.util.Date fecha){
        fecha_radicacion_invias = ( fecha == null ? null : new java.sql.Date(fecha.getTime()));
    }

    //Utilizado para realizar consultas por rangos. No se almacena en la base
    //de datos.

    java.util.Date fecha_radicacion_invias2;
            
    public java.util.Date getFechaRadicacionInvias2(){
        return fecha_radicacion_invias2;
    }
    //Método para utilizar con el objeto Calendar
    public void setFechaRadicacionInvias2(java.util.Date fecha){
        fecha_radicacion_invias2 = fecha;
    }
    
    /*------------------------------------------------------------------------*/
    
    public String toString(){
            StringBuffer ret = new StringBuffer();                
            ret.append((id_correspondencia != null ? "ID Correspondencia : " + id_correspondencia + "\n": ""));                        
            ret.append((consecutivo != null ? "Consecutivo : " + consecutivo + "\n": ""));                        
            ret.append((clase != null ? "Clase : " + clase + "\n": ""));                        
            ret.append((idref_tipo != null ? "Tipo : " + idref_tipo.getEtiqueta() + "\n": ""));                        
            ret.append((idref_estadoactual != null && idref_estadoactual.getEtiqueta() != null ? "Estado actual : " +idref_estadoactual.getEtiqueta() + "\n": ""));
            ret.append((idper_remitente != null && idper_remitente.getEtiqueta() != null ? "Remitente : " + idper_remitente.getEtiqueta() + "\n" : ""));            
            ret.append((idper_destinatario != null && idper_destinatario.getEtiqueta() != null ? "Destinatario : " + idper_destinatario.getEtiqueta() + "\n" : ""));
            ret.append((nro_contrato != null ?"Contrato : " + nro_contrato + "\n": ""));
            ret.append((nro_radicacion != null ?"Nro radicación : " + nro_radicacion + "\n": ""));
            ret.append((fecha_radicacion != null ? "Fecha de radicación : " +fecha_radicacion + "\n": ""));
            ret.append((nro_radicacion_invias != null ?"Nro radicación Invias: " + nro_radicacion_invias + "\n": ""));
            ret.append((fecha_radicacion_invias != null ? "Fecha de radicación Invias : " + fecha_radicacion_invias + "\n": ""));
            ret.append((fecha_entrega != null ? "Fecha de recepción : " + fecha_entrega + "\n": ""));
            ret.append((asunto != null ? "Asunto : " + asunto + "\n": ""));
            return ret.toString();        
    }
    
    /*------------------------------------------------------------------------*/
    public CorrespondenciaVo getCopia(){ 
        CorrespondenciaVo   vo = new CorrespondenciaVo();
        vo.setId_correspondencia( id_correspondencia );
        vo.setClase( clase );
        vo.setCaracter( caracter );
        vo.setIdper_remitente( idper_remitente);
        vo.setAsunto( asunto);
        vo.setAsunto_borrar( asunto_borrar);
        vo.setNro_radicacion( nro_radicacion);
        vo.setFecha_radicacion( fecha_radicacion);
        vo.setNro_radicacion_invias( nro_radicacion_invias);
        vo.setFecha_radicacion_invias( fecha_radicacion_invias);
        vo.setNro_contrato( nro_contrato);
        vo.setFecha_vencimiento( fecha_vencimiento);
        vo.setGrupo( grupo );
        vo.setFecha_entrega( fecha_entrega);
        vo.setUltima_modificacion( ultima_modificacion);
        vo.setDocumento( documento);
        vo.setConsecutivo( consecutivo );
        vo.setRol_propietario( rol_propietario);
        vo.setAno_contrato( ano_contrato);
        vo.setId_corresp_padre( id_corresp_padre );
        if( idref_estadoactual != null )vo.setIdref_estadoactual( idref_estadoactual.getCopia() );
        if( idper_destinatario != null )vo.setIdper_destinatario( idper_destinatario.getCopia() );
        if( idper_remitente != null ) vo.setIdper_remitente( idper_remitente.getCopia());
        if( dependencia != null )vo.setDependencia( dependencia.getCopia() );
        if( idref_tipo != null )vo.setIdref_tipo( idref_tipo.getCopia());
        if( documento != null ){
            DocumentoVo nuevo = new DocumentoVo();
            nuevo.setNombre_documento(documento.getNombre_documento());
            nuevo.setCorrespondencia(documento.getCorrespondencia());
        }
        return vo;
    }
    /*------------------------------------------------------------------------*/
    public boolean equals(Object obj) {
        //Es el mismo objeto ?
        if ( this == obj ){
            return true;
        }
        //Es una correspondencia?
        if( !( obj instanceof CorrespondenciaVo) ){
            return false;
        }
        CorrespondenciaVo vo = (CorrespondenciaVo)obj;
        //Igual el destinatario ?
        Object ob1 = idper_destinatario;
        Object ob2 = vo.getIdper_destinatario();
        if( (ob1 == null && ob2 != null) || ( !ob1.equals(ob2) )) return false;
        //Igual el tipo ?
        ob1 = idref_tipo;
        ob2 = vo.getIdref_tipo();
        if( (ob1 == null && ob2 != null) || ( !ob1.equals(ob2) )) return false;
        //Igual la clase ?
        ob1 = clase;
        ob2 = vo.getClase();
        if( (ob1 == null && ob2 != null) || ( !ob1.equals(ob2) )) return false;
        //Igual el carácter ?
        ob1 = caracter;
        ob2 = vo.getCaracter();
        if( (ob1 == null && ob2 != null) || ( !ob1.equals(ob2) )) return false;
        //Igual el estado actual
        if(!idref_estadoactual.equals(vo.getIdref_estadoactual()))return false;
        //Igual el asunto ?
        if(!asunto.equals(vo.getAsunto()))return false;
        //Igual el nro de contrato
        ob1 = nro_contrato;
        ob2 = vo.getNro_contrato();
        if( ( ob1 == null && ob2 != null ) || ( !ob1.equals(ob2)) ) return false;
        //Igual el año del contrato?
        ob1 = ano_contrato;
        ob2 = vo.getAno_contrato();
        if( ( ob1==null && ob2!=null ) || ( !ob1.equals(ob2)) ) return false;
        //Igual la dependencia del contrato?
        ob1 = dependencia;
        ob2 = vo.getDependencia();
        if( ( ob1 == null && ob2 != null ) || ( ob1 != null && ob2 == null )) {
            return false;
        }else{
            Integer a = dependencia.getId_referencia();
            Integer b = vo.getDependencia().getId_referencia();
            if( !a.equals(b)){
                return false;
            }
        }
        //Igual el documento?
        ob1 = documento;
        ob2 = vo.getDocumento();
        if( ( ob1 == null && ob2 != null ) || ( ob1 != null && ob2 == null )) {
            return false;
        }else{
            byte[] a = documento.getArchivo();
            byte[] b = vo.getDocumento().getArchivo();
            if( a != b ){
                return false;
            }
        }
        //Igual el nro de radicación?
        ob1 = nro_radicacion;
        ob2 = vo.getNro_radicacion();
        if( (ob1==null && ob2!=null) || ( !ob1.equals(ob2)) ) return false;
        //Igual la fecha de radicación?
        ob1 = fecha_radicacion;
        ob2 = vo.getFecha_radicacion();
        if( (ob1==null && ob2!=null) || ( !ob1.equals(ob2)) ) return false;
        //Igual el nro de radicación invias?
        ob1  = nro_radicacion_invias;
        ob2 = vo.getNro_radicacion_invias();
        if( (ob1==null && ob2!=null) || ( !ob1.equals(ob2)) ) return false;
        //Igual la fecha de radicación?
        ob1 = fecha_radicacion_invias;
        ob2 = vo.getFecha_radicacion_invias();
        if( (ob1==null && ob2!=null) || ( !ob1.equals(ob2)) ) return false;
        //Igual la fecha de vencimiento?
        ob1 = fecha_vencimiento;
        ob2 = vo.getFecha_vencimiento();
        if( (ob1==null && ob2!=null) || ( !ob1.equals(ob2)) ) return false;
        //Igual la correspondencia padre?
        ob1 = id_corresp_padre;
        ob2 = vo.getId_corresp_padre();
        if( (ob1==null && ob2!=null) || ( !ob1.equals(ob2)) ) return false;
        return true;
    }    
    /*------------------------------------------------------------------------*/
    public Integer getId(){
        return  (id_correspondencia);
    }
    public String getEtiqueta(){
        return  (this.asunto!=null)? asunto:null;
    }
    /*------------------------------------------------------------------------*/
    
}
