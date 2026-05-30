/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author michellekatzzador
 */
public class Departamento {
    private int numero;
    private String nombre;

    
    //contructor
    public Departamento(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
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
    
    
    
}
