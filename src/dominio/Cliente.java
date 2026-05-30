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
public class Cliente {
    private String nombre;
    private String celular;
    private String mail;
    private ArrayList<Paquete> paquetes = new ArrayList <>();
    
  //constructor
    public Cliente(String nombre, String celular, String mail) {
        this.nombre = nombre;
        this.celular = celular;
        this.mail = mail;
    }
    
    
    
//getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(ArrayList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }
    
    
         
}
