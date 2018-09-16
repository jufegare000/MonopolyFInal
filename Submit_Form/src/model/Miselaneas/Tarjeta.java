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
public abstract class Tarjeta {
    private String sentencia;

    public Tarjeta(String sentencia) {
        this.sentencia = sentencia;
    }
    
    public abstract void ejecutarAccion(Tablero tablero);

    public String getSentencia() {
        return sentencia;
    }
}
