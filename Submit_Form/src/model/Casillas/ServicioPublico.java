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
public class ServicioPublico extends Propiedad{
    private int precioBase;

    public ServicioPublico(int valor, int valorHipoteca, String nombre, int posicion, int precioBase) {
        super(valor, valorHipoteca, nombre, posicion);
    }
    
    @Override
    public void cobrar(Jugador jugador) {//revisar cobro de servicios
        int dados=jugador.tirarDados(new int[2]);
        jugador.pagar(dados*precioBase);
    }
    
}
