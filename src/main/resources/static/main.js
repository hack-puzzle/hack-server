$(document).ready(function () {

    $("#btn-start-time-confirm").click(function () {
       $.ajax("change-start-time", {
           data: { startTime: $("#start-time").val() },
           method: "POST"
       }).done(function (res) {
           console.log(res);
       });
    });

});