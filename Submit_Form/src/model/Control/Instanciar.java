/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Control;


import java.util.ArrayList;


import model.Casillas.Carcel;
import model.Casillas.Casilla;
import model.Casillas.CasillaSalida;
import model.Casillas.Estacion;
import model.Casillas.Impuestos;
import model.Casillas.IrALaCarcel;
import model.Casillas.ParadaLible;
import model.Casillas.ServicioPublico;
import model.Casillas.Solar;
import model.Casillas.Sorpresa;
import model.Miselaneas.Tarjeta;
import model.Miselaneas.TarjetaALaCarcel;
import model.Miselaneas.TarjetaCobrar;
import model.Miselaneas.TarjetaIrA;
import model.Miselaneas.TarjetaLiberar;
import model.Miselaneas.TarjetaMover;
import model.Miselaneas.TarjetaPagar;

/**
 *
 * @author User
 */
public class Instanciar {

    public void instanciarTablero(ArrayList<Casilla> tablero) {
        tablero.add(new CasillaSalida(200, "Salida", 0));
        Color cafe = new Color("Cafe", 50);
        tablero.add(new Solar(2, 10, 30, 90, 160, 250, cafe, 60, 30, "mediterranean\nAvenue", 1));
        tablero.add(new Sorpresa("sorpresa", 2));
        tablero.add(new Solar(4, 20, 60, 180, 320, 450, cafe, 60, 30, "Baltic\nAvenue", 3));
        tablero.add(new Impuestos(200, "Income\nTax", 4));
        tablero.add(new Estacion(200, 100, "Reading\nRaiload", 5, 25));
        Color azulClaro = new Color("Azul Claro", 50);
        tablero.add(new Solar(6, 30, 90, 270, 400, 550, azulClaro, 100, 50, "Oriental\nAvenue", 6));
        tablero.add(new Sorpresa("sorpresa", 7));
        tablero.add(new Solar(6, 30, 90, 270, 400, 550, azulClaro, 100, 50, "Vermont\nAvenue", 8));
        tablero.add(new Solar(8, 40, 100, 300, 450, 600, azulClaro, 120, 60, "Connecticut\nAvenue", 9));
        tablero.add(new Carcel("Jail", 10));
        Color rosado = new Color("Rosado", 100);
        tablero.add(new Solar(10, 50, 150, 450, 625, 750, rosado, 140, 70, "St.Charles\nPlace", 11));
        tablero.add(new ServicioPublico(150, 75, "Electric\nCompany", 12, 4));
        tablero.add(new Solar(10, 50, 150, 450, 625, 750, rosado, 140, 70, "States\nAvenue", 13));
        tablero.add(new Solar(12, 60, 180, 500, 700, 900, rosado, 160, 80, "Virginia\nAvenue", 14));
        tablero.add(new Estacion(200, 100, "Pensilvania\nRaiload", 15, 25));
        Color naranja = new Color("naranja", 100);
        tablero.add(new Solar(14, 70, 200, 550, 750, 950, naranja, 180, 90, "St.James\nPlace", 16));
        tablero.add(new Sorpresa("sorpresa", 17));
        tablero.add(new Solar(14, 70, 200, 550, 750, 950, naranja, 180, 90, "Tennessee\nAvenue", 18));
        tablero.add(new Solar(16, 80, 220, 600, 800, 1000, naranja, 200, 100, "New York\nAvenue", 19));
        tablero.add(new ParadaLible("Free\nParking", 20));
        Color rojo = new Color("Rojo", 150);
        tablero.add(new Solar(18, 90, 250, 700, 875, 1050, rojo, 220, 110, "Kentucky\nAvenue", 21));
        tablero.add(new Sorpresa("sorpresa", 22));
        tablero.add(new Solar(18, 90, 250, 700, 875, 1050, rojo, 220, 110, "Indiana\nAvenue", 23));
        tablero.add(new Solar(20, 100, 300, 750, 925, 1100, rojo, 240, 120, "Illinois\nAvenue", 24));
        tablero.add(new Estacion(200, 100, "B.& O.\nRaiload", 25, 25));
        Color amarillo = new Color("Amarillo", 150);
        tablero.add(new Solar(22, 110, 330, 800, 975, 1150, amarillo, 260, 130, "Atlantic\nAvenue", 26));
        tablero.add(new Solar(22, 110, 330, 800, 975, 1150, amarillo, 260, 130, "Ventnor\nAvenue", 27));
        tablero.add(new ServicioPublico(150, 75, "Wather\nWorks", 28, 4));
        tablero.add(new Solar(24, 120, 360, 850, 1025, 1200, amarillo, 280, 140, "Marvin\nGardens", 29));
        tablero.add(new IrALaCarcel("Go to\nJail", 30));
        Color verde = new Color("Verde", 200);
        tablero.add(new Solar(26, 130, 390, 900, 1100, 1275, verde, 300, 150, "Pacific\nAvenue", 31));
        tablero.add(new Solar(26, 130, 390, 900, 1100, 1275, verde, 300, 150, "N.Carolina\nAvenue", 32));
        tablero.add(new Sorpresa("sorpresa", 33));
        tablero.add(new Solar(26, 130, 390, 900, 1100, 1275, verde, 300, 150, "Pennsylvania\nAvenue", 34));
        tablero.add(new Estacion(200, 100, "Short\nline", 15, 35));
        tablero.add(new Sorpresa("sorpresa", 36));
        Color azulOscuro = new Color("Azul Oscuro", 200);
        tablero.add(new Solar(35, 175, 500,  1100, 1300, 1500, azulOscuro, 350, 175, "Park\nPlace", 37));
        tablero.add(new Impuestos(200, "Luxory\nTax", 38));
        tablero.add(new Solar(50, 200, 600,  1400, 1700, 2000, azulOscuro, 400, 200, "Boardwalk", 39));
    }

    public ArrayList<Tarjeta> instanciarComunityChest() {
        ArrayList<Tarjeta> tarjetas = new ArrayList<>();
        tarjetas.add(new TarjetaIrA(0, "Ve a la salida"));
        tarjetas.add(new TarjetaCobrar(200, "Hubo un error en el banco y te han desembolsado $200"));
        tarjetas.add(new TarjetaPagar(50, "El doctor cobra por sus servicios"));
        tarjetas.add(new TarjetaCobrar(50, "Consigue $50 por ventas de acciones"));
        tarjetas.add(new TarjetaLiberar("Pase para salir de la carcel"));
        tarjetas.add(new TarjetaALaCarcel("Has sido condenado, ve a la carcel"));
        tarjetas.add(new TarjetaCobrar(200, "recibe $200 para habrir una gran espectaculo"));
        tarjetas.add(new TarjetaCobrar(100, "feliz navidad, recibe $100 como regalo"));
        tarjetas.add(new TarjetaCobrar(20, "Has pedido un reembolso de los impuestos y recibes $20"));
        tarjetas.add(new TarjetaCobrar(40, "Es tu cumpleaños, recibe $40 de regalo"));
        tarjetas.add(new TarjetaCobrar(100, "Recibe $100 de tu seguro de vida"));
        tarjetas.add(new TarjetaPagar(150, "Es hora de pagar la salud, el recibo es de $150"));
        tarjetas.add(new TarjetaLiberar("Pase para salir de la carcel"));
        tarjetas.add(new TarjetaPagar(150, "Es hora de pagar el colegio, el recibo es de $150"));
        tarjetas.add(new TarjetaCobrar(25, "Recibe $25 como pago por tu labor como consultor"));
        tarjetas.add(new TarjetaCobrar(10, "Recibe $10 por participar en el concurso de belleza"));
        tarjetas.add(new TarjetaCobrar(100, "Has heredado $100, lamentamos tu perdida"));
        return tarjetas;
    }

    public void instanciarChance() {
        ArrayList<Tarjeta> tarjetas = new ArrayList<>();
        tarjetas.add(new TarjetaIrA(0, "Ve a la salida"));
        tarjetas.add(new TarjetaMover("Tu viaje continua, avanza 17 casillas", 17));
        tarjetas.add(new TarjetaMover("Tu viaje continua, avanza 28 casillas", 28));
        tarjetas.add(new TarjetaMover("Avanza una casilla mas", 1));
        tarjetas.add(new TarjetaCobrar(50, "el banco te paga un dividendo de $50"));
        tarjetas.add(new TarjetaLiberar("Pase para salir de la carcel"));
        tarjetas.add(new TarjetaMover("Retrocede 3 casillas", -3));
        tarjetas.add(new TarjetaALaCarcel("Has sido condenado, ve a la carcel"));
        tarjetas.add(new TarjetaPagar(15, "los pobres tambien pagan impuestos, paga $15 al banco"));
        tarjetas.add(new TarjetaPagar(150, "Felicidades, eres el nuevo presidente, paga $150 de salarios"));
        tarjetas.add(new TarjetaCobrar(150, "Recibe $150 como prestamo para construir edificios"));
        tarjetas.add(new TarjetaCobrar(100, "Recibe $100 por ganar la competencia de crucigramas"));
    }
}
