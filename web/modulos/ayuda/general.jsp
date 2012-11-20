<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=ISO-8859-1" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{modulos$ayuda$general.page1}" id="page1">
            <ui:html binding="#{modulos$ayuda$general.html1}" id="html1">
                <ui:head binding="#{modulos$ayuda$general.head1}" id="head1">
                    <ui:link binding="#{modulos$ayuda$general.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <ui:link binding="#{modulos$ayuda$general.link2}" id="link2" url="/resources/menu-nal.css"/>
                </ui:head>
                <ui:body binding="#{modulos$ayuda$general.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{modulos$ayuda$general.form1}" id="form1">
                        <div style="">
                            <jsp:directive.include file="../../menu.jspf"/>
                        </div>
                        <f:verbatim>
                            <table border="0">
                                <tr>
                                    <td height="26" valign="middle" width="600">
                                        <span class="TituloAyuda">Navegaci&amp;oacute;n</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td width="600">
                                        <p 
                                                class="textoAyuda">La  navegaci&amp;oacute;n a trav&amp;eacute;s de los diferentes m&amp;oacute;dulos se realiza por medio de las <a
                                                href="/Sip/images/navegacion.jpg" target="_blank">pesta&amp;ntilde;as</a> ubicadas en la parte superior de la aplicaci&amp;oacute;n. Es importante que el usuario  guarde los cambios efectuados en cualquier pantalla antes de cambiar a otro  m&amp;oacute;dulo, de lo contrario los cambios son perdidos.</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td height="26" valign="middle" width="600">
                                        <span class="TituloAyuda">Campos  requeridos</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="height: 64px" width="600">
                                        <div 
                                                class="textoAyuda">En las  pantallas para registro o actualizaci&amp;oacute;n de informaci&amp;oacute;n, el s&amp;iacute;mbolo <img
                                                alt="none" height="18" src="/Sip/images/star.jpg"
                                                width="18"/> indicar&amp;aacute;  que el campo es requerido para poder guardar la informaci&amp;oacute;n de la pantalla. En  caso de que el usuario no ingrese dicha informaci&amp;oacute;n, el sistema indicar&amp;aacute; por  medio del s&amp;iacute;mbolo <img
                                                alt="none" height="23" src="/Sip/images/obligatorios3.jpg" width="30"/> los campos faltantes. <a
                                                href="/Sip/images/obligatorios2.jpg" target="_blank">Ver ejemplo</a>. </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td height="26" valign="middle" width="600">
                                        <span class="TituloAyuda">Seguridad</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td width="600">
                                        <div  class="textoAyuda"
                                                style="null">El sistema  maneja la seguridad por medio de asignaci&amp;oacute;n de permisos a ciertos roles  definidos para la aplicaci&amp;oacute;n. Cualquier intento de acceso a un m&amp;oacute;dulo para el  cual el usuario no dispone de los privilegios requeridos, ser&amp;aacute; prohibido e <a
                                                href="/Sip/images/noautorizado.jpg" target="_blank">indicado</a> por el sistema.</div>
                                    </td>
                                </tr>
                                <tr>
                                    <td height="26" valign="middle" width="600">
                                        <span class="TituloAyuda">Cierre de  la  aplicaci&amp;oacute;n</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td width="600">
                                        <div  class="textoAyuda">Para salir  de la aplicaci&amp;oacute;n, el usuario dispone de un <a
                                                href="/Sip/images/cerrarsesion.jpg" target="_blank">hiperv&amp;iacute;nculo</a> en la parte superior  derecha. Si el sistema detecta que el usuario no ha utilizado la aplicaci&amp;oacute;n por  un tiempo superior a 30 minutos, el sistema cerrar&amp;aacute; autom&amp;aacute;ticamente la sesi&amp;oacute;n  del usuario.<br/>
                            De igual  forma, si el usuario cierra la ventana del explorador sin haber cerrado su  sesi&amp;oacute;n por medio del hiperv&amp;iacute;nculo, el sistema cerrar&amp;aacute; autom&amp;aacute;ticamente la sesi&amp;oacute;n  del usuario.</div>
                                    </td>
                                </tr>
                            </table>
                        </f:verbatim>
                        <div>
                            <jsp:directive.include file="../../footer.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
