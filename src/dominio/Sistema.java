package dominio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import persistencia.ArchivoLectura;

/**
 *
 * @author michellekatzzador
 */
public class Sistema extends Observable implements Serializable {

    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Paquete> paquetes = new ArrayList<>();
    private ArrayList<Departamento> departamentos = new ArrayList<>();
    private ArrayList<Envio> envios = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Tarifa> tarifas = new ArrayList<>();
    private ArrayList<Zona> zonas = new ArrayList<>();

    //contructor
    public Sistema() {
        cargarDatos();
        cargarTarifas();
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
    public void cargarDatos() {
        Zona norte = new Zona("Norte");
        Zona oeste = new Zona("Oeste");
        Zona este = new Zona("Este");
        Zona sur = new Zona("Sur");
        zonas.add(norte);
        zonas.add(oeste);
        zonas.add(este);
        zonas.add(sur);

        departamentos.add(new Departamento(1, "Artigas", norte));
        departamentos.add(new Departamento(2, "Salto", norte));
        departamentos.add(new Departamento(3, "Paysandú", norte));
        departamentos.add(new Departamento(4, "Rivera", norte));
        departamentos.add(new Departamento(5, "Tacuarembó", norte));
        departamentos.add(new Departamento(6, "Río Negro", oeste));
        departamentos.add(new Departamento(7, "Soriano", oeste));
        departamentos.add(new Departamento(8, "Colonia", oeste));
        departamentos.add(new Departamento(9, "San José", oeste));
        departamentos.add(new Departamento(10, "Cerro Largo", este));
        departamentos.add(new Departamento(11, "Treinta y Tres", este));
        departamentos.add(new Departamento(12, "Lavalleja", este));
        departamentos.add(new Departamento(13, "Rocha", este));
        departamentos.add(new Departamento(14, "Maldonado", este));
        departamentos.add(new Departamento(15, "Durazno", sur));
        departamentos.add(new Departamento(16, "Flores", sur));
        departamentos.add(new Departamento(17, "Florida", sur));
        departamentos.add(new Departamento(18, "Canelones", sur));
        departamentos.add(new Departamento(19, "Montevideo", sur));
    }

    // obetner departamento en la lista
    public Departamento obtenerDepartamento(String nombre) {
        Departamento d = new Departamento();

        for (int i = 0; i < departamentos.size(); i++) {
            if (departamentos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                d = departamentos.get(i);
            }
        }

        return d;
    }

    public Zona obtenerZona(String nombre) {
        Zona z = new Zona();

        for (int i = 0; i < clientes.size(); i++) {
            if (zonas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                z = zonas.get(i);
            }
        }

        return z;
    }

    // agregar un clinete
    public boolean agregarCliente(String unNombre, String unMail, String unTelefono) {
        boolean correcto = true;
        if (unNombre.equals("")) {
            correcto = false;
            System.out.println("Error, faltó el ingreso del nombre");
        } else if (existeNombre(unNombre)) {
            correcto = false;
        } else {
            Cliente c = new Cliente();
            c.setNombre(unNombre);
            c.setTelefono(unTelefono);
            c.setMail(unMail);
            clientes.add(c);

            setChanged();
            notifyObservers();
        }
        return correcto;
    }

    // evento para obtener los clientes de la lista
    public Cliente obtenerCliente(String nombre) {
        Cliente c = new Cliente();

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                c = clientes.get(i);
            }
        }

        return c;
    }

    public boolean eliminarCliente(String nombre) {
        boolean correcto = true;
        if (existeNombre(nombre)) {
            Cliente c = new Cliente();
            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                    c = clientes.get(i);
                    clientes.remove(c);
                    setChanged();
                    notifyObservers();
                }
            }
        } else {
            correcto = false;
        }
        return correcto;
    }

    //Metodo para agregar funcionario al sistema
    public boolean agregarFuncionario(String unNombre, int unAnoIngreso, String unTelefono) {
        boolean correcto = true;
        if (unNombre.equals("")) {
            correcto = false;
            System.out.println("Error, faltó el ingreso del nombre");
        } else if (existeNombre(unNombre)) {
            correcto = false;
        } else {
            Funcionario f = new Funcionario();
            f.setNombre(unNombre);
            f.setCelular(unTelefono);
            f.setAnoIngreso(unAnoIngreso);

            funcionarios.add(f);

            setChanged();
            notifyObservers();

        }
        return correcto;
    }

    // evento para obtener los clientes de la lista
    public Funcionario obtenerFuncionario(String nombre) {
        Funcionario f = new Funcionario();

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                f = funcionarios.get(i);
            }
        }

        return f;
    }

    public boolean eliminarFuncionario(String nombre) {
        boolean correcto = true;
        if (existeNombre(nombre)) {
            Funcionario f = new Funcionario();
            for (int i = 0; i < funcionarios.size(); i++) {
                if (funcionarios.get(i).getNombre().equalsIgnoreCase(nombre)) {
                    f = funcionarios.get(i);
                    funcionarios.remove(f);
                    setChanged();
                    notifyObservers();
                }
            }
        } else {
            correcto = false;
        }
        return correcto;
    }

    //metodo para ver que nombre no se repita
    private boolean existeNombre(String nombre) {
        boolean existe = false;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                existe = true;
            }
        }

        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getNombre().equalsIgnoreCase(nombre)) {
                existe = true;
            }
        }
        return existe;
    }

    // ----------------------------------------------
    // paquetes
    public float calcularPrecio() {

        return 0;
    }

    public void AgregarPaquete(Paquete paquete) {
        paquetes.add(paquete);
        setChanged();
        notifyObservers();
    }

    public Paquete obtenerPaquete(String nombre) {
        Paquete p = new Paquete();

        for (int i = 0; i < paquetes.size(); i++) {
            if (paquetes.get(i).getId().equalsIgnoreCase(nombre)) {
                p = paquetes.get(i);
            }
        }

        return p;
    }

    public ArrayList<Paquete> ObtenerPaquetePen(String zona) {
        ArrayList<Paquete> paquetesPendientes = new ArrayList<>();

        for (int i = 0; i < paquetes.size(); i++) {
            if (paquetes.get(i).getDepartamento().getZona().getNombre().equalsIgnoreCase(zona)) {
                paquetesPendientes.add(paquetes.get(i));
            }
        }

        return paquetesPendientes;
    }

    //metodo para ver que nombre no se repita
    public boolean existePaquete(String id) {
        boolean existe = false;
        for (int i = 0; i < paquetes.size(); i++) {
            if (paquetes.get(i).getId().equalsIgnoreCase(id)) {
                existe = true;
            }
        }
        return existe;
    }

    //------------------------------------------------------------
    // envios
    public Envio obtenerEnvio(int id) {
        Envio e = new Envio();

        for (int i = 0; i < envios.size(); i++) {
            if (envios.get(i).getId() == id) {
                e = envios.get(i);
            }
        }
        return e;
    }
    
    //-----------------------------------------------------------------------
    //TARIFAS
    public void cargarTarifas(){
        ArchivoLectura archivo = new ArchivoLectura ("TARIFAS.TXT");
       
        while (archivo.hayMasLineas()){
            String[] datos = archivo.linea().split("#");
            String nombreZona = datos[0];
            String[] precios = datos[1].split(",");
            
            Zona z = obtenerZona(nombreZona);
            Tarifa t = new Tarifa(z);
            int[] precioPeso =  new int [4];
            for (int i =0 ; i <precios.length ; i++){
                precioPeso[i]= Integer.parseInt(precios [i]);
            }
            t.setPrecios(precioPeso);
            tarifas.add(t);
           
            
        }
        archivo.cerrar();
     
    }

}
