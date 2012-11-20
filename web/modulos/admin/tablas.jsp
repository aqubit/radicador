<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html"
    xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=ISO-8859-1" pageEncoding="UTF-8"/>
    <f:view>
        <f:loadBundle basename="sip.guiMessages" var="msgs"/>
        <ui:page binding="#{modulos$admin$tablas.page1}" id="page1">
            <ui:html binding="#{modulos$admin$tablas.html1}" id="html1">
                <ui:head binding="#{modulos$admin$tablas.head1}" id="head1">
                    <ui:link binding="#{modulos$admin$tablas.link1}" id="link1" url="/resources/menu-nal.css"/>
                </ui:head>
                <ui:body binding="#{modulos$admin$tablas.body1}" focus="form1:ddTipoReferencia" id="body1" style="-rave-layout: grid">
                    <ui:script id="script1" url="/script/sipol.js"/>
                    <ui:form binding="#{modulos$admin$tablas.form1}" id="form1" virtualFormsConfig="agregar | txtfldNombre txtfldDescripcion txtfldAbreviacion pnlPrincipal:tblElementos:tableRowGroup1:tableColumn1:radioButton1 ddTipoReferencia | pnlPrincipal:pnlBotones:btnAgregar , editar | pnlPrincipal:tblElementos:tableRowGroup1:tableColumn1:radioButton1 | pnlPrincipal:pnlBotones:btnEditar , borrar | pnlPrincipal:tblElementos:tableRowGroup1:tableColumn1:radioButton1 | pnlPrincipal:pnlBotones:btnBorrar , cambio_tipo | pnlPrincipal:tblElementos:tableRowGroup1:tableColumn1:radioButton1 ddTipoReferencia | ddTipoReferencia , reset | | pnlPrincipal:pnlBotones:btnNuevo">
                        <div>
                            <jsp:directive.include file="../../menu.jspf"/>
                        </div>
                        <h:panelGrid binding="#{modulos$admin$tablas.pnlPrincipal}" id="pnlPrincipal"
                            rendered="#{UserInfoSessionBean.permiso['ADMIN_TABLAS']}" style="" width="528">
                            <ui:messageGroup binding="#{modulos$admin$tablas.messageGroup1}" id="messageGroup1" showGlobalOnly="true"/>
                            <h:panelGrid binding="#{modulos$admin$tablas.pnlControles}" columnClasses="TablaSipPrimeraColumna, TablaSipRestoColumnas"
                                columns="2" id="pnlControles" style="" width="479">
                                <ui:label binding="#{modulos$admin$tablas.label1}" for="ddTipoReferencia" id="label1" requiredIndicator="true"
                                    styleClass="labelForm" text="Tipo de Referencia"/>
                                <h:selectOneMenu binding="#{modulos$admin$tablas.ddTipoReferencia}" converter="#{modulos$admin$tablas.integerDDConverter}"
                                    id="ddTipoReferencia" onchange="common_timeoutSubmitForm(this.form, 'ddTipoReferencia');" style="width: 336px" tabindex="1" valueChangeListener="#{modulos$admin$tablas.ddTipoReferencia_processValueChange}">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$admin$tablas.dropdown1SelectItems}" id="dropdown1SelectItems" value="#{modulos$admin$tablas.ddTipoReferenciaItems}"/>
                                </h:selectOneMenu>
                                <ui:label binding="#{modulos$admin$tablas.label2}" for="txtfldNombre" id="label2" requiredIndicator="true"
                                    styleClass="labelForm" text="Nombre"/>
                                <ui:textField binding="#{modulos$admin$tablas.txtfldNombre}" id="txtfldNombre" required="true" style="width: 336px" tabIndex="2" text="#{modulos$admin$tablas.referencia.nombre}"/>
                                <ui:label binding="#{modulos$admin$tablas.label3}" for="txtfldDescripcion" id="label3" requiredIndicator="true"
                                    styleClass="labelForm" text="Descripción"/>
                                <ui:textField binding="#{modulos$admin$tablas.txtfldDescripcion}" id="txtfldDescripcion" required="true" style="width: 336px"
                                    tabIndex="3" text="#{modulos$admin$tablas.referencia.descripcion}"/>
                                <ui:label binding="#{modulos$admin$tablas.label4}" for="txtfldAbreviacion" id="label4" requiredIndicator="true"
                                    styleClass="labelForm" text="Abreviación"/>
                                <ui:textField binding="#{modulos$admin$tablas.txtfldAbreviacion}" id="txtfldAbreviacion" required="true" style="width: 336px"
                                    tabIndex="4" text="#{modulos$admin$tablas.referencia.abreviacion}"/>
                            </h:panelGrid>
                            <ui:panelLayout binding="#{modulos$admin$tablas.pnlBotones}" id="pnlBotones" panelLayout="flow" style="height: 22px; text-align: center; width: 100%">
                                <ui:button action="#{modulos$admin$tablas.btnNuevo_action}" binding="#{modulos$admin$tablas.btnNuevo}" id="btnNuevo"
                                    tabIndex="5" text="Nuevo"/>
                                <ui:button action="#{modulos$admin$tablas.btnEditar_action}" binding="#{modulos$admin$tablas.btnEditar}" id="btnEditar"
                                    disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_TABLAS_BUTTON_EDITAR']}" style="" tabIndex="6" text="Editar"/>
                                <ui:button action="#{modulos$admin$tablas.btnAgregar_action}" binding="#{modulos$admin$tablas.btnAgregar}" id="btnAgregar"
                                    disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_TABLAS_BUTTON_AGREGAR']}" style="" tabIndex="7" 
                                    text="#{ (empty AdminSessionBean.referenciaEnEdicion.id_referencia) ? msgs.buttonAgregarLabel : msgs.buttonGuardarLabel}"/>
                                <ui:button action="#{modulos$admin$tablas.btnBorrar_action}" binding="#{modulos$admin$tablas.btnBorrar}" id="btnBorrar"
                                    onClick="if (confirmDeleteSelectedRows() == false) return false" disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_TABLAS_BUTTON_BORRAR']}"
                                    style="" tabIndex="8" text="Borrar"/>
                            </ui:panelLayout>
                            <ui:table augmentTitle="false" binding="#{modulos$admin$tablas.tblElementos}" clearSortButton="true" id="tblElementos"
                                paginateButton="true" paginationControls="true" sortPanelToggleButton="true" tabIndex="9" width="455">
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
                                <ui:tableRowGroup binding="#{modulos$admin$tablas.tableRowGroup1}" id="tableRowGroup1" rows="5"
                                    selected="#{modulos$admin$tablas.selectedState}" sourceData="#{modulos$admin$tablas.tablaReferenciasDataProvider}" sourceVar="currentRow">
                                    <ui:tableColumn binding="#{modulos$admin$tablas.tableColumn1}" id="tableColumn1" onClick="setTimeout('initAllRows()', 0)"
                                        selectId="radioButton1" width="428">
                                        <ui:radioButton binding="#{modulos$admin$tablas.radioButton1}" id="radioButton1" label="" name="asdas"
                                            selected="#{modulos$admin$tablas.selected}" selectedValue="#{modulos$admin$tablas.selectedValue}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$tablas.tableColumn2}" headerText="Nombre" id="tableColumn2" sort="nombre">
                                        <ui:staticText binding="#{modulos$admin$tablas.staticText3}" id="staticText3" text="#{currentRow.value['nombre']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$tablas.tableColumn3}" headerText="Descripción" id="tableColumn3" sort="descripcion" width="171">
                                        <ui:staticText binding="#{modulos$admin$tablas.staticText4}" id="staticText4" text="#{currentRow.value['descripcion']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$tablas.tableColumn4}" headerText="Abreviación" id="tableColumn4" sort="abreviacion" width="203">
                                        <ui:staticText binding="#{modulos$admin$tablas.staticText5}" id="staticText5" text="#{currentRow.value['abreviacion']}"/>
                                    </ui:tableColumn>
                                </ui:tableRowGroup>
                            </ui:table>
                        </h:panelGrid>
                        <c:if test="${not UserInfoSessionBean.permiso['ADMIN_TABLAS']}">
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
