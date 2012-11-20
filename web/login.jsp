<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{login.page1}" id="page1">
            <ui:html binding="#{login.html1}" id="html1">
                <ui:head binding="#{login.head1}" id="head1" title="">
                    <ui:link binding="#{login.link1}" id="link1" url="/resources/menu-nal.css"/>
                </ui:head>
                <ui:body binding="#{login.body1}" focus="form1:txtfldUsuario" id="body1" style="background-color: rgb(255, 255, 255); -rave-layout: grid" styleClass="loginpage-background">
                    <ui:form binding="#{login.form1}" id="form1" virtualFormsConfig="login | pnlPrincipal:gridPanel3:txtfldUsuario pnlPrincipal:gridPanel3:txtfldContrasena | pnlPrincipal:layoutPanel2:btnLogin1">
                        <div style="">
                            <jsp:directive.include file="header.jspf"/>
                        </div>
                        <h:panelGrid binding="#{login.pnlPrincipal}" id="pnlPrincipal" style="height: 24px; text-align: center" width="311">
                            <h:panelGrid binding="#{login.gridPanel3}" cellspacing="10" columns="2" id="gridPanel3">
                                <ui:label binding="#{login.label1}" for="txtfldUsuario" id="label1" requiredIndicator="true"
                                    style="height: 26px; text-align: left; width: 91px" styleClass="Titulo1" text="Usuario"/>
                                <ui:textField binding="#{login.txtfldUsuario}" id="txtfldUsuario" required="true" style="width: 155px"/>
                                <ui:label binding="#{login.label2}" for="txtfldContrasena" id="label2" requiredIndicator="true"
                                    style="text-align: left; width: 118px" styleClass="Titulo1" text="Contraseña"/>
                                <ui:passwordField binding="#{login.txtfldContrasena}" id="txtfldContrasena" required="true" style="width: 155px"/>
                            </h:panelGrid>
                            <ui:panelLayout binding="#{login.layoutPanel2}" id="layoutPanel2" style="text-align: center; width: 311px; -rave-layout: grid">
                                <ui:button action="#{login.login_btn_action}" binding="#{login.btnLogin1}" id="btnLogin1" style="width: 113px"
                                    styleClass="LblLev2Txt" text="Ingresar"/>
                                <ui:messageGroup binding="#{login.messageGroup1}" id="messageGroup1" showGlobalOnly="true" style="height: 72px; text-align: center; width: 311px"/>
                            </ui:panelLayout>
                        </h:panelGrid>
                        <div style="">
                            <jsp:directive.include file="footer.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
