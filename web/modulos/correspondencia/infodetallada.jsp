<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html"
    xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=ISO-8859-1" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{modulos$correspondencia$infodetallada.page1}" id="page1">
            <ui:html binding="#{modulos$correspondencia$infodetallada.html1}" id="html1">
                <ui:head binding="#{modulos$correspondencia$infodetallada.head1}" id="head1">
                    <ui:link binding="#{modulos$correspondencia$infodetallada.link1}" id="link1" url="/resources/menu-nal.css"/>
                </ui:head>
                <ui:body binding="#{modulos$correspondencia$infodetallada.body1}" id="body1" style="-rave-layout: grid">
                    <ui:script id="script1" url="/script/sipol.js"/>
                    <ui:form binding="#{modulos$correspondencia$infodetallada.form1}" id="form1" virtualFormsConfig="">
                        <div>
                            <jsp:directive.include file="../../menu.jspf"/>
                        </div>
                        <h:panelGrid binding="#{modulos$correspondencia$infodetallada.pnlPrincipal}" id="pnlPrincipal"
                            rendered="#{UserInfoSessionBean.permiso['CORRESPONDENCIA_VER']}" style="" width="648">
                            <h:panelGrid binding="#{modulos$correspondencia$infodetallada.pnlControles}"
                                columnClasses="TablaSipPrimeraColumna, TablaSipRestoColumnas" columns="2" id="pnlControles" width="527">
                                <ui:label binding="#{modulos$correspondencia$infodetallada.label1}" id="label1" styleClass="labelForm" text="ID"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.lblId}" id="lblId" text="#{CorrespondenciaSessionBean.correspondenciaActual.id_correspondencia}"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.label20}" id="label20" styleClass="labelForm" text="Consecutivo"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.lblConsecutivo}" id="lblConsecutivo" text="#{CorrespondenciaSessionBean.correspondenciaActual.consecutivo}"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.label6}" id="label6" styleClass="labelForm" text="Clase"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.lblClase}" id="lblClase" text="#{CorrespondenciaSessionBean.correspondenciaActual.clase}"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.label7}" id="label7" styleClass="labelForm" text="Carácter"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.lblCaracter}" id="lblCaracter" text="#{CorrespondenciaSessionBean.correspondenciaActual.caracter}"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.label15}" id="label15" styleClass="labelForm" text="Tipo"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.lblTipo}" id="lblTipo" text="#{CorrespondenciaSessionBean.correspondenciaActual.idref_tipo}"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.label2}" id="label2" styleClass="labelForm" text="Remitente"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.lblRemitente}" id="lblRemitente" text="#{CorrespondenciaSessionBean.correspondenciaActual.idper_remitente}"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.label3}" id="label3" styleClass="labelForm" text="Destinatario"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.lblDestinatario}" id="lblDestinatario" text="#{CorrespondenciaSessionBean.correspondenciaActual.idper_destinatario}"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.label4}" for="drpEstado" id="label4" styleClass="labelForm" text="Estado"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.lblEstado}" id="lblEstado" text="#{CorrespondenciaSessionBean.correspondenciaActual.idref_estadoactual}"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.label9}" for="txaObs" id="label9" styleClass="labelForm" text="Asunto"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.lblAsunto}" id="lblAsunto" text="#{CorrespondenciaSessionBean.correspondenciaActual.asunto}"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.label10}" id="label10" styleClass="labelForm" text="Fecha de registro"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.lblFecEntrega}"
                                    converter="#{modulos$correspondencia$infodetallada.sqlTimestampConverter1}" id="lblFecEntrega" text="#{CorrespondenciaSessionBean.correspondenciaActual.fecha_entrega}"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.label5}" id="label5" styleClass="labelForm" text="Documento"/>
                                <ui:hyperlink binding="#{modulos$correspondencia$infodetallada.downloadLink1}" id="downloadLink1" onClick="submit();"
                                    text="#{CorrespondenciaSessionBean.documentoCorrespondenciaActual.nombre_documento}" url="download.jsp"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.label11}" id="label11" styleClass="labelForm" text="Número de radicación UN"/>
                                <ui:panelLayout binding="#{modulos$correspondencia$infodetallada.layoutPanel3}" id="layoutPanel3" panelLayout="flow" style="">
                                    <ui:label binding="#{modulos$correspondencia$infodetallada.lblNroRadicacion}" id="lblNroRadicacion" text="#{CorrespondenciaSessionBean.correspondenciaActual.nro_radicacion}"/>
                                    <ui:label binding="#{modulos$correspondencia$infodetallada.label8}" id="label8" styleClass="labelForm" text=" Fecha"/>
                                    <ui:label binding="#{modulos$correspondencia$infodetallada.lblFechaRadicacion}" id="lblFechaRadicacion" text="#{CorrespondenciaSessionBean.correspondenciaActual.fecha_radicacion}"/>
                                </ui:panelLayout>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.label17}" id="label17" styleClass="labelForm" text="Número de radicación INVIAS"/>
                                <ui:panelLayout binding="#{modulos$correspondencia$infodetallada.layoutPanel4}" id="layoutPanel4" panelLayout="flow">
                                    <ui:label binding="#{modulos$correspondencia$infodetallada.lblNroRadicacionInvias}" id="lblNroRadicacionInvias" text="#{CorrespondenciaSessionBean.correspondenciaActual.nro_radicacion_invias}"/>
                                    <ui:label binding="#{modulos$correspondencia$infodetallada.lblFechaInvias}" id="lblFechaInvias"
                                        rendered="#{!empty CorrespondenciaSessionBean.correspondenciaActual.fecha_radicacion_invias}" styleClass="labelForm" text=" Fecha"/>
                                    <ui:label binding="#{modulos$correspondencia$infodetallada.lblFechaRadicacionInvias}" id="lblFechaRadicacionInvias" text="#{CorrespondenciaSessionBean.correspondenciaActual.fecha_radicacion_invias}"/>
                                </ui:panelLayout>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.label12}" id="label12" styleClass="labelForm" text="Número de contrato"/>
                                <ui:panelLayout binding="#{modulos$correspondencia$infodetallada.layoutPanel2}" id="layoutPanel2" panelLayout="flow" style="height: 24px; width: 647px">
                                    <ui:label binding="#{modulos$correspondencia$infodetallada.lblNroContrato}" id="lblNroContrato" text="#{CorrespondenciaSessionBean.correspondenciaActual.nro_contrato}"/>
                                    <ui:label binding="#{modulos$correspondencia$infodetallada.label16}" id="label16" styleClass="labelForm" text=" /"/>
                                    <ui:label binding="#{modulos$correspondencia$infodetallada.lblAnoContrato}" id="lblAnoContrato" text="#{CorrespondenciaSessionBean.correspondenciaActual.ano_contrato}"/>
                                    <ui:label binding="#{modulos$correspondencia$infodetallada.label18}" id="label18" styleClass="labelForm"/>
                                    <ui:label binding="#{modulos$correspondencia$infodetallada.lblDependenciaContrato}" id="lblDependenciaContrato" text="#{CorrespondenciaSessionBean.correspondenciaActual.dependencia}"/>
                                </ui:panelLayout>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.label13}" id="label13" styleClass="labelForm" text="Requiere respuesta"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.lblFechaVence}"
                                    converter="#{modulos$correspondencia$infodetallada.dateTimeConverter1}" id="lblFechaVence" text="#{CorrespondenciaSessionBean.correspondenciaActual.fecha_vencimiento}"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.label14}" id="label14" styleClass="labelForm" text="Última modificación"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.lblUltimaModif}"
                                    converter="#{modulos$correspondencia$infodetallada.sqlTimestampConverter2}" id="lblUltimaModif" text="#{CorrespondenciaSessionBean.correspondenciaActual.ultima_modificacion}"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.label19}" for="ddRol" id="label19" styleClass="labelForm" text="Grupo propietario de la correspondencia"/>
                                <ui:label binding="#{modulos$correspondencia$infodetallada.lblGrupoPropietario}" id="lblGrupoPropietario"/>
                            </h:panelGrid>
                            <ui:table augmentTitle="false" binding="#{modulos$correspondencia$infodetallada.table1}" clearSortButton="true" id="table1"
                                title="Estados" width="80%">
                                <script><![CDATA[
/* ----- Functions for Table Preferences Panel ----- */
/*
 * Toggle the table preferences panel open or closed
 */
function togglePreferencesPanel() {
  var table = document.getElementById("form1:table1");
  table.toggleTblePreferencesPanel();
}
/* ----- Functions for Filter Panel ----- */
/*
 * Return true if the filter menu has actually changed,
 * so the corresponding event should be allowed to continue.
 */
function filterMenuChanged() {
  var table = document.getElementById("form1:table1");
  return table.filterMenuChanged();
}
/*
 * Toggle the custom filter panel (if any) open or closed.
 */
function toggleFilterPanel() {
  var table = document.getElementById("form1:table1");
  return table.toggleTableFilterPanel();
}
/* ----- Functions for Table Actions ----- */
/*
 * Initialize all rows of the table when the state
 * of selected rows changes.
 */
function initAllRows() {
  var table = document.getElementById("form1:table1");
  table.initAllRows();
}
/*
 * Set the selected state for the given row groups
 * displayed in the table.  This functionality requires
 * the 'selectId' of the tableColumn to be set.
 *
 * @param rowGroupId HTML element id of the tableRowGroup component
 * @param selected Flag indicating whether components should be selected
 */
function selectGroupRows(rowGroupId, selected) {
  var table = document.getElementById("form1:table1");
  table.selectGroupRows(rowGroupId, selected);
}
/*
 * Disable all table actions if no rows have been selected.
 */
function disableActions() {
  // Determine whether any rows are currently selected
  var table = document.getElementById("form1:table1");
  var disabled = (table.getAllSelectedRowsCount() > 0) ? false : true;
  // Set disabled state for top actions
  document.getElementById("form1:table1:tableActionsTop:deleteTop").setDisabled(disabled);
  // Set disabled state for bottom actions
  document.getElementById("form1:table1:tableActionsBottom:deleteBottom").setDisabled(disabled);
}]]></script>
                                <ui:tableRowGroup binding="#{modulos$correspondencia$infodetallada.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                    sourceData="#{modulos$correspondencia$infodetallada.objectArrayDataProviderEstados}" sourceVar="currentRow">
                                    <ui:tableColumn binding="#{modulos$correspondencia$infodetallada.tableColumn1}" headerText="Estado" id="tableColumn1" sort="etiqueta">
                                        <ui:staticText binding="#{modulos$correspondencia$infodetallada.staticText1}" id="staticText1" text="#{currentRow.value['etiqueta']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$correspondencia$infodetallada.tableColumn3}" headerText="Modificada por"
                                        id="tableColumn3" sort="persona">
                                        <ui:staticText binding="#{modulos$correspondencia$infodetallada.staticText3}" id="staticText3" text="#{currentRow.value['persona']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$correspondencia$infodetallada.tableColumn2}" headerText="Fecha" id="tableColumn2" sort="fecha">
                                        <ui:staticText binding="#{modulos$correspondencia$infodetallada.staticText2}" id="staticText2" text="#{currentRow.value['fecha']}"/>
                                    </ui:tableColumn>
                                </ui:tableRowGroup>
                            </ui:table>
                            <ui:table augmentTitle="false" binding="#{modulos$correspondencia$infodetallada.table2}" clearSortButton="true" id="table2"
                                title="Hilo de conversación" width="90%">
                                <script><![CDATA[
/* ----- Functions for Table Preferences Panel ----- */
/*
 * Toggle the table preferences panel open or closed
 */
function togglePreferencesPanel() {
  var table = document.getElementById("form1:table2");
  table.toggleTblePreferencesPanel();
}
/* ----- Functions for Filter Panel ----- */
/*
 * Return true if the filter menu has actually changed,
 * so the corresponding event should be allowed to continue.
 */
function filterMenuChanged() {
  var table = document.getElementById("form1:table2");
  return table.filterMenuChanged();
}
/*
 * Toggle the custom filter panel (if any) open or closed.
 */
function toggleFilterPanel() {
  var table = document.getElementById("form1:table2");
  return table.toggleTableFilterPanel();
}
/* ----- Functions for Table Actions ----- */
/*
 * Initialize all rows of the table when the state
 * of selected rows changes.
 */
function initAllRows() {
  var table = document.getElementById("form1:table2");
  table.initAllRows();
}
/*
 * Set the selected state for the given row groups
 * displayed in the table.  This functionality requires
 * the 'selectId' of the tableColumn to be set.
 *
 * @param rowGroupId HTML element id of the tableRowGroup component
 * @param selected Flag indicating whether components should be selected
 */
function selectGroupRows(rowGroupId, selected) {
  var table = document.getElementById("form1:table2");
  table.selectGroupRows(rowGroupId, selected);
}
/*
 * Disable all table actions if no rows have been selected.
 */
function disableActions() {
  // Determine whether any rows are currently selected
  var table = document.getElementById("form1:table2");
  var disabled = (table.getAllSelectedRowsCount() > 0) ? false : true;
  // Set disabled state for top actions
  document.getElementById("form1:table2:tableActionsTop:deleteTop").setDisabled(disabled);
  // Set disabled state for bottom actions
  document.getElementById("form1:table2:tableActionsBottom:deleteBottom").setDisabled(disabled);
}]]></script>
                                <ui:tableRowGroup binding="#{modulos$correspondencia$infodetallada.tableRowGroup2}" id="tableRowGroup2" rows="10"
                                    sourceData="#{modulos$correspondencia$infodetallada.objectArrayDataProviderHilo}" sourceVar="currentRow">
                                    <ui:tableColumn binding="#{modulos$correspondencia$infodetallada.tableColumn10}" headerText="ID" id="tableColumn10">
                                        <ui:hyperlink action="#{modulos$correspondencia$infodetallada.hyperlink1_action}"
                                            binding="#{modulos$correspondencia$infodetallada.hyperlink1}" id="hyperlink1" text="ver #{currentRow.value['id_correspondencia']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$correspondencia$infodetallada.tableColumn7}" headerText="Estado" id="tableColumn7" sort="idref_estadoactual">
                                        <ui:staticText binding="#{modulos$correspondencia$infodetallada.staticText7}" id="staticText7" text="#{currentRow.value['idref_estadoactual']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$correspondencia$infodetallada.tableColumn12}" headerText="Remitente" id="tableColumn12" sort="idper_remitente">
                                        <ui:staticText binding="#{modulos$correspondencia$infodetallada.staticText11}" id="staticText11" text="#{currentRow.value['idper_remitente']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$correspondencia$infodetallada.tableColumn13}" headerText="Destinatario"
                                        id="tableColumn13" sort="idper_destinatario">
                                        <ui:staticText binding="#{modulos$correspondencia$infodetallada.staticText12}" id="staticText12" text="#{currentRow.value['idper_destinatario']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$correspondencia$infodetallada.tableColumn14}" headerText="Recibido" id="tableColumn14" sort="fecha_entrega">
                                        <ui:staticText binding="#{modulos$correspondencia$infodetallada.staticText13}" id="staticText13" text="#{currentRow.value['fecha_entrega']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$correspondencia$infodetallada.tableColumn15}" headerText="Vence" id="tableColumn15" sort="fecha_vencimiento">
                                        <ui:staticText binding="#{modulos$correspondencia$infodetallada.staticText14}" id="staticText14" text="#{currentRow.value['fecha_vencimiento']}"/>
                                    </ui:tableColumn>
                                </ui:tableRowGroup>
                            </ui:table>
                            <ui:panelLayout binding="#{modulos$correspondencia$infodetallada.pnlBotones}" id="pnlBotones" panelLayout="flow" style="text-align: center">
                                <ui:button action="#{modulos$correspondencia$infodetallada.btnActualizar_action}"
                                    binding="#{modulos$correspondencia$infodetallada.btnActualizar}"
                                    disabled="#{(not UserInfoSessionBean.permiso['CORRESPONDENCIA_SUBMODULO_VER_BUTTON_ACTUALIZAR']) or (not CorrespondenciaSessionBean.puedeActualizarCorrespondenciaActual)}" id="btnActualizar"
                                    tabIndex="1" text="Actualizar"/>
                                <ui:button action="#{modulos$correspondencia$infodetallada.btnAceptar_action}"
                                    binding="#{modulos$correspondencia$infodetallada.btnAceptar}"
                                    disabled="#{not UserInfoSessionBean.permiso['CORRESPONDENCIA_SUBMODULO_VER_BUTTON_NUEVA_CONSULTA']}" id="btnAceptar"
                                    tabIndex="2" text="Consultar"/>
                            </ui:panelLayout>
                        </h:panelGrid>
                        <c:if test="${not UserInfoSessionBean.permiso['CORRESPONDENCIA_VER']}">
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
