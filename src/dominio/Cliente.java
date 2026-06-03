package dominio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author michellekatzzador
 */
public class Cliente {
    private String nombre;
    private String celular;
    private String mail;
    private ArrayList<Integer> paquetes = new ArrayList <>();
    
//        public static void serializar(){
//        Persona p1 = new Persona();
//        p1.setNombre("Luis");
//        p1.setEdad(55);
//        //p1.setMascota(a1);
//        
//        Persona p2 = new Persona();
//        p2.setNombre("Ana");
//        p2.setEdad(22);
//        //p2.setMascota(a2);
//        try{
//            ObjectOutputStream out = new ObjectOutputStream(new 
//                FileOutputStream("sistema.ser"));
//            out.writeObject(p1);
//            out.writeObject(p2);
//            out.close();
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//    }
//    
//    private static void deserializar(){
//        
//        try{
//            ObjectInputStream in = new ObjectInputStream(
//                new FileInputStream("sistema.ser"));
//            Persona p3 = (Persona) in.readObject();
//            Persona p4 = (Persona) in.readObject();
//            System.out.println(p3);
//            System.out.println(p4);
//        }catch(IOException | ClassNotFoundException ex){
//            ex.printStackTrace();
//        }
//        
//    }
    
        public static void serializar(){

        //p1.setMascota(a1);

        //p2.setMascota(a2);
        try{
            ObjectOutputStream out = new ObjectOutputStream(new 
                FileOutputStream("sistema.ser"));
            //out.writeObject();
            //out.writeObject();
            out.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    
    
    
    
    
    
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

    public ArrayList<Integer> getIdPaquetes() {
        return paquetes;
    }

    public void setPaquetes(ArrayList<Integer> idPaquetes) {
        this.paquetes = paquetes;
    }
    
    
         
}
