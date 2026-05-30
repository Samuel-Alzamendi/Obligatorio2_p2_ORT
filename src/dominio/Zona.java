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
public class Zona {
    private ArrayList<Departamento> departamentos = new ArrayList <>();   

    
    //contstructor
    public Zona() {
    }

    
    
    //setter y getter
    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    
    
    
    
    
}
