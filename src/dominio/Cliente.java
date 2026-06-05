package dominio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Cliente implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private String nombre;
    private String telefono;
    private String email;
    private ArrayList<Integer> idPaquetes = new ArrayList<>();

    public Cliente(){
        
    }
    
    //constructor
    public Cliente(String nombre, String telefono, String email, ArrayList<Integer> idPaquetes) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.idPaquetes = idPaquetes;
    }

    //getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String celular) {
        this.telefono = celular;
    }

    public String getMail() {
        return email;
    }

    public void setMail(String mail) {
        this.email = mail;
    }

    public ArrayList<Integer> getIdPaquetes() {
        return idPaquetes;
    }

    public void setPaquetes(ArrayList<Integer> idPaquetes) {
        this.idPaquetes = idPaquetes;
    }

    
    
    public void agregarCliente(String unNombre, String unMail, String unTelefono){
        
        
    }
}
