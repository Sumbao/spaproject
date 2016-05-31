/**
 * Created by zazabi37 on 31/03/2016.
 */
//$( document ).ready(function() {
//    console.log( "ready!" );
//});
loadtable();
function loadtable() {
    clearvaluemodal();
    var jsonData = AjaxUtil.get({
        url: session.context + "/employees/findalldataemployee"
    })
    $("#tableEmployeebody").empty();
    $("#tableEmployee").data("data-table", jsonData);
    $.each(jsonData, function (index, item) {
        $("#tableEmployee").append('' +
            '<tr>' +
            '<td>' +
            '<center>' +
            '<input id="checkBoxEmployee' + index + '" value="' + jsonData[index].id + '" name="checkBoxEmployee" type="checkbox" class="checkbox" onclick="checkBoxInputEmployee(this)"/>' +
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
            '<td>' +
            '<center>' +
            '<button value="' + index + '" class="btn btn-primary" onclick="editemployee(this)""><span class="glyphicon fa fa-pencil"></span></button>' +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            '<button class="btn btn-danger" value="' + index + '" onclick="deleteEmpData(' + item.id + ')""><span class="glyphicon glyphicon glyphicon-remove"></span></button>' +
            '</center>' +
            '</td>' +
            '</tr>'
        )
    })
    $("#tableEmployee").DataTable();
};

$("#employeeBtnAdd").on('click', function () {
    $("#modalAddEmployee").modal("show");
});

$("#modalBtnAddEmp").on('click', function () {
    var empcode = $("#empCodeAdd").val();
    var empname = $("#empNameAdd").val();
    var empaddr = $("#empAddrAdd").val();
    var emptel = $("#empTelAdd").val();
    var empmail = $("#empemailAdd").val();

    var data = {
        empCode: empcode,
        empName: empname,
        empAddr: empaddr,
        empTel: emptel,
        empEmail: empmail
    }

    var jsondata = AjaxUtil.post({
        url: session.context + "/employees/createmployee",
        data: JSON.stringify(data),
        complete: function (xhr) {
            if (xhr.readyState == 4) {
                if (xhr.status == 201) {
                    swal("Success", "", "success");
                    $("#modalAddEmployee").modal("hide");
                    clearvaluemodal();
                    $("#tableEmployee").DataTable().destroy();
                    loadtable();
                }
                else if (xhr.status == 200) {
                    swal("Failed", "", "warning");
                }
                else if (xhr.status == 409) {
                    swal("SameData", "", "warning");
                }

            } else {
                swal("FailedGG", "", "warning");
            }
        }
    })
});

function checkBoxInputEmployee(checkbox) {
    var countInputChecked = $("input[name^='checkBoxEmployee']:checked:enabled").length;
    var countInputAll = $("[name='checkBoxEmployee']").length;

    if (countInputChecked == countInputAll) {
        $("#checkBoxEmployeeAll").prop("checked", true);
    }
    else {
        $("#checkBoxEmployeeAll").prop("checked", false);
    }
}

$("#checkBoxEmployeeAll").on('change', function () {
    var booleanCheckAll = $("#checkBoxEmployeeAll").prop("checked");
    if (booleanCheckAll) {
        $("[name='checkBoxEmployee']").prop("checked", true);
    }
    else {
        $("[name='checkBoxEmployee']").prop("checked", false);
    }
});

function clearvaluemodal() {
    $("#empCodeAdd").val("");
    $("#empNameAdd").val("");
    $("#empAddrAdd").val("");
    $("#empTelAdd").val("");
    $("#empemailAdd").val("");
};

$("#modalBtnAddNextEmp").on('click', function () {
    var empcode = $("#empCodeAdd").val();
    var empname = $("#empNameAdd").val();
    var empaddr = $("#empAddrAdd").val();
    var emptel = $("#empTelAdd").val();
    var empmail = $("#empemailAdd").val();

    var data = {
        empCode: empcode,
        empName: empname,
        empAddr: empaddr,
        empTel: emptel,
        empEmail: empmail
    }

    var jsondata = AjaxUtil.post({
        url: session.context + "/employees/createmployee",
        data: JSON.stringify(data),
        complete: function (xhr) {
            if (xhr.readyState == 4) {
                if (xhr.status == 201) {
                    swal("Success", "", "success");
                    clearvaluemodal();
                    $("#tableEmployee").DataTable().destroy();
                    loadtable();
                }
                else if (xhr.status == 200) {
                    swal("Failed", "", "warning");
                }
                else if (xhr.status == 409) {
                    swal("SameData", "", "warning");
                }

            } else {
                swal("FailedGG", "", "warning");
            }
        }
    })
});

$("#btnCancelAdd").on('click', function () {
    $("#modalAddEmployee").modal("hide");
});

$("#btnEditEmployee").on('click', function () {
    $("#modalEditEmployee").modal("show");
});

$("#btnCancelEdit").on('click', function () {
    $("#modalEditEmployee").modal("hide")
});

$("#modalBtnEditEmp").on('click', function () {
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
        url: session.context + "/employees/" + id,
        data: JSON.stringify(dataTableEmployee[index]),
        complete: function (xhr) {
            if (xhr.readyState == 4) {
                if (xhr.status == 200) {
                    swal("Success", "", "success");
                    $("#modalEditEmployee").modal("hide");
                    clearvalueeditmodal();
                    $("#tableEmployee").DataTable().destroy();
                    loadtable();
                }
                else if (xhr.status == 409) {
                    swal("SameData", "", "warning");
                }

            } else {
                swal("FailedGG", "", "warning");
            }
        }
    })
});

function editemployee(btn) {
    clearvaluemodal();
    var index = btn.value;
    var dataTableEmployee = $("#tableEmployee").data("data-table");

    $("#modalEditEmployee").data("data-id", dataTableEmployee[index].id);
    $("#modalEditEmployee").data("data-index", index);

    $("#empCodeEdit").val(dataTableEmployee[index].empCode);
    $("#empNameEdit").val(dataTableEmployee[index].empName);
    $("#empAddrEdit").val(dataTableEmployee[index].empAddr);
    $("#empTelEdit").val(dataTableEmployee[index].empTel);
    $("#empemailEdit").val(dataTableEmployee[index].empEmail);

    $("#modalEditEmployee").modal("show");
};

function clearvalueeditmodal() {
    $("#empCodeEdit").val("");
    $("#empNameEdit").val("");
    $("#empAddrEdit").val("");
    $("#empTelEdit").val("");
    $("#empemailEdit").val("");
}

$("#employeesDelete").on('click', function () {
    var arrayDeleteEmp = $("input[name^='checkBoxEmployee']:checked:enabled");
    var lengthOfResponseText;
    var cSuccess = 0;
    var fSuccess = 0;
    var empdelval = arrayDeleteEmp.length;
    if (empdelval <= 0) {
        swal("กรุณาเลือกข้อมูลที่ต้องการลบ", "", "warning");
    } else if (empdelval > 0) {
        swal({
                title: "ต้องการลบข้อมูลจำนวน " + empdelval + " เรคคอร์ด",
                type: "warning",
                showCancelButton: true,
                confirmButtonColor: "#5cb85C",
                confirmButtonText: "ยืนยัน",
                cancelButtonText: "ยกเลิก",
                closeOnConfirm: false
            },
            function () {
                for (var i = arrayDeleteEmp.length - 1; i >= 0; i--) {
                    lengthOfResponseText = deleteEmp(arrayDeleteEmp[i].value);
                    //console.log("GG:" + lengthOfResponseText);
                    if (lengthOfResponseText == 0) {
                        cSuccess++;
                    } else {
                        fSuccess++;
                    }
                }
                $("#tableEmployee").DataTable().destroy();
                loadtable();

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
    $("#checkBoxEmployeeAll").prop("checked", false);
});

function deleteEmp(id) {
    var lengthOfResponseText;
    var data = $.ajax({
        type: "DELETE",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        headers: {
            Accept: "application/json"
        },
        url: session.context + "/employees/" + id,
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

function deleteEmpData(id) {

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
                url: session.context + "/employees/" + id,
                complete: function (xhr) {
                    if (xhr.readyState == 4) {
                        if (xhr.status == 200 && xhr.responseText == "") {
                            swal("ลบข้อมูลสำเร็จ", "", "success");
                            $("#tableEmployee").DataTable().destroy();
                            loadtable();
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


