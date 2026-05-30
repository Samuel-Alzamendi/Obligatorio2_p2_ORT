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
public class Envio {
    private String id;
    private Zona zona;
    private Funcionario funcionario;
    private ArrayList<Paquete> paquetes = new ArrayList <>();
    private String fechaEnvio;
    private int pesoTotalPaquetes;
    private int precio;
    
    
    //constructor    

    public Envio(String id, Zona zona, Funcionario funcionario, String fechaEnvio, int pesoTotalPaquetes, int precio) {
        this.id = id;
        this.zona = zona;
        this.funcionario = funcionario;
        this.fechaEnvio = fechaEnvio;
        this.pesoTotalPaquetes = pesoTotalPaquetes;
        this.precio = precio;
    }
    
    
    
    //getter y setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
  
        
        
        
}
