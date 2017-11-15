// JavaScript Document
$(document).ready(function() {
	$('[data-toggle="offcanvas"]').click(function(){
		$('#side-menu').toggleClass('hidden-xs');	
	});
	$("#kaydet-btn").click(function () {
        window.location.href = "calisma-tipleri-liste.html";
    })
});

