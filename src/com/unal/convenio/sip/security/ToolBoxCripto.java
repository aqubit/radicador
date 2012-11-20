/*
 * ToolBox.java
 *
 * Created on 13 de marzo de 2006, 09:10 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.security;

import com.unal.convenio.sip.admin.voh.RolPermisoVo;
import com.unal.convenio.sip.admin.voh.UsuarioVo;
import javax.faces.context.FacesContext;
import com.unal.convenio.sip.admin.service.AdminSvc;
import com.unal.convenio.sip.admin.service.AdminSvcImpl;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import javax.crypto.Cipher;
import sun.misc.*;
import java.io.IOException;
import java.io.FileInputStream;
import com.unal.util.SipLog;
import java.util.ResourceBundle;
import java.util.Iterator;
import java.util.Set;
import javax.servlet.http.HttpServletResponse;
import javax.faces.context.ExternalContext;
/**
 *
 * @author César
 */
public class ToolBoxCripto {
    
    private static PrivateKey privKey;
    private static PublicKey pubKey;
    
    static{
       ResourceBundle bundleSipApp = ResourceBundle.getBundle("sip.sipApp");
       String keyStorePath = System.getProperty("javax.net.ssl.keyStore");
       String keyStorePassword = System.getProperty("javax.net.ssl.keyStorePassword");       
       try{
            KeyStore kst = KeyStore.getInstance("JKS");
            kst.load(  new FileInputStream(keyStorePath) , keyStorePassword.toCharArray());
            KeyPair kp = getPrivateKey(kst, bundleSipApp.getString("SIP.KEY.NAME"), keyStorePassword.toCharArray());
            privKey = kp.getPrivate();
            pubKey = kp.getPublic();       
        }catch(Exception e){
            SipLog.getLogger().error(e);
        }       
    }
    
    /** Creates a new instance of ToolBox */
    public ToolBoxCripto() {
    }

    private static KeyPair getPrivateKey(KeyStore keystore, String alias, char[] password) {
        try {
            // Get private key
            Key key = keystore.getKey(alias, password);
            if (key instanceof PrivateKey) {
                // Get certificate of public key
                java.security.cert.Certificate cert = keystore.getCertificate(alias);
    
                // Get public key
                PublicKey publicKey = cert.getPublicKey();
    
                // Return a key pair
                return new KeyPair(publicKey, (PrivateKey)key);
            }
        } catch (UnrecoverableKeyException e) {
            SipLog.getLogger().error(e);
        } catch (NoSuchAlgorithmException e) {
            SipLog.getLogger().error(e);
        } catch (KeyStoreException e) {
            SipLog.getLogger().error(e);
        }
        return null;
    }           

    /**
     * Encrypt a text using public key.
     * @param text The original unencrypted text
     * @param key The public key
     * @return Encrypted text
     * @throws java.lang.Exception
     */
    public static byte[] encrypt(byte[] text )
    {
        byte[] cipherText = null;
        try
        {
            //
            // get an RSA cipher object and print the provider
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            // encrypt the plaintext using the public key
            cipher.init(Cipher.ENCRYPT_MODE, pubKey);
            cipherText = cipher.doFinal(text);
        }
        catch (Exception e){
            SipLog.getLogger().error(e);
        }
        return cipherText;
    }    

    /**
     * Encrypt a text using public key. The result is enctypted BASE64 encoded text
     * @param text The original unencrypted text
     * @param key The public key
     * @return Encrypted text encoded as BASE64
     * @throws java.lang.Exception
     */
    public static String encrypt(String text ) 
    {
        String encryptedText = null;
        try
        {
            byte[] cipherText = encrypt(text.getBytes("ISO-8859-1"));
            encryptedText = encodeBASE64(cipherText);
        }
        catch (Exception e){
            SipLog.getLogger().error(e);
        }
        return encryptedText;
    }    
    
    /**
     * Decrypt BASE64 encoded text using private key
     * @param text The encrypted text, encoded as BASE64
     * @param key The private key
     * @return The unencrypted text encoded as ISO-8859-1
     * @throws java.lang.Exception
     */
    public static String decrypt( String text ) 
    {
        String result = null;
        try
        {
            // decrypt the text using the private key
            byte[] dectyptedText = decrypt(decodeBASE64(text));
            result = new String(dectyptedText, "ISO-8859-1");
        }
        catch (Exception e){
            SipLog.getLogger().error(e);
        }
        return result;

    }

    /**
     * Decrypt text using private key
     * @param text The encrypted text
     * @param key The private key
     * @return The unencrypted text
     * @throws java.lang.Exception
     */
    public static byte[] decrypt(byte[] text )
    {
        byte[] dectyptedText = null;
        try
        {
            // decrypt the text using the private key
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(Cipher.DECRYPT_MODE, privKey);
            dectyptedText = cipher.doFinal(text);
        }
        catch (Exception e){
            SipLog.getLogger().error(e);
        }
        return dectyptedText;

    }
    
    /**
     * Encode bytes array to BASE64 string
     * @param bytes
     * @return Encoded string
     */
    private static String encodeBASE64(byte[] bytes)
    {        
        BASE64Encoder b64 = new BASE64Encoder();
        return b64.encode(bytes);
    }

    /**
     * Decode BASE64 encoded string to bytes array
     * @param text The string
     * @return Bytes array
     * @throws IOException
     */
    private static byte[] decodeBASE64(String text) throws IOException {
        byte[] result = null;
        try{
            BASE64Decoder b64 = new BASE64Decoder();
            result = b64.decodeBuffer(text);
        }
        catch (Exception e){
            SipLog.getLogger().error(e);
        }
        return result;
    }       
}
