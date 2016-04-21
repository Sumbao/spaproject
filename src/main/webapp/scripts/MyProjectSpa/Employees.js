/**
 * Created by zazabi37 on 31/03/2016.
 */
//$( document ).ready(function() {
//    console.log( "ready!" );
//});
loadtable();
function loadtable(){
    clearvaluemodal();
    jsonData = AjaxUtil.get({
        url:session.context+"/employees/findalldataemployee"
    })
    $("#tableEmployee").empty();
    $("#tableEmployee").data("data-table", jsonData);
    $.each(jsonData, function (index, item) {
        $("#tableEmployee").append('' +
            '<tr>' +
            '<td>'+
            '<center>'+
            '<input id="checkBoxEmployee'+index+'" value="'+jsonData[index].id+'" name="checkBoxEmployee" type="checkbox" class="checkbox" onclick="checkBoxInputEmployee(this)"/>'+
            '</center>'+
            '</td>'+
            '<td>' +
            '<center>' +
            '<button value="' + index + '" class="btn btn-primary" onclick="editemployee(this)""><span class="glyphicon fa fa-pencil"></span></button>' +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.empCode +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.empName +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.empAddr +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.empTel +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.empEmail +
            '</center>' +
            '</td>' +
            '</tr>'
        )
    })
};

$("#employeeBtnAdd").on('click',function(){
    $("#modalAddEmployee").modal("show");
});

$("#modalBtnAddEmp").on('click',function(){
    var empcode = $("#empCodeAdd").val();
    var empname = $("#empNameAdd").val();
    var empaddr = $("#empAddrAdd").val();
    var emptel = $("#empTelAdd").val();
    var empmail = $("#empemailAdd").val();

    var data ={
        empCode:empcode,
        empName:empname,
        empAddr:empaddr,
        empTel:emptel,
        empEmail:empmail
    }

    var jsondata = AjaxUtil.post({
        url: session.context+"/employees/createmployee",
        data : JSON.stringify(data),
        complete: function (xhr) {
            if (xhr.readyState == 4) {
                if (xhr.status == 201) {
                    swal("Success","","success");
                    $("#modalAddEmployee").modal("hide");
                    clearvaluemodal();
                    loadtable();
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

function checkBoxInputEmployee (checkbox) {
    var countInputChecked = $("input[name^='checkBoxEmployee']:checked:enabled").length;
    var countInputAll  = $("[name='checkBoxEmployee']").length;

    if(countInputChecked == countInputAll){
        $("#checkBoxEmployeeAll").prop("checked",true);
    }
    else
    {
        $("#checkBoxEmployeeAll").prop("checked",false);
    }
}

$("#checkBoxEmployeeAll").on('change',function(){
    var booleanCheckAll = $("#checkBoxEmployeeAll").prop("checked");
    if(booleanCheckAll){
        $("[name='checkBoxEmployee']").prop("checked",true);
    }
    else{
        $("[name='checkBoxEmployee']").prop("checked",false);
    }
});

function clearvaluemodal(){
    $("#empCodeAdd").val("");
    $("#empNameAdd").val("");
    $("#empAddrAdd").val("");
    $("#empTelAdd").val("");
    $("#empemailAdd").val("");
};

$("#modalBtnAddNextEmp").on('click',function(){
    var empcode = $("#empCodeAdd").val();
    var empname = $("#empNameAdd").val();
    var empaddr = $("#empAddrAdd").val();
    var emptel = $("#empTelAdd").val();
    var empmail = $("#empemailAdd").val();

    var data ={
        empCode:empcode,
        empName:empname,
        empAddr:empaddr,
        empTel:emptel,
        empEmail:empmail
    }

    var jsondata = AjaxUtil.post({
        url: session.context+"/employees/createmployee",
        data : JSON.stringify(data),
        complete: function (xhr) {
            if (xhr.readyState == 4) {
                if (xhr.status == 201) {
                    swal("Success","","success");
                    clearvaluemodal();
                    loadtable();
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

$("#btnCancelAdd").on('click',function(){
    $("#modalAddEmployee").modal("hide");
});

$("#btnEditEmployee").on('click',function(){
   $("#modalEditEmployee").modal("show");
});

$("#btnCancelEdit").on('click',function(){
    $("#modalEditEmployee").modal("hide")
});

$("#modalBtnEditEmp").on('click',function(){
    var id = $("#modalEditEmployee").data("data-id");
    var index = $("#modalEditEmployee").data("data-index");
    var dataTableEmployee = $("#tableEmployee").data("data-table");
    var empcodeEdit = $("#empCodeEdit").val();
    var empnameEdit = $("#empNameEdit").val();
    var empaddrEdit = $("#empAddrEdit").val();
    var emptelEdit = $("#empTelEdit").val();
    var empmailEdit = $("#empemailEdit").val();

    dataTableEmployee[index].empCode = empcodeEdit;
    dataTableEmployee[index].empName = empnameEdit;
    dataTableEmployee[index].empAddr = empaddrEdit;
    dataTableEmployee[index].empTel = emptelEdit;
    dataTableEmployee[index].empEmail = empmailEdit;


    jsondata = AjaxUtil.put({
        url: session.context+"/employees/"+id,
        data:JSON.stringify(dataTableEmployee[index]),
        complete: function (xhr) {
            if (xhr.readyState == 4) {
                if (xhr.status == 200) {
                    swal("Success","","success");
                    $("#modalEditEmployee").modal("hide");
                    clearvalueeditmodal();
                    loadtable();
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

function editemployee(btn){
    clearvaluemodal();
    var index = btn.value;
    var dataTableEmployee = $("#tableEmployee").data("data-table");

    $("#modalEditEmployee").data("data-id",dataTableEmployee[index].id);
    $("#modalEditEmployee").data("data-index",index);

    $("#empCodeEdit").val(dataTableEmployee[index].empCode);
    $("#empNameEdit").val(dataTableEmployee[index].empName);
    $("#empAddrEdit").val(dataTableEmployee[index].empAddr);
    $("#empTelEdit").val(dataTableEmployee[index].empTel);
    $("#empemailEdit").val(dataTableEmployee[index].empEmail);

    $("#modalEditEmployee").modal("show");
};

function clearvalueeditmodal(){
    $("#empCodeEdit").val("");
    $("#empNameEdit").val("");
    $("#empAddrEdit").val("");
    $("#empTelEdit").val("");
    $("#empemailEdit").val("");
}

$("#employeesDelete").on('click',function(){
    var arrayDeleteEmp = $("input[name^='checkBoxEmployee']:checked:enabled");
    if(arrayDeleteEmp.length <= 0){
        swal("Please Select Data","","warning");
    }
    else{
        for (var i = arrayDeleteEmp.length - 1; i >= 0; i--) {
            deleteEmp(arrayDeleteEmp[i].value);
            swal("Delete Success","","success");
            loadtable();
        }
    }
});

function deleteEmp(id){
    var jsonData = AjaxUtil.delete({
        url:session.context+"/employees/"+id
    });
}