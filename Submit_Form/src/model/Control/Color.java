/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Control;

import model.Casillas.Propiedad;
import model.Casillas.Solar;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Color {
    private String color;
    private ArrayList<Solar> solares;
    private int valorEdificio;

    public Color(String color, int valorEdificio) {
        this.color = color;
        solares=new ArrayList<>();
        this.valorEdificio=valorEdificio;
    }
    
    public void addSolar(Solar solar){
        solares.add(solar);
    }
    
    public boolean estanCompletos(ArrayList<Propiedad> propiedades){
        int contador=0;
        for (Propiedad propiedad : propiedades) {
            
        }
        return false;
    }
}