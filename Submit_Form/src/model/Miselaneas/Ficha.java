/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Miselaneas;

/**
 *
 * @author User
 */
public class Ficha {
    private int pos;
    private String figura;

    public Ficha(String figura) {
        this.figura = figura;
    }

    public int getPos() {
        return pos;
    }

    public String getFigura() {
        return figura;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    
    public void mover(int dados){
        pos=(pos+dados)%40;
    } 
}
