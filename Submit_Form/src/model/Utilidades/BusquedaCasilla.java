/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Utilidades;

import model.Casillas.Casilla;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BusquedaCasilla {

    public int BuscarCasilla(ArrayList<Casilla> tablero,int type) {
        int pos = -1;
        for (int i=0;i<tablero.size();i++) {
            int typeThis = tablero.get(i).getType();
            if (type == typeThis) {
                pos = type;
            }
        }
        return pos;
    }
    
    
}
