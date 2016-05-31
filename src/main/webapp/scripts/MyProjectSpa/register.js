/**
 * Created by zazabi37 on 14/03/2016.
 */

$(document).ready(function(){
    clearvalue();
});
$("#txt_CusBirthDay").datepicker({dateFormat: 'dd/mm/yy'});
$("#btn_BirthDate").on('click', function () {
    $("#txt_CusBirthDay").focus();
});

$("#btn_Register").on('click',function(){
    var username = $("#txt_CusUsername").val();
    var pass = $("#txt_password").val();
    var name = $("#txt_CusName").val();
    var addr = $("#txt_CusAddr").val();
    var birthday = $("#txt_CusBirthDay").val();
    var age = $("#txt_CusAge").val();
    var cussex = $("input[name=sex]:checked").val();
    var tel = $("#txt_CusTel").val();
    var email = $("#txt_CusEmail").val();
    var role = AjaxUtil.get({
        url:session.context+"/customertypes/getcustomertype/"+9998
    });

    console.log("role:"+role);
    var cusbirthday = birthday.split("/");
    var datetosave = parseInt(cusbirthday[0]);
    var monthtosave = parseInt(cusbirthday[1]);
    var yeartosave = parseInt(cusbirthday[2]);
    var birthdatetosave = new Date(yeartosave, monthtosave - 1, datetosave, 0, 0, 0);

    var data = {
        username : username,
        password: pass,
        loginstatus:true,
        customerName: name,
        customerAddr: addr,
        customerEmail: email,
        customerAge: age,
        customerBirthDay: birthdatetosave.getTime(),
        customerTel:tel,
        customertype:{id:role.id,version:role.version}
    }

    console.log("data:"+data);
    //alert(username+pass+name+addr+birthday+age+cussex+tel);
    var jsonData = AjaxUtil.post({
        url: session.context + "/customers/createCustomer",
        data: JSON.stringify(data),
            complete: function (xhr) {
                if (xhr.readyState == 4) {
                    if (xhr.status == 201) {
                        swal({
                                title: "สำเร็จ",
                                type: "success",
                                confirmButtonColor: "#79CDCD",
                                confirmButtonText: "ตกลง",
                                closeOnConfirm: false
                            },
                            function(isConfirm){
                                if (isConfirm) {
                                    swal.close();
                                    clearvalue();
                                    window.location.href = session['context']+"/login";

                                }
                            });
                    }
                    else if (xhr.status == 409) {
                        swal("มีชื่อผู้ใช้นี้ในระบบแล้ว");
                    }
                } else {
                    swal("ผิดพลาด");
                }
            }

    })
});

function clearvalue(){
    $("#txt_CusUsername").val("");
    $("#txt_password").val("");
    $("#txt_CusName").val("");
    $("#txt_CusAddr").val("");
    $("#txt_CusBirthDay").val("");
    $("#txt_CusAge").val("");
    $("#rad_1").prop("checked",true);
    $("#txt_CusTel").val("");
    $("#txt_CusEmail").val("");
};
