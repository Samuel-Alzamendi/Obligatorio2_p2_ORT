/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz.Reportes;

import dominio.Sistema;

/**
 *
 * @author samue
 */
public class ConsultaPorCliente extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ConsultaPorCliente.class.getName());

    private Sistema modelo;

    public ConsultaPorCliente(Sistema modelo) {
        initComponents();
        this.modelo = modelo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pMain = new javax.swing.JPanel();
        spClientes = new javax.swing.JScrollPane();
        liClientes = new javax.swing.JList<>();
        lblPendientes = new javax.swing.JLabel();
        lblTotalPendientes = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblEnviados = new javax.swing.JLabel();
        lblTotalEnviados = new javax.swing.JLabel();
        lblRecibidos = new javax.swing.JLabel();
        lblTotalRecibidos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta por cliente");

        pMain.setLayout(null);

        spClientes.setViewportView(liClientes);

        pMain.add(spClientes);
        spClientes.setBounds(10, 10, 400, 330);

        lblPendientes.setText("Total de paquetes pendientes");
        pMain.add(lblPendientes);
        lblPendientes.setBounds(420, 10, 170, 16);

        lblTotalPendientes.setText("_____");
        pMain.add(lblTotalPendientes);
        lblTotalPendientes.setBounds(420, 30, 25, 16);

        btnConfirmar.setText("Confirmar");
        pMain.add(btnConfirmar);
        btnConfirmar.setBounds(420, 320, 84, 23);

        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);
        pMain.add(btnCancelar);
        btnCancelar.setBounds(510, 320, 76, 23);

        lblEnviados.setText("Total de paquetes enviados");
        pMain.add(lblEnviados);
        lblEnviados.setBounds(420, 60, 170, 16);

        lblTotalEnviados.setText("_____");
        pMain.add(lblTotalEnviados);
        lblTotalEnviados.setBounds(420, 80, 25, 16);

        lblRecibidos.setText("Total de paquetes recibidos");
        pMain.add(lblRecibidos);
        lblRecibidos.setBounds(420, 110, 170, 16);

        lblTotalRecibidos.setText("_____");
        pMain.add(lblTotalRecibidos);
        lblTotalRecibidos.setBounds(420, 130, 25, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 614, 357);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel lblEnviados;
    private javax.swing.JLabel lblPendientes;
    private javax.swing.JLabel lblRecibidos;
    private javax.swing.JLabel lblTotalEnviados;
    private javax.swing.JLabel lblTotalPendientes;
    private javax.swing.JLabel lblTotalRecibidos;
    private javax.swing.JList<String> liClientes;
    private javax.swing.JPanel pMain;
    private javax.swing.JScrollPane spClientes;
    // End of variables declaration//GEN-END:variables
}
