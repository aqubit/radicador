package com.unal.convenio.sip.security.jdbc;

import com.unal.convenio.sip.admin.voh.UsuarioVo;
import java.io.Serializable;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.security.auth.*;
import javax.security.auth.spi.*;
import javax.security.auth.login.*;
import javax.security.auth.callback.*;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import com.unal.convenio.sip.security.UserIdPrincipal;
import com.unal.convenio.sip.security.ToolBoxCripto;
import com.unal.convenio.sip.admin.service.*;
        
public class JdbcLoginModule implements LoginModule,Serializable{
    
    // initial state
    private UsuarioVo usuario; 
    private Subject subject;
    private CallbackHandler callbackHandler;
    private Map sharedState;
    private Map options;
      
    // username and password
    private String username;
    private String password;
    
    //authentication status
    boolean auth_success = true;
    boolean commit_success = false;
    boolean password_mismatch= false;
    boolean invalid_user= false;
    boolean disabled_user= false;
    
    /**
     * Initialize this <code>LoginModule</code>.
     *
     * <p>
     *
     * @param subject the <code>Subject</code> to be authenticated. <p>
     *
     * @param callbackHandler a <code>CallbackHandler</code> for communicating
     *			with the end user (prompting for user names and
     *			passwords, for example). <p>
     *
     * @param sharedState shared <code>LoginModule</code> state. <p>
     *
     * @param options options specified in the login
     *			<code>Configuration</code> for this particular
     *			<code>LoginModule</code>.
     */
    
    
    public void initialize(
            Subject subject, 
            CallbackHandler callbackHandler,
            Map sharedState, 
            Map options
    ){        
        System.out.println("JdbcLoginModule:InitMethod");        
        this.subject = subject;
        this.callbackHandler = callbackHandler;
        this.sharedState = sharedState;
        this.options = options;       
    }
    
    /**
     * Authenticate the user by prompting for a user name and password.
     *
     * <p>
     *
     * @return true in all cases since this <code>LoginModule</code>
     *		should not be ignored.
     *
     * @exception FailedLoginException if the authentication fails. <p>
     *
     * @exception LoginException if this <code>LoginModule</code>
     *		is unable to perform the authentication.
     */
    public boolean login() throws LoginException {        
        System.out.println("JdbcLoginModule:login()");
        // get the callback handler with the user name and password
        if (callbackHandler == null)
            throw new LoginException("JdbcLoginModule: No CallbackHandler Available");
        
        Callback[] callbacks = new Callback[2];
        callbacks[0] = new NameCallback("Usuario");
        callbacks[1] = new PasswordCallback("Contraseña: ", false);
        
        try {
            callbackHandler.handle(callbacks);
            username = ((NameCallback)callbacks[0]).getName();
            password = new String(((PasswordCallback)callbacks[1]).getPassword());
            
            auth_success = validateUser(username, password);
            
            if(!auth_success){
                if(password_mismatch){
                    throw new LoginException("Contraseña incorrecta");
                }else if(invalid_user){
                    throw new LoginException("Usuario incorrecto");
                }else if(disabled_user){
                    throw new LoginException("Cuenta desactivada");
                }
            }
            return true;
        } catch (java.io.IOException ioe) {
            throw new LoginException(ioe.toString());
        } catch (UnsupportedCallbackException use) {
            throw new LoginException("JdbcLoginModule: Not Supported"+ use.getCallback().toString() );
        }
    }
    
    /**
     * <p> This method is called if the LoginContext's
     * overall authentication succeeded
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules
     * succeeded).
     * <p>
     *
     * @exception LoginException if the commit fails.
     *
     * @return true if this LoginModule's own login and commit
     *		attempts succeeded, or false otherwise.
     */
    public boolean commit() throws LoginException {
        System.out.println("JdbcLoginModule:commit()");
        if (auth_success) {           
            UserIdPrincipal idUsrPrincipal = new UserIdPrincipal(usuario.getId_usuario().toString());
            subject.getPrincipals().add(idUsrPrincipal);
            commit_success= true;
            System.out.println("Adding principals");
        } else {
            commit_success = false;
        }
        return commit_success;
    }
    
    /**
     * <p> This method is called if the LoginContext's
     * overall authentication failed.
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules
     * did not succeed).
     *
     * <p> If this LoginModule's own authentication attempt
     * succeeded (checked by retrieving the private state saved by the
     * <code>login</code> and <code>commit</code> methods),
     * then this method cleans up any state that was originally saved.
     *
     * <p>
     *
     * @exception LoginException if the abort fails.
     *
     * @return false if this LoginModule's own login and/or commit attempts
     *		failed, and true otherwise.
     */
    public boolean abort() throws LoginException {        
        System.out.println("JdbcLoginModule:abort()");
        if (!auth_success) {
            // authentication failure
            usuario = null;
            username = null;
            password = null;
            this.subject.getPrincipals().clear();
            return true;
        }
        return false;
    }
    
    /**
     * Logout the user.
     *
     * <p> This method removes the <code>SamplePrincipal</code>
     * that was added by the <code>commit</code> method.
     *
     * <p>
     *
     * @exception LoginException if the logout fails.
     *
     * @return true in all cases since this <code>LoginModule</code>
     *          should not be ignored.
     */
    public boolean logout() throws LoginException {
        System.out.println("JdbcLoginModule:logout()");
        this.usuario = null;
        this.username = null;
        this.password = null;
        this.subject.getPrincipals().clear();
        return true;
    }
    
    
    /**
     *  This method does the actual authentication by validating in the database
     *  if the user exists and if the password matches or not.
     *
     */
    
    public boolean validateUser(String username, String password){                 
        AdminSvc svc = new AdminSvcImpl();
        usuario = svc.getUsuarioPasswd(username);
        if( usuario == null ){
            //if no results obtained means the user is not present in the database
            auth_success = false;
            invalid_user = true;
            return auth_success;
        }
        if( usuario.getDisabled() != null && usuario.getDisabled().booleanValue() ){
            auth_success = false;
            disabled_user = true;
            return auth_success;            
        }
        //Check password con la llave privada del convenio
        byte[] paswdEncrypted = usuario.getPassword();
        String strPswdDecrypted = ToolBoxCripto.decrypt(new String(paswdEncrypted));
        if( !strPswdDecrypted.equals(password) ){                
            auth_success = false;
            password_mismatch= true;
            return auth_success;
        }
        return auth_success;
    }
}
