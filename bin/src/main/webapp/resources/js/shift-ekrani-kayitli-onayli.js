// JavaScript Document
$(document).ready(function() {
	$('[data-toggle="offcanvas"]').click(function(){
		$('#side-menu').toggleClass('hidden-xs');	
	});
		$("#new-shift-btn").click(function () {
        window.location.href = "shift-ekrani.html";
    })
	$("#analiz-btn").click(function () {
        window.location.href = "analiz-ekrani.html";
    })
												/*------------------CHECBOX-TOP BEGİN---------------------*/
	$("#top").change(function () {
        if ($("#top").is(':checked')) {
            $("input[class$='toplam']").prop('disabled', true);
        }
        else {
            $("input[class$='toplam']").prop('disabled', false);
        }
    });
	$(".total").keyup(function () {

        if ($("#top").is(':checked'))
            $(".toplam").val($(".total").val());
    });
	$(".total").click(function () {

        if ($("#top").is(':checked'))
            $(".toplam").val($(".total").val());
    });											/*------------------CHECBOX-TOP END---------------------*/
												/*------------------CHECBOX-AC BEGİN---------------------*/
	$("#ac").change(function () {
        if ($("#ac").is(':checked')) {
            $("input[class$='acilis']").prop('disabled', true);
        }
        else {
            $("input[class$='acilis']").prop('disabled', false);
        }
    });
	$(".open").keyup(function () {

        if ($("#ac").is(':checked'))
            $(".acilis").val($(".open").val());
    });
	$(".open").click(function () {

        if ($("#ac").is(':checked'))
            $(".acilis").val($(".open").val());
    });											/*------------------CHECBOX-AC END---------------------*/
												/*------------------CHECBOX-KAPA BEGİN---------------------*/
	$("#kapa").change(function () {
        if ($("#kapa").is(':checked')) {
            $("input[class$='kapanis']").prop('disabled', true);
        }
        else {
            $("input[class$='kapanis']").prop('disabled', false);
        }
    });
	$(".closer").keyup(function () {

        if ($("#kapa").is(':checked'))
            $(".kapanis").val($(".closer").val());
    });
	$(".closer").click(function () {

        if ($("#kapa").is(':checked'))
            $(".kapanis").val($(".closer").val());
    });											/*------------------CHECBOX-KAPA END---------------------*/
												/*------------------CHECBOX-ARA BEGİN---------------------*/
	$("#ara").change(function () {
        if ($("#ara").is(':checked')) {
            $("input[class$='ara").prop('disabled', true);
        }
        else {
            $("input[class$='ara']").prop('disabled', false);
        }
    });
	$(".middle").keyup(function () {

        if ($("#ara").is(':checked'))
            $(".ara").val($(".middle").val());
    });
	$(".middle").click(function () {

        if ($("#ara").is(':checked'))
            $(".ara").val($(".middle").val());
    });											/*------------------CHECBOX-ARA END---------------------*/

});

