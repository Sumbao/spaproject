/**
 * Created by zazabi37 on 31/03/2016.
 */
$(document).ready(function () {
    findAllProduct();
    findprotypess();
});

function getdetail(id) {
    window.location.href = session['context'] + '/products/productdetail?id=' + id
}

function findAllProduct() {
    var allRooms = AjaxUtil.get({
        url: session.context + "/products/findallproduct"
    })
    $(".carousel-captionactive").empty();
    $(".carousel-captionitem").empty();
    $.each(allRooms, function (index, item) {
        // $("#rowRoom").append(''+
        // 	'<div class="col-sm-3" >'+
        // 		'<div class="thumbnail" >'+
        // 			'<img id="roomImages" src="'+partImages+'/rooms/loadimage/'+item.id+'" class="img-rounded" style="min-height:250px;height:250px;"/>'+
        // 			'<div class="caption">'+
        // 			'<h3>'+item.roomName+'</h3>'+
        // 			'<p>'+item.roomDetail+'</p>'+
        // 			'<div align="right">'+
        // 		        '<button id="roombtnAdd" type="button" class="btn btn-primary" onclick="reservations('+item.id+')"" >'+Button.Reservation+'</button>'+
        // 		    '</div>'+
        // 			'</div>'+
        // 		'</div>'+
        // 	'</div>'
        // );
        if (index <= 3) {
            $(".carousel-captionactive").append('' +
                '<div class="col-sm-3" >' +
                '<div class="thumbnail" >' +
                '<img id="roomImages" src="' + partImages + '/products/loadimage/' + item.id + '" class="img-responsive"  style="min-height:160px;height:160px;" />' +
                '<div class="caption">' +
                '<h3>' + item.productName + '</h3>' +
                '<p>' + item.productPrice + '</p>' +
                '<div align="right">' +
                '<button id="roombtnAdd" type="button" class="btn btn-primary" onclick="getdetail(' + item.id + ')"" >' + "detail" + '</button>' +
                '</div>' +
                '</div>' +
                '</div>' +
                '</div>'
            );
        } else {
            $(".carousel-captionitem").append('' +
                '<div class="col-sm-3" >' +
                '<div class="thumbnail" >' +
                '<img id="roomImages" src="' + partImages + '/products/loadimage/' + item.id + '" class="img-responsive"  style="min-height:160px;height:160px;" />' +
                '<div class="caption">' +
                '<h3>' + item.productName + '</h3>' +
                '<p>' + item.productPrice + '</p>' +
                '<div align="right">' +
                '<button id="roombtnAdd" type="button" class="btn btn-primary" onclick="getdetail(' + item.id + ')"" >' + "detail" + '</button>' +
                '</div>' +
                '</div>' +
                '</div>' +
                '</div>'
            );
        }
        ;

        $("#allproduct").append('' +
            '<div class="col-xs-6 col-md-3">' +
            '<a href="/MyProjectSpa/products/productdetail/?id=' + item.id + '">' +
            '<div class="form-group">' +
            '<img id="inforImage" class="img-responsive" width="160" height="100" src="/MyProjectSpa/products/loadimage/' + item.id + '"/>' +
            '<div class="caption">' +
            '<label>' +
            '<center>' +
            item.productName +
            '</center>' +
            '</label>' +
            '</div>' +
            '</div>' +
            '</a>' +
            '</div>')
    })
}

$("#roomBuildings").on('change', function () {
    $("#roomBuildings option[value='01']").remove();
});

function findprotypess() {
    data = AjaxUtil.get({
        url: session.context + "/producttypeses"
    });

    $.each(data, function (index, item) {
        $("#selectProductTypes").append("<option value=" + item.id + "#" + item.version + " >" + item.productTypesName + "</option>");
    });
}

$("#searchProduct").on('click', function () {
    var producttypesearch = $("#selectProductTypes").val().split("#");

    getdata = AjaxUtil.get({
        url: session.context + "/findProductbyproducttype/" + producttypesearch[0]
    });

    $("#rowRoom").empty();
    $(".carousel-captionactive").empty();
    $(".carousel-captionitem").empty();
    $.each(getdata, function (index, item) {
        if (index <= 3) {
            $(".carousel-captionactive").append('' +
                '<div class="col-sm-3" >' +
                '<div class="thumbnail" >' +
                '<img id="roomImages" src="' + partImages + '/products/loadimage/' + item.id + '" class="img-rounded"  style="min-height:220px;height:220px;" />' +
                '<div class="caption">' +
                '<h3>' + item.productName + '</h3>' +
                '<p>' + item.productPrice + '</p>' +
                '<div align="right">' +
                '<button id="roombtnAdd" type="button" class="btn btn-primary" onclick="getdetail(' + item.id + ')"" >' + "detail" + '</button>' +
                '</div>' +
                '</div>' +
                '</div>' +
                '</div>'
            );
        } else {
            $(".carousel-captionitem").append('' +
                '<div class="col-sm-3" >' +
                '<div class="thumbnail" >' +
                '<img id="roomImages" src="' + partImages + '/products/loadimage/' + item.id + '" class="img-rounded"  style="min-height:220px;height:220px;" />' +
                '<div class="caption">' +
                '<h3>' + item.productName + '</h3>' +
                '<p>' + item.productPrice + '</p>' +
                '<div align="right">' +
                '<button id="roombtnAdd" type="button" class="btn btn-primary" onclick="getdetail(' + item.id + ')"" >' + "detail" + '</button>' +
                '</div>' +
                '</div>' +
                '</div>' +
                '</div>'
            );
        }
        ;
    });
});