<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html"
    xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui" 
    xmlns:a4j="https://ajax4jsf.dev.java.net/ajax">
    <jsp:directive.page contentType="text/html;charset=ISO-8859-1" pageEncoding="UTF-8"/>
    <f:view>
        <f:loadBundle basename="sip.guiMessages" var="msgs"/>
        <ui:page binding="#{modulos$correspondencia$consultar.page1}" id="page1">
            <ui:html binding="#{modulos$correspondencia$consultar.html1}" id="html1">
                <ui:head binding="#{modulos$correspondencia$consultar.head1}" id="head1">
                    <ui:link binding="#{modulos$correspondencia$consultar.link1}" id="link1" url="/resources/menu-nal.css"/>
                </ui:head>
                <ui:body binding="#{modulos$correspondencia$consultar.body1}" focus="form1:txtID" id="body1" style="-rave-layout: grid">
                    <ui:script id="script1" url="/script/sipol.js"/>
                    <ui:form binding="#{modulos$correspondencia$consultar.form1}" id="form1" virtualFormsConfig="consultar | pnlPrincipal:pnlControles:layoutPanel4:ddDestinatario pnlPrincipal:pnlControles:txtID pnlPrincipal:pnlControles:ddClase pnlPrincipal:pnlControles:layoutPanel3:ddRemitente pnlPrincipal:pnlControles:ddEstado pnlPrincipal:pnlControles:ddTipo pnlPrincipal:pnlControles:ddCaracter pnlPrincipal:pnlControles:txtConsecutivo pnlPrincipal:pnlControles:gridPanel5:txtNroRadicacionInvias pnlPrincipal:pnlControles:layoutPanel2:ddDependencia pnlPrincipal:pnlControles:layoutPanel2:ddAno pnlPrincipal:pnlControles:layoutPanel2:txtNroContrato pnlPrincipal:pnlControles:gridPanel5:gridPanel6:calFechaRadicacionInvias pnlPrincipal:pnlControles:gridPanel3:txtNroRadicacion pnlPrincipal:pnlControles:ddRol pnlPrincipal:pnlControles:gridPanel1:calUltimaModif2 pnlPrincipal:pnlControles:gridPanel1:calUltimaModif pnlPrincipal:pnlControles:ddVencer pnlPrincipal:pnlControles:gridPanel3:gridPanel4:calFechaRadicacion pnlPrincipal:pnlControles:gridPanel3:gridPanel4:calFechaRadicacion2 pnlPrincipal:pnlControles:gridPanel5:gridPanel6:calFechaRadicacionInvias2 | pnlPrincipal:pnlBotones:btnConsultar">
                        <div>
                            <jsp:directive.include file="../../menu.jspf"/>
                        </div>
                        <h:panelGrid binding="#{modulos$correspondencia$consultar.pnlPrincipal}" id="pnlPrincipal"
                            rendered="#{UserInfoSessionBean.permiso['CORRESPONDENCIA_CONSULTAR']}" style="" width="504">
                            <ui:messageGroup binding="#{modulos$correspondencia$consultar.messageGroup1}" id="messageGroup1" showGlobalOnly="true"/>
                            <h:panelGrid binding="#{modulos$correspondencia$consultar.pnlControles}"
                                columnClasses="TablaSipPrimeraColumna, TablaSipRestoColumnas" columns="2" id="pnlControles" style="" width="479">
                                <ui:label binding="#{modulos$correspondencia$consultar.label2}" for="txtID" id="label2" styleClass="labelForm" text="ID"/>
                                <ui:textField binding="#{modulos$correspondencia$consultar.txtID}" columns="4"
                                    converter="#{modulos$correspondencia$consultar.integerConverter1}" id="txtID" style="width: 96px" tabIndex="1" text="#{modulos$correspondencia$consultar.vo.id_correspondencia}"/>
                                <ui:label binding="#{modulos$correspondencia$consultar.label12}" for="txtID" id="label12" styleClass="labelForm" text="Consecutivo"/>
                                <ui:textField binding="#{modulos$correspondencia$consultar.txtConsecutivo}" columns="4" id="txtConsecutivo" style="width: 96px"
                                    tabIndex="2" text="#{modulos$correspondencia$consultar.vo.consecutivo}"/>
                                <ui:label binding="#{modulos$correspondencia$consultar.label8}" for="ddClase" id="label8" styleClass="labelForm" text="Clase"/>
                                <h:selectOneMenu binding="#{modulos$correspondencia$consultar.ddClase}" id="ddClase" style="width: 200px" tabindex="3" value="#{modulos$correspondencia$consultar.vo.clase}">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$correspondencia$consultar.dropdown1SelectItems}" id="dropdown1SelectItems" value="#{modulos$correspondencia$consultar.ddClaseDefaultItems}"/>
                                </h:selectOneMenu>
                                <ui:label binding="#{modulos$correspondencia$consultar.label13}" id="label13" styleClass="labelForm" text="Carácter"/>
                                <h:selectOneMenu binding="#{modulos$correspondencia$consultar.ddCaracter}" id="ddCaracter" style="width: 200px" tabindex="4" value="#{modulos$correspondencia$consultar.vo.caracter}">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$correspondencia$consultar.dropdown1SelectItems7}" id="dropdown1SelectItems7" value="#{modulos$correspondencia$consultar.ddCaracterItems}"/>
                                </h:selectOneMenu>
                                <ui:label binding="#{modulos$correspondencia$consultar.label14}" id="label14" styleClass="labelForm" text="Tipo"/>
                                <h:selectOneMenu binding="#{modulos$correspondencia$consultar.ddTipo}" id="ddTipo" style="width: 350px" tabindex="5" value="#{modulos$correspondencia$consultar.vo.idref_tipo.id_referencia}">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$correspondencia$consultar.dropdown1SelectItems8}" id="dropdown1SelectItems8" value="#{modulos$correspondencia$consultar.ddTipoItems}"/>
                                </h:selectOneMenu>
                                <ui:label binding="#{modulos$correspondencia$consultar.label5}" id="label5" styleClass="labelForm" text="Estado"/>
                                <h:selectOneMenu binding="#{modulos$correspondencia$consultar.ddEstado}" id="ddEstado" style="width: 150px" tabindex="6" value="#{modulos$correspondencia$consultar.vo.idref_estadoactual.id_referencia}">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$correspondencia$consultar.dropdown1SelectItems1}" id="dropdown1SelectItems1" value="#{modulos$correspondencia$consultar.ddEstadoDefaultItems}"/>
                                </h:selectOneMenu>
                                <ui:label binding="#{modulos$correspondencia$consultar.label3}" id="label3" styleClass="labelForm" text="Remitente"/>
                                <ui:panelLayout binding="#{modulos$correspondencia$consultar.layoutPanel3}" id="layoutPanel3" panelLayout="flow" style="">
                                    <h:selectOneMenu binding="#{modulos$correspondencia$consultar.ddRemitente}" id="ddRemitente" style="width: 350px"
                                        tabindex="7" value="#{modulos$correspondencia$consultar.vo.idper_remitente.id_persona}">
                                        <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                        <f:selectItems binding="#{modulos$correspondencia$consultar.dropdown1SelectItems2}" id="dropdown1SelectItems2" value="#{modulos$correspondencia$consultar.ddRemitenteDefaultItems}"/>
                                    </h:selectOneMenu>
                                    <ui:imageHyperlink binding="#{modulos$correspondencia$consultar.imageHyperlink1}" id="imageHyperlink1"
                                        imageURL="/images/search.gif" onClick="doPopup(&quot;form1:ddRemitente&quot;)" tabIndex="8" target="popup" text="Buscar" url="/faces/modulos/common/buscarPersona.jsp"/>
                                </ui:panelLayout>
                                <ui:label binding="#{modulos$correspondencia$consultar.label4}" id="label4" styleClass="labelForm" text="Destinatario"/>
                                <ui:panelLayout binding="#{modulos$correspondencia$consultar.layoutPanel4}" id="layoutPanel4" panelLayout="flow">
                                    <h:selectOneMenu binding="#{modulos$correspondencia$consultar.ddDestinatario}" id="ddDestinatario" style="width: 350px"
                                        tabindex="9" value="#{modulos$correspondencia$consultar.vo.idper_destinatario.id_persona}">
                                        <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                        <f:selectItems binding="#{modulos$correspondencia$consultar.dropdown2SelectItems}" id="dropdown2SelectItems" value="#{modulos$correspondencia$consultar.ddDestinatarioDefaultItems}"/>
                                    </h:selectOneMenu>
                                    <ui:imageHyperlink binding="#{modulos$correspondencia$consultar.imageHyperlink2}" id="imageHyperlink2"
                                        imageURL="/images/search.gif" onClick="doPopup(&quot;form1:ddDestinatario&quot;)" tabIndex="10" target="popup"
                                        text="Buscar" url="/faces/modulos/common/buscarPersona.jsp"/>
                                </ui:panelLayout>
                                <ui:label binding="#{modulos$correspondencia$consultar.label6}" id="label6" styleClass="labelForm" text="Contrato"/>
                                <ui:panelLayout binding="#{modulos$correspondencia$consultar.layoutPanel2}" id="layoutPanel2" panelLayout="flow" style="height: 24px; width: 647px">
                                    <ui:textField binding="#{modulos$correspondencia$consultar.txtNroContrato}" columns="8" id="txtNroContrato" tabIndex="11" text="#{modulos$correspondencia$consultar.vo.nro_contrato}"/>
                                    <ui:label binding="#{modulos$correspondencia$consultar.label1}" id="label1" styleClass="labelForm" text="Año"/>
                                    <h:selectOneMenu binding="#{modulos$correspondencia$consultar.ddAno}"
                                        converter="#{modulos$correspondencia$consultar.integerConverter1}" id="ddAno" tabindex="12" value="#{modulos$correspondencia$consultar.vo.ano_contrato}">
                                        <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                        <f:selectItems binding="#{modulos$correspondencia$consultar.dropdown1SelectItems4}" id="dropdown1SelectItems4" value="#{modulos$correspondencia$consultar.ddAnoItems}"/>
                                    </h:selectOneMenu>
                                    <ui:label binding="#{modulos$correspondencia$consultar.label10}" id="label10" styleClass="labelForm" text="Dependencia"/>
                                    <h:selectOneMenu binding="#{modulos$correspondencia$consultar.ddDependencia}" id="ddDependencia" tabindex="13" value="#{modulos$correspondencia$consultar.vo.dependencia.id_referencia}">
                                        <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                        <f:selectItems binding="#{modulos$correspondencia$consultar.dropdown1SelectItems5}" id="dropdown1SelectItems5" value="#{modulos$correspondencia$consultar.ddDependenciaItems}"/>
                                    </h:selectOneMenu>
                                </ui:panelLayout>
                                <ui:label binding="#{modulos$correspondencia$consultar.label15}" id="label15" styleClass="labelForm" text="Número de radicación UN"/>
                                <h:panelGrid binding="#{modulos$correspondencia$consultar.gridPanel3}" columns="2" id="gridPanel3" style="">
                                    <ui:textField binding="#{modulos$correspondencia$consultar.txtNroRadicacion}" columns="8" id="txtNroRadicacion"
                                        tabIndex="14" text="#{modulos$correspondencia$consultar.vo.nro_radicacion}"/>
                                    <h:panelGrid binding="#{modulos$correspondencia$consultar.gridPanel4}" columns="4" id="gridPanel4" style="">
                                        <ui:label binding="#{modulos$correspondencia$consultar.label16}" for="calFechaRadicacion" id="label16"
                                            styleClass="labelForm" text="Entre"/>
                                        <ui:calendar binding="#{modulos$correspondencia$consultar.calFechaRadicacion}" columns="10" id="calFechaRadicacion"
                                            maxDate="#{modulos$correspondencia$consultar.maxDate}" minDate="#{modulos$correspondencia$consultar.minDate}"
                                            selectedDate="#{modulos$correspondencia$consultar.vo.fechaRadicacion}" tabIndex="15" validator="#{modulos$correspondencia$consultar.calValidateFecha1}"/>
                                        <ui:label binding="#{modulos$correspondencia$consultar.label20}" for="calFechaRadicacion2" id="label20"
                                            style="font-weight: bold" styleClass="labelForm" text="y"/>
                                        <ui:calendar binding="#{modulos$correspondencia$consultar.calFechaRadicacion2}" columns="10" id="calFechaRadicacion2"
                                            maxDate="#{modulos$correspondencia$consultar.maxDate}" minDate="#{modulos$correspondencia$consultar.minDate}"
                                            selectedDate="#{modulos$correspondencia$consultar.vo.fechaRadicacion2}" tabIndex="15" validator="#{modulos$correspondencia$consultar.calValidateFecha2}"/>
                                    </h:panelGrid>
                                </h:panelGrid>
                                <ui:label binding="#{modulos$correspondencia$consultar.label17}" id="label17" styleClass="labelForm" text="Número de radicación Invias"/>
                                <h:panelGrid binding="#{modulos$correspondencia$consultar.gridPanel5}" columns="2" id="gridPanel5">
                                    <ui:textField binding="#{modulos$correspondencia$consultar.txtNroRadicacionInvias}" columns="8" id="txtNroRadicacionInvias"
                                        tabIndex="16" text="#{modulos$correspondencia$consultar.vo.nro_radicacion_invias}"/>
                                    <h:panelGrid binding="#{modulos$correspondencia$consultar.gridPanel6}" columns="4" id="gridPanel6" style="">
                                        <ui:label binding="#{modulos$correspondencia$consultar.label18}" for="calFechaRadicacionInvias" id="label18"
                                            styleClass="labelForm" text="Entre"/>
                                        <ui:calendar binding="#{modulos$correspondencia$consultar.calFechaRadicacionInvias}" columns="10"
                                            id="calFechaRadicacionInvias" maxDate="#{modulos$correspondencia$consultar.maxDate}"
                                            minDate="#{modulos$correspondencia$consultar.minDate}"
                                            selectedDate="#{modulos$correspondencia$consultar.vo.fechaRadicacionInvias}" tabIndex="17" validator="#{modulos$correspondencia$consultar.calValidateFecha1}"/>
                                        <ui:label binding="#{modulos$correspondencia$consultar.label21}" for="calFechaRadicacionInvias2" id="label21"
                                            style="font-weight: bold" styleClass="labelForm" text="y"/>
                                        <ui:calendar binding="#{modulos$correspondencia$consultar.calFechaRadicacionInvias2}" columns="10"
                                            id="calFechaRadicacionInvias2" maxDate="#{modulos$correspondencia$consultar.maxDate}"
                                            minDate="#{modulos$correspondencia$consultar.minDate}"
                                            selectedDate="#{modulos$correspondencia$consultar.vo.fechaRadicacionInvias2}" tabIndex="17" validator="#{modulos$correspondencia$consultar.calValidateFecha2}"/>
                                    </h:panelGrid>
                                </h:panelGrid>
                                <ui:label binding="#{modulos$correspondencia$consultar.label7}" for="calUltimaModif" id="label7" styleClass="labelForm" text="Última Modificación entre"/>
                                <h:panelGrid binding="#{modulos$correspondencia$consultar.gridPanel1}" columns="3" id="gridPanel1">
                                    <ui:calendar binding="#{modulos$correspondencia$consultar.calUltimaModif}" columns="10" id="calUltimaModif"
                                        maxDate="#{modulos$correspondencia$consultar.maxDate}" minDate="#{modulos$correspondencia$consultar.minDate}"
                                        selectedDate="#{modulos$correspondencia$consultar.vo.ultimaModificacion}" tabIndex="18" validator="#{modulos$correspondencia$consultar.calValidateFecha1}"/>
                                    <ui:label binding="#{modulos$correspondencia$consultar.label19}" for="calUltimaModif2" id="label19"
                                        style="font-weight: bold" styleClass="labelForm" text="y"/>
                                    <ui:calendar binding="#{modulos$correspondencia$consultar.calUltimaModif2}" columns="10" id="calUltimaModif2"
                                        maxDate="#{modulos$correspondencia$consultar.maxDate}" minDate="#{modulos$correspondencia$consultar.minDate}"
                                        selectedDate="#{modulos$correspondencia$consultar.vo.ultimaModificacion2}" tabIndex="18" validator="#{modulos$correspondencia$consultar.calValidateFecha2}"/>
                                </h:panelGrid>
                                <ui:label binding="#{modulos$correspondencia$consultar.label11}" id="label11" styleClass="labelForm" text="Grupo propietario de la correspondencia"/>
                                <h:selectOneMenu binding="#{modulos$correspondencia$consultar.ddRol}"
                                    converter="#{modulos$correspondencia$consultar.integerConverter1}" id="ddRol" tabindex="19" value="#{modulos$correspondencia$consultar.vo.rol_propietario}">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$correspondencia$consultar.dropdown1SelectItems6}" id="dropdown1SelectItems6" value="#{modulos$correspondencia$consultar.ddRolItems}"/>
                                </h:selectOneMenu>
                                <ui:label binding="#{modulos$correspondencia$consultar.label9}" id="label9" styleClass="labelForm" text="Por vencer"/>
                                <h:selectOneMenu binding="#{modulos$correspondencia$consultar.ddVencer}"
                                    converter="#{modulos$correspondencia$consultar.integerConverter1}" id="ddVencer" style="width: 120px" tabindex="20">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$correspondencia$consultar.dropdown1SelectItems3}" id="dropdown1SelectItems3" value="#{modulos$correspondencia$consultar.ddVencerDefaultItems}"/>
                                </h:selectOneMenu>
                            </h:panelGrid>
                            <ui:panelLayout binding="#{modulos$correspondencia$consultar.pnlBotones}" id="pnlBotones" panelLayout="flow" style="text-align: center">
                                <ui:button action="#{modulos$correspondencia$consultar.btnConsultar_action}"
                                    binding="#{modulos$correspondencia$consultar.btnConsultar}"
                                    disabled="#{not UserInfoSessionBean.permiso['CORRESPONDENCIA_SUBMODULO_CONSULTAR_BUTTON_CONSULTAR']}" id="btnConsultar"
                                    tabIndex="21" text="Consultar"/>
                                <ui:button action="#{modulos$correspondencia$consultar.btnReset_action}" binding="#{modulos$correspondencia$consultar.btnReset}"
                                    id="btnReset" reset="true" tabIndex="22" text="Limpiar"/>
                            </ui:panelLayout>
                        </h:panelGrid>
                        <c:if test="${not UserInfoSessionBean.permiso['CORRESPONDENCIA_CONSULTAR']}">
                            <jsp:directive.include file="../../noautorizado.jspf"/>
                        </c:if>
                        <div>
                            <jsp:directive.include file="../../footer.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
