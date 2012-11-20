<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html"
    xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=ISO-8859-1" pageEncoding="UTF-8"/>
    <f:view>
        <f:loadBundle basename="sip.guiMessages" var="msgs"/>
        <ui:page binding="#{modulos$admin$usuarios.page1}" id="page1">
            <ui:html binding="#{modulos$admin$usuarios.html1}" id="html1">
                <ui:head binding="#{modulos$admin$usuarios.head1}" id="head1">
                    <ui:link binding="#{modulos$admin$usuarios.link1}" id="link1" url="/resources/menu-nal.css"/>
                </ui:head>
                <ui:body binding="#{modulos$admin$usuarios.body1}" focus="form1:txtfldUsuario" id="body1" style="-rave-layout: grid">
                    <ui:script id="script1" url="/script/sipol.js"/>
                    <ui:form binding="#{modulos$admin$usuarios.form1}" id="form1" virtualFormsConfig="agregar | txtfldUsuario pnlPrincipal:tblElementos:tableRowGroup1:tableColumn1:radioButton1 ddPersona chbxDisabled txtfldContrasena2 txtfldContrasena | pnlPrincipal:pnlBotones:btnAgregar, borrar | pnlPrincipal:tblElementos:tableRowGroup1:tableColumn1:radioButton1 | pnlPrincipal:pnlBotones:btnBorrar , editar | pnlPrincipal:tblElementos:tableRowGroup1:tableColumn1:radioButton1 | pnlPrincipal:pnlBotones:btnEditar , reset | | pnlPrincipal:pnlBotones:btnNuevo">
                        <div>
                            <jsp:directive.include file="../../menu.jspf"/>
                        </div>
                        <h:panelGrid binding="#{modulos$admin$usuarios.pnlPrincipal}" id="pnlPrincipal" onclick=""
                            rendered="#{UserInfoSessionBean.permiso['ADMIN_USUARIOS']}" style="" width="624">
                            <ui:messageGroup binding="#{modulos$admin$usuarios.messageGroup1}" id="messageGroup1" showGlobalOnly="true"/>
                            <h:panelGrid binding="#{modulos$admin$usuarios.pnlControles}" columnClasses="TablaSipPrimeraColumna, TablaSipRestoColumnas"
                                columns="2" id="pnlControles" width="623">
                                <ui:label binding="#{modulos$admin$usuarios.label1}" for="txtfldUsuario" id="label1" requiredIndicator="true" style=""
                                    styleClass="labelForm" text="Usuario"/>
                                <ui:textField binding="#{modulos$admin$usuarios.txtfldUsuario}" id="txtfldUsuario" required="true" style="width: 192px"
                                    tabIndex="1" text="#{modulos$admin$usuarios.usuario.login}"
                                    disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_USUARIOS_TXTFLD_LOGIN']}"/>
                                <ui:label binding="#{modulos$admin$usuarios.label2}" for="ddPersona" id="label2" requiredIndicator="true" style=""
                                    styleClass="labelForm" text="Persona"/>
                                <ui:panelLayout binding="#{modulos$admin$usuarios.layoutPanel2}" id="layoutPanel2" panelLayout="flow" style="height: 24px; width: 100%">
                                    <h:selectOneMenu binding="#{modulos$admin$usuarios.ddPersona}" converter="#{modulos$admin$usuarios.integerDDConverter}"
                                        id="ddPersona" required="true" style="width: 350px" tabindex="2" 
                                        disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_USUARIOS_DDWN_PERSONA']}">
                                        <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                        <f:selectItems binding="#{modulos$admin$usuarios.dropdown1SelectItems}" id="dropdown1SelectItems" value="#{modulos$admin$usuarios.ddPersonaItems}"/>
                                    </h:selectOneMenu>
                                    <ui:imageHyperlink binding="#{modulos$admin$usuarios.imageHyperlink1}" id="imageHyperlink1" imageURL="/images/search.gif"
                                        onClick="doPopup(&quot;form1:ddPersona&quot;)" target="popup" text="Buscar" url="/faces/modulos/common/buscarPersona.jsp"
                                        rendered="#{UserInfoSessionBean.permiso['ADMIN_SUBMODULO_USUARIOS_DDWN_PERSONA']}"/>
                                </ui:panelLayout>
                                <ui:label binding="#{modulos$admin$usuarios.label3}" for="txtfldContrasena" id="label3" requiredIndicator="true" style=""
                                    styleClass="labelForm" text="Contraseña"/>
                                <ui:passwordField binding="#{modulos$admin$usuarios.txtfldContrasena}" id="txtfldContrasena" onChange="" required="true"
                                    style="width: 192px" tabIndex="3"/>
                                <ui:label binding="#{modulos$admin$usuarios.label5}" for="txtfldContrasena2" id="label5" requiredIndicator="true"
                                    styleClass="labelForm" text="Reescribir contraseña"/>
                                <ui:passwordField binding="#{modulos$admin$usuarios.txtfldContrasena2}" id="txtfldContrasena2" onChange="" required="true"
                                    style="width: 192px" tabIndex="4"/>
                                <ui:label binding="#{modulos$admin$usuarios.label4}" for="chbxDisabled" id="label4" style="" styleClass="labelForm" text="Desactivado"/>
                                <ui:checkbox binding="#{modulos$admin$usuarios.chbxDisabled}" converter="#{modulos$admin$usuarios.booleanConverter1}"
                                    id="chbxDisabled" label="Si" selected="#{modulos$admin$usuarios.usuario.disabled}" tabIndex="5"
                                    disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_USUARIOS_CHKBX_DESACTIVADO']}"/>
                            </h:panelGrid>
                            <ui:panelLayout binding="#{modulos$admin$usuarios.pnlBotones}" id="pnlBotones" panelLayout="flow" style="height: 22px; text-align: center; width: 100%">
                                <ui:button action="#{modulos$admin$usuarios.btnNuevo_action}" binding="#{modulos$admin$usuarios.btnNuevo}" id="btnNuevo"
                                    tabIndex="6" text="Nuevo"/>
                                <ui:button action="#{modulos$admin$usuarios.btnEditar_action}" binding="#{modulos$admin$usuarios.btnEditar}"
                                    disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_USUARIOS_BUTTON_EDITAR']}" id="btnEditar" style="" tabIndex="7" text="Editar"/>
                                <ui:button action="#{modulos$admin$usuarios.btnAgregar_action}" binding="#{modulos$admin$usuarios.btnAgregar}"
                                    disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_USUARIOS_BUTTON_AGREGAR']}" id="btnAgregar" style=""
                                    tabIndex="8" text="#{ (empty AdminSessionBean.usuarioEnEdicion.id_usuario) ? msgs.buttonAgregarLabel : msgs.buttonGuardarLabel}"/>
                                <ui:button action="#{modulos$admin$usuarios.btnBorrar_action}" binding="#{modulos$admin$usuarios.btnBorrar}"
                                    disabled="#{not UserInfoSessionBean.permiso['ADMIN_SUBMODULO_USUARIOS_BUTTON_BORRAR']}" id="btnBorrar"
                                    onClick="if (confirmDeleteSelectedRows() == false) return false" style="" tabIndex="9" text="Borrar"/>
                            </ui:panelLayout>
                            <ui:table augmentTitle="false" binding="#{modulos$admin$usuarios.tblElementos}" clearSortButton="true" id="tblElementos"
                                paginateButton="true" paginationControls="true" sortPanelToggleButton="true" tabIndex="10" width="527">
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
                                <ui:tableRowGroup binding="#{modulos$admin$usuarios.tableRowGroup1}" id="tableRowGroup1" rows="5"
                                    selected="#{modulos$admin$usuarios.selectedState}" sourceData="#{modulos$admin$usuarios.tablaUsuarioDataProvider}" sourceVar="currentRow">
                                    <ui:tableColumn binding="#{modulos$admin$usuarios.tableColumn1}" id="tableColumn1" onClick="setTimeout('initAllRows()', 0)"
                                        selectId="radioButton1" width="428">
                                        <ui:radioButton binding="#{modulos$admin$usuarios.radioButton1}" id="radioButton1" label="" name="asdas"
                                            selected="#{modulos$admin$usuarios.selected}" selectedValue="#{modulos$admin$usuarios.selectedValue}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$usuarios.tableColumn2}" headerText="Login" id="tableColumn2" sort="login">
                                        <ui:staticText binding="#{modulos$admin$usuarios.staticText1}" id="staticText1" text="#{currentRow.value['login']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$admin$usuarios.tableColumn3}" headerText="Persona" id="tableColumn3" sort="persona" width="171">
                                        <ui:staticText binding="#{modulos$admin$usuarios.staticText2}" id="staticText2" text="#{currentRow.value['persona']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn align="center" binding="#{modulos$admin$usuarios.tableColumn4}" headerText="Desactivado" id="tableColumn4"
                                        sort="disabled" width="236">
                                        <ui:checkbox binding="#{modulos$admin$usuarios.checkbox1}" disabled="true" id="checkbox1" selected="#{currentRow.value['disabled']}"/>
                                    </ui:tableColumn>
                                </ui:tableRowGroup>
                            </ui:table>
                        </h:panelGrid>
                        <c:if test="${not UserInfoSessionBean.permiso['ADMIN_USUARIOS']}">
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
