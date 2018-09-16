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
public abstract class Casilla {

    private String nombre;
    private int posicion;
    private int type;

    public Casilla(String nombre, int posicion, int type) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.type = type; //identificador para saber el tipo de casilla
    }

    /*
    El atributo tablero es por que varias de las sobre escrituras necesitan de
    distintos componentes del tablero pero no necesariamente los mismos
     */
    public abstract void pisar(Tablero tablero);

    public int getType() {
        return type;
    }

}
