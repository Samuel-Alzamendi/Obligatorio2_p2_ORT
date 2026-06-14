package Testeos;

import dominio.Sistema;
import interfaz.ComenzarCon;

public class newClass {

    public static void main(String[] args) {
        
        String id = "Hola 2123";
        boolean signos = id.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ0-9]*");
        System.out.println(signos);
    }

}
