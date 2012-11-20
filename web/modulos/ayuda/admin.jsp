<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=ISO-8859-1" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{modulos$ayuda$admin.page1}" id="page1">
            <ui:html binding="#{modulos$ayuda$admin.html1}" id="html1">
                <ui:head binding="#{modulos$ayuda$admin.head1}" id="head1">
                    <ui:link binding="#{modulos$ayuda$admin.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <ui:link binding="#{modulos$ayuda$admin.link2}" id="link2" url="/resources/menu-nal.css"/>
                </ui:head>
                <ui:body binding="#{modulos$ayuda$admin.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{modulos$ayuda$admin.form1}" id="form1">
                        <div>
                            <jsp:directive.include file="../../menu.jspf"/>
                        </div>
                        <table border="0">
                            <tr>
                                <td height="26" valign="middle" width="600">
                                    <span class="TituloAyuda">Creaci&amp;oacute;n de usuarios </span>
                                </td>
                            </tr>
                            <tr>
                                <td width="600">
                                    <p class="textoAyuda">Para la  creaci&amp;oacute;n de usuarios se requiere la siguiente informaci&amp;oacute;n:</p>
                                    <ol>
                                        <li class="textoAyuda">El  nombre de la cuenta para el ingreso a la aplicaci&amp;oacute;n.</li>
                                        <li class="textoAyuda">La  persona asociada a dicha cuenta. Una persona puede tener asociadas m&amp;uacute;ltiples  cuentas.</li>
                                        <li class="textoAyuda">La  contrase&amp;ntilde;a. La &amp;uacute;nica restricci&amp;oacute;n para la contrase&amp;ntilde;a es que sea de al menos 6 caracteres. </li>
                                    </ol>
                                    <p class="textoAyuda">Adicionalmente,  el administrador del sistema puede desactivar una cuenta seleccionando la  casilla de selecci&amp;oacute;n &amp;ldquo;Desactivado&amp;rdquo; en el momento de crear o actualizar un  usuario</p>
                                </td>
                            </tr>
                            <tr>
                                <td height="26" valign="middle" width="600">
                                    <span class="TituloAyuda">
                                        <strong>Asignaci&amp;oacute;n de permisos</strong>
                                    </span>
                                </td>
                            </tr>
                            <tr>
                                <td width="600">
                                    <div align="justify">
                                        <p class="textoAyuda">El sistema  maneja la seguridad por medio de asignaci&amp;oacute;n de permisos a roles definidos para  la aplicaci&amp;oacute;n. Los pasos para asignar permisos en la aplicaci&amp;oacute;n son los  siguientes:</p>
                                        <ol start="1" type="1">
                                            <li class="textoAyuda">Crear el rol (si no existe).       Ver m&amp;oacute;dulo Roles.</li>
                                            <li class="textoAyuda">Crear el usuario (si no       existe). Ver m&amp;oacute;dulo Usuarios.</li>
                                            <li class="textoAyuda">Asignarle el rol al usuario.       Ver m&amp;oacute;dulo Perfiles.</li>
                                            <li class="textoAyuda">Asignarle permisos a un rol.       Esto incluye, seleccionar el objeto al cual se le dar&amp;aacute;n permisos y el tipo       de permiso. Ver m&amp;oacute;dulo Permisos.</li>
                                        </ol>
                                        <p class="textoAyuda">Una vez  asignados los permisos, para poder ver los cambios, es necesario que los  usuarios pertenecientes a dicho rol cierren su sesi&amp;oacute;n si ya hab&amp;iacute;an ingresado al  sistema.</p>
                                        <span class="textoAyuda">Para proteger otros elementos de las pantallas  adicionales a los definidos actualmente, por favor contacte el administrador  del sistema.</span>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td height="26" valign="middle" width="600">
                                    <span class="TituloAyuda">
                                        <strong>Par&amp;aacute;metros de referencia</strong>
                                    </span>
                                </td>
                            </tr>
                            <tr>
                                <td width="600">
                                    <div align="justify">
                                        <p class="textoAyuda">Se pueden  a&amp;ntilde;adir o modificar los elementos de las listas desplegables en las distintas  pantallas del sistema. Dichos elementos se encuentran definidos en la pantalla  de &amp;ldquo;Tablas&amp;rdquo; dentro del m&amp;oacute;dulo de administraci&amp;oacute;n. All&amp;iacute;, es necesario seleccionar  el tipo de referencia (ej. tipo de documento, tipo de persona, etc.), y  proceder a modificar, a&amp;ntilde;adir o borrar elementos al tipo de referencia  existente. </p>
                                    </div>
                                </td>
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
