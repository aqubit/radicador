<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html"
    xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=ISO-8859-1" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{modulos$correspondencia$resbusqueda.page1}" id="page1">
            <ui:html binding="#{modulos$correspondencia$resbusqueda.html1}" id="html1">
                <ui:head binding="#{modulos$correspondencia$resbusqueda.head1}" id="head1">
                    <ui:link binding="#{modulos$correspondencia$resbusqueda.link2}" id="link2" url="/resources/menu-nal.css"/>
                </ui:head>
                <ui:body binding="#{modulos$correspondencia$resbusqueda.body1}" id="body1" style="-rave-layout: grid">
                    <ui:script id="script1" url="/script/sipol.js"/>
                    <ui:form binding="#{modulos$correspondencia$resbusqueda.form1}" id="form1">
                        <div>
                            <jsp:directive.include file="../../menu.jspf"/>
                        </div>
                        <h:panelGrid binding="#{modulos$correspondencia$resbusqueda.pnlPrincipal}" id="pnlPrincipal"
                            rendered="#{UserInfoSessionBean.permiso['CORRESPONDENCIA_RESULTADO_BUSQUEDA']}" style="">
                            <ui:table augmentTitle="false" binding="#{modulos$correspondencia$resbusqueda.table1}" clearSortButton="true" id="table1"
                                paginateButton="true" paginationControls="true" style="text-align: center; width: 1708px" title="Correspondencia" width="1070">
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
                                <ui:tableRowGroup align="center" binding="#{modulos$correspondencia$resbusqueda.tableRowGroup1}"
                                    emptyDataMsg="No existen registros con la seleccion realizada" id="tableRowGroup1" rows="10"
                                    sourceData="#{modulos$correspondencia$resbusqueda.objectArrayDataProvider1}" sourceVar="currentRow">
                                    <ui:tableColumn binding="#{modulos$correspondencia$resbusqueda.tableColumn1}" headerText="ID" id="tableColumn1">
                                        <ui:hyperlink action="#{modulos$correspondencia$resbusqueda.hyperlink1_action}"
                                            binding="#{modulos$correspondencia$resbusqueda.hyperlink1}" id="hyperlink1" text="ver #{currentRow.value['id_correspondencia']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$correspondencia$resbusqueda.tableColumn12}" headerText="Consecutivo" id="tableColumn12" sort="consecutivo">
                                        <ui:staticText binding="#{modulos$correspondencia$resbusqueda.staticText9}" id="staticText9" text="#{currentRow.value['consecutivo']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$correspondencia$resbusqueda.tableColumn2}" headerText="Clase" id="tableColumn2" sort="clase">
                                        <ui:staticText binding="#{modulos$correspondencia$resbusqueda.staticText10}" id="staticText10" text="#{currentRow.value['clase']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$correspondencia$resbusqueda.tableColumn13}" headerText="Carácter" id="tableColumn13" sort="caracter">
                                        <ui:staticText binding="#{modulos$correspondencia$resbusqueda.staticText12}" id="staticText12" text="#{currentRow.value['caracter']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$correspondencia$resbusqueda.tableColumn8}" headerText="Tipo" id="tableColumn8" sort="idref_tipo">
                                        <ui:staticText binding="#{modulos$correspondencia$resbusqueda.staticText11}" id="staticText11" text="#{currentRow.value['idref_tipo']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$correspondencia$resbusqueda.tableColumn9}" headerText="Estado" id="tableColumn9" sort="idref_estadoactual">
                                        <ui:staticText binding="#{modulos$correspondencia$resbusqueda.staticText1}" id="staticText1" text="#{currentRow.value['idref_estadoactual']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$correspondencia$resbusqueda.tableColumn3}" headerText="Remitente" id="tableColumn3" sort="idper_remitente">
                                        <ui:staticText binding="#{modulos$correspondencia$resbusqueda.staticText3}" id="staticText3" text="#{currentRow.value['idper_remitente']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$correspondencia$resbusqueda.tableColumn4}" headerText="Destinatario" id="tableColumn4" sort="idper_destinatario">
                                        <ui:staticText binding="#{modulos$correspondencia$resbusqueda.staticText4}" id="staticText4" text="#{currentRow.value['idper_destinatario']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$correspondencia$resbusqueda.tableColumn14}" headerText="#Radicación UN"
                                        id="tableColumn14" sort="nro_radicacion">
                                        <ui:staticText binding="#{modulos$correspondencia$resbusqueda.staticText13}" id="staticText13" text="#{currentRow.value['nro_radicacion']} #{currentRow.value['fecha_radicacion']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$correspondencia$resbusqueda.tableColumn7}" headerText="Vence" id="tableColumn7" sort="fecha_vencimiento">
                                        <ui:staticText binding="#{modulos$correspondencia$resbusqueda.staticText7}" id="staticText7" text="#{currentRow.value['fecha_vencimiento']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{modulos$correspondencia$resbusqueda.tableColumn5}" headerText="Asunto" id="tableColumn5" sort="asunto">
                                        <ui:staticText binding="#{modulos$correspondencia$resbusqueda.staticText5}" id="staticText5" text="#{currentRow.value['asunto']}"/>
                                    </ui:tableColumn>
                                </ui:tableRowGroup>
                            </ui:table>
                        </h:panelGrid>
                        <c:if test="${not UserInfoSessionBean.permiso['CORRESPONDENCIA_RESULTADO_BUSQUEDA']}">
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
