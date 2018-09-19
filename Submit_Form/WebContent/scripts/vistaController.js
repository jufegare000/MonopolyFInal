var jugadores = [];

function empiezaElJuego(a) {
    this.hideDiv(a);
}

function hideDiv(){
    //
    var x = document.getElementById("jugadores");
    var y = document.getElementById("tiraDados");
    x.style.visibility = 'hidden';
    y.style.visibility = 'visible';
}

function take_values(){
	var n = document.forms["monoForm"]["OS"].value;
	
	
	for (var i = 0; i < n; i++){
		jugadores[i] = { Jugador: i + 1, posicion: 0};
	}

	this.rekuezt(n, 1);
	this.hideDiv();
}

function rekuezt(parametro, opc){
	var http = new XMLHttpRequest();
	http.open("POST", "http://localhost:8080/Submit_Form/manejador.jsp", true);
	http.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	var params = "param" + opc + "=" + parametro; // probably use document.getElementById(...).value
	http.send(params);
	
	http.onload = function() {
	    alert(http.responseText);
	}
}


function tirardados(){
	this.rekuezt("122", 2);
}