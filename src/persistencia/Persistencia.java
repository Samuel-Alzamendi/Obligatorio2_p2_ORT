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

    public Persistencia() {

    }

    public void serializar(Sistema s) {

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sistema.ser"));
            out.writeObject(s);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Sistema deserializar() {
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

    public void borrarDatos() {
        java.io.File archivo = new java.io.File("sistema.ser");
        if (archivo.exists()) {
            archivo.delete();
            System.out.println("Datos borrados correctamente.");
        } else {
            System.out.println("No había datos guardados.");
        }
    }

    public boolean veriArch() throws IOException {
        boolean veri = true;
        java.io.File archivo = new java.io.File("sistema.ser");
        try {
            if (archivo.exists()) {
                System.out.println("Existe sistema.ser");
            } else {
                ObjectInputStream in = new ObjectInputStream(
                        new FileInputStream("sistema.ser"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return veri;
    }

}
