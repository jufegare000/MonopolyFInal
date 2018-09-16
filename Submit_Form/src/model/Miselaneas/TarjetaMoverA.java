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
public class TarjetaMoverA extends Tarjeta{

    private int posiciones;
    
    public TarjetaMoverA(String sentencia) {
        super(sentencia);
    }

    @Override
    public void ejecutarAccion(Tablero tablero) {
        tablero.getJugadorEnTurno().moverFicha(posiciones);
    }
    
}
