$(document).ready(function () {
    loadmassagetype();
    loadtableMassage();
});



function loadtableMassage() {
    var massageData = AjaxUtil.get({
        url: session.context + "/massages/findallmassage"
    });
    $("#tablemassagebody").empty();
    $("#tableMassage").data("data-table", massageData);

    $.each(massageData, function (index, item) {
        $("#tableMassage").append('' +
            '<tr>' +
            '<td>' +
            '<center>' +
            '<input id="checkBoxMassage' + index + '" value="' + massageData[index].id + '" name="checkBoxMassage" type="checkbox" class="checkbox" onclick="checkBoxInputMassage(this)"/>' +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.massageCode +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.massageName +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.massageTypes.massageTypeName +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.massageTime + " นาที" +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            '<button value="' + index + '" class="btn btn-primary" onclick="editMassage(this)""><span class="glyphicon fa fa-pencil"></span></button>' +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            '<button class="btn btn-danger" value="' + index + '" onclick="deleteMassageData(' + item.id + ')""><span class="glyphicon glyphicon glyphicon-remove"></span></button>' +
            '</center>' +
            '</td>' +
            '</tr>'
        )
    });
    $("#tableMassage").DataTable();

}

function loadmassagetype() {
    $("#select_Massagetype").empty();
    var mastype = AjaxUtil.get({
        url: session.context + "/massagetypeses/findmassagetype"
    });

    $.each(mastype, function (index, item) {
        $("#select_Massagetype").append("<option value=" + item.id + "#" + item.version + " >" + item.massageTypeName + "</option>");
        $("#select_MassagetypeEdit").append("<option value=" + item.id + "#" + item.version + " >" + item.massageTypeName + "</option>");
    });
}

$("#massageBtnAdd").on('click', function () {
    $("#modalAddMassage").modal('show');
});

$("#modalBtnAddmassage").on('click', function () {
    var massagecode = $("#massageCodeAdd").val();
    var massagename = $("#massagenameAdd").val();
    var massagetype = $("#select_Massagetype").val().split("#");
    var massagetime = $("#select_MassageTime").val();
    var massagedes = $("#massageDesAdd").val();

    var massagenewdata = {
        massageCode: massagecode,
        massageName: massagename,
        massageDetail: massagedes,
        massageTime: massagetime,
        massageTypes: {id: massagetype[0], version: massagetype[1]}
    }

    var newdatamassage = AjaxUtil.post({
        url: session.context + "/massages",
        data: JSON.stringify(massagenewdata),
        complete: function (xhr) {
            if (xhr.readyState == 4) {
                if (xhr.status == 201) {
                    swal("Success", "", "success");
                    $("#modalAddMassage").modal('hide');
                    clearvalueAddMassage();
                    $("#tableMassage").DataTable().destroy();
                    loadtableMassage();

                }
                else if (xhr.status == 409) {
                    swal("Same data", "", "warning");
                }
                else if (xhr.status == 500) {
                    swal("Failed", "", "warning");
                }
            } else {
                swal("error", "", "warning");
            }
        }
    });
});

$("#modalBtnAddNextmassage").on('click', function () {
    var massagecode = $("#massageCodeAdd").val();
    var massagename = $("#massagenameAdd").val();
    var massagetype = $("#select_Massagetype").val().split("#");
    var massagetime = $("#select_MassageTime").val();
    var massagedes = $("#massageDesAdd").val();

    var massagenewdata = {
        massageCode: massagecode,
        massageName: massagename,
        massageDetail: massagedes,
        massageTime: massagetime,
        massageTypes: {id: massagetype[0], version: massagetype[1]}
    }

    var newdatamassage = AjaxUtil.post({
        url: session.context + "/massages",
        data: JSON.stringify(massagenewdata),
        complete: function (xhr) {
            if (xhr.readyState == 4) {
                if (xhr.status == 201) {
                    swal("Success", "", "success");
                    clearvalueAddMassage();
                    $("#tableMassage").DataTable().destroy();
                    loadtableMassage();
                    //paggingtabllemassage();
                }
                else if (xhr.status == 409) {
                    swal("Same data", "", "warning");
                }
                else if (xhr.status == 500) {
                    swal("Failed", "", "warning");
                }
            } else {
                swal("error", "", "warning");
            }
        }
    });
});

function editMassage(btn) {
    clearvaluemodal();
    var index = btn.value;
    var dataTableMassage = $("#tableMassage").data("data-table");

    $("#modalEditMassage").data("data-id", dataTableMassage[index].id);
    $("#modalEditMassage").data("data-index", index);

    $("#massageCodeEdit").val(dataTableMassage[index].massageCode);
    $("#massagenameEdit").val(dataTableMassage[index].massageName);
    $("#massageDesEdit").val(dataTableMassage[index].massageDetail);
    $("#select_MassagetypeEdit").val(dataTableMassage[index].massageTypes.id + "#" + dataTableMassage[index].massageTypes.version);
    $("#select_MassageTimeEdit").val(dataTableMassage[index].massageTime);
    console.log(dataTableMassage[index].massageTypes.id + "#" + dataTableMassage[index].massageTypes.version);
    $("#modalEditMassage").modal("show");
}

function clearvalueAddMassage() {
    $("#massageCodeAdd").val("");
    $("#massagenameAdd").val("");
    $("#massageDesAdd").val("");
}

function checkBoxInputMassage(checkbox) {
    var countInputChecked = $("input[name^='checkBoxMassage']:checked:enabled").length;
    var countInputAll = $("[name='checkBoxMassage']").length;

    if (countInputChecked == countInputAll) {
        $("#checkBoxMassageAll").prop("checked", true);
    }
    else {
        $("#checkBoxMassageAll").prop("checked", false);
    }
}

$("#checkBoxMassageAll").on('change', function () {
    var booleanCheckAll = $("#checkBoxMassageAll").prop("checked");
    if (booleanCheckAll) {
        $("[name='checkBoxMassage']").prop("checked", true);
    }
    else {
        $("[name='checkBoxMassage']").prop("checked", false);
    }
});

function deleteMassageData(id) {
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
            var delmasdata = AjaxUtil.delete({
                url: session.context + "/massages/" + id,
                complete: function (xhr) {
                    if (xhr.readyState == 4) {
                        if (xhr.status == 200 && xhr.responseText == "") {
                            swal("ลบข้อมูลสำเร็จ", "", "success");
                            $("#tableMassage").DataTable().destroy();
                            loadtableMassage();
                            //paggingtabllemassage();
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

$("#btnCancelmassage").on('click', function () {
    $("#modalAddMassage").modal('hide');
});

$("#btnCancelEditmassage").on('click', function () {
    $("#modalEditMassage").modal('hide');
});

function clearvaluemodalEdit() {
    $("#massagenameEdit").val("");
    $("#massageCodeEdit").val("");
    $("#massageDesEdit").val("");
}

$("#modalBtnEditmassage").on('click', function () {
    var id = $("#modalEditMassage").data("data-id");
    var index = $("#modalEditMassage").data("data-index");
    var dataTableMassage = $("#tableMassage").data("data-table");
    var massagecodeEdit = $("#massageCodeEdit").val();
    var massagenameEdit = $("#massagenameEdit").val();
    var massagetypeEdit = $("#select_MassagetypeEdit").val().split("#");
    var massagetimeEdit = $("#select_MassageTimeEdit").val();
    var massagedesEdit = $("#massageDesEdit").val();

    dataTableMassage[index].massageCode = massagecodeEdit;
    dataTableMassage[index].massageName = massagenameEdit;
    dataTableMassage[index].massageTypes = {id: massagetypeEdit[0], version: massagetypeEdit[1]};
    dataTableMassage[index].massageTime = massagetimeEdit;
    dataTableMassage[index].massageDetail = massagedesEdit;


    jsondata = AjaxUtil.put({
        url: session.context + "/massages/" + id,
        data: JSON.stringify(dataTableMassage[index]),
        complete: function (xhr) {
            if (xhr.readyState == 4) {
                if (xhr.status == 200) {
                    swal("Success", "", "success");
                    $("#modalEditMassage").modal("hide");
                    clearvaluemodalEdit();
                    $("#tableMassage").DataTable().destroy();
                    loadtableMassage();
                    //paggingtabllemassage();
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

$("#massageDelete").on('click', function () {
    var arrayDeleteMassage = $("input[name^='checkBoxMassage']:checked:enabled");
    var lengthOfResponseText;
    var cSuccess = 0;
    var fSuccess = 0;
    var empdelmassage = arrayDeleteMassage.length;
    if (empdelmassage <= 0) {
        swal("กรุณาเลือกข้อมูลที่ต้องการลบ", "", "warning");
    } else if (empdelmassage > 0) {
        swal({
                title: "ต้องการลบข้อมูลจำนวน " + empdelmassage + " เรคคอร์ด",
                type: "warning",
                showCancelButton: true,
                confirmButtonColor: "#5cb85C",
                confirmButtonText: "ยืนยัน",
                cancelButtonText: "ยกเลิก",
                closeOnConfirm: false
            },
            function () {
                for (var i = arrayDeleteMassage.length - 1; i >= 0; i--) {
                    lengthOfResponseText = deleteMassage(arrayDeleteMassage[i].value);
                    //console.log("GG:" + lengthOfResponseText);
                    if (lengthOfResponseText == 0) {
                        cSuccess++;
                    } else {
                        fSuccess++;
                    }
                }
                $("#tableMassage").DataTable().destroy();
                loadtableMassage();

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
    $("#checkBoxMassageAll").prop("checked", false);
});

function deleteMassage(id) {
    var lengthOfResponseText;
    var data = $.ajax({
        type: "DELETE",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        headers: {
            Accept: "application/json"
        },
        url: session.context + "/massages/" + id,
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