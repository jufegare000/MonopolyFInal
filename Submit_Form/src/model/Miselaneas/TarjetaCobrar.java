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
public class TarjetaCobrar extends Tarjeta {

    private int valor;
    
    public TarjetaCobrar(int valor, String sentencia) {
        super(sentencia);
        this.valor = valor;
    }
    
    @Override
    public void ejecutarAccion(Tablero tablero) {
        tablero.getJugadorEnTurno().cobrar(valor);
    }
    
}
