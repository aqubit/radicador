<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html"
    xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=ISO-8859-1" pageEncoding="UTF-8"/>
    <f:view>
        <f:loadBundle basename="sip.guiMessages" var="msgs"/>
        <ui:page binding="#{modulos$admin$perfiles.page1}" id="page1">
            <ui:html binding="#{modulos$admin$perfiles.html1}" id="html1">
                <ui:head binding="#{modulos$admin$perfiles.head1}" id="head1">
                    <ui:link binding="#{modulos$admin$perfiles.link1}" id="link1" url="/resources/menu-nal.css"/>
                </ui:head>
                <ui:body binding="#{modulos$admin$perfiles.body1}" focus="form1:ddRol" id="body1" style="-rave-layout: grid">
                    <ui:script id="script1" url="/script/sipol.js"/>
                    <ui:form binding="#{modulos$admin$perfiles.form1}" id="form1" virtualFormsConfig="agregar | pnlPrincipal:pnlControles:ddUsuario pnlPrincipal:pnlControles:ddRol | pnlPrincipal:pnlBotones:btnAgregar , borrar | pnlPrincipal:tblElementos:tableRowGroup1:tableColumn1:radioButton1 | pnlPrincipal:pnlBotones:btnBorrar , cambiar | pnlPrincipal:pnlControles:ddRol | pnlPrincipal:pnlControles:ddRol">
                        <div>
                            <jsp:directive.include file="../../menu.jspf"/>
                        </div>
                        <h:panelGrid binding="#{modulos$admin$perfiles.pnlPrincipal}" id="pnlPrincipal" rendered="#{UserInfoSessionBean.permiso['ADMIN_PERFILES']}">
                            <ui:messageGroup binding="#{modulos$admin$perfiles.messageGroup1}" id="messageGroup1" showGlobalOnly="true" styleClass=""/>
                            <h:panelGrid binding="#{modulos$admin$perfiles.pnlControles}" columnClasses="TablaSipPrimeraColumna, TablaSipRestoColumnas"
                                columns="2" id="pnlControles" width="431">
                                <ui:label binding="#{modulos$admin$perfiles.label3}" for="ddRol" id="label3" requiredIndicator="true" style=""
                                    styleClass="labelForm" text="Rol"/>
                                <h:selectOneMenu binding="#{modulos$admin$perfiles.ddRol}" converter="#{modulos$admin$perfiles.integerDDConverter}" id="ddRol"
                                    onchange="common_timeoutSubmitForm(this.form, 'ddRol');" style="width: 288px" tabindex="1">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$admin$perfiles.dropdown1SelectItems}" id="dropdown1SelectItems" value="#{modulos$admin$perfiles.ddRolItems}"/>
                                </h:selectOneMenu>
                                <ui:label binding="#{modulos$admin$perfiles.label1}" for="ddUsuario" id="label1" requiredIndicator="true" style=""
                                    styleClass="labelForm" text="Usuario"/>
                                <h:selectOneMenu binding="#{modulos$admin$perfiles.ddUsuario}" converter="#{modulos$admin$perfiles.integerDDConverter}"
                                    id="ddUsuario" required="true" style="width: 288px" tabindex="2">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$admin$perfiles.dropdown1SelectItems1}" id="dropdown1SelectItems1" value="#{modulos$admin$perfiles.ddUsuarioItems}"/>
                                </h:selectOneMenu>
                            </h:panelGrid>
                            <ui:panelLayout binding="#{modulos$admin$perfiles.pnlBotones}" id="pnlBotones" panelLayout="flow" style="height: 22px; text-align: center; width: 100%">
                                <ui:button action="#{modulos$admin$perfiles.btnAgregar_action}" binding="#{modulos$admin$perfiles.btnAgregar}"
                                    disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_PERFILES_BUTTON_AGREGAR']}" id="btnAgregar" style=""
                                    tabIndex="3" text="Agregar"/>
                                <ui:button action="#{modulos$admin$perfiles.btnBorrar_action}" binding="#{modulos$admin$perfiles.btnBorrar}"
                                    disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_PERFILES_BUTTON_BORRAR']}" id="btnBorrar"
                                    onClick="if (confirmDeleteSelectedRows() == false) return false" style="" tabIndex="4" text="Borrar"/>
                            </ui:panelLayout>
                            <ui:table augmentTitle="false" binding="#{modulos$admin$perfiles.tblElementos}" clearSortButton="true" id="tblElementos"
                                paginateButton="true" paginationControls="true" sortPanelToggleButton="true" tabIndex="5">
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
                                <ui:tableRowGroup binding="#{modulos$admin$perfiles.tableRowGroup1}" id="tableRowGroup1" rows="5"
                                    selected="#{modulos$admin$perfiles.selectedState}" sourceData="#{modulos$admin$perfiles.tablaPerfilesDataProvider}" sourceVar="currentRow">
                                    <ui:tableColumn binding="#{modulos$admin$perfiles.tableColumn1}" id="tableColumn1" onClick="setTimeout('initAllRows()', 0)" selectId="radioButton1">
                                        <ui:radioButton binding="#{modulos$admin$perfiles.radioButton1}" id="radioButton1" label="" name="asdas"
                                            selected="#{modulos$admin$perfiles.selected}" selectedValue="#{modulos$admin$perfiles.selectedValue}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$perfiles.tableColumn3}" headerText="Usuario" id="tableColumn3" sort="login">
                                        <ui:staticText binding="#{modulos$admin$perfiles.staticText2}" id="staticText2" text="#{currentRow.value['login']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$perfiles.tableColumn2}" headerText="Persona" id="tableColumn2" sort="persona">
                                        <ui:staticText binding="#{modulos$admin$perfiles.staticText1}" id="staticText1" text="#{currentRow.value['persona']}"/>
                                    </ui:tableColumn>
                                </ui:tableRowGroup>
                            </ui:table>
                        </h:panelGrid>
                        <c:if test="${not UserInfoSessionBean.permiso['ADMIN_PERFILES']}">
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
