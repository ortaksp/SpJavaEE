// JavaScript Document
$(document).ready(function() {
	$('[data-toggle="offcanvas"]').click(function(){
		$('#side-menu').toggleClass('hidden-xs');	
	});							
	$("#kaydet-btn").click(function () {
        window.location.href = "";
    })
	$("#geri-btn").click(function () {
        window.location.href = "";
    })

    $('[data-toggle="tooltip"]').tooltip(); 
	
	$(function() {
        $.mask.definitions['~'] = "[+-]";
        $("#tel").mask("(9999) 999-9999");
		
        $("input").blur(function() {
            $("#tel").html("Unmasked value: " + $(this).mask());
        }).dblclick(function() {
            $(this).unmask();
        });
    });
});

