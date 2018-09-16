
<%@page import="model.Usuarios.Jugador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"
        import="model.*"
        %>

<% 
	//Se reciben valores en esta página.
	int dados[] = new int[2];
	int resul = 0;
	Jugador jug = new Jugador("av",1);
	resul = jug.tirarDados(dados);
	String opc = (String)request.getParameter("param1");
	out.println("Avanza " + resul + " casillas");
%>