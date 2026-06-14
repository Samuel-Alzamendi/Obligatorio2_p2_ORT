/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz.paquetes;

import dominio.Cliente;
import dominio.Departamento;
import dominio.Paquete;
import dominio.Sistema;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author samue
 */
public class Ingreso extends javax.swing.JFrame implements Observer {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Ingreso.class.getName());

    private Sistema modelo;

    public Ingreso(Sistema modelo) {
        this.modelo = modelo;
        initComponents();
        actualizarLista();
        comboDepa();
        modelo.addObserver(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();
        txtDestinatario = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        spCliente = new javax.swing.JScrollPane();
        liClientes = new javax.swing.JList<>();
        lblPrecioTotal = new javax.swing.JLabel();
        lblPrecioMuestra = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        cbDepartamentos = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hacer ingreso");
        setMinimumSize(new java.awt.Dimension(610, 400));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setText("Identificador de paquete");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(6, 9, 140, 16);

        jLabel2.setText("Cliente");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(6, 34, 140, 16);

        jLabel3.setText("Fecha");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 190, 140, 16);

        jLabel4.setText("Destinatario");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 220, 140, 16);

        jLabel5.setText("Direccion");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 250, 140, 16);

        jLabel6.setText("Departameno de destino");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 280, 180, 16);

        jLabel7.setText("Peso en gramos");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 310, 140, 16);

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(this::btnConfirmarActionPerformed);
        jPanel1.add(btnConfirmar);
        btnConfirmar.setBounds(340, 350, 130, 23);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(478, 350, 110, 23);

        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });
        jPanel1.add(txtFecha);
        txtFecha.setBounds(180, 190, 180, 22);
        jPanel1.add(txtDestinatario);
        txtDestinatario.setBounds(180, 220, 180, 22);
        jPanel1.add(txtDireccion);
        txtDireccion.setBounds(180, 250, 180, 22);
        jPanel1.add(txtPeso);
        txtPeso.setBounds(180, 310, 70, 22);

        spCliente.setViewportView(liClientes);

        jPanel1.add(spCliente);
        spCliente.setBounds(180, 40, 180, 141);

        lblPrecioTotal.setText("Precio total");
        jPanel1.add(lblPrecioTotal);
        lblPrecioTotal.setBounds(380, 310, 80, 20);

        lblPrecioMuestra.setText("_________");
        jPanel1.add(lblPrecioMuestra);
        lblPrecioMuestra.setBounds(460, 310, 130, 20);
        jPanel1.add(txtId);
        txtId.setBounds(180, 10, 180, 22);

        cbDepartamentos.addActionListener(this::cbDepartamentosActionPerformed);
        jPanel1.add(cbDepartamentos);
        cbDepartamentos.setBounds(180, 280, 180, 22);

        jToggleButton1.setText("Calcular");
        jToggleButton1.addActionListener(this::jToggleButton1ActionPerformed);
        jPanel1.add(jToggleButton1);
        jToggleButton1.setBounds(260, 310, 100, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //modelo.remove(this);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        Cliente c = new Cliente();
        boolean clienteCumple = true;
        boolean cumpleFecha = true;
        boolean cumple = true;
        boolean cumplePeso = true;

        // el signos se utiliza para ver si el id tiene espacios o signos no validos
        String id = txtId.getText();
        boolean signos = id.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ0-9]*");

        if (signos) {
            String destinatario = txtDestinatario.getText();
            boolean letrasDes = destinatario.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]*");

            if (letrasDes) {
                if (!modelo.existePaquete(id)) {
                    if (liClientes.getSelectedValue() == null) {
                        JOptionPane.showMessageDialog(this, "Seleccione un cliente");
                        clienteCumple = false;
                    } else {
                        String nombreSeleccionado = (String) liClientes.getSelectedValue();
                        c = modelo.obtenerCliente(nombreSeleccionado);
                    }

                    if (clienteCumple) {
                        Departamento d = new Departamento();
                        d = modelo.obtenerDepartamento(cbDepartamentos.getSelectedItem().toString());

                        String fechaTexto = "";
                        if (txtFecha.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(this, "Error... Debe ingresar la fecha");
                            cumpleFecha = false;
                            cumple = false;
                        } else {
                            SimpleDateFormat formato = new SimpleDateFormat("d/M/yyyy");
                            formato.setLenient(false);

                            try {
                                Date fecha = formato.parse(txtFecha.getText().trim());

                                Calendar cal = Calendar.getInstance();
                                cal.setTime(fecha);
                                int ano = cal.get(Calendar.YEAR);

                                if (ano < 2026 || ano > 2080) {
                                    JOptionPane.showMessageDialog(this, "Error... El año debe estar entre 2026 y 2080");
                                    cumpleFecha = false;
                                    cumple = false;
                                } else {
                                    // normalizamos el formato a dd/MM/yyyy para guardar
                                    SimpleDateFormat formatoSalida = new SimpleDateFormat("dd/MM/yyyy");
                                    fechaTexto = formatoSalida.format(fecha);
                                }
                            } catch (ParseException e) {
                                JOptionPane.showMessageDialog(this, "Error... Fecha mal ingresada. Use el formato dd/MM/aaaa");
                                cumpleFecha = false;
                                cumple = false;
                            }

                            int peso = 0;

                            try {
                                peso = Integer.parseInt(txtPeso.getText());
                                cumplePeso = true;
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(this, "el peso debe contener solo números");

                            }
                            if (cumpleFecha && cumple && cumplePeso) {

                                Paquete p = new Paquete();
                                p.setDepartamento(d);
                                p.setDireccion(txtDireccion.getText());
                                p.setFecha(fechaTexto);
                                p.setId(id);
                                p.setNombreDestinatario(destinatario);

                                if (lblPrecioMuestra.getText().equals("_________")) {
                                    JOptionPane.showMessageDialog(this, "Error... No se Calculo");
                                    cumple = false;
                                } else if (txtPeso.getText().trim().isEmpty()) {
                                    JOptionPane.showMessageDialog(this, "Error... No se ingreso peso");
                                    cumple = false;
                                } else {
                                    try {
                                        peso = Integer.parseInt(txtPeso.getText());

                                        if (peso < 0) {
                                            JOptionPane.showMessageDialog(this, "Error... Se ingreso un peso negativo");
                                            cumple = false;
                                        } else {
                                            p.setPeso(peso);
                                        }
                                    } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(this, "Error... El peso debe ser un número");
                                        cumple = false;
                                    }
                                }

                                p.setEstado("Pendiente");
                                // calcular
                                p.setPrecio(modelo.calcularPrecio());
                                p.setCliente(c);

                                if (cumple) {
                                    modelo.AgregarPaquete(p);
                                }
                                //actualizarListaPaquetes();
                            }

                        }
                    }

                    if (cumple && cumpleFecha && clienteCumple && cumplePeso) {
                        JOptionPane.showMessageDialog(this, "Ingreso exitoso");
                        this.dispose();
                    }
                    //else {
                    //JOptionPane.showMessageDialog(this, "Ingreso inválido");
                    //  }
                } else if (modelo.existePaquete(id)) {
                    JOptionPane.showMessageDialog(this, "Identificador de paquete ya existente\nIngreso inválido");
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Identificador de paquete invalido\nIngreso inválido");
        }


    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFechaKeyTyped

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        int peso = 0;
        boolean cumple = false;
        try {
            peso = Integer.parseInt(txtPeso.getText());
            cumple = true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "el peso debe contener solo números");

        }
        if (cumple) {
            Departamento d = new Departamento();
            d = modelo.obtenerDepartamento(cbDepartamentos.getSelectedItem().toString());
            int res = modelo.calcularPrecio(peso, d);
            lblPrecioMuestra.setText(String.valueOf(res));
        }

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void cbDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDepartamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDepartamentosActionPerformed

    @Override
    public void update(Observable o, Object arg) {
        // se ejecuta automáticamente cuando el modelo llama notifyObservers()
        actualizarLista();  // refrescás las listas
    }

    private void actualizarLista() {
        String[] nombres = new String[modelo.getClientes().size()];
        for (int i = 0; i < modelo.getClientes().size(); i++) {
            nombres[i] = modelo.getClientes().get(i).getNombre();
        }
        liClientes.setListData(nombres);
    }

//    private void actualizarListaPaquetes() {
//        String[] nombres = new String[modelo.getPaquetes().size()];
//        for (int i = 0; i < modelo.getPaquetes().size(); i++) {
//            nombres[i] = modelo.getPaquetes().get(i).getId();
//        }
//        listaP.setListData(nombres);
//    }
    private void comboDepa() {
        for (int i = 0; i < modelo.getDepartamentos().size(); i++) {
            cbDepartamentos.addItem(modelo.getDepartamentos().get(i).getNombre());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> cbDepartamentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblPrecioMuestra;
    private javax.swing.JLabel lblPrecioTotal;
    private javax.swing.JList<String> liClientes;
    private javax.swing.JScrollPane spCliente;
    private javax.swing.JTextField txtDestinatario;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables

}
