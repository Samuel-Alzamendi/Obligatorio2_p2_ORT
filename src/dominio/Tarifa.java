/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author michellekatzzador
 */
public class Tarifa implements Serializable {

    private static final long serialVersionUID = 1L;

    private Zona zona;
    private int[] precios = new int[4];
    private static int porcentaje;

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

    public int[] getPrecios() {
        return precios;
    }

    public void setPrecios(int[] precios) {
        this.precios = precios;
    }

    public static int getPorcentaje() {
        return porcentaje;
    }

    public static void setPorcentaje(int porcentaje) {
        Tarifa.porcentaje = porcentaje;
    }

    //metodos
}
