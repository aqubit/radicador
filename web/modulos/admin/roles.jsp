<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html"
    xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=ISO-8859-1" pageEncoding="UTF-8"/>
    <f:view>
        <f:loadBundle basename="sip.guiMessages" var="msgs"/>
        <ui:page binding="#{modulos$admin$roles.page1}" id="page1">
            <ui:html binding="#{modulos$admin$roles.html1}" id="html1">
                <ui:head binding="#{modulos$admin$roles.head1}" id="head1">
                    <ui:link binding="#{modulos$admin$roles.link1}" id="link1" url="/resources/menu-nal.css"/>
                </ui:head>
                <ui:body binding="#{modulos$admin$roles.body1}" focus="form1:txtfldNombre" id="body1" style="-rave-layout: grid">
                    <ui:script id="script1" url="/script/sipol.js"/>
                    <ui:form binding="#{modulos$admin$roles.form1}" id="form1" virtualFormsConfig="agregar | txtfldNombre txtfldDescripcion pnlPrincipal:tblElementos:tableRowGroup1:tableColumn1:radioButton1 | pnlPrincipal:pnlBotones:btnAgregar, editar | pnlPrincipal:tblElementos:tableRowGroup1:tableColumn1:radioButton1 | pnlPrincipal:pnlBotones:btnEditar , borrar | pnlPrincipal:tblElementos:tableRowGroup1:tableColumn1:radioButton1 | pnlPrincipal:pnlBotones:btnBorrar , reset | | pnlPrincipal:pnlBotones:btnNuevo">
                        <div>
                            <jsp:directive.include file="../../menu.jspf"/>
                        </div>
                        <h:panelGrid binding="#{modulos$admin$roles.pnlPrincipal}" id="pnlPrincipal" rendered="#{UserInfoSessionBean.permiso['ADMIN_ROLES']}"
                            style="" width="456">
                            <ui:messageGroup binding="#{modulos$admin$roles.messageGroup1}" id="messageGroup1" showGlobalOnly="true"/>
                            <h:panelGrid binding="#{modulos$admin$roles.pnlControles}" columnClasses="TablaSipPrimeraColumna, TablaSipRestoColumnas" columns="2"
                                id="pnlControles" style="" width="455">
                                <ui:label binding="#{modulos$admin$roles.label2}" for="txtfldNombre" id="label2" requiredIndicator="true" styleClass="labelForm" text="Nombre"/>
                                <ui:textField binding="#{modulos$admin$roles.txtfldNombre}" id="txtfldNombre" required="true" style="width: 336px" tabIndex="1" text="#{modulos$admin$roles.rol.nombre}"/>
                                <ui:label binding="#{modulos$admin$roles.label3}" for="txtfldDescripcion" id="label3" requiredIndicator="true"
                                    styleClass="labelForm" text="Descripción"/>
                                <ui:textField binding="#{modulos$admin$roles.txtfldDescripcion}" id="txtfldDescripcion" required="true" style="width: 336px"
                                    tabIndex="2" text="#{modulos$admin$roles.rol.descripcion}"/>
                            </h:panelGrid>
                            <ui:panelLayout binding="#{modulos$admin$roles.pnlBotones}" id="pnlBotones" panelLayout="flow" style="height: 22px; text-align: center; width: 100%">
                                <ui:button action="#{modulos$admin$roles.btnNuevo_action}" binding="#{modulos$admin$roles.btnNuevo}" id="btnNuevo" tabIndex="3" text="Nuevo"/>
                                <ui:button action="#{modulos$admin$roles.btnEditar_action}" binding="#{modulos$admin$roles.btnEditar}" id="btnEditar"
                                    disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_ROLES_BUTTON_EDITAR']}" style="" tabIndex="4" text="Editar"/>
                                <ui:button action="#{modulos$admin$roles.btnAgregar_action}" binding="#{modulos$admin$roles.btnAgregar}" id="btnAgregar"
                                    disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_ROLES_BUTTON_AGREGAR']}" style="" tabIndex="5" 
                                    text="#{ (empty AdminSessionBean.rolEnEdicion.id_rol) ? msgs.buttonAgregarLabel : msgs.buttonGuardarLabel}"/>
                                <ui:button action="#{modulos$admin$roles.btnBorrar_action}" binding="#{modulos$admin$roles.btnBorrar}" id="btnBorrar"
                                    onClick="if (confirmDeleteSelectedRows() == false) return false" disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_ROLES_BUTTON_BORRAR']}"
                                    style="" tabIndex="6" text="Borrar"/>
                            </ui:panelLayout>
                            <ui:table augmentTitle="false" binding="#{modulos$admin$roles.tblElementos}" clearSortButton="true" id="tblElementos"
                                paginateButton="true" paginationControls="true" sortPanelToggleButton="true" tabIndex="7" width="823">
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
                                <ui:tableRowGroup binding="#{modulos$admin$roles.tableRowGroup1}" id="tableRowGroup1" rows="5"
                                    selected="#{modulos$admin$roles.selectedState}" sourceData="#{modulos$admin$roles.tablaRolDataProvider}" sourceVar="currentRow">
                                    <ui:tableColumn binding="#{modulos$admin$roles.tableColumn1}" id="tableColumn1" onClick="setTimeout('initAllRows()', 0)"
                                        selectId="radioButton1" width="428">
                                        <ui:radioButton binding="#{modulos$admin$roles.radioButton1}" id="radioButton1" label="" name="asdas"
                                            selected="#{modulos$admin$roles.selected}" selectedValue="#{modulos$admin$roles.selectedValue}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$roles.tableColumn2}" headerText="Nombre" id="tableColumn2" sort="nombre">
                                        <ui:staticText binding="#{modulos$admin$roles.staticText1}" id="staticText1" text="#{currentRow.value['nombre']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$roles.tableColumn3}" headerText="Descripción" id="tableColumn3" sort="descripcion" width="171">
                                        <ui:staticText binding="#{modulos$admin$roles.staticText2}" id="staticText2" text="#{currentRow.value['descripcion']}"/>
                                    </ui:tableColumn>
                                </ui:tableRowGroup>
                            </ui:table>
                        </h:panelGrid>
                        <c:if test="${not UserInfoSessionBean.permiso['ADMIN_ROLES']}">
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
