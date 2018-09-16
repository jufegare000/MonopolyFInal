/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Casillas;

import model.Usuarios.Jugador;

/**
 *
 * @author User
 */
public class Estacion extends Propiedad{
    
    int alquiler;
    
    public Estacion(int valor, int valorHipoteca, String nombre, int posicion, int alquiler) {
        super(valor, valorHipoteca, nombre, posicion);
        this.alquiler=alquiler;
    }
    
    @Override
    public void cobrar(Jugador jugador) {
        jugador.pagar(alquiler);
    }
    
}
