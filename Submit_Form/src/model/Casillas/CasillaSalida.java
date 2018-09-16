/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Casillas;

import model.Control.Tablero;

/**
 *
 * @author User
 */
public class CasillaSalida extends Casilla {
    
    private int monto;
    
    public CasillaSalida(int monto, String nombre, int posicion) {
        super(nombre, posicion,0);
        this.monto = monto;
    }
    
    @Override
    public void pisar(Tablero tablero) {
        tablero.getJugadorEnTurno().cobrar(monto);
    }
}
