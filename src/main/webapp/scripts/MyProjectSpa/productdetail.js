/**
 * Created by zazabi37 on 22/04/2016.
 */
var idProduct = window.location.search.replace('?','').split('&&')[0].split('=')[1].split("&")[0];
var idproint = parseInt(idProduct);
$(document).ready(function(){
    clrdetail();
    loadprodetail();
})

function loadprodetail(){
    var jsonData = AjaxUtil.get({
        url: session.context+"/products/" + idproint
    });
    console.log(jsonData.productDetails);

        $("label[id=proCode]").text(jsonData.productId);
        $("label[id=proName]").text(jsonData.productName);
        $("label[id=proPrice]").text(jsonData.productPrice);
        $("label[id=proDetail]").text(jsonData.productDetails);

    $("#proImage").attr('src',$("#proImage").attr('src')+idproint);
};

function clrdetail(){
    $("#proCode").empty();
    $("#proName").empty();
    $("#proPrice").empty();
    $("#proDetail").empty();
}

