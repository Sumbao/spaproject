$(document).ready(function(){
    loadmassagetable();
});

function loadmassagetable(){
    var massagedata = AjaxUtil.get({
        url:session.context+"/massages/findMassagebyTypeId/"+9999
    });
    $("#tableProductbody").empty();
    $.each(massagedata,function(index,item){
        $("#massagetable").append('' +
            '<tr>' +
            '<td>' +
            '<center>' +
            item.massageName +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.massageTime +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.massageprice +" บาท"+
            '</center>' +
            '</td>' +
            '</tr>')
    });
    $("#massagetable").DataTable({
        "paging":   false,
        "info":     false
    });
}