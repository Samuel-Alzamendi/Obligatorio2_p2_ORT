/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz.paquetes;

import dominio.Cliente;
import dominio.Departamento;
import dominio.Paquete;
import dominio.Sistema;

/**
 *
 * @author samue
 */
public class Ingreso extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Ingreso.class.getName());

    private Sistema modelo;

    public Ingreso(Sistema modelo) {
        this.modelo = modelo;
        initComponents();
        actualizarLista();
        comboDepa();
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
        jLabel6.setBounds(10, 280, 140, 16);

        jLabel7.setText("Peso en gramos");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 310, 140, 16);

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(this::btnConfirmarActionPerformed);
        jPanel1.add(btnConfirmar);
        btnConfirmar.setBounds(350, 310, 130, 23);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(500, 310, 88, 23);
        jPanel1.add(txtFecha);
        txtFecha.setBounds(150, 190, 180, 22);
        jPanel1.add(txtDestinatario);
        txtDestinatario.setBounds(150, 220, 180, 22);
        jPanel1.add(txtDireccion);
        txtDireccion.setBounds(150, 250, 180, 22);
        jPanel1.add(txtPeso);
        txtPeso.setBounds(150, 310, 180, 22);

        spCliente.setViewportView(liClientes);

        jPanel1.add(spCliente);
        spCliente.setBounds(150, 40, 180, 141);

        lblPrecioTotal.setText("Precio total");
        jPanel1.add(lblPrecioTotal);
        lblPrecioTotal.setBounds(350, 280, 80, 16);

        lblPrecioMuestra.setText("_________");
        jPanel1.add(lblPrecioMuestra);
        lblPrecioMuestra.setBounds(430, 280, 164, 16);
        jPanel1.add(txtId);
        txtId.setBounds(150, 10, 180, 22);

        jPanel1.add(cbDepartamentos);
        cbDepartamentos.setBounds(150, 280, 180, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        Cliente c = new Cliente();
        String nombreSeleccionado = (String) liClientes.getSelectedValue();
        c = modelo.obtenerCliente(nombreSeleccionado);

        Paquete p = new Paquete();
        p.setDepartamento((Departamento) cbDepartamentos.getSelectedItem());
        p.setDireccion(txtDireccion.getText());
        p.setFecha(txtFecha.getText());
        p.setId(txtId.getText());
        p.setNombreDestinatario(txtDestinatario.getText());
        p.setPeso(Integer.parseInt(txtPeso.getText()));
        p.setEstado("Pendiente");
        
        // calcular
        p.setPrecio(modelo.calcularPrecio());
        p.setCliente(c);

        modelo.AgregarPaquete(p);

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void actualizarLista() {
        String[] nombres = new String[modelo.getClientes().size()];
        for (int i = 0; i < modelo.getClientes().size(); i++) {
            nombres[i] = modelo.getClientes().get(i).getNombre();
        }
        liClientes.setListData(nombres);
    }

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
