<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html"
    xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=ISO-8859-1" pageEncoding="UTF-8"/>
    <f:view>
        <f:loadBundle basename="sip.guiMessages" var="msgs"/>
        <ui:page binding="#{modulos$admin$personas.page1}" id="page1">
            <ui:html binding="#{modulos$admin$personas.html1}" id="html1">
                <ui:head binding="#{modulos$admin$personas.head1}" id="head1">
                    <ui:link binding="#{modulos$admin$personas.link1}" id="link1" url="/resources/menu-nal.css"/>
                </ui:head>
                <ui:body binding="#{modulos$admin$personas.body1}" focus="form1:txtfldIdentificacion" id="body1" style="-rave-layout: grid">
                    <ui:script id="script1" url="/script/sipol.js"/>
                    <ui:form binding="#{modulos$admin$personas.form1}" id="form1" virtualFormsConfig="agregar | txtfldIdentificacion txtfldNombre1 txtfldNombre2 txtfldApellido1 txtfldApellido2 txtfldEmail txtfldTelefono ddTipoIdentificacion ddTipoPersona | pnlPrincipal:pnlBotones:btnAgregar , editor | pnlPrincipal:tblElementos:tableRowGroup1:tableColumn1:radioButton1 | pnlPrincipal:pnlBotones:btnEditar , borrar | pnlPrincipal:tblElementos:tableRowGroup1:tableColumn1:radioButton1 | pnlPrincipal:pnlBotones:btnBorrar , reset | | pnlPrincipal:pnlBotones:btnNuevo">
                        <div>
                            <jsp:directive.include file="../../menu.jspf"/>
                        </div>
                        <h:panelGrid binding="#{modulos$admin$personas.pnlPrincipal}" id="pnlPrincipal"
                            rendered="#{UserInfoSessionBean.permiso['ADMIN_PERSONAS']}" style="" width="432">
                            <ui:messageGroup binding="#{modulos$admin$personas.messageGroup1}" id="messageGroup1" showGlobalOnly="true"/>
                            <h:panelGrid binding="#{modulos$admin$personas.pnlControles}" columnClasses="TablaSipPrimeraColumna, TablaSipRestoColumnas"
                                columns="2" id="pnlControles" width="503">
                                <ui:label binding="#{modulos$admin$personas.label1}" for="txtfldIdentificacion" id="label1" requiredIndicator="true"
                                    styleClass="labelForm" text="Número de Identificación"/>
                                <ui:textField binding="#{modulos$admin$personas.txtfldIdentificacion}" id="txtfldIdentificacion" required="true"
                                    style="width: 192px" tabIndex="1" text="#{modulos$admin$personas.persona.documento}"/>
                                <ui:label binding="#{modulos$admin$personas.label2}" for="ddTipoIdentificacion" id="label2" requiredIndicator="true"
                                    styleClass="labelForm" text="Tipo de Identificación"/>
                                <h:selectOneMenu binding="#{modulos$admin$personas.ddTipoIdentificacion}" id="ddTipoIdentificacion" required="true"
                                    style="width: 192px" tabindex="2" value="#{modulos$admin$personas.persona.idref_tipodocumento.id_referencia}">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$admin$personas.dropdown1SelectItems}" id="dropdown1SelectItems" value="#{modulos$admin$personas.ddTipoIdentificacionItems}"/>
                                </h:selectOneMenu>
                                <ui:label binding="#{modulos$admin$personas.label3}" for="ddTipoPersona" id="label3" requiredIndicator="true"
                                    styleClass="labelForm" text="Tipo de Persona"/>
                                <h:selectOneMenu binding="#{modulos$admin$personas.ddTipoPersona}" id="ddTipoPersona" required="true" style="width: 192px"
                                    tabindex="3" value="#{modulos$admin$personas.persona.idref_tipopersona.id_referencia}">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$admin$personas.dropdown2SelectItems}" id="dropdown2SelectItems" value="#{modulos$admin$personas.ddTipoPersonaItems}"/>
                                </h:selectOneMenu>
                                <ui:label binding="#{modulos$admin$personas.label4}" for="txtfldNombre1" id="label4" requiredIndicator="true"
                                    styleClass="labelForm" text="Nombre1"/>
                                <ui:textField binding="#{modulos$admin$personas.txtfldNombre1}" id="txtfldNombre1" required="true" style="width: 192px"
                                    tabIndex="4" text="#{modulos$admin$personas.persona.nombre1}"/>
                                <ui:label binding="#{modulos$admin$personas.label5}" for="txtfldNombre2" id="label5" styleClass="labelForm" text="Nombre2"/>
                                <ui:textField binding="#{modulos$admin$personas.txtfldNombre2}" id="txtfldNombre2" style="width: 192px" tabIndex="5" text="#{modulos$admin$personas.persona.nombre2}"/>
                                <ui:label binding="#{modulos$admin$personas.label6}" for="txtfldApellido1" id="label6" styleClass="labelForm" text="Apellido1"/>
                                <ui:textField binding="#{modulos$admin$personas.txtfldApellido1}" id="txtfldApellido1" style="width: 192px" tabIndex="6" text="#{modulos$admin$personas.persona.apellido1}"/>
                                <ui:label binding="#{modulos$admin$personas.label7}" for="txtfldApellido2" id="label7" styleClass="labelForm" text="Apellido2"/>
                                <ui:textField binding="#{modulos$admin$personas.txtfldApellido2}" id="txtfldApellido2" style="width: 192px" tabIndex="7" text="#{modulos$admin$personas.persona.apellido2}"/>
                                <ui:label binding="#{modulos$admin$personas.label8}" for="txtfldEmail" id="label8" styleClass="labelForm" text="e-mail"/>
                                <ui:textField binding="#{modulos$admin$personas.txtfldEmail}" id="txtfldEmail" style="width: 192px" tabIndex="8" text="#{modulos$admin$personas.persona.email}"/>
                                <ui:label binding="#{modulos$admin$personas.label9}" for="txtfldTelefono" id="label9" styleClass="labelForm" text="Teléfono"/>
                                <ui:textField binding="#{modulos$admin$personas.txtfldTelefono}" id="txtfldTelefono" style="width: 192px" tabIndex="9" text="#{modulos$admin$personas.persona.telefono}"/>
                            </h:panelGrid>
                            <ui:panelLayout binding="#{modulos$admin$personas.pnlBotones}" id="pnlBotones" panelLayout="flow" style="height: 22px; text-align: center; width: 100%">
                                <ui:button action="#{modulos$admin$personas.btnNuevo_action}" binding="#{modulos$admin$personas.btnNuevo}" id="btnNuevo"
                                    tabIndex="10" text="Nuevo"/>
                                <ui:button action="#{modulos$admin$personas.btnEditar_action}" binding="#{modulos$admin$personas.btnEditar}"
                                    disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_PERSONAS_BUTTON_AGREGAR']}" id="btnEditar" style=""
                                    tabIndex="11" text="Editar"/>
                                <ui:button action="#{modulos$admin$personas.btnAgregar_action}" binding="#{modulos$admin$personas.btnAgregar}"
                                    disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_PERSONAS_BUTTON_EDITAR']}" id="btnAgregar" style=""
                                    tabIndex="12" text="#{ (empty AdminSessionBean.personaEnEdicion.id_persona) ? msgs.buttonAgregarLabel : msgs.buttonGuardarLabel}"/>
                                <ui:button action="#{modulos$admin$personas.btnBorrar_action}" binding="#{modulos$admin$personas.btnBorrar}"
                                    disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_PERSONAS_BUTTON_BORRAR']}" id="btnBorrar"
                                    onClick="if (confirmDeleteSelectedRows() == false) return false" style="" tabIndex="13" text="Borrar"/>
                            </ui:panelLayout>
                            <ui:table augmentTitle="false" binding="#{modulos$admin$personas.tblElementos}" clearSortButton="true" id="tblElementos"
                                paginateButton="true" paginationControls="true" sortPanelToggleButton="true" tabIndex="14" width="431">
                                <script><![CDATA[
                            /* ----- Functions for Table Actions ----- */
                            /*
                             * Initialize all rows of the table when the state
                             * of selected rows changes.
                             */
                            function initAllRows() {
                              var table = document.getElementById("form1:tblElementos");
                              table.initAllRows();
                            }
                            ]]></script>
                                <ui:tableRowGroup binding="#{modulos$admin$personas.tableRowGroup1}" id="tableRowGroup1" rows="5"
                                    selected="#{modulos$admin$personas.selectedState}" sourceData="#{modulos$admin$personas.tablaPersonaDataProvider}" sourceVar="currentRow">
                                    <ui:tableColumn binding="#{modulos$admin$personas.tableColumn1}" id="tableColumn1" onClick="setTimeout('initAllRows()', 0)"
                                        selectId="radioButton1" width="428">
                                        <ui:radioButton binding="#{modulos$admin$personas.radioButton1}" id="radioButton1" label="" name="asdas"
                                            selected="#{modulos$admin$personas.selected}" selectedValue="#{modulos$admin$personas.selectedValue}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$personas.tableColumn2}" headerText="Documento" id="tableColumn2" sort="documento">
                                        <ui:staticText binding="#{modulos$admin$personas.staticText2}" id="staticText2" text="#{currentRow.value['documento']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$personas.tableColumn9}" headerText="Tipo Documento" id="tableColumn9" sort="idref_tipodocumento">
                                        <ui:staticText binding="#{modulos$admin$personas.staticText1}" id="staticText1" text="#{currentRow.value['idref_tipodocumento']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$personas.tableColumn10}" headerText="Tipo Persona" id="tableColumn10" sort="idref_tipopersona">
                                        <ui:staticText binding="#{modulos$admin$personas.staticText6}" id="staticText6" text="#{currentRow.value['idref_tipopersona']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$personas.tableColumn3}" headerText="Nombre1" id="tableColumn3" sort="nombre1" width="171">
                                        <ui:staticText binding="#{modulos$admin$personas.staticText3}" id="staticText3" text="#{currentRow.value['nombre1']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$personas.tableColumn4}" headerText="Nombre2" id="tableColumn4" sort="nombre2" width="112">
                                        <ui:staticText binding="#{modulos$admin$personas.staticText4}" id="staticText4" text="#{currentRow.value['nombre2']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$personas.tableColumn5}" headerText="Apellido1" id="tableColumn5" sort="apellido1">
                                        <ui:staticText binding="#{modulos$admin$personas.staticText5}" id="staticText5" text="#{currentRow.value['apellido1']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$personas.tableColumn6}" headerText="Apellido2" id="tableColumn6" sort="apellido2">
                                        <ui:staticText binding="#{modulos$admin$personas.staticText14}" id="staticText14" text="#{currentRow.value['apellido2']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$personas.tableColumn7}" headerText="Email" id="tableColumn7" sort="email">
                                        <ui:staticText binding="#{modulos$admin$personas.staticText15}" id="staticText15" text="#{currentRow.value['email']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$personas.tableColumn8}" headerText="Teléfono" id="tableColumn8" sort="telefono">
                                        <ui:staticText binding="#{modulos$admin$personas.staticText16}" id="staticText16" text="#{currentRow.value['telefono']}"/>
                                    </ui:tableColumn>
                                </ui:tableRowGroup>
                            </ui:table>
                        </h:panelGrid>
                        <c:if test="${not UserInfoSessionBean.permiso['ADMIN_PERSONAS']}">
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
