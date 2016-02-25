/**
 * Created by zazabi37 on 25/02/2016.
 */


$("#btn_loginmain").on('click',function(){
    $("#modalRegister").modal("show");
});

$("#btn_Register").on('click',function(){
    window.location = "/MyProjectSpa/customers/register";
});