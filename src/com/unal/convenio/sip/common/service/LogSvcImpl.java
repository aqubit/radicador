/*
 * AdminSvcImpl.java
 *
 * Created on 15 de febrero de 2006, 12:45 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.common.service;
import com.unal.convenio.sip.common.dao.CommonDAOFactory;
import com.unal.convenio.sip.common.dao.LogDAO;
import com.unal.convenio.sip.common.voh.LogVo;
import com.unal.convenio.sip.common.vo.BaseVo;
import com.unal.convenio.sip.admin.voh.UsuarioVo;
import com.unal.convenio.sip.admin.service.AdminSvc;
import com.unal.convenio.sip.admin.service.AdminSvcImpl;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.persister.entity.AbstractEntityPersister;
import org.hibernate.type.Type;
import org.hibernate.type.BlobType;
import org.hibernate.type.SetType;
import org.hibernate.EntityMode;
import java.util.List;
import java.util.Set;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author MB & César
 */
 
public class LogSvcImpl implements LogSvc, java.io.Serializable{   
    
    private static CommonDAOFactory daoFactory = CommonDAOFactory.getDAOFactory(CommonDAOFactory.HIBERNATE);
    private static AdminSvc adminSvc = new AdminSvcImpl();

    
    public LogVo[] getLogs(LogVo vo) {
       LogVo[] result = new  LogVo[0];
       LogDAO dao = daoFactory.getLogDAO();
       List lista =  dao.findAll(vo);
       if( lista != null && !lista.isEmpty() ){
            result = new LogVo[lista.size()];
            result = (LogVo[])lista.toArray(result);
            for( int i = 0 ; i < result.length ; i++){
                Integer idUsuario = result[i].getId_usuario();
                UsuarioVo usuario = adminSvc.getUsuario(idUsuario);
                if( usuario != null ){
                    result[i].setUsuarioStr(usuario.toString());
                }
           }
       }
       
       return result;
       
    }        

    public LogVo getLog(Integer id) {
       LogDAO dao = daoFactory.getLogDAO();
       return dao.find(id);        
    }

    public boolean persistirLog(LogVo log) { 
       LogDAO dao = daoFactory.getLogDAO();
       log.setFecha(new java.sql.Date(new Date().getTime()));
       return dao.saveUpdate(log);             
    }
    
    public boolean persistirLog(BaseVo baseVo, String operacion) {
       LogVo log = createLogVo(baseVo, operacion);
       LogDAO dao = daoFactory.getLogDAO();
       return dao.saveUpdate(log);             
    }
    
    
    public boolean deleteLog(LogVo Log) {
       LogDAO dao = daoFactory.getLogDAO();
       return dao.delete(Log);             
    }  
    
    public LogVo createLogVo(BaseVo baseVo, String operacion){
       AbstractEntityPersister metaData = HibernateSvc.getMetaData(baseVo.getClass());
       String strNombreTabla = metaData.getTableName();
       LogVo log = new LogVo();
       log.setFecha(new java.sql.Date(new Date().getTime()));
       log.setId_registro(baseVo.getId());
       log.setId_usuario(baseVo.getIdUsuario());
       log.setNombre_tabla(strNombreTabla);
       log.setOperacion(operacion);
       String[] arrayStrPropertyNames = metaData.getPropertyNames();
       Type[] arrayTypes = metaData.getPropertyTypes();
       Object[] arrayValues = metaData.	getPropertyValues(baseVo, EntityMode.POJO); 
       String estadoString = "";
       for( int i = 0; i < arrayValues.length; i++){
           if( arrayTypes[i] instanceof SetType ){
               Set s = (Set)arrayValues[i];
               Iterator it = s.iterator();
               estadoString += arrayStrPropertyNames[i] + "{ ";
               for( ;it.hasNext();){
                    estadoString += it.next() + ",";
               }
               estadoString += "} |";
           }else if( !( arrayTypes[i] instanceof BlobType )) {
                estadoString += arrayStrPropertyNames[i] + "=" + arrayValues[i] + " | ";
           }
       }
       log.setEstado_entidad(estadoString);
       return log;
    }
}