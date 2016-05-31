/**
 * Created by zazabi37 on 20/04/2016.
 */
loadtableprotype();
function loadtableprotype(){
    clearvaluemodal();
    jsonData = AjaxUtil.get({
        url:session.context+"/producttypeses/findallprotype"
    })
    $("#tableProducttypesbody").empty();
    $("#tableProducttypes").data("data-table", jsonData);
    $.each(jsonData, function (index, item) {
        $("#tableProducttypes").append('' +
            '<tr>' +
            '<td>'+
            '<center>'+
            '<input id="checkBoxprotype'+index+'" value="'+jsonData[index].id+'" name="checkBoxprotype" type="checkbox" class="checkbox" onclick="checkBoxInputprotype(this)"/>'+
            '</center>'+
            '</td>'+
            '<td>' +
            '<center>' +
            item.productTypesName +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            '<button value="' + index + '" class="btn btn-primary" onclick="editprotype(this)""><span class="glyphicon fa fa-pencil"></span></button>' +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            '<button class="btn btn-danger" value="' + index + '" onclick="deleteProtypeData(' + item.id + ')""><span class="glyphicon glyphicon glyphicon-remove"></span></button>' +
            '</center>' +
            '</td>' +
            '</tr>'
        )
    })
    $("#tableProducttypes").DataTable();
};

$("#producttypeBtnAdd").on('click',function(){
    $("#modalAddProducttypes").modal("show");
});

$("#modalBtnAddprotype").on('click',function(){
    var protypename = $("#protypenameAdd").val();
    var protypedes = $("#protypedesAdd").val();

    var dataprotype ={
        productTypesName:protypename,
        productTypesDescription:protypedes
    }
    console.log(dataprotype);
    var jsondata = AjaxUtil.post({
        url: session.context+"/producttypeses/createprotype",
        data : JSON.stringify(dataprotype),
        complete: function (xhr) {
            if (xhr.readyState == 4) {
                if (xhr.status == 201) {
                    swal("Success","","success");
                    $("#modalAddProducttypes").modal("hide");
                    clearvaluemodalprotype();
                    $("#tableProducttypes").DataTable().destroy();
                    loadtableprotype();
                }
                else if (xhr.status == 200) {
                    swal("Failed","","warning");
                }
                else if (xhr.status == 409) {
                    swal("SameData","","warning");
                }

            } else {
                swal("FailedGG","","warning");
            }
        }
    })
});

function checkBoxInputprotype (checkbox) {
    var countInputChecked = $("input[name^='checkBoxprotype']:checked:enabled").length;
    var countInputAll  = $("[name='checkBoxprotype']").length;

    if(countInputChecked == countInputAll){
        $("#checkBoxprotypeAll").prop("checked",true);
    }
    else
    {
        $("#checkBoxprotypeAll").prop("checked",false);
    }
}

$("#checkBoxprotypeAll").on('change',function(){
    var booleanCheckAll = $("#checkBoxprotypeAll").prop("checked");
    if(booleanCheckAll){
        $("[name='checkBoxprotype']").prop("checked",true);
    }
    else{
        $("[name='checkBoxprotype']").prop("checked",false);
    }
});

function clearvaluemodalprotype(){
    $("#protypenameAdd").val("");
    $("#protypedesAdd").val("");
};

$("#modalBtnAddNextprotype").on('click',function(){
    var protypename = $("#protypenameAdd").val();
    var protypedes = $("#protypedesAdd").val();

    var data ={
        productTypesName:protypename,
        productTypesDescription:protypedes
    }

    var jsondata = AjaxUtil.post({
        url: session.context+"/producttypeses/createprotype",
        data : JSON.stringify(data),
        complete: function (xhr) {
            if (xhr.readyState == 4) {
                if (xhr.status == 201) {
                    swal("Success","","success");
                    clearvaluemodalprotype();
                    $("#tableProducttypes").DataTable().destroy();
                    loadtableprotype();
                }
                else if (xhr.status == 200) {
                    swal("Failed","","warning");
                }
                else if (xhr.status == 409) {
                    swal("SameData","","warning");
                }

            } else {
                swal("FailedGG","","warning");
            }
        }
    })
});

$("#btnCancelprotype").on('click',function(){
    $("#modalAddProducttypes").modal("hide");
});

$("#btnCancelEditProtype").on('click',function(){
    $("#modalEditProducttypes").modal("hide")
});

$("#modalBtnEditProType").on('click',function(){
    var id = $("#modalEditProducttypes").data("data-id");
    var index = $("#modalEditProducttypes").data("data-index");
    var dataTableProType = $("#tableProducttypes").data("data-table");

    var protypeNameEdit = $("#protypenameEdit").val();
    var protypeDesEdit = $("#protypedesEdit").val();
    console.log(id+" "+index+" "+dataTableProType+" "+protypeDesEdit+" "+protypeNameEdit);
    dataTableProType[index].productTypesName = protypeNameEdit;
    dataTableProType[index].productTypesDescription = protypeDesEdit;


    jsondata = AjaxUtil.put({
        url: session.context+"/producttypeses/"+id,
        data:JSON.stringify(dataTableProType[index]),
        complete: function (xhr) {
            if (xhr.readyState == 4) {
                if (xhr.status == 200) {
                    swal("Success","","success");
                    $("#modalEditProducttypes").modal("hide");
                    clearvalueeditprotypemodal();
                    $("#tableProducttypes").DataTable().destroy();
                    loadtableprotype();
                }
                else if (xhr.status == 409) {
                    swal("SameData","","warning");
                }

            } else {
                swal("FailedGG","","warning");
            }
        }
    })
});

function editprotype(btn){
    clearvalueeditprotypemodal();
    var index = btn.value;
    var dataTableProType = $("#tableProducttypes").data("data-table");

    $("#modalEditProducttypes").data("data-id",dataTableProType[index].id);
    $("#modalEditProducttypes").data("data-index",index);

    $("#protypenameEdit").val(dataTableProType[index].productTypesName);
    $("#protypedesEdit").val(dataTableProType[index].productTypesDescription);

    console.log(index+" "+dataTableProType);
    $("#modalEditProducttypes").modal("show");
};

function clearvalueeditprotypemodal(){
    $("#protypenameEdit").val("");
    $("#protypedesEdit").val("");

}

//$("#producttypeDelete").on('click',function(){
//    var arrayDeleteProtype = $("input[name^='checkBoxprotype']:checked:enabled");
//    if(arrayDeleteProtype.length <= 0){
//        swal("Please Select Data","","warning");
//    }
//    else{
//        for (var i = arrayDeleteProtype.length - 1; i >= 0; i--) {
//            deleteProType(arrayDeleteProtype[i].value);
//            swal("Delete Success","","success");
//            loadtableprotype();
//        }
//    }
//});
//
//function deleteProType(id){
//    var jsonData = AjaxUtil.delete({
//        url:session.context+"/producttypeses/"+id
//    });
//}

$("#producttypeDelete").on('click', function () {
    var arrayDeleteProtype = $("input[name^='checkBoxprotype']:checked:enabled");
    var lengthOfResponseText;
    var cSuccess = 0;
    var fSuccess = 0;
    var eprotypedelval = arrayDeleteProtype.length;
    if (eprotypedelval <= 0) {
        swal("กรุณาเลือกข้อมูลที่ต้องการลบ", "", "warning");
    } else if (eprotypedelval > 0) {
        swal({
                title: "ต้องการลบข้อมูลจำนวน " + eprotypedelval + " เรคคอร์ด",
                type: "warning",
                showCancelButton: true,
                confirmButtonColor: "#5cb85C",
                confirmButtonText: "ยืนยัน",
                cancelButtonText: "ยกเลิก",
                closeOnConfirm: false
            },
            function () {
                for (var i = eprotypedelval - 1; i >= 0; i--) {
                    lengthOfResponseText = deleteProtype(arrayDeleteProtype[i].value);
                    //console.log("GG:" + lengthOfResponseText);
                    if (lengthOfResponseText == 0) {
                        cSuccess++;
                    } else {
                        fSuccess++;
                    }
                }
                $("#tableProducttypes").DataTable().destroy();
                loadtableprotype();
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
    $("#checkBoxprotypeAll").prop("checked",false);
});

function deleteProtype(id) {
    var lengthOfResponseText;
    var data = $.ajax({
        type: "DELETE",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        headers: {
            Accept: "application/json"
        },
        url: session.context+"/producttypeses/"+id,
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
}

function deleteProtypeData(id){
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
            var delempdata = AjaxUtil.delete({
                url: session.context+"/producttypeses/"+id,
                complete: function (xhr) {
                    if (xhr.readyState == 4) {
                        if (xhr.status == 200 && xhr.responseText == "") {
                            swal("ลบข้อมูลสำเร็จ", "", "success");
                            $("#tableProducttypes").DataTable().destroy();
                            loadtableprotype();
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
}