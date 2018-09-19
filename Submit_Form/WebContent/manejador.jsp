
<%@page import="model.Control.Tablero"%>
<%@page import="model.Usuarios.Jugador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"
        import="model.*"
        %>
<%! Tablero tbl; %>
<% 

	//Se reciben valores en esta página.
	//Crear jugadores
	String opc = (String)request.getParameter("param1");
	if(opc != null){

		tbl = new Tablero();
		int num;
		int actual;
		String parseao;
		int dados[] = new int[2];
		int resul = 0;
		Jugador jug;
//		resul = jug.tirarDados(dados);

		num = Integer.valueOf(opc);
		//out.println(num);
		
		for (int i = 0; i < num; i++){
			actual = i + 1;
			parseao = String.valueOf(actual);
			jug = new Jugador(parseao ,1);
			tbl.IngresarJugador(jug);
		}
	}else{
		for (int i = 0; i < tbl.getJugadores().size(); i++){
			out.println(tbl.getJugadores().get(i).getNombre());
		}
	}


	
	/*for (int i = 0; i < num; i++){
		out.println(tbl.getJugadores().get(i).getNombre());
	}
	*/
%>