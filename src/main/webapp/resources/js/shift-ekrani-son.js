// JavaScript Document
$(document).ready(function() {
	$('[data-toggle="offcanvas"]').click(function(){
		$('#side-menu').toggleClass('hidden-xs');	
	});
		$("#kaydet-btn").click(function () {
        window.location.href = "shift-ekrani-kayitli.html";
    })
	$("#elle-btn").click(function () {
        window.location.href = "";
    })
	$("#duzenle-btn").click(function () {
        window.location.href = "shift-ekrani.html";
    })
});

