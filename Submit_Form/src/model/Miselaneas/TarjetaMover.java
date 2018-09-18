/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Miselaneas;

import model.Control.Tablero;

/**
 *
 * @author User
 */
public class TarjetaMover extends Tarjeta{

    private int posiciones;
    
    public TarjetaMover(String sentencia, int posiciones) {
        super(sentencia);
        this.posiciones=posiciones;
    }

    @Override
    public void ejecutarAccion(Tablero tablero) {
        tablero.getJugadorEnTurno().moverFicha(posiciones);
    }
    
}
