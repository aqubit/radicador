/**
*					--DAO Generator--
*
* Java code generated by the DAO Generator Developed By Akcess.in 
* Date of file generation: Wed Mar 01 09:34:18 COT 2006
*
* DAO Generator Version 1.0
*
*/
package com.unal.convenio.sip.admin.voh;
import com.unal.convenio.sip.common.vo.BaseVo;
import java.sql.Timestamp;

import java.util.Set;
import java.util.HashSet;
/**
* DataTransferObject for the domain entity tsip_admin_rol
*/
public class RolVo extends BaseVo 
{
	private Integer id_rol;
	private String nombre;
	private String descripcion;
        private Set usuarios = new HashSet();

	public RolVo(){}
	public RolVo(Integer id_rol ,String nombre ,String descripcion){
		this.id_rol = id_rol;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public void setId_rol(Integer id_rol ){
		 this.id_rol =id_rol;
	}
	public Integer getId_rol(){
		 return(id_rol);
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
        public void setUsuarios(Set usuarios){
                this.usuarios = usuarios;
        }
        public Set getUsuarios(){
                return(usuarios);
        }       
	public String toString(){
		return (nombre != null ? nombre : "");
	}        
        public boolean equals(Object obj) {
            boolean retValue = false;
            if ( this == obj ){
                retValue = true;
            }else if( obj instanceof RolVo && obj != null){
                RolVo tmp = (RolVo)obj;
                if( tmp.getId_rol() != null ){
                    retValue = tmp.getId_rol().equals(id_rol);
                }
            }
            return retValue;
        }

        public int hashCode() {           
            return id_rol.intValue();
        }                     
        
        public String getEtiqueta() {
            return nombre;
        }

        public Integer getId() {
            return id_rol;
        }            
}//End
