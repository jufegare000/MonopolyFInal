<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="model.Control.Tablero"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css" media="screen"/>
        <script type="text/javascript" src="scripts/vistaController.js"></script>
        <title>Nada la tortuga bajo del agua</title>
</head>
<body>

            <div>
                <table border="5" id="table">
                    <tbody>
                        <tr>
                            <td style="width: 70px;" ><label id="park">"FREE PARKING"</label> </td>
                            <td style="width: 70px; background-color:#ff4d4d;">Kentucky Avenue</td>
                            <td style="width: 70px;">CHANCE ???</td>
                            <td style="width: 70px; background-color:#ff4d4d;">Indiana Avenue</td>
                            <td style="width: 70px; background-color:#ff4d4d;">Illinois Avenue</td>
                            <td style="width: 70px;">B. &amp; O. Railroad</td>
                            <td style="width: 70px; background-color:#ffff80;">Atlantic Avenue</td>
                            <td style="width: 70px; background-color:#ffff80;">Ventnor Avenue</td>
                            <td style="width: 70px; ">WATER WORKS</td>
                            <td style="width: 70px; background-color:#ffff80;">Marvin Gardens</td>
                            <td style="width: 70px; background-color:blue; color: white;">GO TO JAIL!</td>
                        </tr>
                        <tr>
                            <td style="width: 70px; background-color:#ffb380;">New York Avenue</td>
                            <td style="width: 70px;" colspan="9">&nbsp;</td>
                            <td style="width: 70px; background-color:#70db70;">Pacific Avenue</td>
                        </tr>
                        <tr>
                            <td style="width: 70px; background-color:#ffb380;">Tennessee Avenue</td>
                            <td style="width: 70px;" colspan="9">&nbsp;</td>
                            <td style="width: 70px; background-color:#70db70;">North Carolina Avenue</td>
                        </tr>
                        <tr>
                            <td style="width: 70px;">Community Chest</td>
                            <td style="width: 70px;" colspan="9">
                            <form 
								action=""
								name="monoForm" >
                                <div id="jugadores">
                                    <label>Número de Jugadores</label>
                                    <select name="OS">
                                        <option value="2">2</option> 
                                        <option value="3">3</option> 
                                        <option value="4">4</option>
                                        <option value="5">5</option> 
                                        <option value="6">6</option> 
                                        <option value="7">7</option> 
                                        <option value="8">8 </option> 
                                    </select>
                                    <input type="button" value="Empezar" onclick="return take_values() "/>
                              </form>
                                </div></td>
                            <td style="width: 70px;">Community Chest</td>
                        </tr>
                        <tr>
                            <td style="width: 70px; background-color:#ffb380;">St. James Place</td>
                            <td style="width: 70px;" colspan="9">
                            <form 
								action=""
								name="juegaForm" >
                                <div id="tiraDados" style="visibility: hidden;">
                                    <label>Tirar Dados</label>
                                    <input type="button" value="Tirar" onclick="return tirardados() "/>
                                     </div>
                                     </form>
                                     
                                     </td>
                            <td style="width: 70px; background-color:#70db70;">Pennsylvania Avenue</td>
                        </tr>
                        <tr>
                            <td style="width: 70px;">"station" Pennsylvania Railroad</td>
                            <td style="width: 70px;" colspan="9">&nbsp;</td>
                            <td style="width: 70px;">"station" Short Line</td>
                        </tr>
                        <tr>
                            <td style="width: 70px; background-color: #dd99ff; ">Virginia Avenue</td>
                            <td style="width: 70px;" colspan="9">&nbsp;</td>
                            <td style="width: 70px;">CHANCE</td>
                        </tr>
                        <tr>
                            <td style="width: 70px; background-color: #dd99ff">States Avenue</td>
                            <td style="width: 70px;" colspan="9">&nbsp;</td>
                            <td style="width: 70px; background-color: #1a75ff;">Park Place</td>
                        </tr>
                        <tr>
                            <td style="width: 70px;">Electric Company</td>
                            <td style="width: 70px;" colspan="9">&nbsp;</td>
                            <td style="width: 70px;">LUXURY TAX</td>
                        </tr>
                        <tr>
                            <td style="width: 70px; background-color: #dd99ff;">St. Charles Place</td>
                            <td style="width: 70px;" colspan="9">&nbsp;</td>

                            <td style="width: 70px; background-color: #1a75ff;">Boardwalk</td>
                        </tr>
                        <tr>
                            <td style="width: 98px; height: 124px; background-color: #ffb366;">Cárcel mi papá</td>
                            <td style="width: 98px; height: 124px; background-color: #99ccff;">Connecticut Avenue</td>
                            <td style="width: 98px; height: 124px; background-color: #99ccff;">Vermont Avenue</td>
                            <td style="width: 98px; height: 124px; ">CHANCE ???</td>
                            <td style="width: 98px; height: 124px; background-color: #99ccff;">Oriental Avenue</td>
                            <td style="width: 98px; height: 124px;">"stations" Reading Railroad</td>
                            <td style="width: 98px; height: 124px;">TAX pague 200 o 10% mi papa</td>
                            <td style="width: 98px; height: 124px; background-color:#aa80ff;">Baltic Avenue</td>
                            <td style="width: 98px; height: 124px;">Arca Comunal</td>
                            <td style="width: 98px; height: 124px; background-color:#aa80ff;"> Mediterranean Avenue</td>
                            <td style="width: 98px; height: 124px; color: red">Inicio</td>
                        </tr>
                    </tbody>
                </table>
            </div>
       
</body>
</html>