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
public class Zona implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nombre;

    //contstructor
    public Zona() {

    }

    public Zona(String nombre) {
        this.nombre = nombre;

    }

    //setter y getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//metodos
}
