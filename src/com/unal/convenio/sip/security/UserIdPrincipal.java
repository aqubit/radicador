/*
 * MyidUsuarioPrincipal.java
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

    
    public class UserIdPrincipal implements Principal, java.io.Serializable {


     /*
      *     
      */
    private String idUsuario;


    public UserIdPrincipal(String idUsuario) {
	if (idUsuario == null)
	    throw new NullPointerException("UsuarioIdPrincipal::illegal null input");

	this.idUsuario = idUsuario;
    }


    public String getName() {
	return idUsuario;
    }


    public String toString() {
	return("idUsuarioPrincipal:  " + idUsuario);
    }


    public boolean equals(Object o) {
	if (o == null)
	    return false;

        if (this == o)
            return true;
 
        if (!(o instanceof UserIdPrincipal))
            return false;
        UserIdPrincipal that = (UserIdPrincipal)o;

	if (this.getName().equals(that.getName()))
	    return true;
	return false;
    }
 
 
    public int hashCode() {
	return idUsuario.hashCode();
    }
    
}
