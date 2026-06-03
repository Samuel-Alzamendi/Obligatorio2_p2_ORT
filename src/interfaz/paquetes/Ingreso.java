/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz.paquetes;

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
        txtIdPaquete = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtDestinatario = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtDepaDestino = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        spCliente = new javax.swing.JScrollPane();
        liClientes = new javax.swing.JList<>();
        lblPrecioTotal = new javax.swing.JLabel();
        lblPrecioMuestra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hacer ingreso");
        setMinimumSize(new java.awt.Dimension(598, 348));
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
        jLabel3.setBounds(6, 184, 140, 16);

        jLabel4.setText("Destinatario");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(6, 212, 140, 16);

        jLabel5.setText("Direccion");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(6, 240, 140, 16);

        jLabel6.setText("Departameno de destino");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(6, 268, 140, 16);

        jLabel7.setText("Peso en gramos");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(6, 296, 140, 16);

        btnConfirmar.setText("Confirmar");
        jPanel1.add(btnConfirmar);
        btnConfirmar.setBounds(201, 321, 84, 23);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(291, 321, 88, 23);
        jPanel1.add(txtIdPaquete);
        txtIdPaquete.setBounds(152, 6, 180, 22);
        jPanel1.add(txtFecha);
        txtFecha.setBounds(152, 181, 180, 22);
        jPanel1.add(txtDestinatario);
        txtDestinatario.setBounds(152, 209, 180, 22);
        jPanel1.add(txtDireccion);
        txtDireccion.setBounds(152, 237, 180, 22);
        jPanel1.add(txtDepaDestino);
        txtDepaDestino.setBounds(152, 265, 180, 22);
        jPanel1.add(txtPeso);
        txtPeso.setBounds(152, 293, 180, 22);

        spCliente.setViewportView(liClientes);

        jPanel1.add(spCliente);
        spCliente.setBounds(152, 34, 180, 141);

        lblPrecioTotal.setText("Precio total");
        jPanel1.add(lblPrecioTotal);
        lblPrecioTotal.setBounds(344, 296, 80, 16);

        lblPrecioMuestra.setText("_________");
        jPanel1.add(lblPrecioMuestra);
        lblPrecioMuestra.setBounds(430, 296, 164, 16);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 350);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.dispose();
        
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
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
    private javax.swing.JTextField txtDepaDestino;
    private javax.swing.JTextField txtDestinatario;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIdPaquete;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
