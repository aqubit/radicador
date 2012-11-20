/*
 * Utilidades.java
 *
 * Created on 4 de marzo de 2006, 01:05 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.util;
import com.unal.convenio.sip.common.vo.BaseVo;
import java.util.ResourceBundle;
import java.text.MessageFormat;
import javax.faces.model.SelectItem;
import java.util.List;
import java.util.Iterator;
import java.util.Set;
/**
 *
 * @author César
 */
public class ToolBox {

    /** Creates a new instance of Utilidades */
    private ToolBox() {
    }
    
    public static String formatearMensaje(String pattern, java.lang.Object[] valores){
        MessageFormat format = new MessageFormat(pattern);
        return format.format(valores);                     
    }       

    
    public static void poblarDropDown(List ddItems, List datos){
        ddItems.clear();
        if( datos != null && !datos.isEmpty() ){
            Iterator it = datos.iterator();
            BaseVo ob;
            while(it.hasNext()){
                ob = (BaseVo)it.next();
                ddItems.add( new SelectItem( ob.getId(), ob.getEtiqueta() ));
            }
        }
    }
    
    public static void poblarDropDown(List ddItems, java.util.Map datos ){
        ddItems.clear();
        if( datos != null && !datos.isEmpty() ){
            Iterator it = datos.keySet().iterator();
            while(it.hasNext()){
                Object ob = it.next();
                ddItems.add( new SelectItem( ob, datos.get(ob).toString() ));
            }          
        }
    }
}
