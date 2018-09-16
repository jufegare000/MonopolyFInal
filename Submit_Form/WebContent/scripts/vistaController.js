function empiezaElJuego(a) {
    this.hideDiv(a);
}

function hideDiv(a){
    //
    document.getElementById("park").innerHTML = " " + a;
    var x = document.getElementById("jugadores");
    x.style.visibility = 'hidden';
}

function take_values(){
	var n = document.forms["monoForm"]["OS"].value;
	var http = new XMLHttpRequest();
	http.open("POST", "http://localhost:8080/Submit_Form/manejador.jsp", true);
	http.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	var params = "param1=" + n; // probably use document.getElementById(...).value
	http.send(params);
	http.onload = function() {
	    alert(http.responseText);
	}
}

function submitForms(){
	
}