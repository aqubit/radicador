<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <f:loadBundle basename="sip.guiMessages" var="msgs"/>
        <ui:page binding="#{modulos$auditoria$logConsultaForm.page1}" id="page1">
            <ui:html binding="#{modulos$auditoria$logConsultaForm.html1}" id="html1">
                <ui:head binding="#{modulos$auditoria$logConsultaForm.head1}" id="head1">
                    <ui:link binding="#{modulos$auditoria$logConsultaForm.link1}" id="link1" url="/resources/menu-nal.css"/>
                    <ui:link binding="#{modulos$auditoria$logConsultaForm.link2}" id="link2" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{modulos$auditoria$logConsultaForm.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{modulos$auditoria$logConsultaForm.form1}" id="form1">
                        <ui:label binding="#{modulos$auditoria$logConsultaForm.label1}" id="label1" styleClass="title" text="Consulta de modificaciones en entidades"/>
                        <h1></h1>
                        <table align="center" border="1" bordercolor="#CCCCCC" cellpadding="1" cellspacing="0" width="90%">
                            <tr>
                                <td class="labelForm" width="30%">
                                    <ui:label binding="#{modulos$auditoria$logConsultaForm.label2}" id="label2" text="Usuario"/>
                                </td>
                                <td class="inputForm">
                                    <h:selectOneMenu binding="#{modulos$auditoria$logConsultaForm.ddUsuario}"
                                        converter="#{modulos$auditoria$logConsultaForm.integerConverter1}" id="ddUsuario">
                                        <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                        <f:selectItems binding="#{modulos$auditoria$logConsultaForm.dropdown1SelectItems}" id="dropdown1SelectItems" value="#{modulos$auditoria$logConsultaForm.ddUsuarioDefaultItems}"/>
                                    </h:selectOneMenu>
                                </td>
                            </tr>
                            <tr>
                                <td class="labelForm">
                                    <ui:label binding="#{modulos$auditoria$logConsultaForm.label3}" id="label3" text="Operacion"/>
                                </td>
                                <td class="inputForm">
                                    <h:selectOneMenu binding="#{modulos$auditoria$logConsultaForm.ddOperacion}" id="ddOperacion">
                                        <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                        <f:selectItems binding="#{modulos$auditoria$logConsultaForm.dropdown2SelectItems}" id="dropdown2SelectItems" value="#{modulos$auditoria$logConsultaForm.ddOperacionDefaultItems}"/>
                                    </h:selectOneMenu>
                                </td>
                            </tr>
                            <tr>
                                <td class="labelForm">
                                    <ui:label binding="#{modulos$auditoria$logConsultaForm.label6}" id="label6" text="Entidad"/>
                                </td>
                                <td class="inputForm">
                                    <h:selectOneMenu binding="#{modulos$auditoria$logConsultaForm.ddEntidad}" id="ddEntidad">
                                        <f:selectItem itemLabel="#{msgs.mensajeSeleccionar}" itemValue=""/>
                                        <f:selectItems binding="#{modulos$auditoria$logConsultaForm.dropdown3SelectItems}" id="dropdown3SelectItems" value="#{modulos$auditoria$logConsultaForm.ddEntidadDefaultItems}"/>
                                    </h:selectOneMenu>
                                </td>
                            </tr>
                            <tr>
                                <td class="labelForm">
                                    <ui:label binding="#{modulos$auditoria$logConsultaForm.label7}" id="label7" text="Fecha inicial"/>
                                </td>
                                <td class="inputForm">
                                    <ui:calendar binding="#{modulos$auditoria$logConsultaForm.calendarInicial}" id="calendarInicial"
                                        maxDate="#{modulos$auditoria$logConsultaForm.maxDate}" minDate="#{modulos$auditoria$logConsultaForm.minDate}"/>
                                </td>
                            </tr>
                            <tr>
                                <td class="labelForm">
                                    <ui:label binding="#{modulos$auditoria$logConsultaForm.label4}" id="label4" text="Fecha Final"/>
                                </td>
                                <td class="inputForm">
                                    <ui:calendar binding="#{modulos$auditoria$logConsultaForm.calendarFin}" id="calendarFin"
                                        maxDate="#{modulos$correspondencia$consultar.maxDate}" minDate="#{modulos$auditoria$logConsultaForm.minDate}"/>
                                </td>
                            </tr>
                        </table>
                        <table align="center" width="90%">
                            <tr>
                                <td align="right" style="height: 24px">
                                    <ui:button action="#{modulos$auditoria$logConsultaForm.btnConsulta_action}"
                                        binding="#{modulos$auditoria$logConsultaForm.btnConsulta}" id="btnConsulta" text="Consultar"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="center" style="height: 24px">
                                    <ui:messageGroup binding="#{modulos$auditoria$logConsultaForm.messageGroup1}" id="messageGroup1" showGlobalOnly="true"/>
                                </td>
                            </tr>
                        </table>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
