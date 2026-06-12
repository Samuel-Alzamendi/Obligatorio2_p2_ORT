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
public class Envio implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private Zona zona;
    private Funcionario funcionario;
    private ArrayList<Paquete> paquetes;
    private String fechaEnvio;
    private int pesoTotalPaquetes;
    private int precio;
    private boolean recepcionado;

    //constructor    
    public Envio() {
        recepcionado = false;
        this.paquetes = new ArrayList<>();
    }

    public Envio(int id, Zona zona, Funcionario funcionario, String fechaEnvio, int pesoTotalPaquetes, int precio, boolean recepcionado) {
        this.id = id;
        this.zona = zona;
        this.funcionario = funcionario;
        paquetes = new ArrayList<>();
        this.fechaEnvio = fechaEnvio;
        this.pesoTotalPaquetes = pesoTotalPaquetes;
        this.precio = precio;
        this.recepcionado = recepcionado;
        
    }

    //getter y setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
        public boolean getRecepcionado() {
        return recepcionado;
    }

    public void setrecepcionado(boolean recepcionado) {
        this.recepcionado = recepcionado;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(ArrayList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public int getPesoTotalPaquetes() {
        return pesoTotalPaquetes;
    }

    public void setPesoTotalPaquetes(int pesoTotalPaquetes) {
        this.pesoTotalPaquetes = pesoTotalPaquetes;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    public void agregarPaquete(Paquete paquete) {
    paquetes.add(paquete);
}

}
