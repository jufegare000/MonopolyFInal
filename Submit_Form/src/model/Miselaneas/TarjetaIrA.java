/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Miselaneas;

import model.Control.Tablero;
import model.Utilidades.BusquedaCasilla;

/**
 *
 * @author alejandrom.montoya
 */
public class TarjetaIrA extends Tarjeta{
    int type;

    public TarjetaIrA(int type, String sentencia) {
        super(sentencia);
        this.type = type;
    }
    
    @Override
    public void ejecutarAccion(Tablero tablero) {
        BusquedaCasilla busqueda = new BusquedaCasilla();
        int pos=busqueda.BuscarCasilla(tablero.getTablero(), type);
        tablero.getJugadorEnTurno().getFicha().setPos(pos);
        tablero.getTablero().get(pos).pisar(tablero);
    }
    
}
