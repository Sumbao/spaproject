$(document).ready(function(){
    findemp();
})

function findemp(){

    var empdata = AjaxUtil.get({
        url:session.context + '/employees/findalldataemployee'
    });

    $.each(empdata, function (index, item) {
        $("#selectemp").append("<option value=" + item.id + "#" + item.version + " >" + item.empName + "</option>");
    });
};

$("#selectemp").on('change',function(){
    $("#selectemp option[value='01']").remove();
});



$("#searchEmpEvent").on('click',function(){
    if($("#selectemp").val() == 01){
        swal("กรุณาเลือกพนักงาน","","warning");
    }else{
        var empsel = $("#selectemp").val().split("#");
        //$(".fc-event-container").empty();
        //inputdata(empsel[0]);
        var empevent = AjaxUtil.get({
            url:session.context +'/massageevents/findeventbyEmpId/'+empsel[0],
            complete: function (xhr) {
                if (xhr.readyState == 4) {
                    if (xhr.status == 404) {
                        $("#calendar").fullCalendar({
                            header: {
                                left: 'prev,next today',
                                center: 'title',
                                right: 'month,basicWeek,basicDay'
                            }
                        });
                    }
                } else {
                    swal("error","","warning");
                }
            }
        });
        //$("#calendar").fullCalendar('removeEvents');
        $('#calendar').fullCalendar('destroy');
        loadcalendardata(empevent);
        //$('#calendar').fullCalendar('refetchEvents');
        $('#calendar').fullCalendar('render');
    }
});

function loadcalendardata(data){

    //---------------------------

    $("#calendar").fullCalendar({
        header: {
            left: 'prev,next today',
            center: 'title',
            right: 'month,basicWeek,basicDay'
        },
        eventLimit: true,
        events: $.map(data,function(index,item){
            //console.log("index:"+index.reserveDate);
            //console.log("1");
            var date = new Date(index.reserveDate);
            var dateday = date.getDate()+1
            var eventdate = new Date(dateday+date.getMonth()+date.getYear(),0,0,0).toISOString();

            //console.log("date:"+eventdate);

            var event = new Object();
            //console.log("2");
            event.id = index.id;
            event.start = date;//วันที่ลงในปฏิทิน
            event.starttime = index.eventStartTime;
            event.endtime = index.eventEndTime;
            event.title = index.massage.massageName;
            event.backgroundColor = '#487699';
            //console.log("eventdate"+event.id+"-"+event.start+"-"+event.starttime+"-"+event.endtime+"-"+event.title)
            //console.log("3");
            return event;
        }),
        eventRender: function(event, element) {

            //console.log("4");
            var limit = 20;
            var eventstarttime = event.starttime;
            var starttime = new Date(eventstarttime);
            //var timestart = starttime.toISOString().split("T");
            //var timestartformathour = timestart[1].split(":")
            var eventendtime = event.endtime;
            var endtime = new Date(eventendtime);
            var starthour = starttime.getHours();
            var startminute = starttime.getMinutes();
            var endhour = endtime.getHours();
            var endminute =endtime.getMinutes();

            if(starthour >= 1&& starthour<=9){
                var hourstart = "0"+starthour;
            }else{
                var hourstart = starthour;
            }

            if(startminute >= 0&& startminute<=9){
                var minstart = "0"+startminute;
            }else{
                var minstart = startminute;
            }

            if(endhour >= 1&& endhour<=9){
                var hourend = "0"+endhour;
            }else{
                var hourend = endhour;
            }

            if(endminute >= 0&& endminute<=9){
                var minend = "0"+endminute;
            }else{
                var minend = endminute;
            }


           // var timeend = endtime.toISOString().split("T");
            //var timeendformathour = timeend[1].split(":")
            //console.log(starttime.getHours())
            //var massage = event.title;
            //console.log(hourstart);
            element.find('.fc-time').html(hourstart+":"+minstart+  " - " + hourend+":"+minend +'<br />');
            //element.find('.fc-time').append(massage+'<br />');
            //if (event.title.length > limit) {
            //    element.find('.fc-title').text(event.title.substr(0,limit)+'<br/>').parent().attr('title', event.title);
            //}
            var today = new Date();
            var todayLang = today.getTime();
            var startdate = event.start;
            var datecheck = new Date(startdate).toISOString();
            var timestartcheck = event.starttime;
            var timeendcheck = event.endtime;
            var dateTime = (datecheck.split("T")[0]+"T"+timestartcheck);
            var dateReserve = new Date(dateTime);
            var dateReservation = dateReserve.getTime();

            var dateTimeStart = (datecheck.split("T")[0]+"T"+timeendcheck);
            var dateReserveStart = new Date(dateTimeStart);
            var dateReservationStart = dateReserveStart.getTime();

            var dateCheckDay = datecheck.split("T")[0];
            var todayCheckDay = today.toISOString().split("T")[0];

            if (todayLang > dateReservation) {
                element.css("backgroundColor","#A0A0A0");
            }
            if(dateReservation > todayLang){
                if (todayLang >= dateReservationStart) {
                    if (todayCheckDay === dateCheckDay) {
                        element.css("backgroundColor","#00FFCC");
                    }
                }
            }
        },
        eventClick : function(event){
            alert(event.id);
        }
    })
    //$('#calendar').fullCalendar('rerenderEvents');
}


$("#newEmpEvent").on('click',function(){
    var empsel = $("#selectemp").val().split("#");
    if($("#selectemp").val() == 01){
        swal("กรุณาเลือกพนักงาน","","warning");
    }else{
        window.location.href = "/MyProjectSpa/massageevents/newevent?id="+empsel[0];
    }
});

//function clear_calendar() {
//
//
//
//}


