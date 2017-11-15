// JavaScript Document
$(document).ready(function() {
	$('[data-toggle="offcanvas"]').click(function(){
		$('#side-menu').toggleClass('hidden-xs');	
	});
	$(".duzenle-btn").click(function () {
        window.location.href = "calisma-tipleri-kayitli.html";
    })
	$(".yduzenle-btn").click(function () {
        window.location.href = "calisma-tipleri.html";
    })
	$(".detay-btn").click(function () {
        window.location.href = "calisma-tipleri-detay.html";
    })
});

