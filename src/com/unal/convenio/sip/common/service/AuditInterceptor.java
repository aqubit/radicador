/*
 * AuditInterceptor.java
 *
 * Created on 25 de marzo de 2006, 08:59 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.common.service;

import com.unal.convenio.sip.common.vo.BaseVo;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import org.hibernate.Interceptor;
import org.hibernate.type.Type;
import org.hibernate.metadata.ClassMetadata;

/**
 *
 * @author César
 */

public class AuditInterceptor implements Interceptor, Serializable {

    private static final LogSvc sipLogSvc = new LogSvcImpl();
    
    public String onPrepareStatement(String str) {
        return str;
    }

    public Object getEntity(String str, Serializable serializable) throws org.hibernate.CallbackException {        
        return null;
    }

    public Object instantiate(String str, org.hibernate.EntityMode entityMode, Serializable serializable) throws org.hibernate.CallbackException {
        return null;
    }

    public String getEntityName(Object obj) throws org.hibernate.CallbackException {
        return null;        
    }

    public Boolean isTransient(Object obj) {
        return null;        
    }

    public void onDelete(Object obj, Serializable serializable, Object[] obj2, String[] str, Type[] type) throws org.hibernate.CallbackException {

    }
   
    public boolean onSave(Object obj, Serializable serializable, Object[] obj2, String[] str, Type[] type) throws org.hibernate.CallbackException {
        return false;
    }

    public boolean onLoad(Object obj, Serializable serializable, Object[] obj2, String[] str, Type[] type) throws org.hibernate.CallbackException {
        return false;
    }

    public int[] findDirty(Object obj, Serializable serializable, Object[] obj2, Object[] obj3, String[] str, Type[] type) {
        return null;
    }

    public boolean onFlushDirty(Object obj, Serializable serializable, Object[] obj2, Object[] obj3, String[] str, Type[] type) throws org.hibernate.CallbackException {
        return false;
    }

    public void onCollectionRecreate(Object obj, Serializable serializable) throws org.hibernate.CallbackException {
        //do nothing
    }

    public void onCollectionRemove(Object obj, Serializable serializable) throws org.hibernate.CallbackException {
        //do nothing
    }

    public void onCollectionUpdate(Object obj, Serializable serializable) throws org.hibernate.CallbackException {
        //do nothing
    }

    public void afterTransactionBegin(org.hibernate.Transaction transaction) {
        //do nothing
    }

    public void afterTransactionCompletion(org.hibernate.Transaction transaction) {
        //do nothing
    }

    public void beforeTransactionCompletion(org.hibernate.Transaction transaction) {
        //do nothing
    }

    public void preFlush(java.util.Iterator iterator) throws org.hibernate.CallbackException {
        //do nothing
    }

    public void postFlush(java.util.Iterator iterator) throws org.hibernate.CallbackException {
        //do nothing
    }
}
