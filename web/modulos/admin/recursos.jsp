<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html"
    xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <f:loadBundle basename="sip.guiMessages" var="msgs"/>
        <ui:page binding="#{modulos$admin$recursos.page1}" id="page1">
            <ui:html binding="#{modulos$admin$recursos.html1}" id="html1">
                <ui:head binding="#{modulos$admin$recursos.head1}" id="head1">
                    <ui:link binding="#{modulos$admin$recursos.link1}" charset="ISO-8859-1" id="link1" url="/resources/menu-nal.css"/>
                </ui:head>
                <ui:body binding="#{modulos$admin$recursos.body1}" focus="form1:ddTipoRecurso" id="body1" style="-rave-layout: grid">
                    <ui:script id="script1" url="/script/sipol.js"/>
                    <ui:form binding="#{modulos$admin$recursos.form1}" id="form1" virtualFormsConfig="agregar | txtfldNombre txtfldDescripcion ddTipoRecurso pnlPrincipal:tblElementos:tableRowGroup1:tableColumn1:radioButton1 | pnlPrincipal:pnlBotones:btnAgregar , borrar | pnlPrincipal:tblElementos:tableRowGroup1:tableColumn1:radioButton1 | pnlPrincipal:pnlBotones:btnBorrar , editar | pnlPrincipal:tblElementos:tableRowGroup1:tableColumn1:radioButton1 | pnlPrincipal:pnlBotones:btnEditar , tiporecurso | ddTipoRecurso | ddTipoRecurso , reset | | pnlPrincipal:pnlBotones:btnNuevo">
                        <div>
                            <jsp:directive.include file="../../menu.jspf"/>
                        </div>
                        <h:panelGrid binding="#{modulos$admin$recursos.pnlPrincipal}" id="pnlPrincipal"
                            rendered="#{UserInfoSessionBean.permiso['ADMIN_RECURSOS']}" style="" width="576">
                            <ui:messageGroup binding="#{modulos$admin$recursos.messageGroup1}" id="messageGroup1" showGlobalOnly="true"/>
                            <h:panelGrid binding="#{modulos$admin$recursos.pnlControles}" columnClasses="TablaSipPrimeraColumna, TablaSipRestoColumnas"
                                columns="2" id="pnlControles" style="" width="551">
                                <ui:label binding="#{modulos$admin$recursos.label4}" for="ddTipoRecurso" id="label4" requiredIndicator="true"
                                    styleClass="labelForm" text="Tipo de Recurso"/>
                                <h:selectOneMenu binding="#{modulos$admin$recursos.ddTipoRecurso}" converter="#{modulos$admin$recursos.integerDDConverter}"
                                    id="ddTipoRecurso" onchange="common_timeoutSubmitForm(this.form, 'ddTipoRecurso');" style="width: 432px" tabindex="1" valueChangeListener="#{modulos$admin$recursos.ddTipoRecurso_processValueChange}">
                                    <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                    <f:selectItems binding="#{modulos$admin$recursos.dropdown1SelectItems}" id="dropdown1SelectItems" value="#{modulos$admin$recursos.ddTipoRecursoItems}"/>
                                </h:selectOneMenu>
                                <ui:label binding="#{modulos$admin$recursos.label2}" for="txtfldNombre" id="label2" requiredIndicator="true"
                                    styleClass="labelForm" text="Nombre"/>
                                <ui:textField binding="#{modulos$admin$recursos.txtfldNombre}" id="txtfldNombre" required="true" style="width: 432px"
                                    tabIndex="2" text="#{modulos$admin$recursos.recurso.nombre}"/>
                                <ui:label binding="#{modulos$admin$recursos.label1}" for="txtfldDescripcion" id="label1" requiredIndicator="true"
                                    styleClass="labelForm" text="Descripción"/>
                                <ui:textField binding="#{modulos$admin$recursos.txtfldDescripcion}" id="txtfldDescripcion" required="true" style="width: 432px"
                                    tabIndex="3" text="#{modulos$admin$recursos.recurso.descripcion}"/>
                            </h:panelGrid>
                            <ui:panelLayout binding="#{modulos$admin$recursos.pnlBotones}" id="pnlBotones" panelLayout="flow" style="height: 22px; text-align: center; width: 100%">
                                <ui:button action="#{modulos$admin$recursos.btnNuevo_action}" binding="#{modulos$admin$recursos.btnNuevo}" id="btnNuevo"
                                    tabIndex="4" text="Nuevo"/>
                                <ui:button action="#{modulos$admin$recursos.btnEditar_action}" binding="#{modulos$admin$recursos.btnEditar}"
                                    disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_RECURSOS_BUTTON_EDITAR']}" id="btnEditar" style="" tabIndex="5" text="Editar"/>
                                <ui:button action="#{modulos$admin$recursos.btnAgregar_action}" binding="#{modulos$admin$recursos.btnAgregar}"
                                    disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_RECURSOS_BUTTON_AGREGAR']}" id="btnAgregar" style=""
                                    tabIndex="6" text="#{ (empty AdminSessionBean.recursoEnEdicion.id_recurso) ? msgs.buttonAgregarLabel : msgs.buttonGuardarLabel}"/>
                                <ui:button action="#{modulos$admin$recursos.btnBorrar_action}" binding="#{modulos$admin$recursos.btnBorrar}"
                                    disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_RECURSOS_BUTTON_BORRAR']}" id="btnBorrar"
                                    onClick="if (confirmDeleteSelectedRows() == false) return false" style="" tabIndex="7" text="Borrar"/>
                            </ui:panelLayout>
                            <ui:table augmentTitle="false" binding="#{modulos$admin$recursos.tblElementos}" clearSortButton="true" id="tblElementos"
                                paginateButton="true" paginationControls="true" sortPanelToggleButton="true" tabIndex="8" width="431">
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
                                <ui:tableRowGroup binding="#{modulos$admin$recursos.tableRowGroup1}" id="tableRowGroup1" rows="5"
                                    selected="#{modulos$admin$recursos.selectedState}" sourceData="#{modulos$admin$recursos.tablaRecursoDataProvider}" sourceVar="currentRow">
                                    <ui:tableColumn binding="#{modulos$admin$recursos.tableColumn1}" id="tableColumn1" onClick="setTimeout('initAllRows()', 0)"
                                        selectId="radioButton1" width="428">
                                        <ui:radioButton binding="#{modulos$admin$recursos.radioButton1}" id="radioButton1" label="" name="asdas"
                                            selected="#{modulos$admin$recursos.selected}" selectedValue="#{modulos$admin$recursos.selectedValue}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$recursos.tableColumn2}" headerText="Nombre" id="tableColumn2" sort="nombre">
                                        <ui:staticText binding="#{modulos$admin$recursos.staticText1}" id="staticText1" text="#{currentRow.value['nombre']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$recursos.tableColumn3}" headerText="Descripción" id="tableColumn3"
                                        sort="descripcion" width="171">
                                        <ui:staticText binding="#{modulos$admin$recursos.staticText2}" id="staticText2" text="#{currentRow.value['descripcion']}"/>
                                    </ui:tableColumn>
                                </ui:tableRowGroup>
                            </ui:table>
                        </h:panelGrid>
                        <c:if test="${not UserInfoSessionBean.permiso['ADMIN_RECURSOS']}">
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
