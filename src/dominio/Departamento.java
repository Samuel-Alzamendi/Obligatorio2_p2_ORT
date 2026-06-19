/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;

/**
 *
 * @author michellekatzzador
 */
public class Departamento implements Serializable {

    private static final long serialVersionUID = 1L;

    private int numero;
    private String nombre;
    private Zona zona;

    //contructor
    public Departamento() {

    }

    public Departamento(int numero, String nombre, Zona zona) {
        this.numero = numero;
        this.nombre = nombre;
        this.zona = zona;
    }

    //getter y setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    //metodos
    @Override
    public String toString() {
        return this.nombre;
    }
}
