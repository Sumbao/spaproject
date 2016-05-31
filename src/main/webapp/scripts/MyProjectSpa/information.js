
$(document).ready(function(){
    loadtableinformation();
});

function loadtableinformation(){
    clearvalueinfor();
    var infordata = AjaxUtil.get({
        url:session.context + "/informations/findallinformation"
    });
    $("#tableInformationbody").empty();
    $("#tableInformation").data("data-table", infordata);
    $.each(infordata, function (index, item) {
        $("#tableInformation").append('' +
            '<tr>' +
            '<td>'+
            '<center>'+
            '<input id="checkBoxinfor'+index+'" value="'+infordata[index].id+'" name="checkBoxinformation" type="checkbox" class="checkbox" onclick="checkBoxInputinformation(this)"/>'+
            '</center>'+
            '</td>'+
            '<td>' +
            '<center>' +
            item.informationName +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            item.informationDetail +
            '</center>' +
            '</td>' +
            '<td>' +
            '<center>' +
            '<button value="' + index + '" class="btn btn-primary" onclick="editInformation(this)""><span class="glyphicon fa fa-pencil"></span></button>' +
            '</center>' +
            '</td>' +
            '</tr>'
        )
    })
    $("#tableInformation").DataTable();
}

function checkBoxInputinformation(){
    var countInputChecked = $("input[name^='checkBoxinformation']:checked:enabled").length;
    var countInputAll  = $("[name='checkBoxinformation']").length;

    if(countInputChecked == countInputAll){
        $("#checkBoxInforAll").prop("checked",true);
    }
    else
    {
        $("#checkBoxInforAll").prop("checked",false);
    }
}

$("#checkBoxInforAll").on('change',function(){
    var booleanCheckAll = $("#checkBoxInforAll").prop("checked");
    if(booleanCheckAll){
        $("[name='checkBoxinformation']").prop("checked",true);
    }
    else{
        $("[name='checkBoxinformation']").prop("checked",false);
    }
});

$("#informationBtnAdd").on('click',function(){
    $("#modalAddInformation").modal('show');
});

$("#informationDelete").on('click',function(){

});

$("#modalBtnAddinformation").on('click',function(){
    var inforname = $("#infornameAdd").val();
    var infordes = $("#infordesAdd").val();
    var inforpicname = $("#inforfile").val();

    var infornewdata = {
        informationName:inforname,
        informationDetail:infordes,
        informationPictureName:inforpicname
    }

    var inforData = new FormData();
    inforData.append("json", JSON.stringify(infornewdata));
    inforData.append("inforfile", inforfile.files[0]);
    //console.log(formData);
    $.ajax({
        type: "POST",
        headers: {
            Accept: 'application/json',
        },
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        url: session['context'] + '/informations/createinformation/',
        processData: false,
        contentType: false,
        data: inforData,
        complete: function (xhr) {
            if (xhr.readyState == 4) {
                if (xhr.status == 201) {
                    swal("Success","","success");
                    $("#modalAddInformation").modal('hide');
                    clearvalueinfor();
                    $("#tableInformation").DataTable().destroy();
                    loadtableinformation();
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

$("#inforfile").on('change',function(){
    var filename = $("#inforfile").val();
    $("#informationPicture").val(filename);
});

function editInformation(){

}

$("#btnCancelinformation").on('click',function(){
   $("#modalAddInformation").modal('hide')
});

function clearvalueinfor(){
    $("#infornameAdd").val("");
    $("#infordesAdd").val("");
    $("#inforfile").val("");
    $("#informationPicture").val("");
}