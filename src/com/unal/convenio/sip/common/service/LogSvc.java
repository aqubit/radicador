/*
 * AdminSvc.java
 *
 * Created on 15 de febrero de 2006, 12:44 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.common.service;
import com.unal.convenio.sip.common.voh.LogVo;
import com.unal.convenio.sip.common.vo.BaseVo;
import java.util.List;
/**
 *
 * @author César
 */
public interface LogSvc {   
    public static final String OP_INSERT = "Insercion";
    public static final String OP_RETRIEVE = "Consulta";
    public static final String OP_UPDATE = "Actualizacion";
    public static final String OP_DELETE = "Eliminacion";
    LogVo[]    getLogs(LogVo log);
    LogVo   getLog(Integer id);
    boolean persistirLog(BaseVo baseVo, String operacion);
    boolean persistirLog(LogVo log);
    boolean deleteLog(LogVo log); 
    LogVo createLogVo(BaseVo baseVo, String operacion);
}

