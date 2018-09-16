/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Casillas;

import model.Control.Tablero;
import model.Usuarios.Jugador;

/**
 *
 * @author User
 */
public class Propiedad extends Casilla {

    private int valor;
    private int valorHipoteca;
    private boolean disponible;
    protected Jugador propietario;

    public Propiedad(int valor, int valorHipoteca, String nombre, int posicion) {
        super(nombre, posicion,1);
        this.valor = valor;
        this.valorHipoteca = valorHipoteca;
        disponible = true;
    }

    public int getValor() {
        return valor;
    }

    public int getValorHipoteca() {
        return valorHipoteca;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setPropietario(Jugador propietario) {
        this.propietario = propietario;
    }

    @Override
    public void pisar(Tablero tablero) {
        if (disponible) {
            if (tablero.getChoice() == 0) {
                tablero.getBanco().venderPropiedad(this, tablero.getJugadorEnTurno());
            }else
                tablero.getBanco().subastar(this, tablero.getJugadores(), valor, valor);
        } else {
            cobrar(tablero.getJugadorEnTurno());
        }
    }

    public void cobrar(Jugador jugador) {
    }

}
