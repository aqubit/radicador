/**
*					--DAO Generator--
*
* Java code generated by the DAO Generator Developed By Pravu Mishra 
* Date of file generation: Sat Feb 11 23:31:38 COT 2006
*
* DAO Generator Version 0.0.1
*
*/
package com.unal.convenio.sip.admin.voh;
import com.unal.convenio.sip.common.vo.BaseVo;
import java.sql.Timestamp;

/**
* DataTransferObject for the domain entity TSIP_TABLA_REFERENCIA
*/
public class TablaReferenciaVo extends BaseVo
{
	private Integer id_referencia;
	private TipoReferenciaVo id_tiporeferencia;
	private String nombre;
	private String descripcion;
	private String abreviacion;


	public TablaReferenciaVo(){}
	public TablaReferenciaVo(Integer id_referencia ,TipoReferenciaVo id_tiporeferencia ,String nombre ,String descripcion ,String abreviacion){
		this.id_referencia = id_referencia;
		this.id_tiporeferencia = id_tiporeferencia;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.abreviacion = abreviacion;
	}

	public void setId_referencia(Integer id_referencia ){
             this.id_referencia =id_referencia;
	}
	public Integer getId_referencia(){
             return(id_referencia);
	}
	public void setId_tiporeferencia(TipoReferenciaVo ob){
             this.id_tiporeferencia = ob;
	}
	public TipoReferenciaVo getId_tiporeferencia(){
             return(id_tiporeferencia);
	}
	public void setNombre(String nombre ){
             this.nombre =nombre;
	}
	public String getNombre(){
             return(nombre);
	}
	public void setDescripcion(String descripcion ){
             this.descripcion =descripcion;
	}
	public String getDescripcion(){
             return(descripcion);
	}
	public void setAbreviacion(String abreviacion ){
             this.abreviacion =abreviacion;
	}
	public String getAbreviacion(){
             return(abreviacion);
	}

	public String toString(){
            return (nombre != null ? nombre : "");
	}        

        public boolean equals(Object obj) {
            boolean retValue = false;
            if ( this == obj ){
                retValue = true;
            }else if( obj instanceof TablaReferenciaVo && obj != null){
                TablaReferenciaVo tmp = (TablaReferenciaVo)obj;
                if( tmp.getId_referencia() != null ){
                    retValue = tmp.getId_referencia().equals(id_referencia);
                }
            }
            return retValue;
        }

        public int hashCode() {           
            return id_referencia.intValue();
        }             
        
        public String getEtiqueta() {
            return nombre;
        }

        public Integer getId() {
            return id_referencia;
        }        
        
        public TablaReferenciaVo getCopia(){
            TablaReferenciaVo vo = new TablaReferenciaVo();
            vo.setId_referencia(id_referencia);
            vo.setId_tiporeferencia(id_tiporeferencia);
            vo.setNombre(nombre);
            vo.setDescripcion(descripcion); 
            vo.setAbreviacion(abreviacion);
            return vo;
        }
        
}//End