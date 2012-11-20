<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=ISO-8859-1" pageEncoding="UTF-8"/>
    <f:view>
        <f:loadBundle basename="sip.guiMessages" var="msgs"/>
        <ui:page binding="#{modulos$common$buscarPersona.page1}" id="page1">
            <ui:html binding="#{modulos$common$buscarPersona.html1}" id="html1">
                <ui:head binding="#{modulos$common$buscarPersona.head1}" id="head1" title="Buscar persona">
                    <ui:link binding="#{modulos$common$buscarPersona.link1}" id="link1" url="/resources/menu-nal.css"/>
                </ui:head>
                <ui:body binding="#{modulos$common$buscarPersona.body1}" focus="form1:txtfldIdentificacion" id="body1" style="-rave-layout: grid">
                    <script><![CDATA[
                        function doSave(value) {
                              window.opener.destinationElement.value = value;
                              window.close();
                        }
                    ]]></script>
                    <ui:form binding="#{modulos$common$buscarPersona.form1}" id="form1" virtualFormsConfig="buscar | txtfldIdentificacion txtfldNombre1 txtfldNombre2 txtfldApellido1 txtfldApellido2 txtfldEmail txtfldTelefono ddTipoIdentificacion ddTipoPersona gridPanel1:hdnTarget | gridPanel1:gridPanel2:layoutPanel1:btnBuscar">
                        <h:panelGrid binding="#{modulos$common$buscarPersona.gridPanel1}" id="gridPanel1" style="left: 24px; top: 0px; position: absolute" width="432">
                            <ui:messageGroup binding="#{modulos$common$buscarPersona.messageGroup1}" id="messageGroup1" showGlobalOnly="true"/>
                            <h:panelGrid binding="#{modulos$common$buscarPersona.gridPanel2}" columnClasses="TablaSipPrimeraColumna, TablaSipRestoColumnas"
                                columns="2" id="gridPanel2" width="503">
                                <ui:label binding="#{modulos$common$buscarPersona.label1}" for="txtfldIdentificacion" id="label1" styleClass="labelForm" text="Número de Identificación"/>
                                <ui:textField binding="#{modulos$common$buscarPersona.txtfldIdentificacion}" id="txtfldIdentificacion" style="width: 192px"
                                    tabIndex="1" text="#{modulos$common$buscarPersona.filtro.documento}"/>
                                <ui:label binding="#{modulos$common$buscarPersona.label2}" for="ddTipoIdentificacion" id="label2" styleClass="labelForm" text="Tipo de Identificación"/>
                                <h:selectOneMenu binding="#{modulos$common$buscarPersona.ddTipoIdentificacion}" id="ddTipoIdentificacion" style="width: 192px"
                                    tabindex="2" value="#{modulos$common$buscarPersona.filtro.idref_tipodocumento.id_referencia}">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$common$buscarPersona.dropdown1SelectItems}" id="dropdown1SelectItems" value="#{modulos$common$buscarPersona.ddTipoIdentificacionItems}"/>
                                </h:selectOneMenu>
                                <ui:label binding="#{modulos$common$buscarPersona.label3}" for="ddTipoPersona" id="label3" styleClass="labelForm" text="Tipo de Persona"/>
                                <h:selectOneMenu binding="#{modulos$common$buscarPersona.ddTipoPersona}" id="ddTipoPersona" style="width: 192px" tabindex="3" value="#{modulos$common$buscarPersona.filtro.idref_tipopersona.id_referencia}">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$common$buscarPersona.dropdown2SelectItems}" id="dropdown2SelectItems" value="#{modulos$common$buscarPersona.ddTipoPersonaItems}"/>
                                </h:selectOneMenu>
                                <ui:label binding="#{modulos$common$buscarPersona.label4}" for="txtfldNombre1" id="label4" styleClass="labelForm" text="Nombre1"/>
                                <ui:textField binding="#{modulos$common$buscarPersona.txtfldNombre1}" id="txtfldNombre1" style="width: 192px" tabIndex="4" text="#{modulos$common$buscarPersona.filtro.nombre1}"/>
                                <ui:label binding="#{modulos$common$buscarPersona.label5}" for="txtfldNombre2" id="label5" styleClass="labelForm" text="Nombre2"/>
                                <ui:textField binding="#{modulos$common$buscarPersona.txtfldNombre2}" id="txtfldNombre2" style="width: 192px" tabIndex="5" text="#{modulos$common$buscarPersona.filtro.nombre2}"/>
                                <ui:label binding="#{modulos$common$buscarPersona.label6}" for="txtfldApellido1" id="label6" styleClass="labelForm" text="Apellido1"/>
                                <ui:textField binding="#{modulos$common$buscarPersona.txtfldApellido1}" id="txtfldApellido1" style="width: 192px" tabIndex="6" text="#{modulos$common$buscarPersona.filtro.apellido1}"/>
                                <ui:label binding="#{modulos$common$buscarPersona.label7}" for="txtfldApellido2" id="label7" styleClass="labelForm" text="Apellido2"/>
                                <ui:textField binding="#{modulos$common$buscarPersona.txtfldApellido2}" id="txtfldApellido2" style="width: 192px" tabIndex="7" text="#{modulos$common$buscarPersona.filtro.apellido2}"/>
                                <ui:label binding="#{modulos$common$buscarPersona.label8}" for="txtfldEmail" id="label8" styleClass="labelForm" text="e-mail"/>
                                <ui:textField binding="#{modulos$common$buscarPersona.txtfldEmail}" id="txtfldEmail" style="width: 192px" tabIndex="8" text="#{modulos$common$buscarPersona.filtro.email}"/>
                                <ui:label binding="#{modulos$common$buscarPersona.label9}" for="txtfldTelefono" id="label9" styleClass="labelForm" text="Teléfono"/>
                                <ui:textField binding="#{modulos$common$buscarPersona.txtfldTelefono}" id="txtfldTelefono" style="width: 192px" tabIndex="9" text="#{modulos$common$buscarPersona.filtro.telefono}"/>
                            </h:panelGrid>
                            <ui:panelLayout binding="#{modulos$common$buscarPersona.layoutPanel1}" id="layoutPanel1" panelLayout="flow" style="height: 22px; text-align: center; width: 100%">
                                <ui:button action="#{modulos$common$buscarPersona.btnBuscar_action}" binding="#{modulos$common$buscarPersona.btnBuscar}"
                                    id="btnBuscar" style="" tabIndex="10" text="Buscar"/>
                                <ui:button binding="#{modulos$common$buscarPersona.btnReset}" id="btnReset" reset="true" text="Reset"/>
                                <ui:button binding="#{modulos$common$buscarPersona.btnCerrar}" id="btnCerrar" onClick="window.close()" text="Cancelar"/>
                            </ui:panelLayout>
                            <ui:hiddenField binding="#{modulos$common$buscarPersona.hdnTarget}" id="hdnTarget"/>
                            <ui:table augmentTitle="false" binding="#{modulos$common$buscarPersona.tblResultados}" clearSortButton="true" id="tblResultados"
                                lite="true" paginateButton="true" paginationControls="true" sortPanelToggleButton="true" tabIndex="13" width="233">
                                <ui:tableRowGroup binding="#{modulos$common$buscarPersona.tableRowGroup1}" id="tableRowGroup1" rows="5"
                                    sourceData="#{modulos$common$buscarPersona.tablaPersonaDataProvider}" sourceVar="currentRow">
                                    <ui:tableColumn binding="#{modulos$common$buscarPersona.tableColumn2}" headerText="Documento" id="tableColumn2" sort="documento">
                                        <ui:hyperlink binding="#{modulos$common$buscarPersona.hyperlink1}" id="hyperlink1"
                                            onClick="doSave('#{currentRow.value['id']}')" text="#{currentRow.value['documento']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$common$buscarPersona.tableColumn9}" headerText="Tipo Documento" id="tableColumn9" sort="idref_tipodocumento">
                                        <ui:staticText binding="#{modulos$common$buscarPersona.staticText1}" id="staticText1" text="#{currentRow.value['idref_tipodocumento']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$common$buscarPersona.tableColumn10}" headerText="Tipo Persona" id="tableColumn10" sort="idref_tipopersona">
                                        <ui:staticText binding="#{modulos$common$buscarPersona.staticText6}" id="staticText6" text="#{currentRow.value['idref_tipopersona']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$common$buscarPersona.tableColumn1}" headerText="Nombre" id="tableColumn1" sort="etiqueta">
                                        <ui:staticText binding="#{modulos$common$buscarPersona.staticText3}" id="staticText3" text="#{currentRow.value['etiqueta']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$common$buscarPersona.tableColumn7}" headerText="Email" id="tableColumn7" sort="email">
                                        <ui:staticText binding="#{modulos$common$buscarPersona.staticText15}" id="staticText15" text="#{currentRow.value['email']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$common$buscarPersona.tableColumn8}" headerText="Teléfono" id="tableColumn8" sort="telefono">
                                        <ui:staticText binding="#{modulos$common$buscarPersona.staticText16}" id="staticText16" text="#{currentRow.value['telefono']}"/>
                                    </ui:tableColumn>
                                </ui:tableRowGroup>
                            </ui:table>
                        </h:panelGrid>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
