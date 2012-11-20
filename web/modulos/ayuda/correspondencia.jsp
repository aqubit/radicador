<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=ISO-8859-1" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{modulos$ayuda$correspondencia.page1}" id="page1">
            <ui:html binding="#{modulos$ayuda$correspondencia.html1}" id="html1">
                <ui:head binding="#{modulos$ayuda$correspondencia.head1}" id="head1">
                    <ui:link binding="#{modulos$ayuda$correspondencia.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <ui:link binding="#{modulos$ayuda$correspondencia.link2}" id="link2" url="/resources/menu-nal.css"/>
                </ui:head>
                <ui:body binding="#{modulos$ayuda$correspondencia.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{modulos$ayuda$correspondencia.form1}" id="form1">
                        <div>
                            <jsp:directive.include file="../../menu.jspf"/>
                        </div>
                        <table border="0">
                          <tr>
                            <td width="600" height="26" valign="middle"><span class="TituloAyuda">Clasificaci&amp;oacute;n </span></td>
                          </tr>
                          <tr>
                            <td width="600"><p class="textoAyuda">Para  registrar la correspondencia manejada por el convenio, el sistema clasifica la  correspondencia dependiendo de las siguientes caracter&amp;iacute;sticas:</p>
                              <ul type="square">
                                <li class="textoAyuda">Clase = {Entrada, Salida}. La       correspondencia recibida por el convenio se considera de entrada y la       enviada por el convenio como de salida.</li>
                                <li class="textoAyuda">Car&amp;aacute;cter = {Interno, Externo}.       La correspondencia enviada a el INVIAS o recibida del INVIAS, es       considerada externa. Otra correspondencia que tenga como destinatario o       remitente una persona distinta al INVIAS se considera de car&amp;aacute;cter interno.</li>
                                <li class="textoAyuda">Tipo. Hace referencia al       contenido de la correspondencia. Los posibles valores de esta lista       desplegable se encuentran definidos. Ver m&amp;oacute;dulo Tablas</li>
                            </ul>    </td>
                          </tr>
                          <tr>
                            <td width="600" height="26" valign="middle"><span class="TituloAyuda"><strong>Estados</strong></span></td>
                          </tr>
                          <tr>
                            <td width="600"><div align="justify">
                              <p class="textoAyuda">Cada  correspondencia registrada en el sistema deber&amp;iacute;a pasar por ciertos estados dependiendo  de su clasificaci&amp;oacute;n. </p>
                              <p class="textoAyuda">Para la  correspondencia de entrada tenemos los siguientes estados:</p>
                              <ol start="1" type="1">
                                <li class="textoAyuda">Recibida</li>
                                <li class="textoAyuda">En revisi&amp;oacute;n</li>
                                <li class="textoAyuda">Revisada</li>
                                <li class="textoAyuda">Asignada</li>
                                <li class="textoAyuda">Contestada</li>
                              </ol>
                              <p class="textoAyuda">Para la  correspondencia de salida tenemos los siguientes estados:</p>
                              <ol start="1" type="1">
                                <li class="textoAyuda">Registrada</li>
                                <li class="textoAyuda">Revisi&amp;oacute;n t&amp;eacute;cnica</li>
                                <li class="textoAyuda">Revisi&amp;oacute;n jur&amp;iacute;dica</li>
                                <li class="textoAyuda">Revisi&amp;oacute;n administrativa</li>
                                <li class="textoAyuda">Enviada</li>
                                <li class="textoAyuda">Entregada</li>
                              </ol>
                              <p class="textoAyuda">Una vez la  correspondencia llega a su estado final, el sistema deshabilita futuras  actualizaciones a la correspondencia. Solamente los usuarios con el rol  &amp;ldquo;Administrador del SIPOL&amp;rdquo; pueden realizar cambios una vez la correspondencia  esta en su estado final.<br />
                          De manera  similar, si una correspondencia de salida llega a su estado final, el sistema  actualiza autom&amp;aacute;ticamente el estado de la correspondencia padre, indicando que  ya se respondi&amp;oacute; a dicha correspondencia</p>
                              </div></td>
                          </tr>
                          <tr>
                            <td width="600" height="26" valign="middle"><span class="TituloAyuda"><strong>Alertas</strong></span></td>
                          </tr>
                          <tr>
                            <td width="600"><div align="justify">
                              <p class="textoAyuda">Para las  correspondencias a las cuales se defina una fecha de vencimiento para su  tramite, el sistema enviar&amp;aacute; autom&amp;aacute;ticamente un correo recordatorio a todos los  miembros del grupo responsable de la correspondencia. Este correo es enviado  tres d&amp;iacute;as antes, el d&amp;iacute;a mismo de vencimiento, y mientras la correspondencia no  llegue a su estado final.</p>
                            </div></td>
                          </tr>
                        </table>
                        <table border="0">
                          <tr>
                            <td width="600" height="26" valign="middle"><span class="TituloAyuda"><strong>Hilos de conversaci&amp;oacute;n</strong></span></td>
                          </tr>
                          <tr>
                            <td width="600"><div align="justify">
                              <p class="textoAyuda">Para llevar un  seguimiento apropiado de la correspondencia del convenio, el sistema permite  asociar una correspondencia a otra. De esta forma se puede observar en un orden  cronol&amp;oacute;gico el conjunto de correspondencias asociadas entre si. Dicho hilo de  la conversaci&amp;oacute;n es desplegado en la informaci&amp;oacute;n detallada de la correspondencia,  en donde se puede acceder directamente a la informaci&amp;oacute;n de sus correspondencias  asociadas haciendo clic en cualquiera de los hiperv&amp;iacute;nculos ubicados en la parte  inferior.</p>
                            </div></td>
                          </tr>
                        </table>                        
                        <div>
                            <jsp:directive.include file="../../footer.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
