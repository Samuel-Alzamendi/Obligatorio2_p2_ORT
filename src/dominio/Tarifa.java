/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author michellekatzzador
 */
public class Tarifa {
    private Zona zona;
    private ArrayList<Paquete> paquetes = new ArrayList <>();
    private int[] precios = new int[4];
   
    
    
    //constructor
    public Tarifa(Zona zona) {
        this.zona = zona;
    }
    
    
    //getter y setter

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(ArrayList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public int[] getPrecios() {
        return precios;
    }

    public void setPrecios(int[] precios) {
        this.precios = precios;
    }
    
    
    
    
}
