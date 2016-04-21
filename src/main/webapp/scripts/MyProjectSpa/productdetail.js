/**
 * Created by zazabi37 on 22/04/2016.
 */
var idProduct = window.location.search.replace('?','').split('&&')[0].split('=')[1].split("&")[0];
var idproint = parseInt(idProduct);
loadprodetail();
function loadprodetail(){
    var jsonData = AjaxUtil.get({
        url: session.context+"/products/findproduct/" + idproint
    });

    $.each(jsonData,function(index,item){
        $("#proCode").val(item.productId);
        $("#proName").val(item.productName);
        $("#proPrice").val(item.productDetails);
        $("#proDetail").val(item.productPrice);
    })

    $("#proImage").attr('src',$("#proImage").attr('src')+idproint);
};

