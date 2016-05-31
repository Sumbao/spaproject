$("#btn_confirmchangeadminpassword").on('click',function(){
    var oldpass = $("#admin_old_pass").val();
    var newpass = $("#admin_new_pass").val();
    var newpasscheck = $("#admin_new_pass_check").val();
    var passformbase;
    var idofuser;
    var userdata = AjaxUtil.get({
        url:session.context+"/customers/getuserdata"
    });
    $.each(userdata,function(index,item){
        passformbase = item.password
        idofuser = item.id;
    });
    console.log(passformbase+"-"+idofuser);
    if(oldpass == ""){
        swal("กรุณาใส่ข้อมูลให้ครบ","","warning")
    }else if(newpass == ""){
        swal("กรุณาใส่ข้อมูลให้ครบ","","warning")
    }else if(newpasscheck ==""){
        swal("กรุณาใส่ข้อมูลให้ครบ","","warning")
    }else {
        if(passformbase == oldpass){
            if(newpass == newpasscheck){
                $.ajax({
                    url: session.context+"/customers/changepassword",
                    type: "put", //send it through get method
                    data:{password:newpass,id:idofuser},
                    complete: function (xhr) {
                        if (xhr.readyState == 4) {
                            if (xhr.status == 200) {
                                clrvalue();
                                //window.location = "/MyProjectSpa/login"
                            }
                            else if (xhr.status == 500) {
                                swal("ล้มเหลว","","warning");
                            }
                        } else {
                            swal("error","","warning");
                        }
                    }
                });
            }else{
                swal("กรุณาระบุรหัสผ่านใหม่ให้ตรงกัน","","warning");
            }
        }else{
            swal("กรุณาตรวจสอบรหัสผ่านเดิม","","warning")
        }
    }
});

$("#btn_cancelchangeadminpassword").on('click',function(){
    clrvalue();
    window.location.href = "/MyProjectSpa/admin/main";
});

function clrvalue(){
    $("#admin_old_pass").val("");
    $("#admin_new_pass").val("");
    $("#admin_new_pass_check").val("");
}