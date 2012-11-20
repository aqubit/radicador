/*
 * CorrespondenciaSvc.java
 *
 * Created on 15 de febrero de 2006, 12:44 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.unal.convenio.sip.correspondencia.service;
import com.unal.convenio.sip.admin.voh.UsuarioVo;
import java.util.*;
import com.unal.convenio.sip.admin.voh.PersonaVo;
import com.unal.convenio.sip.admin.voh.TablaReferenciaVo;
import com.unal.convenio.sip.correspondencia.voh.CorrespondenciaVo;
import com.unal.convenio.sip.correspondencia.voh.EstadoCorrespondenciaVo;
import com.unal.convenio.sip.correspondencia.voh.DocumentoVo;

/**
 *
 * @author MB
 */
public interface CorrespondenciaSvc {

    List getAnosContratos();
    List getDependenciasContratos();
    List getTipos();
    Map getClasesMap();
    Map getCaracteresMap();
    Map getEstadosEntMap();
    Map getEstadosSalMap();
    Map getRemitentesMap();
    Map getDestinatariosMap();
    String getGrupoPropietario(CorrespondenciaVo cp);
    public boolean estaVencida(CorrespondenciaVo vo);
    boolean puedeActualizarCorrespondencia(UsuarioVo usuario, CorrespondenciaVo correspondencia );
    Map getCorrespondenciasBaseMap(Integer id_correspondencia, CorrespondenciaVo filtro);
    TablaReferenciaVo getEstado(Integer idEstado);
    CorrespondenciaVo crear(CorrespondenciaVo vo, PersonaVo personaCambio)
        throws CrearCorrespondenciaException,CrearEstadoCorrespondenciaException;
    CorrespondenciaVo actualizar( CorrespondenciaVo voActual, CorrespondenciaVo voNuevo,  PersonaVo personaCambio ) 
        throws CambiaEstadoException , NoCambiaException, SubirArchivoException;
    CorrespondenciaVo getCorrespondencia(Integer idCorrespondencia);
    CorrespondenciaVo[] getCorrespondencias(CorrespondenciaVo correspondencia);
    CorrespondenciaVo[] getCorrespondenciasPorGrupo(Integer grupo); 
    PersonaVo getPersona(Integer idPersona);
    EstadoCorrespondenciaVo[] getEstadosPorCorrespondencia(Integer idCorrespondencia);
    CorrespondenciaVo[] getCorrespondenciasAVencer(Integer dias); 
    void enviarAlarmas();
}
