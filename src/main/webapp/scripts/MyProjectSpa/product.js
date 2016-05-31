/**
 * Created by zazabi37 on 31/03/2016.
 */
//$(document).ready(function(){
//    console.log("GG");
//    setproType();
//});

$("#productBtnAdd").on('click',function(){
    clearvalueProduct();
    $("#modalAddProduct").modal("show");
    //$("#rotate").hide();
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

    $("#tableProductbody").empty();
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
            '<td>' +
            '<center>' +
            '<button value="' + index + '" class="btn btn-primary" onclick="editproduct(this)""><span class="glyphicon fa fa-pencil"></span></button>' +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            '<button class="btn btn-danger" value="' + index + '" onclick="deleteProData(' + item.id + ')""><span class="glyphicon glyphicon glyphicon-remove"></span></button>' +
            '</center>' +
            '</td>' +
            '</tr>')
    })
    $("#tableProduct").DataTable();
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
                    $("#tableProduct").DataTable().destroy();
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
    $("#checkBoxproAll").prop('checked',false);
    $("#proCodeAdd").val("");
    $("#pronameAdd").val("");
    $("#prodesAdd").val("");
    $("#propriceAdd").val("");
    $("#productPicture").val("");
    $("#file").val("");
    $("#select_Protype").val("");
    $("#imgAvatar").removeAttr('src');
}

$("#file").on('change',function(){
    var filename = $("#file").val();
    $("#productPicture").val(filename);
    showPreview(this);
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

$("#checkBoxproAll").on('change',function(){
    var booleanCheckAll = $("#checkBoxproAll").prop("checked");
    if(booleanCheckAll){
        $("[name='checkBoxProduct']").prop("checked",true);
    }
    else{
        $("[name='checkBoxProduct']").prop("checked",false);
    }
});

function editproduct(btn){
    var tableproindex = btn.value;
    var datatableproduct = $("#tableProduct").data("data-table");
    //console.log(tableproindex);
    //console.log(datatableproduct[tableproindex].productTypes.id+"#"+datatableproduct[tableproindex].productTypes.version);
    $("#modalEditProduct").data("data-id",datatableproduct[tableproindex].id);
    $("#modalEditProduct").data("data-index",tableproindex);
    $("#proCodeEdit").val(datatableproduct[tableproindex].productId);
    $("#pronameEdit").val(datatableproduct[tableproindex].productName);
    $("#select_ProtypeEdit").val(datatableproduct[tableproindex].productTypes.id+"#"+datatableproduct[tableproindex].productTypes.version);
    $("#prodesEdit").val(datatableproduct[tableproindex].productDetails);
    $("#propriceEdit").val(datatableproduct[tableproindex].productPrice);
    $("#productPictureEdit").val(datatableproduct[tableproindex].productPicture);
    $("#modalEditProduct").modal('show');
}

$("#modalBtnEditPro").on('click',function(){
    //alert("gg");
    var proeditid = $("#modalEditProduct").data("data-id");
    var proeditindex = $("#modalEditProduct").data("data-index");
    var datatableproduct = $("#tableProduct").data("data-table");
    console.log("GG:"+datatableproduct);
    var procodeedit = $("#proCodeEdit").val();
    var pronameedit = $("#pronameEdit").val();
    var editproselect = $("#select_ProtypeEdit").val().split("#");
    var protypeedit = {id:editproselect[0],version:editproselect[1]}
    var prodesedit = $("#prodesEdit").val();
    var propicedit = $("#productPictureEdit").val();
    var propriceedit = $("#propriceEdit").val();

    datatableproduct[proeditindex].id = proeditid;
    datatableproduct[proeditindex].productId = procodeedit;
    datatableproduct[proeditindex].productName = pronameedit;
    datatableproduct[proeditindex].productTypes = protypeedit;
    datatableproduct[proeditindex].productPrice = propriceedit;
    datatableproduct[proeditindex].productDetails = prodesedit;
    datatableproduct[proeditindex].productPicture = propicedit;

    var formprodataedit = new FormData();
    formprodataedit.append("jasonedit",JSON.stringify(datatableproduct[proeditindex]));
    formprodataedit.append("fileedit",productFileEdit.files[0]);

    $.ajax({
        type: "POST",
        headers: {
            Accept: 'application/json',
        },
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        url: session['context'] + '/products/updateproductdata/',
        processData: false,
        contentType: false,
        data: formprodataedit,
        complete: function (xhr) {
            if (xhr.readyState == 4) {
                if (xhr.status == 200) {
                    swal("สำเร็จ","","success");
                    clearvalueeditproduct();
                    $("#tableProduct").DataTable().destroy();
                    loadtableproduct();
                    $("#modalEditProduct").modal('hide');
                }
                else if (xhr.status == 500) {
                    swal("ล้มเหลว","","warning");
                }
            } else {
                swal("ล้มเหลว-01","","warning");
            }
        }
    });

});

$("#btnCancelEditPro").on('click',function(){
    $("#modalEditProduct").modal('hide');
});

$("#producrfileedit").on('change',function(){
    var editfile = $("#productFileEdit").val();
   $("#productPictureEdit").val(editfile);
});

function clearvalueeditproduct(){
    $("#proCodeEdit").val("");
    $("#pronameEdit").val("");
    $("#select_ProtypeEdit").val("");
    $("#prodesEdit").val("");
    $("#propriceEdit").val("");
    $("#modalEditProduct").val("");
    $("#fileedit").val("");
};

$("#btnCancelpro").on('click',function(){
    clearvalueProduct();
    $("#modalAddProduct").modal('hide');

});

//function deleteProductbyid(id){
//    var deletedata = AjaxUtil.delete({
//        url: session.context + "/products/deleteproductdata/" + id
//    })
//}

$("#productDelete").on('click',function(){
//    var arrayDeleteProduct = $("input[name^='checkBoxProduct']:checked:enabled");
//    if(arrayDeleteProduct.length <= 0){
//        swal("Please Select Data","","warning");
//    }
//    else{
//        for (var i = arrayDeleteProduct.length - 1; i >= 0; i--) {
//            deleteProductbyid(arrayDeleteProduct[i].value);
//            swal("Delete Success","","success");
//            loadtableproduct();
//        }
//    }
    var arrayDeletePro = $("input[name^='checkBoxProduct']:checked:enabled");
    var lengthOfResponseText;
    var cSuccess = 0;
    var fSuccess = 0;
    var empdelpro = arrayDeletePro.length;
    if (empdelpro <= 0) {
        swal("กรุณาเลือกข้อมูลที่ต้องการลบ", "", "warning");
    } else if (empdelpro > 0) {
        swal({
                title: "ต้องการลบข้อมูลจำนวน " + empdelpro + " เรคคอร์ด",
                type: "warning",
                showCancelButton: true,
                confirmButtonColor: "#5cb85C",
                confirmButtonText: "ยืนยัน",
                cancelButtonText: "ยกเลิก",
                closeOnConfirm: false
            },
            function () {
                for (var i = arrayDeletePro.length - 1; i >= 0; i--) {
                    lengthOfResponseText = deletePro(arrayDeletePro[i].value);
                    //console.log("GG:" + lengthOfResponseText);
                    if (lengthOfResponseText == 0) {
                        cSuccess++;
                    } else {
                        fSuccess++;
                    }
                }
                $("#tableProduct").DataTable().destroy();
                loadtableproduct();
                if (cSuccess > 0 && fSuccess > 0) {
                    swal("ลบข้อมูลสำเร็จจำนวน " + cSuccess + " เรคคอร์ด", "ไม่สำเร็จจำนวน " + fSuccess + " เรคคอร์ด", "success")
                } else if (cSuccess > 0) {
                    swal("ลบข้อมูลสำเร็จ", "", "success");
                } else if (fSuccess > 0) {
                    swal("ไม่สามารถลบได้เนื่องจากข้อมูลถูกใช้งานอยู่", "", "warning");
                } else {
                    swal("ไม่สามารถลบได้", "", "warning");
                }
            });
    }
    $("#checkBoxproAll").prop("checked",false);
});

function deletePro(id){
    var lengthOfResponseText;
    var data = $.ajax({
        type: "DELETE",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        headers: {
            Accept: "application/json"
        },
        url: session.context+"/products/deleteproductdata/" + id,
        complete: function (xhr) {
            lengthOfResponseText = xhr.responseText.length;
            if (xhr.readyState == 4) {
                if (xhr.status == 200 && xhr.responseText == "") {
                    //alert("delete");
                }
                else {
                    //alert("fail");
                }
            } else {
                //alert("fail");
            }
        },
        async: false
    });
    return lengthOfResponseText;
};



function deleteProData(id){
    swal({
            title: "ต้องการลบข้อมูล",
            type: "warning",
            showCancelButton: true,
            confirmButtonColor: "#5cb85C",
            confirmButtonText: "ยืนยัน",
            cancelButtonText: "ยกเลิก",
            closeOnConfirm: false
        },
        function () {
            var delprodata = AjaxUtil.delete({
                url: session.context + "/products/deleteproductdata/" + id,
                complete: function (xhr) {
                    if (xhr.readyState == 4) {
                        if (xhr.status == 200 && xhr.responseText == "") {
                            swal("ลบข้อมูลสำเร็จ", "", "success");
                            $("#tableProduct").DataTable().destroy();
                            loadtableproduct();
                        }
                        else {
                            swal("ไม่สามารถลบได้เนื่องจากข้อมูลถูกใช้งานอยู่", "", "warning");
                        }
                    } else {
                        swal("ไม่สามารถลบได้เนื่องจากข้อมูลถูกใช้งานอยู่", "", "warning");
                    }
                }
            })
        })
};

function showPreview(ele)
{
    $('#imgAvatar').attr('src', ele.value); // for IE
    if (ele.files && ele.files[0]) {
        var reader = new FileReader();
        reader.onload = function (e) {
            $('#imgAvatar').attr('src', e.target.result);
        }
        reader.readAsDataURL(ele.files[0]);
    }
    //$("#rotate").show();
}

//var angle = 0;
//$("#rotate").on('click',function(){
//    //rotate(this);
//    //$("#imgAvatar").rotate(getNextAngle());
//    angle += 90;
//    $('#imgAvatar').css('transform','rotate(' + angle + 'deg)');
//});



//function getNextAngle(){
//    nextAngle += 90;
//    if (nextAngle >= 360) {
//        nextAngle = 0;
//    }
//    return nextAngle;
//}
