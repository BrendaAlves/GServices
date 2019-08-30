function openPage(pageName, elmnt) {
    // Esconde os elementos da class="tabcontent" por padrão */
    var i, tabcontent, tablinks;
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
    }

    // Remove a cor de fundo de todos os tablinks/buttons
    tablinks = document.getElementsByClassName("tablink");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].style.backgroundColor = "";
    }

    // Mostra uma class="tabcontent" especifica
    document.getElementById(pageName).style.display = "block";

    // Adiciona uma cor específica ao botão usado para abrir o tab content
    $(elmnt).css('background-color', '#f05837');
}

$(document).ready(function(){
	// Pega o elemento com id="defaultOpen" e clica nele
	$("#button1").click();
});
		