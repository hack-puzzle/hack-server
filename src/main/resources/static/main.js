$(document).ready(function () {

    $("#btn-start-time-confirm").click(function () {
       $.ajax("change-start-time", {
           data: { startTime: $("#start-time").val() },
           method: "POST"
       }).done(function (res) {
           console.log(res);
       });
    });

    $("#btn-notification-send").click(function () {
        $.ajax("notification-send", {
            data: { text: $("#notification-text").val() },
            method: "POST"
        }).done(function (res) {
            console.log(res);
        });
    });

    $("#btn-notification-clear").click(function () {
        $.ajax("notification-clear", {
            method: "GET"
        }).done(function (res) {
            console.log(res);
        });
    });

    $("#btn-next-song").click(function () {
        $.ajax("next-song", {
            method: "GET"
        }).done(function (res) {
            console.log(res);
        });
    });

});