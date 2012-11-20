<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html"
    xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=ISO-8859-1" pageEncoding="UTF-8"/>
    <f:view>
        <f:loadBundle basename="sip.guiMessages" var="msgs"/>
        <ui:page binding="#{modulos$correspondencia$crear.page1}" id="page1">
            <ui:html binding="#{modulos$correspondencia$crear.html1}" id="html1">
                <ui:head binding="#{modulos$correspondencia$crear.head1}" id="head1">
                    <ui:link binding="#{modulos$correspondencia$crear.link1}" id="link1" url="/resources/menu-nal.css"/>
                </ui:head>
                <ui:body binding="#{modulos$correspondencia$crear.body1}" focus="form1:ddClase" id="body1" style="-rave-layout: grid">
                    <ui:script id="script1" url="/script/sipol.js"/>
                    <ui:form binding="#{modulos$correspondencia$crear.form1}" id="form1" virtualFormsConfig="crear | txtNroContrato ddClase ddCaracter ddRemitente txaAsunto ddRol ddTipo txtNroRadicacion calFechaRadicacion txtNroRadicacion calFechaRadicacion ddDestinatario | pnlPrincipal:pnlBotones:btnRegistrar">
                        <div>
                            <jsp:directive.include file="../../menu.jspf"/>
                        </div>
                        <h:panelGrid bgcolor="" binding="#{modulos$correspondencia$crear.pnlPrincipal}" border="0" columnClasses="" id="pnlPrincipal"
                            rendered="#{UserInfoSessionBean.permiso['CORRESPONDENCIA_REGISTRAR']}" rowClasses="" style="" styleClass="">
                            <ui:messageGroup binding="#{modulos$correspondencia$crear.messageGroup1}" id="messageGroup1" showGlobalOnly="true"/>
                            <h:panelGrid binding="#{modulos$correspondencia$crear.pnlControles}" border="0"
                                columnClasses="TablaSipPrimeraColumna, TablaSipRestoColumnas" columns="2" id="pnlControles" style="height: 168px; width: 96px" styleClass="">
                                <ui:label binding="#{modulos$correspondencia$crear.label3}" for="ddClase" id="label3" requiredIndicator="true"
                                    styleClass="labelForm" text="Clase"/>
                                <h:selectOneMenu binding="#{modulos$correspondencia$crear.ddClase}" id="ddClase" required="true" tabindex="1" value="#{modulos$correspondencia$crear.vo.clase}">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$correspondencia$crear.dropdown1SelectItems1}" id="dropdown1SelectItems1" value="#{modulos$correspondencia$crear.ddClaseDefaultItems}"/>
                                </h:selectOneMenu>
                                <ui:label binding="#{modulos$correspondencia$crear.lbltipo}" for="ddCaracter" id="lbltipo" requiredIndicator="true"
                                    styleClass="labelForm" text="Carácter"/>
                                <h:selectOneMenu binding="#{modulos$correspondencia$crear.ddCaracter}" id="ddCaracter" required="true" tabindex="2" value="#{modulos$correspondencia$crear.vo.caracter}">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$correspondencia$crear.dropdown2SelectItems}" id="dropdown2SelectItems" value="#{modulos$correspondencia$crear.ddCaracterDefaultItems}"/>
                                </h:selectOneMenu>
                                <ui:label binding="#{modulos$correspondencia$crear.label7}" for="ddTipo" id="label7" requiredIndicator="true"
                                    styleClass="labelForm" text="Tipo"/>
                                <h:selectOneMenu binding="#{modulos$correspondencia$crear.ddTipo}"
                                    converter="#{modulos$correspondencia$crear.integerConverter1}" id="ddTipo" required="true" style="width: 350px" tabindex="3" value="#{modulos$correspondencia$crear.vo.idref_tipo.id_referencia}">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$correspondencia$crear.dropdown2SelectItems1}" id="dropdown2SelectItems1" value="#{modulos$correspondencia$crear.ddTipoDefaultItems}"/>
                                </h:selectOneMenu>
                                <ui:label binding="#{modulos$correspondencia$crear.label6}" for="ddRemitente" id="label6" requiredIndicator="true"
                                    styleClass="labelForm" text="Remitente"/>
                                <ui:panelLayout binding="#{modulos$correspondencia$crear.layoutPanel2}" id="layoutPanel2" panelLayout="flow">
                                    <h:selectOneMenu binding="#{modulos$correspondencia$crear.ddRemitente}"
                                        converter="#{modulos$correspondencia$crear.integerConverter1}" id="ddRemitente" required="true" style="width: 350px"
                                        tabindex="4" value="#{modulos$correspondencia$crear.vo.idper_remitente.id_persona}">
                                        <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                        <f:selectItems binding="#{modulos$correspondencia$crear.dropdown1SelectItems}" id="dropdown1SelectItems" value="#{modulos$correspondencia$crear.ddRemitenteDefaultItems}"/>
                                    </h:selectOneMenu>
                                    <ui:imageHyperlink binding="#{modulos$correspondencia$crear.imageHyperlink1}" id="imageHyperlink1"
                                        imageURL="/images/search.gif" onClick="doPopup(&quot;form1:ddRemitente&quot;)" tabIndex="5" target="popup" text="Buscar" url="/faces/modulos/common/buscarPersona.jsp"/>
                                </ui:panelLayout>
                                <ui:label binding="#{modulos$correspondencia$crear.label4}" for="ddDestinatario" id="label4" requiredIndicator="true"
                                    styleClass="labelForm" text="Destinatario"/>
                                <ui:panelLayout binding="#{modulos$correspondencia$crear.layoutPanel3}" id="layoutPanel3" panelLayout="flow">
                                    <h:selectOneMenu binding="#{modulos$correspondencia$crear.ddDestinatario}"
                                        converter="#{modulos$correspondencia$crear.integerConverter1}" id="ddDestinatario" required="true" style="width: 350px"
                                        tabindex="6" value="#{modulos$correspondencia$crear.vo.idper_destinatario.id_persona}">
                                        <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                        <f:selectItems binding="#{modulos$correspondencia$crear.dropdown1SelectItems3}" id="dropdown1SelectItems3" value="#{modulos$correspondencia$crear.ddRemitenteDefaultItems}"/>
                                    </h:selectOneMenu>
                                    <ui:imageHyperlink binding="#{modulos$correspondencia$crear.imageHyperlink2}" id="imageHyperlink2"
                                        imageURL="/images/search.gif" onClick="doPopup(&quot;form1:ddDestinatario&quot;)" tabIndex="7" target="popup"
                                        text="Buscar" url="/faces/modulos/common/buscarPersona.jsp"/>
                                </ui:panelLayout>
                                <ui:label binding="#{modulos$correspondencia$crear.label8}" for="txaAsunto" id="label8" requiredIndicator="true"
                                    style="width: 110px" styleClass="labelForm" text="Asunto"/>
                                <ui:textArea binding="#{modulos$correspondencia$crear.txaAsunto}" columns="80" id="txaAsunto" required="true" rows="6"
                                    tabIndex="8" text="#{modulos$correspondencia$crear.vo.asunto}"/>
                                <ui:label binding="#{modulos$correspondencia$crear.label2}" for="txtNroRadicacion" id="label2" requiredIndicator="true"
                                    styleClass="labelForm" text="Número de radicación UN"/>
                                <h:panelGrid binding="#{modulos$correspondencia$crear.gridPanel3}" columns="2" id="gridPanel3" style="">
                                    <ui:textField binding="#{modulos$correspondencia$crear.txtNroRadicacion}" id="txtNroRadicacion" required="true" tabIndex="9" text="#{modulos$correspondencia$crear.vo.nro_radicacion}"/>
                                    <h:panelGrid binding="#{modulos$correspondencia$crear.gridPanel4}" columns="2" id="gridPanel4" style="">
                                        <ui:label binding="#{modulos$correspondencia$crear.label10}" for="calFechaRadicacion" id="label10"
                                            requiredIndicator="true" styleClass="labelForm" text="Fecha de radicación UN"/>
                                        <ui:calendar binding="#{modulos$correspondencia$crear.calFechaRadicacion}" columns="10" id="calFechaRadicacion"
                                            maxDate="#{modulos$correspondencia$crear.maxDate}" minDate="#{modulos$correspondencia$crear.minDateRadicacion}"
                                            required="true" selectedDate="#{modulos$correspondencia$crear.vo.fechaRadicacion}" tabIndex="10" validator="#{modulos$correspondencia$crear.calValidatePosterior}"/>
                                    </h:panelGrid>
                                </h:panelGrid>
                                <ui:label binding="#{modulos$correspondencia$crear.label1}" for="ddRol" id="label1" requiredIndicator="true"
                                    styleClass="labelForm" text="Grupo propietario de la correspondencia"/>
                                <h:selectOneMenu binding="#{modulos$correspondencia$crear.ddRol}" converter="#{modulos$correspondencia$crear.integerConverter1}"
                                    id="ddRol" required="true" tabindex="11" value="#{modulos$correspondencia$crear.vo.rol_propietario}">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$correspondencia$crear.dropdown1SelectItems2}" id="dropdown1SelectItems2" value="#{modulos$correspondencia$crear.ddRolItems}"/>
                                </h:selectOneMenu>
                            </h:panelGrid>
                            <ui:panelLayout binding="#{modulos$correspondencia$crear.pnlBotones}" id="pnlBotones" panelLayout="flow" style="height: 22px; text-align: center; width: 100%">
                                <ui:button action="#{modulos$correspondencia$crear.btnRegistrar_action}" binding="#{modulos$correspondencia$crear.btnRegistrar}"
                                    disabled="#{not UserInfoSessionBean.permiso['CORRESPONDENCIA_SUBMODULO_REGISTRAR_BUTTON_REGISTRAR']}" id="btnRegistrar"
                                    onClick="if (confirmarCreacion() == false) return false" tabIndex="12" text="Registrar"/>
                                <ui:button binding="#{modulos$correspondencia$crear.btnCancel}" id="btnCancel" reset="true" tabIndex="13" text="Limpiar"/>
                            </ui:panelLayout>
                        </h:panelGrid>
                        <c:if test="${not UserInfoSessionBean.permiso['CORRESPONDENCIA_REGISTRAR']}">
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
