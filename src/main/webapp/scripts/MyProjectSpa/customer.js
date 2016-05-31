loadtablecustomer();
function loadtablecustomer() {
    var customerdata = AjaxUtil.get({
        url: session.context + "/customers"
    });
    $("#tableCustomerbody").empty();
    $("#tableCustomer").data("data-table", customerdata);
    $.each(customerdata, function (index, item) {
        $("#tableCustomer").append('' +
            '<tr>' +
            '<td>' +
            '<center>' +
            item.customerName +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.customerAddr +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.customerEmail +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.customerTel +
            '</center>' +
            '</td>' +
            //'<td>' +
            //'<center>' +
            //'<button value="' + index + '" class="btn btn-primary" onclick="editCustomer(this)""><span class="glyphicon fa fa-pencil"></span></button>' +
            //'</center>' +
            //'</td>' +
            '<td>' +
            '<center>' +
            '<button class="btn btn-danger" value="' + index + '" onclick="deleteCustomerData(' + item.id + ')""><span class="glyphicon glyphicon glyphicon-remove"></span></button>' +
            '</center>' +
            '</td>' +
            '</tr>'
        )
    })
    $("#tableCustomer").DataTable();
}

//function editCustomer() {
//
//}

function deleteCustomerData(id) {
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
            var delcusdata = AjaxUtil.delete({
                url: session.context + "/customers/" + id,
                complete: function (xhr) {
                    if (xhr.readyState == 4) {
                        if (xhr.status == 200 && xhr.responseText == "") {
                            swal("ลบข้อมูลสำเร็จ", "", "success");
                            $("#tableCustomer").DataTable().destroy();
                            loadtablecustomer();
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