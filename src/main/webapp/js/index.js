$(document).ready(function () {
    queryBasicInformation(1);
});

function queryBasicInformation(pageNum){
    $.ajax({
        url: basePath+"/collection/queryBasicInformation.action",
        data: {pageNum:pageNum},
        dataType: "html",
        method: "get",
        async: false,
        success: function (html) {
            $("#showAnswer").html(html);
        }
    });
}

function search(pageNum){
    queryBasicInformation(pageNum);
}
