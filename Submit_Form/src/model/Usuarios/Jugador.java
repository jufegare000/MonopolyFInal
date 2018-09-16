/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Usuarios;

import model.Casillas.Propiedad;
import model.Miselaneas.Ficha;
import model.Miselaneas.Tarjeta;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Jugador {

    private String nombre;
    private int fondos;
    private boolean condenado;
    private int sentencia; //Es mejor que cada jugador lleve su sentencia
    private ArrayList<Propiedad> propiedades;
    private Ficha ficha;
    private ArrayList<Tarjeta> liberaciones; // inventario de las tarjetas
    private int contadorPares; // contar pares para evitar mas de 3

    public Jugador(String nombre, int fondos) {
        this.nombre = nombre;
        this.fondos = fondos;
        condenado = false;
        sentencia = 0;
        propiedades = new ArrayList<>();
        liberaciones=new ArrayList<>();
        contadorPares=0;
    }

    public Ficha getFicha() {
        return ficha;
    }
    
    //los siguentes 3 metodos son de manejos de pares
    public void anadirPar(){
        contadorPares++;
    }
    
    public void reiniciarPares(){
        contadorPares=0;
    }
    
    public int getContadorPares() {
        return contadorPares;
    }

    
    public void comprarPropiedad(Propiedad propiedad, int valor) {
        fondos = fondos - valor;
        propiedades.add(propiedad);
        propiedad.setPropietario(this);
    }
    
    public void venderPropiedad(int posPropiedad, Jugador comprador, int valor){
        comprador.comprarPropiedad(propiedades.get(posPropiedad), valor);
        fondos+=valor;
        propiedades.remove(posPropiedad);
    }

    public int tirarDados(int dados[]) {
        int total=0;
        for(int i = 0; i< dados.length; i++){
             dados[i] = (int) (Math.random() * 6 + 1);
             total+=dados[i];
        }
        return total;
    }

    public void moverFicha(int dados) {
        this.ficha.mover(dados);
    }
    
    public void pagar(int valor) {
        fondos = fondos - valor;
    }

    public void cobrar(int valor){
        fondos += valor;
    }
    
    //lo que tiene que ver con la condena
    public void addTarjetaLiberar(Tarjeta liberacion){
        this.liberaciones.add(liberacion);
    }
    
    public void condenar() {
        condenado = true;
        sentencia = 3;
    }

    public void cumplirSentencia() {
        sentencia = sentencia - 1;
        if (sentencia == 0) {
            condenado = false;
        }
    }
}
