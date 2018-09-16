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
public class TarjetaLiberar extends Tarjeta{
    boolean diponible;

    public TarjetaLiberar(String sentencia) {
        super(sentencia);
        this.diponible=false;
    }

    @Override
    public void ejecutarAccion(Tablero tablero) {
        tablero.getJugadorEnTurno().addTarjetaLiberar(this);
    }
}
