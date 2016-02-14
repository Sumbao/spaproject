/**
 * ## Ajax Pattern ##########################################################################################
 */

/**
 * Ajax Pattern
 * Merge defaults and options, without modifying defaults
 * @default {POST} type
 */
var ajaxPattern = {
    type: '',
    url: '',
//    statusCode: {
//        200: function () {
//            console.log('HttpStatus.OK');
//        },
//        204: function () {
//            console.log('HttpStatus.NO_CONTENT');
//        },
//        401: function () {
//            console.log('HttpStatus.UNAUTHORIZED');
//        },
//        403: function () {
//            console.log('HttpStatus.FORBIDDEN');
//        },
//        404: function () {
//            console.log('HttpStatus.NOT_FOUND');
//        },
//        500: function () {
//            console.log('HttpStatus.INTERNAL_SERVER_ERROR');
//        }
//    },
    async: false,
    data: '',
    beforeSend: function () {
        $('.dv-background').show();
    },
    complete: function () {
        $('.dv-background').hide();
    }
}

var AjaxUtil = {};

AjaxUtil.get = function(options){

    var defaults = {              //set the defaults
        headers: {
            Accept : "application/json"
        },
        type: "GET",
        async: false,
    };
    $.extend(options,defaults);

    var dataText = $.ajax(options).responseText;
    var json = JSON.parse(dataText);

    return json;
};

AjaxUtil.post = function(options){

    var defaults = {              //set the defaults
        type: "POST",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        headers: {
            Accept: "application/json"
        },
        async: false
    };

    $.extend(options,defaults);
    var dataText = $.ajax(options).responseText;
    if(dataText.trim() == ""){
        return JSON.stringify("{}");
    }
    var json = JSON.parse(dataText);
    return json;
};

AjaxUtil.put = function(options){

    var defaults = {
        type: "PUT",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        headers: {
            Accept: "application/json"
        },
        async: false
    };

    $.extend(options,defaults);
    var dataText = $.ajax(options).responseText;
    if(dataText.trim() == ""){
        return JSON.stringify("{}");
    }
    var json = JSON.parse(dataText);
    return json;
};

AjaxUtil.delete= function(options){

    var defaults = {
        type: "DELETE",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        headers: {
            Accept: "application/json"
        },
        async: false
    };

    $.extend(options,defaults);
    var dataText = $.ajax(options).responseText;
    if(dataText.trim() == ""){
        return JSON.stringify("{}");
    }
    var json = JSON.parse(dataText);
    return json;
};


function commonChangeLanguage(language) {
    var url = window.location.href;
    if (url.indexOf("lang=") >= 0) {
        var prefix = url.substring(0, url.indexOf("lang"));
        var suffix = url.substring(url.indexOf("lang")).substring(url.indexOf("=") + 1);
        suffix = (suffix.indexOf("&") >= 0) ? suffix.substring(suffix.indexOf("&")) : "";
        url = prefix + "lang=" + language + suffix;
    } else {
        if (url.indexOf("?") < 0)
            url += "?" + "lang=" + language;
        else
            url += "&" + "lang=" + language;
    }
    window.location.href = url;
}
