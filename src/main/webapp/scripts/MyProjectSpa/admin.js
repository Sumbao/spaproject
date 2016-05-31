$(document).ready(function(){
   loaduserdetail();
});

function loaduserdetail(){
    var userdata = AjaxUtil.get({
        url:session.context+"/customers/getuserdata"
    });
    $.each(userdata,function(index,item){
        $("#nameofuser").append(item.customerName+
        '<span class="caret">'+
        '</span>');
    })
};

