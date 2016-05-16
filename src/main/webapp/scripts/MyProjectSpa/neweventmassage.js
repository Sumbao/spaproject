$(document).ready(function () {

    loadmassagetype();
});

var timeformat = /^(2[0-3])|[01][0-9]:[0-5][0-9]$/;

$("#eventDate").datepicker({dateFormat: 'dd/mm/yy'});

$("#btn_EventDate").on('click', function () {
    $("#eventDate").focus();
})

$('#eventStartTime').timepicker({
    timeFormat: 'H:i',
    minTime: '09.00',
    maxTime: '17.00',
    step: '30',
    forceRoundTime: true
});

$("#btn_TimeEventStart").on('click', function () {
    $("#eventStartTime").focus();
});

function loadmassagetype() {
    var mastypedata = AjaxUtil.get({
        url: session.context + '/massagetypeses/findmassagetype'
    });

    $.each(mastypedata, function (index, item) {
        $("#masTypeSelect").append("<option value=" + item.id + "#" + item.version + " >" + item.massageTypeName + "</option>");
    });
}

$("#masTypeSelect").on('change', function () {
    $("#massageSelect").empty();
    var mastype = $("#masTypeSelect").val().split("#");

    var massagedata = AjaxUtil.get({
        url: session.context + "/massages/findMassagebyTypeId/"+mastype[0]
    })
    $.each(massagedata, function (index, item) {
        $("#massageSelect").append("<option value=" + item.id + "#" + item.version + " >" + item.massageName + "</option>");
    });
});