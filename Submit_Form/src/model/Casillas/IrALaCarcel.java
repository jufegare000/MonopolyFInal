/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Casillas;

import model.Control.Tablero;
import model.Utilidades.BusquedaCasilla;

/**
 *
 * @author User
 */
public class IrALaCarcel extends Casilla {

    public IrALaCarcel(String nombre, int posicion) {
        super(nombre, posicion,4);
    }

    @Override
    public void pisar(Tablero tablero) {
        int pos=new BusquedaCasilla().BuscarCasilla(tablero.getTablero(), 5);
        tablero.getJugadorEnTurno().getFicha().setPos(pos);
        tablero.getJugadorEnTurno().condenar();
    }

}
