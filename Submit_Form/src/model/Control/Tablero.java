/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Control;

import model.Usuarios.Banco;
import model.Usuarios.Jugador;
import java.util.ArrayList;
import model.Casillas.Casilla;
import model.Utilidades.BusquedaCasilla;

/**
 *
 * @author alejandrom.montoya
 */
public class Tablero {

    private Banco banco;
    private ArrayList<Jugador> jugadores;
    private ArrayList<Casilla> tablero;
    private int turno;
    private int dados[] = new int[2];
    private int choice = 0;/* era un atributo que me servia para saber que escogia el
                        jugador en la venta y en la carcel*/

    public Banco getBanco() {
        return banco;
    }
    
    public Tablero() {
    	banco = new  Banco();
    	jugadores = new ArrayList<Jugador>();
    	tablero = new ArrayList<Casilla>();
    	Instanciar instancia = new Instanciar();
    	instancia.instanciarTablero(tablero);
    	turno = 0;
    }

    public Jugador getJugadorEnTurno() {
        return jugadores.get(turno % jugadores.size());
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public int getChoice() {
        return choice;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public ArrayList<Casilla> getTablero() {
        return tablero;
    }

    public void IngresarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void ejecutarTurno() {
        boolean par = false;
        do {
            movimiento();
            if (dados[0] == dados[1]) {
                par = true;
                getJugadorEnTurno().anadirPar();
            }
        } while (getJugadorEnTurno().getContadorPares() < 3 && par);
        if(getJugadorEnTurno().getContadorPares()==3){
            int pos = new BusquedaCasilla().BuscarCasilla(tablero, 0);
            getJugadorEnTurno().getFicha().setPos(pos);
        }
        getJugadorEnTurno().reiniciarPares();
    }
    
    

    public int[] getDados() {
		return dados;
	}

	private void movimiento() {
        int posIni = getJugadorEnTurno().getFicha().getPos();
        int pasos = getJugadorEnTurno().tirarDados(dados);
        getJugadorEnTurno().moverFicha(pasos);
        int posFinal = getJugadorEnTurno().getFicha().getPos();
        tablero.get(posFinal).pisar(this);
        if (posFinal < posIni) {
            int pos = new BusquedaCasilla().BuscarCasilla(tablero, 0);
            tablero.get(pos).pisar(this);
        }
    }

    public void terminarTurno() {
        turno++;
    }

}
