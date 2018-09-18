/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Casillas;

import model.Control.Tablero;
import model.Miselaneas.Tarjeta;
import model.Miselaneas.TarjetaLiberar;

/**
 *
 * @author User
 */
public class Sorpresa extends Casilla {

	private Tarjeta[] tarjetas;

	public Sorpresa(String nombre, int posicion) {
		super(nombre, posicion, 2);
		tarjetas = new Tarjeta[20];
	}

	@Override
	public void pisar(Tablero tablero) {
		boolean disponible = true;
		Tarjeta tarjeta;
		do {
			int pos = (int) (Math.random() * 20 + 1);
			tarjeta = tarjetas[pos];
			try {
				TarjetaLiberar liberar = (TarjetaLiberar) tarjeta;
				disponible = liberar.isDiponible();
			} catch (Exception e) {
			}
		} while (!disponible);
		tarjeta.ejecutarAccion(tablero);
	}

}
