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
public class Impuestos extends Casilla {

    private int valor;

    public Impuestos(int valor, String nombre, int posicion) {
        super(nombre, posicion,3);
        this.valor = valor;
    }

    @Override
    public void pisar(Tablero tablero) {
        tablero.getJugadorEnTurno().pagar(valor);
    }

}
