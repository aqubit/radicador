
function doPopup(destination) {                      
    popup = window.open("", "popup", 
    "resizable=1,width=550,height=600,left = 237,top = 84,toolbar=no,menubar=no,scrollbars=yes");
    destinationElement = document.getElementById(destination);
    popup.focus();
}

function confirmarCambios() {
    var bConfirmar;
    bConfirmar = confirm('Quiere guardar los cambios?');
    return bConfirmar;
}

function confirmarPerderCambios() {
    var bConfirmar;
    bConfirmar = confirm('Va a perder los cambios realizados. Quiere continuar?');
    return bConfirmar;
}


function confirmarCreacion() {
    var bConfirmar;
    bConfirmar = confirm('Quiere guardar los cambios y crear la correspondencia?');
    return bConfirmar;
}

function confirmDeleteSelectedRows() {
    var table = document.getElementById("form1:tblElementos");
    return table.confirmDeleteSelectedRows();
}                            


