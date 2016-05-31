var today = session['time'];

$(document).ready(function(){
    $("#eventDatesearch").datepicker("option", "minDate", today);
});

$("#eventDatesearch").datepicker({dateFormat: 'dd/mm/yy'});

$("#btn_EventDateSearch").on('click',function(){
    $("#eventDatesearch").focus();
});

$("#eventDatesearch").on('change',function(){
    $("#tableMassageEventbody").empty();
    loadtablereserve();
});


function loadtablereserve(){
    var datesearch = $("#eventDatesearch").val().split("/");
    var daytosearch = datesearch[0];
    var monthtosearch = datesearch[1];
    var yearrtosearch = datesearch[2];
    var reservedatetosearch = new Date(yearrtosearch, monthtosearch - 1, daytosearch, 0, 0, 0);
    var reserveData = AjaxUtil.get({
        url:session.context +"/massageevents/findeventbyDate/"+reservedatetosearch,
    });

    $("#tableMassageEventbody").empty();
    $("#tableMassageEvent").data("data-table", reserveData);
    $.each(reserveData,function(index,item){
        var dateindex = new Date(item.reserveDate);
        var day = dateindex.getDate();
        var month = dateindex.getMonth()+1;
        var year = dateindex.getFullYear();
        var eventdate = day+"/"+month+"/"+year;
        //---------------------------
        var timestart = new Date(item.eventStartTime);
        var starthour = timestart.getHours();
        var startmin = timestart.getMinutes();

        //---------------------------
        var timeend =new Date(item.eventEndTime);
        var endhour = timeend.getHours();
        var endminute = timeend.getMinutes();

        //---------------------------
        if(starthour >= 1&& starthour<=9){
            var hourstart = "0"+starthour;
        }else{
            var hourstart = starthour;
        }
        //----------------------------
        if(startmin >= 0&& startmin<=9){
            var minstart = "0"+startmin;
        }else{
            var minstart = startmin;
        }
        //----------------------------
        if(endhour >= 1&& endhour<=9){
            var hourend = "0"+endhour;
        }else{
            var hourend = endhour;
        }

        if(endminute >= 0&& endminute<=9){
            var minend = "0"+endminute;
        }else{
            var minend = endhour;
        }
        var eventstart = hourstart+":"+minstart+" น.";
        var eventend = hourend+":"+minend+" น."
        //---------------------------
        $("#tableMassageEvent").append(''+
            '<tr>' +
            '<td>' +
            '<center>' +
            eventdate +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.userReserve.customerName +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.employee.empName +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            eventstart +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            eventend +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            '<button value="' + index + '" class="btn btn-danger" onclick="deleteevent(' + item.id + ')""><span class="glyphicon glyphicon-remove"></span></button>' +
            '</center>' +
            '</td>' +
            '</tr>'
        )
    }) ;
    $("#tableMassageEvent").DataTable();


}


function deleteevent(id){
    swal({
            title: "ต้องการยกเลิกการจอง",
            type: "warning",
            showCancelButton: true,
            confirmButtonColor: "RED",
            confirmButtonText:"ยืนยัน",
            cancelButtonText:"ยกเลิก",
            closeOnConfirm: false
        },
        function () {
            var datadelete = AjaxUtil.delete({
                url: session.context + "/massageevents/" + id,
                complete: function (xhr) {
                    if (xhr.readyState == 4) {
                        if (xhr.status == 200) {
                            $("#tableMassageEventbody").empty();
                            $("#tableMassageEvent").DataTable().destroy();
                            loadtablereserve();
                            swal("ลบข้อมูลสำเร็จ","","success");
                        }
                        else if (xhr.status == 404) {
                            swal("ไม่พบข้อมูล","","warning");
                        }
                        else if (xhr.status == 500) {
                            swal("ไม่สามารถลบได้ เขื่องจากข้อมูลถูกใช้งานอยู่","","warning");
                        }
                    } else {
                        swal("ล้มเหลว","","warning");
                    }
                }
            })
        });
};