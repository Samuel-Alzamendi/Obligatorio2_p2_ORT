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
public class Paquete {
    private String id;
    private Cliente cliente; 
    private String NombreDestinatario;
    private String direccion;
    private String fecha;
    private int peso;
    private int precio;
    private Departamento departamento;
    private String estado;
    private ArrayList<Tarifa> tarifa = new ArrayList <>();

    
    //Constructor

    public Paquete(String id, Cliente cliente, String NombreDestinatario, String direccion, String fecha, int peso, int precio, Departamento departamento, String estado) {
        this.id = id;
        this.cliente = cliente;
        this.NombreDestinatario = NombreDestinatario;
        this.direccion = direccion;
        this.fecha = fecha;
        this.peso = peso;
        this.precio = precio;
        this.departamento = departamento;
        this.estado = estado;
    }

  
    
    
    
    
    
    //Getter y Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNombreDestinatario() {
        return NombreDestinatario;
    }

    public void setNombreDestinatario(String NombreDestinatario) {
        this.NombreDestinatario = NombreDestinatario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Tarifa> getTarifa() {
        return tarifa;
    }

    public void setTarifa(ArrayList<Tarifa> tarifa) {
        this.tarifa = tarifa;
    }
  
    
    //metodos

    
    
}
