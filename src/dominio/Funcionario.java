/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author michellekatzzador
 */
public class Funcionario {
    private String nombre; 
    private String celular; 
    private int numeroFuncionario; 
    private int anoIngreso;
    
    //constructor
    public Funcionario(String nombre, String celular, int numeroFuncionario, int anoIngreso) {
        this.nombre = nombre;
        this.celular = celular;
        this.numeroFuncionario = numeroFuncionario;
        this.anoIngreso = anoIngreso;
    }
    
    public Funcionario() {
       
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

    public int getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(int numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    public int getAnoIngreso() {
        return anoIngreso;
    }

    public void setAnoIngreso(int anoIngreso) {
        this.anoIngreso = anoIngreso;
    }
    
    
    
}
