$(document).ready(function(){
    loadbeautytable();
});

function loadbeautytable(){
    var beautydata = AjaxUtil.get({
        url:session.context+"/massages/findMassagebyTypeId/"+9998
    });
    $("#beautybodytable").empty();
    $.each(beautydata,function(index,item){
        $("#beautytable").append('' +
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
    $("#beautytable").DataTable({
        "paging":   false,
        "info":     false
    });
}