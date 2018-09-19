
<%@page import="model.Control.Tablero"%>
<%@page import="model.Usuarios.Jugador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"
        import="model.*"
        %>
<%! Tablero tbl; %>
<% 
	int valorDados;
	//Se reciben valores en esta página.
	//Crear jugadores
	String opc1 = (String)request.getParameter("param1");
 	String opc2 = (String)request.getParameter("param2");
	if(opc1 != null){

		tbl = new Tablero();
		int num;
		int actual;
		String parseao;
		int dados[] = new int[2];
		int resul = 0;
		Jugador jug;
//		resul = jug.tirarDados(dados);

		num = Integer.valueOf(opc1);
		//out.println(num);
		
		for (int i = 0; i < num; i++){
			actual = i + 1;
			parseao = String.valueOf(actual);
			jug = new Jugador(parseao , 1500);
			tbl.IngresarJugador(jug);
		}
		out.println("empezó el juego");
	}else if(opc2 != null){
		tbl.ejecutarTurno();
		valorDados = tbl.getDados()[0] + tbl.getDados()[1];
		out.println("avanza " + valorDados);
		//imprima los 3 datos de abajo
		int pos = tbl.getJugadorEnTurno().getFicha().getPos();
		int fondos = tbl.getJugadorEnTurno().getFondos();
		String nombre = tbl.getTablero().get(pos).getNombre();
		out.println("Posición: "+pos+ " \n" +
				"fondos: " +  fondos + " \n" +
				"casilla actual: " + nombre);
		/*for (int i = 0; i < tbl.getJugadores().size(); i++){
			out.println(tbl.getJugadores().get(i).getNombre());
		}*/
		
	}


	
	/*for (int i = 0; i < num; i++){
		out.println(tbl.getJugadores().get(i).getNombre());
	}
	*/
%>