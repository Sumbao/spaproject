/**
 * Created by zazabi37 on 20/04/2016.
 */
loadtableprotype();
function loadtableprotype(){
    clearvaluemodal();
    jsonData = AjaxUtil.get({
        url:session.context+"/producttypeses/findallprotype"
    })
    $("#tableProducttypes").empty();
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
            '<button value="' + index + '" class="btn btn-primary" onclick="editprotype(this)""><span class="glyphicon fa fa-pencil"></span></button>' +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.productTypesName +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.productTypesDescription +
            '</center>' +
            '</td>' +
            '</tr>'
        )
    })
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

$("#producttypeDelete").on('click',function(){
    var arrayDeleteProtype = $("input[name^='checkBoxprotype']:checked:enabled");
    if(arrayDeleteProtype.length <= 0){
        swal("Please Select Data","","warning");
    }
    else{
        for (var i = arrayDeleteProtype.length - 1; i >= 0; i--) {
            deleteProType(arrayDeleteProtype[i].value);
            swal("Delete Success","","success");
            loadtableprotype();
        }
    }
});

function deleteProType(id){
    var jsonData = AjaxUtil.delete({
        url:session.context+"/producttypeses/"+id
    });
}