/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Casillas;

import model.Control.Color;
import model.Miselaneas.Edificio;
import model.Usuarios.Jugador;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Solar extends Propiedad {

    private int alquiler;
    private int rentaCasa1;
    private int rentaCasa2;
    private int rentaCasa3;
    private int rentaCasa4;
    private int rentaHotel;
    private int rentas[]; //debe ser de 6 posiciones
    private ArrayList<Edificio> edificios;
    private Color color;

    public Solar(int[] rentas, int valor, int valorHipoteca, String nombre, int posicion) {
        super(valor, valorHipoteca, nombre, posicion);
        this.rentas = rentas;
    }

    public Color getColor() {
        return color;
    }

    // si no se agrega este metodo como se van a construir edificios
    private void anadirEdificio() {
        if (edificios.size() < 5) {
            edificios.add(new Edificio("Casa"));
        } else if (edificios.size() < 6) {
            edificios.add(new Edificio("Hotel"));
        }
    }

    private String getInfo() {
        String info = "";
        info = info + "Precio: " + super.getValor();
        info = info + "Alquiler: " + rentas[0];
        info = info + "Con una casa : " + rentas[1];
        info = info + "Con dos casas : " + rentas[2];
        info = info + "Con tres casas : " + rentas[3];
        info = info + "Con cuatro casas : " + rentas[4];
        info = info + "Con un hotel: " + rentas[5];
        info = info + "Hipoteca: " + super.getValorHipoteca();
        return info;
    }

    @Override
    public void cobrar(Jugador jugador) {
        int pago = rentas[edificios.size()];
        jugador.pagar(pago);
        super.propietario.cobrar(pago);
    }
}
