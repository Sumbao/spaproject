/**
 * Created by zazabi37 on 31/03/2016.
 */
$(document).ready(function(){
    findAllProduct();
});

function findAllProduct(){
    var allRooms = AjaxUtil.get({
        url:session.context+"/products/findallproduct"
    })
    $(".carousel-captionactive").empty();
    $(".carousel-captionitem").empty();
    $.each(allRooms,function(index,item){
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
            $(".carousel-captionactive").append(''+
                '<div class="col-sm-3" >'+
                '<div class="thumbnail" >'+
                '<img id="roomImages" src="'+partImages+'/products/loadimage/'+item.id+'" class="img-rounded"  style="min-height:220px;height:220px;" />'+
                '<div class="caption">'+
                '<h3>'+item.productName+'</h3>'+
                '<p>'+item.productPrice+'</p>'+
                '<div align="right">'+
                '<button id="roombtnAdd" type="button" class="btn btn-primary" onclick="getdetail('+item.id+')"" >'+"detail"+'</button>'+
                '</div>'+
                '</div>'+
                '</div>'+
                '</div>'
            );
        }else{
            $(".carousel-captionitem").append(''+
                '<div class="col-sm-3" >'+
                '<div class="thumbnail" >'+
                '<img id="roomImages" src="'+partImages+'/products/loadimage/'+item.id+'" class="img-rounded"  style="min-height:220px;height:220px;" />'+
                '<div class="caption">'+
                '<h3>'+item.productName+'</h3>'+
                '<p>'+item.productPrice+'</p>'+
                '<div align="right">'+
                '<button id="roombtnAdd" type="button" class="btn btn-primary" onclick="getdetail('+item.id+')"" >'+"detail"+'</button>'+
                '</div>'+
                '</div>'+
                '</div>'+
                '</div>'
            );
        };
    })
}

function getdetail(id){
    window.location.href = session['context'] + 'products/productdetail?id='+id
}

$("#roomBuildings").on('change',function(){
    $("#roomBuildings option[value='01']").remove();
});