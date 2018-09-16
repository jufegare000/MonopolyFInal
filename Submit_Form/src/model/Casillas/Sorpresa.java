/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Casillas;

import model.Control.Tablero;
import model.Miselaneas.Tarjeta;

/**
 *
 * @author User
 */
public class Sorpresa extends Casilla{
    
    private Tarjeta[] tarjetas;

    public Sorpresa(String nombre, int posicion) {
        super(nombre, posicion,2);
        tarjetas=new Tarjeta[20];
    }

    @Override
    public void pisar(Tablero tablero) {
        int pos = (int) (Math.random() * 20 + 1);
        Tarjeta tarjeta =  tarjetas[pos];
        tarjeta.ejecutarAccion(tablero);
    }
    
}
