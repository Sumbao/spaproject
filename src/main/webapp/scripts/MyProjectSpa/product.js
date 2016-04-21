/**
 * Created by zazabi37 on 31/03/2016.
 */
$(document).ready(function(){
    console.log("GG");
    setproType();
});

$("#productBtnAdd").on('click',function(){
    $("#modalAddProduct").modal("show");
});

setproType();
function setproType(){
    $("#select_Protype").empty();
    $("#select_ProtypeEdit").empty();
    var proType = AjaxUtil.get({
        url: session.context + "/producttypeses"
    })

    $.each(proType,function(index,item){
        $("#select_Protype").append("<option value=" + item.id + "#" + item.version + " >" + item.productTypesName  + "</option>");
        $("#select_ProtypeEdit").append("<option value=" + item.id + "#" + item.version + " >" + item.productTypesName  + "</option>")
    })
};

function loadtableproduct(){
    var jsonData = AjaxUtil.get({
        url:session.context + "/products/findallproduct"
    })

    console.log(jsonData);

    $("#tableProduct").empty();
    $("#tableProduct").data("data-table",jsonData);

    $.each(jsonData,function(index,item){
        $("#tableProduct").append('' +
            '<tr>' +
            '<td>'+
            '<center>'+
            '<input id="checkBoxProduct'+index+'" value="'+jsonData[index].id+'" name="checkBoxProduct" type="checkbox" class="checkbox" onclick="checkBoxInputProduct(this)"/>'+
            '</center>'+
            '</td>'+
            '<td>' +
            '<center>' +
            '<button value="' + index + '" class="btn btn-primary" onclick="editproduct(this)""><span class="glyphicon fa fa-pencil"></span></button>' +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.productId +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.productName +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.productDetails +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.productPrice +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
                item.productTypes.productTypesName +
            '</center>' +
            '</td>' +
            '</tr>')
    })
};

$("#modalBtnAddpro").on('click',function(){
    var procode = $("#proCodeAdd").val();
    var proName = $("#pronameAdd").val();
    var prodetail = $("#prodesAdd").val();
    var proPrice = $("#propriceAdd").val();
    var propicname = $("#file").val();

    var producrtypeselect = $("#select_Protype").val().split("#");
    var producttype = {id: producrtypeselect[0], version: producrtypeselect[1]}

    var pronewdata = {
        productId:procode,
        productName:proName,
        productDetails:prodetail,
        productPrice:proPrice,
        productTypes:producttype,
        productPicture:propicname
    }

    var formData = new FormData();
    formData.append("json", JSON.stringify(pronewdata));
    formData.append("file", file.files[0]);
    //console.log(formData);
    $.ajax({
        type: "POST",
        headers: {
            Accept: 'application/json',
        },
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        url: session['context'] + '/products/createproduct/',
        processData: false,
        contentType: false,
        data: formData,
        complete: function (xhr) {
            if (xhr.readyState == 4) {
                if (xhr.status == 201) {
                    swal("Success","","success");
                    $("#modalAddProduct").modal('hide');
                    clearvalueProduct();
                    loadtableproduct();
                }
                else if (xhr.status == 409) {
                    swal("Same data","","warning");
                }
                else if (xhr.status == 500) {
                    swal("Failed","","warning");
                }
            } else {
                swal("error","","warning");
            }
        }
    });
});

function clearvalueProduct(){
    $("#proCodeAdd").val("");
    $("#pronameAdd").val("");
    $("#prodesAdd").val("");
    $("#propriceAdd").val("");
    $("#productPicture").val("");
    $("#file").val("");
    $("$select_Protype").val("");
}

$("#file").on('change',function(){
    var filename = $("#file").val();
    $("#productPicture").val(filename);
});

function checkBoxInputProduct(){
    var countInputChecked = $("input[name^='checkBoxProduct']:checked:enabled").length;
    var countInputAll  = $("[name='checkBoxProduct']").length;

    if(countInputChecked == countInputAll){
        $("#checkBoxproAll").prop("checked",true);
    }
    else
    {
        $("#checkBoxproAll").prop("checked",false);
    }
}

function deleteProduct(id){
    var jsonData = AjaxUtil.delete({
        url:session.context+"/products/"+id
    });
}

$("#productDelete").on('click',function(){
    var arrayDeleteProduct = $("input[name^='checkBoxProduct']:checked:enabled");
    if(arrayDeleteProduct.length <= 0){
        swal("Please Select Data","","warning");
    }
    else{
        for (var i = arrayDeleteProduct.length - 1; i >= 0; i--) {
            deleteProduct(arrayDeleteProduct[i].value);
            swal("Delete Success","","success");
            loadtableproduct();
        }
    }
});

$("#checkBoxproAll").on('change',function(){
    var booleanCheckAll = $("#checkBoxproAll").prop("checked");
    if(booleanCheckAll){
        $("[name='checkBoxProduct']").prop("checked",true);
    }
    else{
        $("[name='checkBoxProduct']").prop("checked",false);
    }
});

function editproduct(){

}
