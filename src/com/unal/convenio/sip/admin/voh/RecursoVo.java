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
import com.unal.convenio.sip.admin.voh.TablaReferenciaVo;

/**
* DataTransferObject for the domain entity tsip_admin_recurso
*/
public class RecursoVo extends BaseVo
{
	private Integer id_recurso;
	private String nombre;
	private TablaReferenciaVo idref_tiporecurso;
	private String descripcion;
        private Set permisos = new HashSet();


	public RecursoVo(){}
	public RecursoVo(Integer id_recurso,String nombre ,TablaReferenciaVo idref_tiporecurso ,String descripcion, Set permisos){
		this.id_recurso = id_recurso;
		this.nombre = nombre;
		this.idref_tiporecurso = idref_tiporecurso;
		this.descripcion = descripcion;
                this.permisos = permisos;
	}

        public void setPermisos(Set permisos){
                this.permisos = permisos;
        }
        
        public Set getPermisos(){
                return(permisos);
        }
        
	public void setId_recurso(Integer id_recurso ){
		 this.id_recurso =id_recurso;
	}
	public Integer getId_recurso(){
		 return(id_recurso);
	}
	public void setNombre(String nombre ){
		 this.nombre =nombre;
	}
	public String getNombre(){
		 return(nombre);
	}
	public void setIdref_tiporecurso(TablaReferenciaVo idref_tiporecurso ){
		 this.idref_tiporecurso =idref_tiporecurso;
	}
	public TablaReferenciaVo getIdref_tiporecurso(){
		 return(idref_tiporecurso);
	}
	public void setDescripcion(String descripcion ){
		 this.descripcion =descripcion;
	}
	public String getDescripcion(){
		 return(descripcion);
	}
	public String toString(){
		return (nombre != null ? nombre : "");
	}           
        public String getEtiqueta() {
            return nombre;
        }

        public Integer getId() {
            return id_recurso;
        }            
}//End
