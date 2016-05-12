$(document).ready(function () {
    loadallinformation();
});

function loadallinformation() {
    var infordata = AjaxUtil.get({
        url: session.context + "/informations/findallinformation"
    });

    $.each(infordata, function (index, item) {
        $("#allnew").append('' +
            '<li id="infor-' + index + '">' +
                '<div class="panel">'+
            '<div class="panel-heading"  style="background-color: #66afe9">' +
            '<a href="" style="color: #FFFFFF">' +
            item.informationName +
            '</a>' +
            '</div>' +
            '<div class="panel-body">' +
            '<div class="row">' +
                '<div class="col-sm-12">'+
            '<img id="inforImage" class="img-rounded col-sm-2" width="160" height="100" src="/MyProjectSpa/informations/loadinformationimage/' + item.id + '"/>' +
            '<p class="desc defaultFont col-sm-10">' +
            item.informationDetail +
            '</p>' +
            '</div>' +
            '</div>' +
            '</div>' +
            '</div>' +
            '</li>')
    })
}