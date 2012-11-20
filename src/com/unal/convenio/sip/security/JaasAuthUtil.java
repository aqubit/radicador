/*
 * Copyright 2005 Sun Microsystems, Inc. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * - Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * - Redistribution in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in
 *   the documentation and/or other materials provided with the
 *   distribution.
 *
 * Neither the name of Sun Microsystems, Inc. or the names of
 * contributors may be used to endorse or promote products derived
 * from this software without specific prior written permission.
 *
 * This software is provided "AS IS," without a warranty of any
 * kind. ALL EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND
 * WARRANTIES, INCLUDING ANY IMPLIED WARRANTY OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE OR NON-INFRINGEMENT, ARE HEREBY
 * EXCLUDED. SUN AND ITS LICENSORS SHALL NOT BE LIABLE FOR ANY DAMAGES
 * SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THE SOFTWARE OR ITS DERIVATIVES. IN NO EVENT WILL SUN
 * OR ITS LICENSORS BE LIABLE FOR ANY LOST REVENUE, PROFIT OR DATA, OR
 * FOR DIRECT, INDIRECT, SPECIAL, CONSEQUENTIAL, INCIDENTAL OR
 * PUNITIVE DAMAGES, HOWEVER CAUSED AND REGARDLESS OF THE THEORY OF
 * LIABILITY, ARISING OUT OF THE USE OF OR INABILITY TO USE SOFTWARE,
 * EVEN IF SUN HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.
 *
 * You acknowledge that Software is not designed, licensed or intended
 * for use in the design, construction, operation or maintenance of
 * any nuclear facility.
 */

package com.unal.convenio.sip.security;

import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;




public class JaasAuthUtil {
    
    /** Creates a new instance of JaasAuthUtil */
    public JaasAuthUtil() {
        
    }
    
    
    public static void validateUsername(UIComponent uic, String entry) {
   
        String field = "Username";

        if (!validateLength(uic, entry, field, 4, 30) ){
            return;
        }
        
        if (entry.indexOf(' ') != -1) {
            String message = field + " : Cannot contain spaces";
            invalidateInput((UIInput)uic, message);
            return;
        }
    }

    
    public static void validatePassword(UIComponent uic, String entry) {
        String field = "Password";

        if (!validateLength(uic, entry, field, 4, 30) ){
            return;
        }
        
        if (entry.indexOf(' ') != -1) {
            String message = field + " : Cannot contain spaces";
            invalidateInput((UIInput)uic, message);
            return;
        }
    }
    
    
    
    public static void validatePassword(UIComponent uic, String password, String confirmPassword) {

        String field = "Password";
        if (!validateLength(uic, password, field, 4, 30) ){
            return;
        }
        
        if (password.indexOf(' ') != -1) {
            String message = field + " : Cannot contain spaces";
            invalidateInput((UIInput)uic, message);
            return;
        }
        
        if (!password.equals(confirmPassword)) {
            String message = " Passwords do not match!";
            invalidateInput((UIInput)uic, message);
            return;
        }
       
    }
    

    public static void validateFirstName(UIComponent uic, String entry) {
        String field = "FirstName";
        if (!validateLength(uic, entry, field, 1, 50) ){
            return;
        }
     }
    
    public static void validateLastName(UIComponent uic, String entry) {
        String field = "LastName";
        if (!validateLength(uic, entry, field, 1, 50) ){
            return;
        }
    }
    
    
    public static void validateEmail(UIComponent uic, String entry) {
        
        System.out.println("Email Received: " + entry);
        String field = "Email"; 
        
        if (!validateLength(uic, entry, field, 1, 50) ){
            return;
        }
        
        int lastDot = entry.lastIndexOf('.');
        //last dot must occur and not be the first or last character
        if (lastDot < 1 || lastDot == entry.length() - 1) {
            String message = field + ": Invalid Email";
            invalidateInput((UIInput)uic, message);
            return;
        }
        
        int at = entry.indexOf('@');
	int lastAt = entry.lastIndexOf('@');
        //@ must occur only once, not be the first character, and be before the last dot
        if (at != lastAt || at < 1 || at > lastDot) {
            String message = field + ": Invalid Email";
            invalidateInput((UIInput)uic, message);
            return;
        }
        
        //the character immediately before and after the @ must not be a dot
        if (entry.charAt(at - 1) == '.' || entry.charAt(at + 1) == '.') {
            String message = field + " : InvalidEmail";
            invalidateInput((UIInput)uic, message);
            return;
        }
        
        //spaces are not permitted
        if (entry.indexOf(' ') != -1) {
            String message = field + " : InvalidEmail";
            invalidateInput((UIInput)uic, message);
            return;
        }
    }
        
    
    public static boolean validateLength(UIComponent uic, String entry, String fieldKey, int min, int max) {
        
        if (entry.length() < min) {
            String message = fieldKey + " : Value has to be longer than " + min + " characters";
            invalidateInput((UIInput)uic, message);
            return false;
        }
        
        if (entry.length() > max) {
            String message = fieldKey + " : Value has to be shorter than " + max + " characters";
            invalidateInput((UIInput)uic, message);
            return false;
        }
        
        return true;
    }  

    public static void invalidateInput(UIInput uii, String message) {
        uii.setValid(false);
	FacesContext fc = javax.faces.context.FacesContext.getCurrentInstance();
        fc.addMessage(uii.getClientId(fc), new FacesMessage(javax.faces.application.FacesMessage.SEVERITY_ERROR, message, null));        
    }
    
}
