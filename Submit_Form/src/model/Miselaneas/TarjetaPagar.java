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
public class TarjetaPagar extends Tarjeta{

    public int aPagar;

    public TarjetaPagar(int aPagar, String sentencia) {
        super(sentencia);
        this.aPagar = aPagar;
    }

    @Override
    public void ejecutarAccion(Tablero tablero) {
        tablero.getJugadorEnTurno().pagar(aPagar);
    }
    
}
