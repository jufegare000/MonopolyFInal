/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Usuarios;

import model.Casillas.Propiedad;
import java.util.ArrayList;

/**
 *
 * @author User
 */


public class Banco {
    
    //en ambos metodos añadi parametros que considere necesarios
    public void venderPropiedad(Propiedad propiedad,Jugador jugador){
        propiedad.setDisponible(false);
        jugador.comprarPropiedad(propiedad, propiedad.getValor());
    }
    public void subastar(Propiedad propiedad, ArrayList<Jugador> jugadores, int pos, int valor){
        propiedad.setDisponible(false);
        jugadores.get(pos).comprarPropiedad(propiedad, valor);
    }
}
