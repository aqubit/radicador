/*
 * MyRolPrincipal.java
 *
 * Created on 5 de febrero de 2006, 05:30 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.security;

/**
 *
 * @author César
 */
    import java.security.Principal;

    
    public class RolPrincipal implements Principal, java.io.Serializable {


     /*
      *     
      */
    private String rol;


    public RolPrincipal(String rol) {
	if (rol == null)
	    throw new NullPointerException("MyRolPrincipal::illegal null input");

	this.rol = rol;
    }


    public String getName() {
	return rol;
    }


    public String toString() {
	return("MyRolPrincipal:  " + rol);
    }


    public boolean equals(Object o) {
	if (o == null)
	    return false;

        if (this == o)
            return true;
 
        if (!(o instanceof RolPrincipal))
            return false;
        RolPrincipal that = (RolPrincipal)o;

	if (this.getName().equals(that.getName()))
	    return true;
	return false;
    }
 
 
    public int hashCode() {
	return rol.hashCode();
    }
    
}
