/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz.paquetes;

import dominio.Envio;
import dominio.Sistema;
import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class Recepcion extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Recepcion.class.getName());

    private Sistema modelo;

    public Recepcion(Sistema modelo) {
        this.modelo = modelo;
        initComponents();
        actualizarListas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spEnvios = new javax.swing.JScrollPane();
        liEnvios = new javax.swing.JList<>();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        spPaquetesEnvios = new javax.swing.JScrollPane();
        liPaquetesEnvio = new javax.swing.JList<>();
        lblEnvios = new javax.swing.JLabel();
        lblPaquetesEnvio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recepcion");

        spEnvios.setViewportView(liEnvios);

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(this::btnConfirmarActionPerformed);

        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("");

        spPaquetesEnvios.setViewportView(liPaquetesEnvio);

        lblEnvios.setText("Envios");

        lblPaquetesEnvio.setText("Paquetes del envio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEnvios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spEnvios, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spPaquetesEnvios, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPaquetesEnvio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnvios)
                    .addComponent(lblPaquetesEnvio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spEnvios)
                    .addComponent(spPaquetesEnvios, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        setBounds(0, 0, 614, 357);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        if (liEnvios.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un envio");
        } else {

            Envio e = modelo.obtenerEnvio(Integer.parseInt(liEnvios.getSelectedValue()));

            String[] paquetesLista = new String[e.getPaquetes().size()];
            for (int i = 0; i < e.getPaquetes().size(); i++) {
                paquetesLista[i] = e.getPaquetes().get(i).toString();
            }

            liPaquetesEnvio.setListData(paquetesLista);

        }


    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void actualizarListas() {

        String[] envios = new String[modelo.getEnvios().size()];
        for (int i = 0; i < modelo.getEnvios().size(); i++) {
            envios[i] = modelo.getEnvios().get(i).getId() + "";
        }
        liEnvios.setListData(envios);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel lblEnvios;
    private javax.swing.JLabel lblPaquetesEnvio;
    private javax.swing.JList<String> liEnvios;
    private javax.swing.JList<String> liPaquetesEnvio;
    private javax.swing.JScrollPane spEnvios;
    private javax.swing.JScrollPane spPaquetesEnvios;
    // End of variables declaration//GEN-END:variables
}
