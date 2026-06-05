/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author michellekatzzador
 */



public class Sistema implements Serializable {
    
  
    
    
    private ArrayList<Cliente> clientes = new ArrayList <>();
    private ArrayList<Paquete> paquetes = new ArrayList <>();
    private ArrayList<Departamento> departamentos = new ArrayList <>();
    private ArrayList<Envio> envios = new ArrayList <>();
    private ArrayList<Funcionario> funcionarios = new ArrayList <>();
    private ArrayList<Tarifa> tarifas = new ArrayList <>();
    private ArrayList<Zona> zonas = new ArrayList <>();
    
    //contructor

    public Sistema() {
    }
    
    
    

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(ArrayList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public ArrayList<Envio> getEnvios() {
        return envios;
    }

    public void setEnvios(ArrayList<Envio> envios) {
        this.envios = envios;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Tarifa> getTarifas() {
        return tarifas;
    }

    public void setTarifas(ArrayList<Tarifa> tarifas) {
        this.tarifas = tarifas;
    }

    public ArrayList<Zona> getZonas() {
        return zonas;
    }

    public void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }
    
    
    
    //Metodos
    
    //Metodo para agregar cliente al sistema
    public boolean agregarCliente(String unNombre, String unMail, String unTelefono){
        boolean correcto = true;
        if (unNombre.equals("")){
            correcto = false;
            System.out.println("Error, faltó el ingreso del nombre");
        } else if (existeNombre(unNombre)) {
        correcto = false;
        } else{
          Cliente c = new Cliente();  
          c.setNombre(unNombre);
          c.setTelefono(unTelefono);
          c.setMail(unMail);
          clientes.add(c);
          
        }
        return correcto;
    }
    
        //Metodo para agregar cliente al sistema
    public boolean agregarFuncionario(String unNombre,
    int unAnoIngreso , String unTelefono){
        boolean correcto = true;
        if (unNombre.equals("")){
            correcto = false;
            System.out.println("Error, faltó el ingreso del nombre");
        } else if (existeNombre(unNombre)) {
        correcto = false;
        } else{
          Funcionario f = new Funcionario();  
          f.setNombre(unNombre);
          f.setCelular(unTelefono);
          f.setAnoIngreso(unAnoIngreso);
          
          funcionarios.add(f);
          
        }
        return correcto;
    }
    
    public boolean eliminarFuncionario(String nombre){
        boolean correcto = true;
        if(existeNombre(nombre)){
            Funcionario f = new Funcionario();
            for(int i = 0; i<funcionarios.size(); i++) {
                 if (funcionarios.get(i).getNombre().equalsIgnoreCase(nombre)) {
                    funcionarios.remove(f);
                    
      
                 }
             }
            
        }else{
            correcto = false;
        }
        return correcto;
    }
    
    //metodo para ver que nombre no se repita
    private boolean existeNombre(String nombre){  
        boolean existe= false;
        for (int i = 0 ; i<clientes.size(); i++ ){
            if (clientes.get(i).getNombre().equalsIgnoreCase(nombre)){
                existe = true;
            }
        }
        
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getNombre().equalsIgnoreCase(nombre)) {
                existe = true;
            }
        }
        return  existe;
    }
    
    
    
   
    

    
      
    
}
