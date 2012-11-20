<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html"
    xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=ISO-8859-1" pageEncoding="UTF-8"/>
    <f:view>
        <f:loadBundle basename="sip.guiMessages" var="msgs"/>
        <ui:page binding="#{main.page1}" id="page1">
            <ui:html binding="#{main.html1}" id="html1">
                <ui:head binding="#{main.head1}" id="head1">
                    <ui:link binding="#{main.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <ui:link binding="#{main.link2}" id="link2" url="/resources/menu-nal.css"/>
                </ui:head>
                <ui:body binding="#{main.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{main.form1}" id="form1">
                        <div>
                            <jsp:directive.include file="menu.jspf"/>
                        </div>
                        <h:panelGrid binding="#{main.pnlDescripcion}" columns="1" id="pnlDescripcion" style="height: 133px">
                            <ui:textArea binding="#{main.textArea1}" id="textArea1" readOnly="true" styleClass="lblTitulo" text="#{msgs['sip.mensaje.bienvenida']}"/>
                        </h:panelGrid>
                        <div>
                            <jsp:directive.include file="footer.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
