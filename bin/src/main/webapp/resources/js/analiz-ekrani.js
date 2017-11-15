// JavaScript Document
$(document).ready(function() {
	$('[data-toggle="offcanvas"]').click(function(){
		$('#side-menu').toggleClass('hidden-xs');	
	});
	$("#kiyasla-btn").click(function () {
        window.location.href = "analiz-ekrani-kiyasla.html";
    });
	$("#shift-btn").click(function () {
        window.location.href = "shift-ekrani-kayitli-onayli.html";
    });
	
	
	new Chart(document.getElementById("bar-chart"), {
    type: 'bar',
    data: {
      labels: ["Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"],
      datasets: [
        {
          label: "Ciro(tl)",
          data: [2478,5267,734,784,433, 234, 3534]
        }
      ]
    },
    options: {
      legend: { display: true },
      title: {
        display: true,
        text: '32. Hafta (07.08.17-13.08.17)'
      }
    }
});
	
	new Chart(document.getElementById("pie-chart"), {
    type: 'pie',
    data: {
      labels: ["Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"],
      datasets: [
        {
          label: "Ciro(tl)",
          backgroundColor: ["#3e95cd", "#8e5ea2","#3cba9f","#e8c3b9","#c45850", "pink", "red"],
          data: [2478,5267,734,784,433, 234, 3534]
        }
      ]
    },
    options: {
      legend: { display: true, position: "right" },
      title: {
        display: true,
        text: '32. Hafta (07.08.17-13.08.17)'
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
          label: "Pazartesi",
          data: [2478,5267,734,784,433, 234, 3534, 2478,5267,734,784,433, 234, 3534, 2478,5267],
		  backgroundColor: "green"
        },
		{
          label: "Salı",
          data: [123,5267,734,54,433, 234, 3534, 67,5267,734,784,433, 234, 789, 2478,789],
		  backgroundColor: "red"
        },
		{
          label: "Çarşamba",
          data: [2478,5267,734,784,433, 234, 3534, 2478,5267,734,784,433, 234, 5435, 2478,5267],
		  backgroundColor: "yellow"
        },
		{
          label: "Perşembe",
          data: [2478,5267,734,784,433, 234, 3534, 2478,5267,7344,784,433, 234, 3534, 2478,5267],
		  backgroundColor: "blue"
        },
		{
          label: "Cuma",
          data: [2478,5267,734,784,433, 234, 3534, 2478,5267,734,784,433, 2344, 3534, 2478,5267],
		  backgroundColor: "purple"
        },
		{
          label: "Cumartesi",
          data: [2478,5267,734,784,433, 234, 3534, 2478,5267,7344,784,433, 234, 3534, 78,5267],
		  backgroundColor: "violet"
        },
		{
          label: "Pazar",
          data: [2478,5267,734,784,433, 234, 3534, 2478,5267,7364,784,433, 234, 3534, 2478,5267],
		  backgroundColor: "pink"
        }
      ]
    },
    options: {
      legend: {
		  position: "top",
		  display: true
		  },
      title: {
        display: true,
        text: '32. Hafta (07.08.17-13.08.17)'
      }
    }
});

//Ciro-Çalışan Grafiği

	new Chart(document.getElementById("line-chart"), {
    type: 'bar',
    data: {
      labels: ["07.00-08.00", "08.00-09.00", "09.00-10.00", "10.00-11.00", "11.00-12.00", "12.00-13.00", "13.00-14.00", "14.00-15.00", "15.00-16.00", "16.00-17.00", "17.00-18.00", "18.00-19.00", "19.00-20.00", "20.00-21.00", "21.00-22.00", "22.00-23.00"],
      datasets: [
        {
          label: "Planlanan",
          data: [1, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3],
		  backgroundColor: "purple",
		  fill: false
        },
		{
          label: "Olan",
          data: [3, 3, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2],
		  backgroundColor: "violet",
		  fill: false
        }
      ]
    },
    options: {
      legend: {
		  position: "top",
		  display: true
		  },
      title: {
        display: true,
        text: '32. Hafta (07.08.17-13.08.17)'
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

