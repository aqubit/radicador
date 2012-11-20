/*
 * RolPermisoVo.java
 *
 * Created on 5 de marzo de 2006, 01:11 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.admin.voh;

import java.io.Serializable;
import com.unal.convenio.sip.admin.voh.RolVo;
import com.unal.convenio.sip.admin.voh.TablaReferenciaVo;

/**
* DataTransferObject for the domain entity tsip_admin_recurso
*/
public class RolPermisoVo implements Serializable
{
        private static final int HASH_PRIME = 1000003;    
        private RolVo rol;
        private TablaReferenciaVo permiso;

        public RolPermisoVo(){}
	
        public RolPermisoVo(RolVo rol , TablaReferenciaVo permiso){
            this.rol = rol;
            this.permiso = permiso;
        }
        
        
        public void setRol(RolVo rol){
                this.rol = rol;
        }       
        public RolVo getRol(){
                return(rol);
        }                
        public TablaReferenciaVo getPermiso(){
                return(permiso);
        }

        public void setPermiso(TablaReferenciaVo permiso){
                this.permiso = permiso;
        }     
        
        public boolean equals(Object obj) {
            boolean retValue = false;
            if ( this == obj ){
                retValue = true;
            }else if( obj instanceof RolPermisoVo && obj != null){
                RolPermisoVo tmp = (RolPermisoVo)obj;
                RolVo tmpRol = tmp.getRol();               
                TablaReferenciaVo tmpPermiso = tmp.getPermiso();
                retValue = tmpRol.equals(rol);
                retValue = tmpPermiso.equals(permiso);
            }
            return retValue;
        }

        public int hashCode() {    
            return HASH_PRIME * rol.getId_rol().intValue() + permiso.getId_referencia().intValue();
        }             
        
	public String toString(){
            return ( rol + "->" + permiso);
	}            
}//End

