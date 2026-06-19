/**
 * Michelle Katz 220144 
 * Samuel Alzamendi 355626
 */
package dominio;

import java.io.Serializable;

/**
 *
 * @author michellekatzzador
 */
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;

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

    @Override
    public String toString() {
        return this.nombre;
    }

}
