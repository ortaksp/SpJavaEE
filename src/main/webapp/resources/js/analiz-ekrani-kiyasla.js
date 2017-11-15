// JavaScript Document
$(document).ready(function() {
	$('[data-toggle="offcanvas"]').click(function(){
		$('#side-menu').toggleClass('hidden-xs');	
	});
	$("#kiyasla-btn").click(function () {
        window.location.href = "analiz-ekrani.html";
    })
	
	new Chart(document.getElementById("bar-chart"), {
    type: 'bar',
    data: {
      labels: ["Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"],
      datasets: [
        {
          label: "..tarihi ciro(tl)",
          data: [2478,5267,734,784,433, 234, 3534],
		  backgroundColor: "red",
		  fill: "false"
        }
      ]
    },
    options: {
      legend: { display: true, position: "right" },
      title: {
        display: true,
        text: '31. Hafta, 32. Hafta, ...'
      }
    }
});
	
//günlük-ciro grafiği

	new Chart(document.getElementById("bar-chart-2"), {
    type: 'bar',
    data: {
      labels: ["07.00-08.00", "08.00-09.00", "09.00-10.00", "10.00-11.00", "11.00-12.00", "12.00-13.00", "13.00-14.00", "14.00-15.00", "15.00-16.00", "16.00-17.00", "17.00-18.00", "18.00-19.00", "19.00-20.00", "20.00-21.00", "21.00-22.00", "22.00-23.00"],
      datasets: [
        {
          label: "07.08.17(32. Hafta)",
          data: [2478,5267,734,784,433, 234, 3534, 2478,5267,734,784,433, 234, 3534, 2478,5267],
		  backgroundColor: "green"
        },
		{
          label: "13.08.17(33. Hafta)",
          data: [123,5267,734,54,433, 234, 3534, 67,5267,734,784,433, 234, 789, 2478,789],
		  backgroundColor: "red"
        }
      ]
    },
    options: {
      legend: {
		  position: "right",
		  display: true
		  },
      title: {
        display: true,
        text: '07.08.17(32. Hafta), 13.08.17(33. Hafta)'
      }
    }
});


//Chosen select

var config = {
	".chosen-select" : {},
	".chosen-select-deselect" : {allow_single_deselect: true},
	".chosen-select-no-single" : {disable_search_treshold: 10},
	".chosen-select-no-result" : {no_result_text: "Birşey bulunamadı"},
	".chosen-select-width" : {width: "95%"}
}
	for (var selector in config) {
	$(selector).chosen(config[selector]);		
}
});

