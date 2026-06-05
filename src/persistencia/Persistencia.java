/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import dominio.Cliente;
import dominio.Departamento;
import dominio.Envio;
import dominio.Funcionario;
import dominio.Paquete;
import dominio.Sistema;
import dominio.Tarifa;
import dominio.Zona;
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
public class Persistencia implements Serializable {
    
    public static void serializar(Sistema s){
        
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sistema.ser"));
            out.writeObject(s);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Sistema deserializar() {
        try {
            ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("sistema.ser"));
                Sistema s = (Sistema) in.readObject();
                 in.close();
                return s; 
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } 
        return null;
    }
    
}
