<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html"
    xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=ISO-8859-1" pageEncoding="UTF-8"/>
    <f:view>
        <f:loadBundle basename="sip.guiMessages" var="msgs"/>
        <ui:page binding="#{modulos$correspondencia$actualizar.page1}" id="page1">
            <ui:html binding="#{modulos$correspondencia$actualizar.html1}" id="html1">
                <ui:head binding="#{modulos$correspondencia$actualizar.head1}" id="head1">
                    <ui:link binding="#{modulos$correspondencia$actualizar.link1}" id="link1" url="/resources/menu-nal.css"/>
                </ui:head>
                <ui:body binding="#{modulos$correspondencia$actualizar.body1}" focus="form1:ddCaracter" id="body1" style="-rave-layout: grid">
                    <ui:script id="script1" url="/script/sipol.js"/>
                    <ui:form binding="#{modulos$correspondencia$actualizar.form1}" id="form1" virtualFormsConfig="actualizar | ddDestinatario calendar1 txaAsunto ddEstado txtNroRadicacion ddPadre fileUpload txtNroContrato1 ddAno ddDependencia ddRol ddRemitente txtNroRadicacion calFechaRadicacion txtNroRadicacionInvias calFechaRadicacionInvias ddCaracter ddTipo calFechaRadicacion txtNroRadicacionInvias txtNroRadicacion calFechaRadicacionInvias | pnlPrincipal:pnlBotones:btnActualizar , cancelar | | pnlPrincipal:pnlBotones:btnCancelar , veDoc | | downloadLink , borrarFoto | | btnBorrarDocumento , buscarPadre | pnlPrincipal:pnlControles:layoutPanel2:txtfldCorrespondenciaPadre pnlPrincipal:pnlControles:layoutPanel2:ddPadre | pnlPrincipal:pnlControles:layoutPanel2:btnBuscarPadre">
                        <div>
                            <jsp:directive.include file="../../menu.jspf"/>
                        </div>
                        <h:panelGrid binding="#{modulos$correspondencia$actualizar.pnlPrincipal}" id="pnlPrincipal"
                            rendered="#{UserInfoSessionBean.permiso['CORRESPONDENCIA_ACTUALIZAR']}" style="" width="408">
                            <ui:messageGroup binding="#{modulos$correspondencia$actualizar.messageGroup1}" id="messageGroup1" showGlobalOnly="true"/>
                            <h:panelGrid binding="#{modulos$correspondencia$actualizar.pnlControles}"
                                columnClasses="TablaSipPrimeraColumna, TablaSipRestoColumnas" columns="2" id="pnlControles">
                                <ui:label binding="#{modulos$correspondencia$actualizar.label1}" id="label1" styleClass="labelForm" text="ID"/>
                                <ui:label binding="#{modulos$correspondencia$actualizar.lableID1}" id="lableID1" text="#{CorrespondenciaSessionBean.correspondenciaActual.id}"/>
                                <ui:label binding="#{modulos$correspondencia$actualizar.label18}" id="label18" styleClass="labelForm" text="Consecutivo"/>
                                <ui:panelLayout binding="#{modulos$correspondencia$actualizar.layoutPanel1}" id="layoutPanel1" panelLayout="flow" style="height: 24px; width: 100%">
                                    <ui:label binding="#{modulos$correspondencia$actualizar.lableID}" id="lableID" text="#{CorrespondenciaSessionBean.correspondenciaActual.consecutivo}"/>
                                </ui:panelLayout>
                                <ui:label binding="#{modulos$correspondencia$actualizar.label20}" id="label20" styleClass="labelForm" text="Clase"/>
                                <ui:label binding="#{modulos$correspondencia$actualizar.lablClase}" id="lablClase" text="#{CorrespondenciaSessionBean.correspondenciaActual.clase}"/>
                                <ui:label binding="#{modulos$correspondencia$actualizar.label7}" for="ddCaracter" id="label7" requiredIndicator="true"
                                    styleClass="labelForm" text="Carácter"/>
                                <h:selectOneMenu binding="#{modulos$correspondencia$actualizar.ddCaracter}" id="ddCaracter" required="true" tabindex="2" value="#{modulos$correspondencia$actualizar.vo.caracter}">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$correspondencia$actualizar.dropdown2SelectItems2}" id="dropdown2SelectItems2" value="#{modulos$correspondencia$actualizar.ddCaracterDefaultItems}"/>
                                </h:selectOneMenu>
                                <ui:label binding="#{modulos$correspondencia$actualizar.label8}" for="ddTipo" id="label8" requiredIndicator="true"
                                    styleClass="labelForm" text="Tipo"/>
                                <h:panelGrid binding="#{modulos$correspondencia$actualizar.gridPanel1}" columns="2" id="gridPanel1">
                                    <h:selectOneMenu binding="#{modulos$correspondencia$actualizar.ddTipo}" id="ddTipo" required="true" style="width: 350px"
                                        tabindex="3" value="#{modulos$correspondencia$actualizar.vo.idref_tipo.id_referencia}">
                                        <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                        <f:selectItems binding="#{modulos$correspondencia$actualizar.dropdown2SelectItems1}" id="dropdown2SelectItems1" value="#{modulos$correspondencia$actualizar.ddTipoDefaultItems}"/>
                                    </h:selectOneMenu>
                                    <ui:textArea binding="#{modulos$correspondencia$actualizar.textArea1}" columns="60" id="textArea1" readOnly="true" rows="3"
                                        style="text-decoration: line-through" text="#{modulos$correspondencia$actualizar.vo.asunto_borrar}"/>
                                </h:panelGrid>
                                <ui:label binding="#{modulos$correspondencia$actualizar.label4}" for="ddEstado" id="label4" requiredIndicator="true"
                                    styleClass="labelForm" text="Estado"/>
                                <h:selectOneMenu binding="#{modulos$correspondencia$actualizar.ddEstado}" id="ddEstado" required="true" tabindex="4" value="#{modulos$correspondencia$actualizar.vo.idref_estadoactual.id_referencia}">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$correspondencia$actualizar.dropdown2SelectItems}" id="dropdown2SelectItems" value="#{modulos$correspondencia$actualizar.ddEstadoActDefaultItems}"/>
                                </h:selectOneMenu>
                                <ui:label binding="#{modulos$correspondencia$actualizar.label2}" for="ddRemitente" id="label2" requiredIndicator="true"
                                    styleClass="labelForm" text="Remitente"/>
                                <ui:panelLayout binding="#{modulos$correspondencia$actualizar.layoutPanel7}" id="layoutPanel7" panelLayout="flow">
                                    <h:selectOneMenu binding="#{modulos$correspondencia$actualizar.ddRemitente}" id="ddRemitente" required="true"
                                        style="width: 350px" tabindex="5" value="#{modulos$correspondencia$actualizar.vo.idper_remitente.id_persona}">
                                        <f:selectItems binding="#{modulos$correspondencia$actualizar.dropdown1SelectItems4}" id="dropdown1SelectItems4" value="#{modulos$correspondencia$actualizar.ddRemitenteDefaultItems}"/>
                                    </h:selectOneMenu>
                                    <ui:imageHyperlink binding="#{modulos$correspondencia$actualizar.imageHyperlink1}" id="imageHyperlink1"
                                        imageURL="/images/search.gif" onClick="doPopup(&quot;form1:ddRemitente&quot;)" tabIndex="6" target="popup" text="Buscar" url="/faces/modulos/common/buscarPersona.jsp"/>
                                </ui:panelLayout>
                                <ui:label binding="#{modulos$correspondencia$actualizar.label3}" for="ddDestinatario" id="label3" requiredIndicator="true"
                                    styleClass="labelForm" text="Destinatario"/>
                                <ui:panelLayout binding="#{modulos$correspondencia$actualizar.layoutPanel4}" id="layoutPanel4" panelLayout="flow">
                                    <h:selectOneMenu binding="#{modulos$correspondencia$actualizar.ddDestinatario}" id="ddDestinatario" required="true"
                                        style="width: 350px" tabindex="7" value="#{modulos$correspondencia$actualizar.vo.idper_destinatario.id_persona}">
                                        <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                        <f:selectItems binding="#{modulos$correspondencia$actualizar.dropdown1SelectItems}" id="dropdown1SelectItems" value="#{modulos$correspondencia$actualizar.ddRemitenteDefaultItems}"/>
                                    </h:selectOneMenu>
                                    <ui:imageHyperlink binding="#{modulos$correspondencia$actualizar.imageHyperlink2}" id="imageHyperlink2"
                                        imageURL="/images/search.gif" onClick="doPopup(&quot;form1:ddDestinatario&quot;)" tabIndex="8" target="popup"
                                        text="Buscar" url="/faces/modulos/common/buscarPersona.jsp"/>
                                </ui:panelLayout>
                                <ui:label binding="#{modulos$correspondencia$actualizar.label9}" id="label9" requiredIndicator="true" styleClass="labelForm" text="Asunto"/>
                                <ui:textArea binding="#{modulos$correspondencia$actualizar.txaAsunto}" columns="80" id="txaAsunto" rows="3" tabIndex="9" text="#{modulos$correspondencia$actualizar.vo.asunto}"/>
                                <ui:label binding="#{modulos$correspondencia$actualizar.label10}" id="label10" styleClass="labelForm" text="Fecha de registro"/>
                                <ui:label binding="#{modulos$correspondencia$actualizar.lblFecRegistro}"
                                    converter="#{modulos$correspondencia$actualizar.dateTimeConverter1}" id="lblFecRegistro" text="#{CorrespondenciaSessionBean.correspondenciaActual.fecha_entrega}"/>
                                <ui:label binding="#{modulos$correspondencia$actualizar.label6}" id="label6" styleClass="labelForm" text="Documento"/>
                                <ui:panelLayout binding="#{modulos$correspondencia$actualizar.layoutPanel5}" id="layoutPanel5" panelLayout="flow" style="height: 24px; width: 647px">
                                    <ui:hyperlink binding="#{modulos$correspondencia$actualizar.downloadLink}" id="downloadLink" onClick="submit();"
                                        text="#{CorrespondenciaSessionBean.documentoCorrespondenciaActual.nombre_documento}" url="download.jsp"/>
                                    <ui:button action="#{modulos$correspondencia$actualizar.btnBorrarDocumento_action}"
                                        binding="#{modulos$correspondencia$actualizar.btnBorrarDocumento}" id="btnBorrarDocumento" imageURL="/images/borrar.gif" text="Botón"/>
                                    <ui:upload binding="#{modulos$correspondencia$actualizar.fileUpload}" columns="25" id="fileUpload" tabIndex="10"/>
                                </ui:panelLayout>
                                <ui:label binding="#{modulos$correspondencia$actualizar.label12}" id="label12" styleClass="labelForm" text="Número de contrato"/>
                                <ui:panelLayout binding="#{modulos$correspondencia$actualizar.layoutPanel6}" id="layoutPanel6" panelLayout="flow" style="height: 24px; width: 647px">
                                    <ui:textField binding="#{modulos$correspondencia$actualizar.txtNroContrato1}" columns="8" id="txtNroContrato1" tabIndex="11" text="#{modulos$correspondencia$actualizar.vo.nro_contrato}"/>
                                    <ui:label binding="#{modulos$correspondencia$actualizar.label15}" id="label15" styleClass="labelForm" text="Año"/>
                                    <h:selectOneMenu binding="#{modulos$correspondencia$actualizar.ddAno}"
                                        converter="#{modulos$correspondencia$actualizar.integerConverter1}" id="ddAno" tabindex="12" value="#{modulos$correspondencia$actualizar.vo.ano_contrato}">
                                        <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                        <f:selectItems binding="#{modulos$correspondencia$actualizar.dropdown1SelectItems1}" id="dropdown1SelectItems1" value="#{modulos$correspondencia$actualizar.ddAnoItems}"/>
                                    </h:selectOneMenu>
                                    <ui:label binding="#{modulos$correspondencia$actualizar.label16}" id="label16" styleClass="labelForm" text="Dependencia"/>
                                    <h:selectOneMenu binding="#{modulos$correspondencia$actualizar.ddDependencia}"
                                        converter="#{modulos$correspondencia$actualizar.integerConverter1}" id="ddDependencia" tabindex="13" value="#{modulos$correspondencia$actualizar.vo.dependencia.id_referencia}">
                                        <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                        <f:selectItems binding="#{modulos$correspondencia$actualizar.dropdown1SelectItems2}" id="dropdown1SelectItems2" value="#{modulos$correspondencia$actualizar.ddDependenciaItems}"/>
                                    </h:selectOneMenu>
                                </ui:panelLayout>
                                <ui:label binding="#{modulos$correspondencia$actualizar.label11}" for="txtNroRadicacion" id="label11" requiredIndicator="true"
                                    styleClass="labelForm" text="Número de radicación UN"/>
                                <h:panelGrid binding="#{modulos$correspondencia$actualizar.gridPanel3}" columns="2" id="gridPanel3" style="">
                                    <ui:textField binding="#{modulos$correspondencia$actualizar.txtNroRadicacion}" id="txtNroRadicacion" required="true"
                                        tabIndex="14" text="#{modulos$correspondencia$actualizar.vo.nro_radicacion}"/>
                                    <h:panelGrid binding="#{modulos$correspondencia$actualizar.gridPanel4}" columns="2" id="gridPanel4" style="">
                                        <ui:label binding="#{modulos$correspondencia$actualizar.label21}" for="calFechaRadicacion" id="label21"
                                            requiredIndicator="true" styleClass="labelForm" text="Fecha de radicación UN"/>
                                        <ui:calendar binding="#{modulos$correspondencia$actualizar.calFechaRadicacion}" columns="10"
                                            dateFormatPattern="dd/MM/yyyy" id="calFechaRadicacion" maxDate="#{modulos$correspondencia$actualizar.maxDate}"
                                            minDate="#{modulos$correspondencia$actualizar.minDateRadicacion}" required="true"
                                            selectedDate="#{modulos$correspondencia$actualizar.vo.fechaRadicacion}" tabIndex="15" validator="#{modulos$correspondencia$actualizar.calValidatePosterior}"/>
                                    </h:panelGrid>
                                </h:panelGrid>
                                <ui:label binding="#{modulos$correspondencia$actualizar.label22}" id="label22" styleClass="labelForm" text="Número de radicación Invias"/>
                                <h:panelGrid binding="#{modulos$correspondencia$actualizar.gridPanel5}" columns="2" id="gridPanel5" style="">
                                    <ui:textField binding="#{modulos$correspondencia$actualizar.txtNroRadicacionInvias}" id="txtNroRadicacionInvias"
                                        tabIndex="16" text="#{modulos$correspondencia$actualizar.vo.nro_radicacion_invias}"/>
                                    <h:panelGrid binding="#{modulos$correspondencia$actualizar.gridPanel6}" columns="2" id="gridPanel6" style="">
                                        <ui:label binding="#{modulos$correspondencia$actualizar.label23}" for="calFechaRadicacionInvias" id="label23"
                                            styleClass="labelForm" text="Fecha de radicación Invias"/>
                                        <ui:calendar binding="#{modulos$correspondencia$actualizar.calFechaRadicacionInvias}" columns="10"
                                            dateFormatPattern="dd/MM/yyyy" id="calFechaRadicacionInvias" maxDate="#{modulos$correspondencia$actualizar.maxDate}"
                                            minDate="#{modulos$correspondencia$actualizar.minDateRadicacion}"
                                            selectedDate="#{modulos$correspondencia$actualizar.vo.fechaRadicacionInvias}" tabIndex="17" validator="#{modulos$correspondencia$actualizar.calValidatePosterior}"/>
                                    </h:panelGrid>
                                </h:panelGrid>
                                <ui:label binding="#{modulos$correspondencia$actualizar.lblFecVence}" for="calendar1" id="lblFecVence" styleClass="labelForm" text="Fecha de vencimiento"/>
                                <ui:calendar binding="#{modulos$correspondencia$actualizar.calendar1}" columns="10" dateFormatPattern="dd/MM/yyyy"
                                    disabled="#{CorrespondenciaSessionBean.estaVencidaCorrespondenciaActual}" id="calendar1"
                                    minDate="#{modulos$correspondencia$actualizar.minDateVencimiento}"
                                    selectedDate="#{modulos$correspondencia$actualizar.vo.fechaVencimiento}" tabIndex="18" validator="#{modulos$correspondencia$actualizar.calValidateAnterior}"/>
                                <ui:label binding="#{modulos$correspondencia$actualizar.label19}" id="label19" styleClass="labelForm" text="Correspondencia padre"/>
                                <ui:panelLayout binding="#{modulos$correspondencia$actualizar.layoutPanel2}" id="layoutPanel2" panelLayout="flow">
                                    <ui:textField binding="#{modulos$correspondencia$actualizar.txtfldCorrespondenciaPadre}" columns="11"
                                        id="txtfldCorrespondenciaPadre" tabIndex="19" toolTip="#{msgs.errorFiltroCorrespondenciaPadre}" trim="false" validator="#{modulos$correspondencia$actualizar.txtfldCorrespondenciaPadre_validate}"/>
                                    <ui:button action="#{modulos$correspondencia$actualizar.btnBuscarPadre_action}"
                                        binding="#{modulos$correspondencia$actualizar.btnBuscarPadre}" id="btnBuscarPadre" mini="true" tabIndex="20" text="Buscar"/>
                                    <ui:label binding="#{modulos$correspondencia$actualizar.label13}" id="label13" styleClass="labelForm" text="[ID - Número de Radicación - Nro Contrato]"/>
                                    <h:selectOneMenu binding="#{modulos$correspondencia$actualizar.ddPadre}" id="ddPadre" style="width: 230px" tabindex="21" value="#{modulos$correspondencia$actualizar.vo.id_corresp_padre}">
                                        <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                        <f:selectItems binding="#{modulos$correspondencia$actualizar.dropdown3SelectItems}" id="dropdown3SelectItems" value="#{modulos$correspondencia$actualizar.ddPadreDefaultItems}"/>
                                    </h:selectOneMenu>
                                </ui:panelLayout>
                                <ui:label binding="#{modulos$correspondencia$actualizar.label14}" id="label14" styleClass="labelForm" text="Última modificación"/>
                                <ui:label binding="#{modulos$correspondencia$actualizar.lblFecUltima}"
                                    converter="#{modulos$correspondencia$actualizar.sqlTimestampConverter1}" id="lblFecUltima" text="#{CorrespondenciaSessionBean.correspondenciaActual.ultima_modificacion}"/>
                                <ui:label binding="#{modulos$correspondencia$actualizar.label17}" for="ddRol" id="label17" requiredIndicator="true"
                                    styleClass="labelForm" text="Grupo propietario de la correspondencia"/>
                                <h:selectOneMenu binding="#{modulos$correspondencia$actualizar.ddRol}"
                                    converter="#{modulos$correspondencia$actualizar.integerConverter1}" id="ddRol" required="true" tabindex="22" value="#{modulos$correspondencia$actualizar.vo.rol_propietario}">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$correspondencia$actualizar.dropdown1SelectItems3}" id="dropdown1SelectItems3" value="#{modulos$correspondencia$actualizar.ddRolItems}"/>
                                </h:selectOneMenu>
                            </h:panelGrid>
                            <ui:panelLayout binding="#{modulos$correspondencia$actualizar.pnlBotones}" id="pnlBotones" panelLayout="flow" style="text-align: center">
                                <ui:button action="#{modulos$correspondencia$actualizar.btnUpdate_action}"
                                    binding="#{modulos$correspondencia$actualizar.btnActualizar}"
                                    disabled="#{not UserInfoSessionBean.permiso['CORRESPONDENCIA_SUBMODULO_ACTUALIZAR_BUTTON_ACTUALIZAR'] and CorrespondenciaSessionBean.puedeActualizarCorrespondenciaActual}"
                                    id="btnActualizar" onClick="if (confirmarCambios() == false) return false" tabIndex="23" text="Actualizar"/>
                                <ui:button action="#{modulos$correspondencia$actualizar.btnCancel_action}"
                                    binding="#{modulos$correspondencia$actualizar.btnCancelar}"
                                    disabled="#{not UserInfoSessionBean.permiso['CORRESPONDENCIA_SUBMODULO_ACTUALIZAR_BUTTON_CANCELAR']}" id="btnCancelar"
                                    onClick="if (confirmarPerderCambios() == false) return false" tabIndex="24" text="Cancelar"/>
                            </ui:panelLayout>
                        </h:panelGrid>
                        <c:if test="${not UserInfoSessionBean.permiso['CORRESPONDENCIA_ACTUALIZAR']}">
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
