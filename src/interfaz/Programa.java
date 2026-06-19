/**
 * Michelle Katz 220144 
 * Samuel Alzamendi 355626
 */
package interfaz;

import dominio.Sistema;
import interfaz.Reportes.PaquetesPorEstado;

public class Programa {

    public static void main(String[] args) {
        Sistema modelo = new Sistema();
        ComenzarCon ventana = new ComenzarCon(modelo);
        ventana.setVisible(true);
        
//        Menu menu = new Menu();
//        menu.setVisible(true);
//        Sistema modelo = new Sistema();
//        PaquetesPorEstado v = new PaquetesPorEstado(modelo);
//        v.setVisible(true);
        
    }
}