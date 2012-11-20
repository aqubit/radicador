<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{modulos$auditoria$logList.page1}" id="page1">
            <ui:html binding="#{modulos$auditoria$logList.html1}" id="html1">
                <ui:head binding="#{modulos$auditoria$logList.head1}" id="head1">
                    <ui:link binding="#{modulos$auditoria$logList.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{modulos$auditoria$logList.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{modulos$auditoria$logList.form1}" id="form1">
                        <ui:label binding="#{modulos$auditoria$logList.label1}" id="label1" style="" text="Resultados de de busqueda de Log"/>
                        <h1/>                      
 <ui:table augmentTitle="false" binding="#{modulos$auditoria$logList.table1}" id="table1" paginateButton="true" paginationControls="true"
                            style="" title="Log" width="90%">
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
                            <ui:tableRowGroup binding="#{modulos$auditoria$logList.tableRowGroup1}" id="tableRowGroup1" rows="#{AdminSessionBean.maxRows}"
                                sourceData="#{modulos$auditoria$logList.logVoArrayDataProvider}" sourceVar="currentRow">
                                <ui:tableColumn binding="#{modulos$auditoria$logList.tableColumn1}" headerText="Fecha" id="tableColumn1" sort="fecha">
                                    <ui:staticText binding="#{modulos$auditoria$logList.staticText1}"
                                        converter="#{modulos$auditoria$logList.dateTimeConverter1}" id="staticText1" text="#{currentRow.value['fecha']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{modulos$auditoria$logList.tableColumn2}" headerText="Usuario" id="tableColumn2" sort="id_usuario">
                                    <ui:staticText binding="#{modulos$auditoria$logList.staticText2}" id="staticText2" text="#{currentRow.value['usuarioStrm']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{modulos$auditoria$logList.tableColumn3}" headerText="Operacion" id="tableColumn3" sort="operacion">
                                    <ui:staticText binding="#{modulos$auditoria$logList.staticText3}" id="staticText3" text="#{currentRow.value['operacion']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{modulos$auditoria$logList.tableColumn4}" headerText="Entidad" id="tableColumn4" sort="nombre_tabla">
                                    <ui:staticText binding="#{modulos$auditoria$logList.staticText4}" id="staticText4" text="#{currentRow.value['nombre_tabla']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{modulos$auditoria$logList.tableColumn5}" headerText="Registro" id="tableColumn5" sort="id_registro">
                                    <ui:staticText binding="#{modulos$auditoria$logList.staticText5}" id="staticText5" text="#{currentRow.value['id_registro']}"/>
                                </ui:tableColumn>
                            </ui:tableRowGroup>
                        </ui:table>
                        <table align="left" width="90%">
                            <tr>
                                <td align="right">
                                    <ui:button action="#{modulos$auditoria$logList.btnAtras_action}" binding="#{modulos$auditoria$logList.btnAtras}"
                                        id="btnAtras" style="background-position: right" text="Atras"/>
                                </td>
                            </tr>
                        </table>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
