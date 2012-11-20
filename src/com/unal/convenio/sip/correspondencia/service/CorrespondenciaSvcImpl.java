/*
 * CorrespondenciaSvcImpl.java
 *
 * Created on 15 de febrero de 2006, 12:45 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.correspondencia.service;
import com.unal.convenio.sip.admin.dao.TipoReferenciaDAO;
import com.unal.convenio.sip.admin.voh.RolVo;
import com.unal.convenio.sip.admin.voh.PersonaVo;
import com.unal.convenio.sip.admin.service.*;
import com.unal.convenio.sip.correspondencia.voh.*;
import com.unal.convenio.sip.correspondencia.voh.EstadoCorrespondenciaVo;
import com.unal.convenio.sip.correspondencia.voh.AnoVo;
import com.unal.convenio.sip.admin.voh.TablaReferenciaVo;
import com.unal.convenio.sip.admin.voh.UsuarioVo;
import com.unal.convenio.sip.admin.voh.TipoReferenciaVo;
import com.unal.convenio.sip.correspondencia.dao.*;
import java.util.*;
/**
 *
 * @author MB
 */
public class CorrespondenciaSvcImpl implements CorrespondenciaSvc, java.io.Serializable{
    
    public static final String TIPO_INT = "INTERNO";
    public static final String TIPO_EXT = "EXTERNO";
    public static final String CLASE_ENT = "ENTRADA";
    public static final String CLASE_SAL = "SALIDA";
    private static final String NOMBRE_TIPOREFERENCIA = "ESTADO_COR";
    private static final Map CARACTERES;
    private static final Map ESTADOS_ENT;
    private static final Map ESTADOS_SAL;
    private static final Map ESTADOS;
    private static TablaReferenciaVo ESTADO_E_RECIBIDA;
    private static TablaReferenciaVo ESTADO_E_CONTESTADA;
    private static TablaReferenciaVo ESTADO_S_REGISTRADA;
    private static TablaReferenciaVo ESTADO_S_ENTREGADA;
    
    private static CorrespondenciaDAOFactory daoFactory =
                CorrespondenciaDAOFactory.getDAOFactory(CorrespondenciaDAOFactory.HIBERNATE);
    private static com.unal.convenio.sip.admin.service.AdminSvc svcAdmin = 
            new com.unal.convenio.sip.admin.service.AdminSvcImpl();
    
    static{
        CARACTERES = new LinkedHashMap();
        CARACTERES.put(TIPO_INT, TIPO_INT);
        CARACTERES.put(TIPO_EXT, TIPO_EXT);
        ESTADOS = new LinkedHashMap();
        ESTADOS_ENT = new LinkedHashMap();
        ESTADOS_SAL = new LinkedHashMap();
        loadEstados();
    }
     
    
    private static void loadEstados(){
        List tipos = svcAdmin.getTipoReferencias();
        Integer idTipoEstado = null;
        for(int i = 0 ; i < tipos.size() ; i++){
            TipoReferenciaVo tipo = (TipoReferenciaVo)tipos.get(i);
            if( tipo.getNombre().indexOf(NOMBRE_TIPOREFERENCIA) != -1 ) {
                idTipoEstado = tipo.getId_tiporeferencia();
                break;
            }
        }
        if( idTipoEstado != null ){
            List estados = svcAdmin.getReferenciasPorTipo(idTipoEstado);            
            if ( estados != null ){
                int i = 0;
                for( ; i < estados.size() ; i++){
                    TablaReferenciaVo vo = (TablaReferenciaVo)estados.get(i);
                    if( vo.getNombre().startsWith("E") ){
                        ESTADOS.put(vo.getId_referencia(), vo);
                        ESTADOS_ENT.put(vo.getId_referencia(), vo.getNombre());                        
                    }else{
                        ESTADOS.put(vo.getId_referencia(), vo);
                        ESTADOS_SAL.put(vo.getId_referencia(), vo.getNombre());
                    }
                    if(vo.getNombre().startsWith("E1")){
                        ESTADO_E_RECIBIDA = vo;
                    }else if( vo.getNombre().indexOf("CONT") != -1){
                        ESTADO_E_CONTESTADA  = vo;
                    }else if(vo.getNombre().startsWith("S1")){
                        ESTADO_S_REGISTRADA = vo;
                    }
                }
                ESTADO_S_ENTREGADA = (TablaReferenciaVo)estados.get(--i);
            }
        }
    }
     
    public CorrespondenciaVo crear(CorrespondenciaVo vo, PersonaVo personaCambio)
        throws CrearCorrespondenciaException,CrearEstadoCorrespondenciaException{
        CorrespondenciaDAO dao = daoFactory.getCorrespondenciaDAO();
        EstadoCorrespondenciaDAO daoEst = daoFactory.getEstadoCorrespondenciaDAO();
        TablaReferenciaVo estadoActual =(vo.getClase().equals(CLASE_ENT))?ESTADO_E_RECIBIDA:ESTADO_S_REGISTRADA;
        boolean bOk = true;
        vo.setIdref_estadoactual(estadoActual);
        java.sql.Date fecha = new java.sql.Date(new java.util.Date().getTime());
        vo.setFecha_entrega(fecha);
        vo.setUltima_modificacion(fecha);        
        //Verificar que las relaciones many-to-one que no son obligatorias contengan
        //algun valor. Si no contienen hay que pasar null. De otra forma hibernate
        //dispara una excepción
        if( vo.getDependencia().getId_referencia() == null ) vo.setDependencia(null);
        bOk = dao.saveUpdate(vo); 
        if( !bOk ) throw( new CrearCorrespondenciaException() );
        vo.setGrupo(vo.getId_correspondencia());
        dao.saveUpdate(vo); 
        if( !bOk ) throw( new CrearCorrespondenciaException() );
        EstadoCorrespondenciaVo estadoVo = new EstadoCorrespondenciaVo();
        estadoVo.setFecha(fecha);
        estadoVo.setId_correspondencia( vo.getId_correspondencia() );
        estadoVo.setIdref_estado(estadoActual);
        estadoVo.setPersona(personaCambio);
        estadoVo.setIdUsuario(vo.getIdUsuario());
        bOk = daoEst.saveUpdate(estadoVo); 
        if( !bOk ) throw( new CrearEstadoCorrespondenciaException() );
        return vo;
    }
    
    public CorrespondenciaVo getCorrespondencia(Integer idCorrespondencia){
        if( idCorrespondencia == null )return null;
        CorrespondenciaDAO dao = daoFactory.getCorrespondenciaDAO();
        return dao.find(idCorrespondencia);
    }
    
    public CorrespondenciaVo actualizar(CorrespondenciaVo voActual, CorrespondenciaVo voNuevo, PersonaVo personaCambio) 
        throws CambiaEstadoException , NoCambiaException, SubirArchivoException{
        
        CorrespondenciaDAO dao = daoFactory.getCorrespondenciaDAO();
        //No se debe permitir cambiar el estado de una correspondencia a un estado
        //anterior
        Integer iEstadoActual = voActual.getIdref_estadoactual().getId_referencia();
        Integer iNuevoEstado = voNuevo.getIdref_estadoactual().getId_referencia();   
        if( iNuevoEstado.intValue() < iEstadoActual.intValue() ){
            throw( new CambiaEstadoException() );
        }
        boolean bCambiaEstado = !iEstadoActual.equals(iNuevoEstado);
        //Si ningun campo cambia, indicarlo
        if( voActual.equals(voNuevo) ){
            throw( new NoCambiaException() );
        }
        java.sql.Date fecha = new java.sql.Date(new java.util.Date().getTime());
        voNuevo.setUltima_modificacion( fecha );
        //Subir el documento
        DocumentoVo doc = voNuevo.getDocumento();
        if( !dao.saveUpdateDocumento(doc, voNuevo )){
            throw( new SubirArchivoException() );
        }
        //Cuál es el grupo de la correspondencia ?
        CorrespondenciaVo padre = null;
        Integer idPadre = voNuevo.getId_corresp_padre();
        if( idPadre != null ){
            padre = getCorrespondencia(idPadre);
            voNuevo.setGrupo( padre.getGrupo() );
        }else{
            voNuevo.setGrupo( voNuevo.getId_correspondencia() );
        }
        //Verificar que las relaciones many-to-one que no son obligatorias contengan
        //algun valor. Si no contienen hay que pasar null. De otra forma hibernate
        //dispara una excepción
        if( voNuevo.getDependencia().getId_referencia() == null ) voNuevo.setDependencia(null);
        //Actualizar la correspondencia
        dao.saveUpdate( voNuevo );         
        if( bCambiaEstado ){
            EstadoCorrespondenciaVo estadoVo = new EstadoCorrespondenciaVo();
            estadoVo.setFecha(fecha);
            estadoVo.setId_correspondencia( voNuevo.getId_correspondencia() );
            estadoVo.setIdref_estado( voNuevo.getIdref_estadoactual() );
            estadoVo.setIdUsuario( voNuevo.getIdUsuario() );
            estadoVo.setPersona( personaCambio );
            EstadoCorrespondenciaDAO daoEst = daoFactory.getEstadoCorrespondenciaDAO();
            daoEst.saveUpdate(estadoVo);
            //Si es necesario, cambiar el estado de la correspondencia padre 
            if(  padre != null &&
                 voNuevo.getClase().equals(CLASE_SAL) && 
                 iNuevoEstado.equals(ESTADO_S_ENTREGADA.getId_referencia())&& 
                 padre.getClase().equals(CLASE_ENT) 
            ){
                 padre.setIdUsuario( voNuevo.getIdUsuario() );
                 padre.setIdref_estadoactual( ESTADO_E_CONTESTADA );
                  dao.saveUpdate( padre );
            }
        }
        //Refrescar el objeto de forma que los campos se actualizan en la ventana
        //de info detallada
        return getCorrespondencia(voNuevo.getId_correspondencia());
    }
    /* 
     *
     *
     *
     * Para poblar dropdowns
     *
     *
     *
     */
    
    public Map getCaracteresMap(){
        return CARACTERES;
    }
    
    public Map getEstadosEntMap(){
        return ESTADOS_ENT;
    }
    public Map getEstadosSalMap(){
        return ESTADOS_SAL;
    }
    
    public PersonaVo getPersona(Integer idPersona){
        return svcAdmin.getPersona(idPersona);
    }
    
    public Map getRemitentesMap(){
       return getPersonasMap();
    }
    
    public Map getDestinatariosMap(){
        return getPersonasMap();
    }
    
    public Map getCorrespondenciasBaseMap(Integer id_correspondencia, CorrespondenciaVo filtro){
        Map corresp = new LinkedHashMap();
        CorrespondenciaDAO dao = daoFactory.getCorrespondenciaDAO();
        List lista = dao.findAllBase(filtro);
        if( lista != null && ! lista.isEmpty() ){
            for( int i = 0 ; i < lista.size() ; i++){
                CorrespondenciaVo vo = (CorrespondenciaVo)lista.get(i);
                StringBuffer label = new StringBuffer();
                label.append( (vo.getId_correspondencia()));
                label.append( (vo.getNro_radicacion() != null ? "\t-\t"+vo.getNro_radicacion():""));
                label.append( (vo.getNro_contrato() != null ? "\t-\t"+ vo.getNro_contrato():""));
                corresp.put(vo.getId_correspondencia(), label.toString());
            }
        }
        //No mostrar la correspondencia como posible padre de si misma
        corresp.remove(id_correspondencia);
        return corresp;
    }
    
    public CorrespondenciaVo[]  getCorrespondenciasPorGrupo(Integer grupo){
          if( grupo == null) return null;
          CorrespondenciaVo vo = new CorrespondenciaVo();
          vo.setGrupo(grupo);
          return getCorrespondencias(vo);
    }
    
    public CorrespondenciaVo[] getCorrespondencias(CorrespondenciaVo vo){
        if( vo == null )return null;
        List lista = new ArrayList();
        CorrespondenciaVo[] result = null;
        CorrespondenciaDAO dao = daoFactory.getCorrespondenciaDAO();
        lista = dao.findAll(vo);
        if( lista != null && !lista.isEmpty() ){
            result = new CorrespondenciaVo[lista.size()];
            result = (CorrespondenciaVo[])lista.toArray(result);
        }
        return result;
    }
    

    public Map getClasesMap(){
        Map map = new LinkedHashMap();
        map.put(CLASE_ENT, CLASE_ENT);
        map.put(CLASE_SAL, CLASE_SAL);
        return map;
    }
    

    public Map getPersonasMap(){
        Map result = new LinkedHashMap();
        List personas = svcAdmin.getPersonas();
        if( personas != null && !personas.isEmpty() ){
            for( int i = 0 ; i < personas.size() ; i++){
               PersonaVo p = (PersonaVo)personas.get(i);
               result.put(p.getId(), p.getEtiqueta());
            }
        }
        return result;
    }
    
    
    public TablaReferenciaVo getEstado(Integer idEstado){
        return (TablaReferenciaVo)ESTADOS.get(idEstado);
    }
    

    public List getTipos() {
        AdminSvc svc = new AdminSvcImpl();
        return svc.getReferenciasPorTipo("TIPO_CORRESPONDENCIA");
    }

    
    public EstadoCorrespondenciaVo[] getEstadosPorCorrespondencia(Integer idCorrespondencia){
        EstadoCorrespondenciaDAO dao = daoFactory.getEstadoCorrespondenciaDAO();
        List lista = dao.findEstadosPorCorrespondencia(idCorrespondencia);
        if( lista==null || lista.isEmpty()) lista = new ArrayList();
        EstadoCorrespondenciaVo[] result = new EstadoCorrespondenciaVo[lista.size()];
        result = (EstadoCorrespondenciaVo[])lista.toArray(result);
        return result;
    }
    
    /* 
     *
     *
     *
     * Envio automático de correos
     *
     *
     *
     */
        
    public void enviarAlarmas() {
        enviarAlarmas(new Integer(0));
        enviarAlarmas(new Integer(3));
        enviarAlarmas(new Integer(-1));        
    }

    public void enviarAlarmas( Integer dias ){
        java.util.Set administradores;
        com.unal.util.mail.MailInfoVo mailvo = new com.unal.util.mail.MailInfoVo();
        int iDias = dias.intValue();
        if( iDias == 0 ){
            mailvo.setSubject("Esta correspondencia vence hoy por respuesta");
        }else if( iDias > 0 ){
            mailvo.setSubject("Esta correspondencia esta a menos de "+ iDias + " días de vencer por respuesta");
        }else{
            mailvo.setSubject("Esta correspondencia esta VENCIDA por respuesta");
        }
        mailvo.setFrom("sipol@no.responder");
        administradores = getAdministradoresConvenio();
        CorrespondenciaVo[] vos = getCorrespondenciasAVencer(dias);
        String correo = null;
        if( vos != null ){
            for( int i = 0 ; i < vos.length ;i++ ){
                mailvo.setMessage(vos[i].toString());
                java.util.Set responsables = new java.util.HashSet(administradores);
                getCorreosPorRol( vos[i].getRol_propietario(),responsables);
                mailvo.setTo( responsables );
                try{
                    com.unal.util.mail.SendEmailSvc.send(mailvo);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    public CorrespondenciaVo[] getCorrespondenciasAVencer(Integer dias){
        CorrespondenciaVo[]  result = new CorrespondenciaVo[0] ; 
        CorrespondenciaVo vo = new CorrespondenciaVo();
        vo.setClase(CLASE_ENT);
        if( dias != null ){
            java.util.Calendar cal =  new java.util.GregorianCalendar();
            cal.clear(java.util.Calendar.MILLISECOND);
            cal.clear(java.util.Calendar.SECOND);
            cal.clear(java.util.Calendar.MINUTE);
            cal.clear(java.util.Calendar.HOUR);
            java.sql.Date hoy = new java.sql.Date( cal.getTime().getTime() );           
            java.sql.Date vence = new java.sql.Date(hoy.getTime()+(dias.intValue()*24*60*60*1000) );
            vo.setFecha_vencimiento(vence);
            CorrespondenciaVo[] res = getCorrespondencias(vo);
            List rem = new ArrayList();
            if( res != null ){
                for(int i = 0 ; i < res.length ; i++ ){
                    if( !res[i].getIdref_estadoactual().equals(ESTADO_E_CONTESTADA)){
                        rem.add(res[i]);
                    }
                }
                result = new CorrespondenciaVo[rem.size()];
                result = (CorrespondenciaVo[])rem.toArray(result);                  
            }
        }
        return result;
    }

    private java.util.Set getAdministradoresConvenio(){
        AdminSvc svc = new AdminSvcImpl();
        Integer id_rol_administradores = new Integer(1);
        java.util.Set recipients = new java.util.HashSet();
        //Traer los correos de los administradores
        java.util.List usuarios= svc.getUsuariosPorRol(id_rol_administradores);
        Iterator it = usuarios.iterator();
        UsuarioVo user = null;       
        String correo = null;
        while( it.hasNext()){
            user = (UsuarioVo)it.next();            
            correo = user.getPersona().getEmail();
            if( correo != null){
                recipients.add( correo );
            }            
        }
        return recipients;
    }    
    
    private void getCorreosPorRol(Integer id_rol_propietario, java.util.Set destinatarios ){
        AdminSvc svc = new AdminSvcImpl();
        Integer id_rol_administradores = new Integer(1);
        //Traer los correos de los miembros del grupo
        java.util.List usuarios= svc.getUsuariosPorRol(id_rol_propietario);
        Iterator it = usuarios.iterator();
        UsuarioVo user = null;       
        String correo = null;
        while( it.hasNext()){
            user = (UsuarioVo)it.next();            
            correo = user.getPersona().getEmail();
            if( correo != null){
                destinatarios.add( correo );
            }            
        }
    }    

    public List getDependenciasContratos() {
        AdminSvc svc = new AdminSvcImpl();
        return svc.getReferenciasPorTipo("DEPENDENCIA_CONTRATO");
    }

    public List getAnosContratos() {
        List l = new ArrayList();
        for( int i = 1990; i <= 2020; i++){
            l.add( new AnoVo(new Integer(i)));
        }        
        return l;
    }

    public String getGrupoPropietario(CorrespondenciaVo cp) {
        RolVo rol = new AdminSvcImpl().getRol( cp.getRol_propietario() );
        return rol.getEtiqueta();
    }

    public boolean estaVencida(CorrespondenciaVo vo) {
        boolean bVencida = false;
        java.util.Date fechaVencimiento = vo.getFechaVencimiento();
        if( fechaVencimiento != null){
            java.util.Calendar cal =  java.util.Calendar.getInstance();
            cal.clear(java.util.Calendar.MILLISECOND);
            cal.clear(java.util.Calendar.SECOND);
            cal.clear(java.util.Calendar.MINUTE);
            cal.clear(java.util.Calendar.HOUR);
            java.sql.Date hoy = new java.sql.Date( cal.getTime().getTime() );       
            bVencida = fechaVencimiento.before(hoy);
        }
        return bVencida;
    }
    
    public boolean puedeActualizarCorrespondencia(UsuarioVo usuario, CorrespondenciaVo correspondencia) {
        boolean bAutorizado = false;
        AdminSvc svc = new AdminSvcImpl();
        //1. Verificar que el usuario tenga el perfil propietario de la correspondenicia
        Set roles = usuario.getRoles();
        Integer iIdRolPropietario = correspondencia.getRol_propietario();
        Iterator it = roles.iterator();
        while( it.hasNext() && !bAutorizado){
            RolVo rol = (RolVo)it.next();
            bAutorizado = rol.getId().equals(iIdRolPropietario);
        }
        //2. Verificar  que la correspondencia no se encuentra en su último estado
        if( bAutorizado ){
            if( correspondencia.getClase().equals(CLASE_ENT) ){
                bAutorizado = !correspondencia.getIdref_estadoactual().equals(ESTADO_E_CONTESTADA);
            }else{
                bAutorizado = !correspondencia.getIdref_estadoactual().equals(ESTADO_S_ENTREGADA);
            }
        }
        //3. Los administradores del sistema pueden modificar la correspondencia independiente
        //de su estado o propietario
        bAutorizado |= svc.isAdministrador(usuario);
        return bAutorizado;
    }
}

