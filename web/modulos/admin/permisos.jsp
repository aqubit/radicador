<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html"
    xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=ISO-8859-1" pageEncoding="UTF-8"/>
    <f:view>
        <f:loadBundle basename="sip.guiMessages" var="msgs"/>
        <ui:page binding="#{modulos$admin$permisos.page1}" id="page1">
            <ui:html binding="#{modulos$admin$permisos.html1}" id="html1">
                <ui:head binding="#{modulos$admin$permisos.head1}" id="head1">
                    <ui:link binding="#{modulos$admin$permisos.link1}" id="link1" url="/resources/menu-nal.css"/>
                </ui:head>
                <ui:body binding="#{modulos$admin$permisos.body1}" focus="form1:ddTipoRecurso" id="body1" style="width: 416px; -rave-layout: grid">
                    <ui:script id="script1" url="/script/sipol.js"/>
                    <ui:form binding="#{modulos$admin$permisos.form1}" id="form1" virtualFormsConfig="agregar | ddRecurso ddRol ddTipoPermiso | pnlPrincipal:pnlBotones:btnAgregar , borrar | pnlPrincipal:tblElementos:tableRowGroup1:tableColumn1:radioButton1 | pnlPrincipal:pnlBotones:btnBorrar , buscar | txtfldNombreRecurso ddTipoRecurso pnlPrincipal:pnlControles:layoutPanel2:ddRecurso | btnBuscar , cambiarrecurso | ddRecurso | ddRecurso">
                        <div>
                            <jsp:directive.include file="../../menu.jspf"/>
                        </div>
                        <h:panelGrid binding="#{modulos$admin$permisos.pnlPrincipal}" id="pnlPrincipal"
                            rendered="#{UserInfoSessionBean.permiso['ADMIN_PERMISOS']}" style="" width="552">
                            <ui:messageGroup binding="#{modulos$admin$permisos.messageGroup1}" id="messageGroup1" showGlobalOnly="true"/>
                            <h:panelGrid binding="#{modulos$admin$permisos.pnlControles}" columnClasses="TablaSipPrimeraColumna, TablaSipRestoColumnas"
                                columns="2" id="pnlControles" style="" width="551">
                                <ui:label binding="#{modulos$admin$permisos.label4}" for="ddTipoRecurso" id="label4" styleClass="labelForm" text="Tipo de Recurso"/>
                                <h:selectOneMenu binding="#{modulos$admin$permisos.ddTipoRecurso}" converter="#{modulos$admin$permisos.integerDDConverter}"
                                    id="ddTipoRecurso" style="width: 312px" tabindex="1">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$admin$permisos.dropdown1SelectItems}" id="dropdown1SelectItems" value="#{modulos$admin$permisos.ddTipoRecursoItems}"/>
                                </h:selectOneMenu>
                                <ui:label binding="#{modulos$admin$permisos.label3}" for="ddRecurso" id="label3" requiredIndicator="true" styleClass="labelForm" text=" Recurso"/>
                                <ui:panelLayout binding="#{modulos$admin$permisos.layoutPanel2}" id="layoutPanel2" panelLayout="flow">
                                    <ui:textField binding="#{modulos$admin$permisos.txtfldNombreRecurso}"
                                        converter="#{modulos$admin$permisos.integerDDConverter}" id="txtfldNombreRecurso" style="width: 144px" tabIndex="2"/>
                                    <ui:button action="#{modulos$admin$permisos.btnBuscar_action}" binding="#{modulos$admin$permisos.btnBuscar}" id="btnBuscar"
                                        mini="true" tabIndex="3" text="Buscar"/>
                                    <h:selectOneMenu binding="#{modulos$admin$permisos.ddRecurso}" converter="#{modulos$admin$permisos.integerDDConverter}"
                                        id="ddRecurso" onchange="common_timeoutSubmitForm(this.form, 'ddRecurso');" style="width: 432px" tabindex="4">
                                        <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                        <f:selectItems binding="#{modulos$admin$permisos.dropdown1SelectItems1}" id="dropdown1SelectItems1" value="#{modulos$admin$permisos.ddRecursoItems}"/>
                                    </h:selectOneMenu>
                                </ui:panelLayout>
                                <ui:label binding="#{modulos$admin$permisos.label1}" for="ddRol" id="label1" requiredIndicator="true" styleClass="labelForm" text="Rol"/>
                                <h:selectOneMenu binding="#{modulos$admin$permisos.ddRol}" converter="#{modulos$admin$permisos.integerDDConverter}" id="ddRol"
                                    required="true" style="width: 312px" tabindex="5">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$admin$permisos.dropdown1SelectItems2}" id="dropdown1SelectItems2" value="#{modulos$admin$permisos.ddRolItems}"/>
                                </h:selectOneMenu>
                                <ui:label binding="#{modulos$admin$permisos.label2}" for="ddTipoPermiso" id="label2" requiredIndicator="true"
                                    styleClass="labelForm" text="Permiso"/>
                                <h:selectOneMenu binding="#{modulos$admin$permisos.ddTipoPermiso}" converter="#{modulos$admin$permisos.integerDDConverter}"
                                    id="ddTipoPermiso" required="true" style="width: 312px" tabindex="6">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$admin$permisos.dropdown2SelectItems}" id="dropdown2SelectItems" value="#{modulos$admin$permisos.ddTipoPermisoItems}"/>
                                </h:selectOneMenu>
                            </h:panelGrid>
                            <ui:panelLayout binding="#{modulos$admin$permisos.pnlBotones}" id="pnlBotones" panelLayout="flow" style="height: 22px; text-align: center; width: 100%">
                                <ui:button action="#{modulos$admin$permisos.btnAgregar_action}" binding="#{modulos$admin$permisos.btnAgregar}"
                                    disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_PERMISOS_BUTTON_AGREGAR']}" id="btnAgregar" style=""
                                    tabIndex="7" text="Agregar"/>
                                <ui:button action="#{modulos$admin$permisos.btnBorrar_action}" binding="#{modulos$admin$permisos.btnBorrar}"
                                    disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_PERMISOS_BUTTON_BORRAR']}" id="btnBorrar"
                                    onClick="if (confirmDeleteSelectedRows() == false) return false" style="" tabIndex="8" text="Borrar"/>
                            </ui:panelLayout>
                            <ui:table augmentTitle="false" binding="#{modulos$admin$permisos.tblElementos}" clearSortButton="true" id="tblElementos"
                                paginateButton="true" paginationControls="true" sortPanelToggleButton="true" tabIndex="9" width="770">
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
                                <ui:tableRowGroup binding="#{modulos$admin$permisos.tableRowGroup1}" id="tableRowGroup1" rows="5"
                                    selected="#{modulos$admin$permisos.selectedState}" sourceData="#{modulos$admin$permisos.tablaPermisosDataProvider}" sourceVar="currentRow">
                                    <ui:tableColumn binding="#{modulos$admin$permisos.tableColumn1}" id="tableColumn1" onClick="setTimeout('initAllRows()', 0)"
                                        selectId="radioButton1" width="428">
                                        <ui:radioButton binding="#{modulos$admin$permisos.radioButton1}" id="radioButton1" label="" name="asdas"
                                            selected="#{modulos$admin$permisos.selected}" selectedValue="#{modulos$admin$permisos.selectedValue}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$permisos.tableColumn4}" headerText="Rol" id="tableColumn4" sort="rol">
                                        <ui:staticText binding="#{modulos$admin$permisos.staticText2}" id="staticText2" text="#{currentRow.value['rol']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$permisos.tableColumn2}" headerText="Permiso" id="tableColumn2" sort="permiso">
                                        <ui:staticText binding="#{modulos$admin$permisos.staticText1}" id="staticText1" text="#{currentRow.value['permiso']}"/>
                                    </ui:tableColumn>
                                </ui:tableRowGroup>
                            </ui:table>
                        </h:panelGrid>
                        <c:if test="${not UserInfoSessionBean.permiso['ADMIN_PERMISOS']}">
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
