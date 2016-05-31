var empid = window.location.search.replace('?', '').split('&&')[0].split('=')[1].split("&")[0];

var today = session['time'];
var date = new Date(today);
var hour = date.getHours();
var minute = date.getMinutes();
//console.log("h:" + hour + "-" + "M:" + minute);
var currenttime = hour + ":" + minute;
var dateto = date.getDate();
var monthto = date.getMonth() + 1

if (monthto >= 1 && monthto <= 9) {
    var monthtocheck = "0" + monthto
} else {
    var monthtocheck = monthto
}
if (dateto >= 1 && dateto <= 9) {
    var datetocheck = "0" + dateto
} else {
    var datetocheck = dateto
}
var dateformbase = datetocheck + "/" + monthtocheck + "/" + date.getFullYear();//วันปัจจุบัน
//console.log(minute);

//console.log(mintime);


$(document).ready(function () {
    $("#eventDate").datepicker("option", "minDate", today);
    getempdetail();
    clearvalueaddNewEvent();
    loadmassagetype();

});

function getempdetail() {

}

$("#eventDate").on('change', function () {
    var dateselect = $("#eventDate").val();
    console.log("sel:" + dateselect + "---" + dateformbase)
    if (dateselect == dateformbase) {
        console.log("same");
        if (hour >= 9 && hour <= 17) {
            if (minute >= 0 && minute <= 20) {
                var mintime = hour + ":" + "30";

            } else if (minute >= 21 && minute <= 59) {
                var mintime = hour + 1 + ":" + "00";
            }
        } else if(hour >=0 && hour<=8){
            var mintime = "09"+ ":" + "00";
        }else {
            swal("กรุณาเลือกวันถัดไป", "", "warning");
            $("#eventDate").val("");
        }
        console.log(mintime)
        $("#eventStartTime").timepicker('option', 'minTime', mintime);
        //$("#eventStartTime").timepicker('option', 'maxTime', 16.00);

    } else {
        console.log("not same")
    }
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
    //forceRoundTime: false,
    disableTextInput: true
});

$("#btn_TimeEventStart").on('click', function () {
    $("#eventStartTime").focus();
});

function loadmassagetype() {
    //$("#masTypeSelect").empty();
    var mastypedata = AjaxUtil.get({
        url: session.context + '/massagetypeses/findmassagetype'
    });

    $.each(mastypedata, function (index, item) {
        $("#masTypeSelect").append("<option value=" + item.id + "#" + item.version + " >" + item.massageTypeName + "</option>");
    });
}

//$("#masTypeSelect").on('click',function(){
//    $("#masTypeSelect option[value='01']").remove();
//});
$("#masTypeSelect").on('change', function () {
    $("#massageSelect").empty();
    $("#masTypeSelect option[value='01']").remove();
    var mastype = $("#masTypeSelect").val().split("#");
    getmassage(mastype[0]);

});

function getmassage(id){
    var massagedata = AjaxUtil.get({
        url: session.context + "/massages/findMassagebyTypeId/" + id
    })
    $.each(massagedata, function (index, item) {
        $("#massageSelect").append("<option value=" + item.id + "#" + item.version + "#" + item.massageTime + " >" + item.massageName + "</option>");
    });
}

function clearvalueaddNewEvent() {
    $("#eventDate").val("");
    $("#masTypeSelect").val("");
    $("#massageSelect").val("");
    $("#eventStartTime").val("");
}

$("#btn_confirmReserve").on('click', function () {
    if($("#masTypeSelect").val() == 01){
        swal("กรุณาเลือกประเภทการบริการ","","warning");
    }if($("#massageSelect").val()==""){
        swal("กรุณาเลือกการบริการ","","warning");
    }if($("#eventDate").val() == ""){
        swal("กรุณาเลือกวันที่","","warning");
    }if($("#eventStartTime").val() == ""){
        swal("กรุณาเลือกเวลาเริ่ม","","warning");
    }else{
        var reservedate = $("#eventDate").val();
        var datesend = reservedate.split("/");
        var datetosave = parseInt(datesend[0]);
        var monthtosave = parseInt(datesend[1]);
        var yeartosave = parseInt(datesend[2]);
        //var mastypeselect = $("#masTypeSelect").val().split("#");
        var masselect = $("#massageSelect").val().split("#");
        var massagetosaveevent = {id: masselect[0], version: masselect[1]}
        var starttime = $("#eventStartTime").val().split(":");

        //-----dateend-------
        var dateendhour = parseInt(starttime[0])
        var dateendminute = parseInt(starttime[1])
        //-------------------
        var massagetime = masselect[2];
        //console.log("minute:" + starttime[1]+60)
        var endtimetosave;
        if (massagetime == 30) {
            if (starttime[1] == 00) {

                var houradd = dateendhour;
                var minadd = dateendminute + 30;
                //endtimetosave = new Date(yeartosave, monthtosave - 1, datetosave, , , 0, 0);
                console.log("00a");
            } else if (starttime[1] == 30) {
                var houradd = dateendhour + 1;
                var minadd = dateendminute;
                //endtimetosave = new Date(yeartosave, monthtosave - 1, datetosave, dateendhour + 1, dateendminute, 0, 0);
                console.log("30a");
            }
        } else if (massagetime == 45) {
            if (starttime[1] == 00) {
                var houradd = dateendhour;
                var minadd = dateendminute + 45;
                //endtimetosave = new Date(yeartosave, monthtosave - 1, datetosave, dateendhour, dateendminute + 45, 0, 0);
                console.log("00b");
            } else if (starttime[1] == 30) {
                var houradd = dateendhour + 1;
                var minadd = dateendminute - 15;
                //endtimetosave = new Date(yeartosave, monthtosave - 1, datetosave, dateendhour + 1, dateendminute - 15, 0, 0);
                console.log("30b");
            }
        } else if (massagetime == 60) {
            if (starttime[1] == 00) {
                var houradd = dateendhour + 1;
                var minadd = dateendminute;
                // endtimetosave = new Date(yeartosave, monthtosave - 1, datetosave, dateendhour + 1, dateendminute, 0, 0);
                console.log("00c");
            } else if (starttime[1] == 30) {
                var houradd = dateendhour + 1;
                var minadd = dateendminute;
                //endtimetosave = new Date(yeartosave, monthtosave - 1, datetosave, dateendhour + 1, dateendminute, 0, 0);
                console.log("30c");
            }
        } else if (massagetime == 90) {
            if (starttime[1] == 00) {
                var houradd = dateendhour + 1;
                var minadd = dateendminute + 30;
                //endtimetosave = new Date(yeartosave, monthtosave - 1, datetosave, dateendhour + 1, dateendminute + 30, 0, 0);
                console.log("00d");
            } else if (starttime[1] == 30) {
                var houradd = dateendhour + 2;
                var minadd = dateendminute - 30;
                //endtimetosave = new Date(yeartosave, monthtosave - 1, datetosave, dateendhour + 2, dateendminute - 30, 0, 0);
                console.log("30d");
            }
        }

        var reservedatetosave = new Date(yeartosave, monthtosave - 1, datetosave, 0, 0, 0);
        var starttimetosave = new Date(yeartosave, monthtosave - 1, datetosave, starttime[0], starttime[1], 0);

        //console.log("endtime:"+endtimetosave);

        var endtimetosave = new Date(yeartosave, monthtosave - 1, datetosave, houradd, minadd, 0);
        var empversion;
        var empdatatosave = AjaxUtil.get({
            url: session.context + "/employees/findempbyid/" + empid
        });
        $.each(empdatatosave, function (index, item) {
            empversion = item.version;
        });
        var cusid ;
        var cusversion;
        var customerdata = AjaxUtil.get({
            url:session.context+"/customers/getuserdata"
        });

        $.each(customerdata,function(index,item){
            cusid = item.id;
            cusversion = item.version;
        });

        var userreserve = {id: cusid, version: cusversion};
        var empreserve = {id: empid, version: "" + empversion};
        //console.log("reservedate:" + reservedatetosave);
        console.log("starttime:" + starttimetosave.getTime());
        console.log("endtime:" + endtimetosave.getTime());
        //console.log(reservedate + "-" + mastypeselect[0] + "-" + masselect[0] + "-" + starttime)


        var reservedatesave = reservedatetosave.getTime();
        var starttimesave = starttimetosave.getTime();
        var endtimesave = endtimetosave.getTime();


        var data = {
            eventStartTime: starttimesave,
            eventEndTime: endtimesave,
            userReserve: userreserve,
            massage: massagetosaveevent,
            employee: empreserve,
            reserveDate: reservedatesave
        };
        //var testdata = $.parseJSON(data)
        //console.log(testdata);

        $.ajax({
            type: "post",
            url: session.context + "/massageevents/createnewevent",
            contentType: "application/json;charset=utf-8",
            dataType : "json",
            data: JSON.stringify(data),
            crossDomain:true,
            async: false,
            complete: function (xhr) {
                if (xhr.readyState == 4) {
                    if (xhr.status == 201) {
                        swal({
                                title: "สำเร็จ",
                                type: "success",
                                //confirmButtonColor: "#79CDCD",
                                confirmButtonText: "Ok",
                                closeOnConfirm: false
                            },
                            function (isConfirm) {
                                if (isConfirm) {
                                    clearvalueaddNewEvent();
                                    window.location.href = "/MyProjectSpa/massageevents/massagelist";
                                }
                            });
                    }
                    else if (xhr.status == 200) {
                        swal("ล้มเหลว", "", "warning");
                    }
                    else if (xhr.status == 409) {
                        swal("ช่วงเวลานี้มีผู้ใช้บริการอยู่", "", "warning");
                    }

                } else {
                    swal("เกิดข้อผิดพลาด", "", "warning");
                }
            }
        });
        //var neweventdata = AjaxUtil.post({
        //    url: session.context + "/massageevents/createnewevent",
        //    data: JSON.stringify(data),
        //    complete: function (xhr) {
        //        if (xhr.readyState == 4) {
        //            if (xhr.status == 201) {
        //
        //                swal({
        //                        title: "Seccess",
        //                        type: "success",
        //                        //confirmButtonColor: "#79CDCD",
        //                        confirmButtonText: "Ok",
        //                        closeOnConfirm: false
        //                    },
        //                    function(isConfirm){
        //                        if (isConfirm) {
        //                            clearvalueaddNewEvent();
        //                            window.location.href = "/MyProjectSpa/massageevents/massagelist";
        //                        }
        //                    });
        //            }
        //            else if (xhr.status == 200) {
        //                swal("Failed", "", "warning");
        //            }
        //            else if (xhr.status == 409) {
        //                swal("SameData", "", "warning");
        //            }
        //
        //        } else {
        //            swal("Failed", "", "warning");
        //        }
        //    }
        //})
    }
});

$("#btn_backto").on('click', function () {
    window.location.href = "/MyProjectSpa/massageevents/massagelist"
});

$("#btn_clrdata").on('click', function () {
    clearvalueaddNewEvent();
    loadmassagetype();
});


$("#massageSelect").on('change',function(){
    $("#massageSelect option[value='01']").remove();
});