/**
 * Michelle Katz 220144 
 * Samuel Alzamendi 355626
 */
package interfaz.paquetes;

import dominio.Envio;
import dominio.Paquete;
import dominio.Sistema;
import java.awt.Color;
import java.awt.Component;
import java.awt.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author samue
 */
public class Recepcion extends javax.swing.JFrame implements Observer {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Recepcion.class.getName());

    private Sistema modelo;

    public Recepcion(Sistema modelo) {
        this.modelo = modelo;
        initComponents();
        liEnvios.setCellRenderer(new EnvioListRenderer());
        actualizarListas();
        modelo.addObserver(this);
        liPaquetesEnvio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
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

        liEnvios.addListSelectionListener(this::liEnviosValueChanged);
        spEnvios.setViewportView(liEnvios);

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(this::btnConfirmarActionPerformed);

        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

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
                    .addComponent(spEnvios, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnvios, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPaquetesEnvio, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(spPaquetesEnvios, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnvios)
                    .addComponent(lblPaquetesEnvio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spEnvios, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(spPaquetesEnvios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(270, 270, 270))
        );

        setBounds(0, 0, 614, 357);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if (liEnvios.getSelectedValue() != null && liPaquetesEnvio.getSelectedValue() != null) {

            int idEnvio = Integer.parseInt(liEnvios.getSelectedValue().split(" - ")[0].replace("Envio ", "").trim());
            Envio e = modelo.obtenerEnvio(idEnvio);
            e.setRecepcionado(true);
            java.util.List<String> paquetesSeleccionados = liPaquetesEnvio.getSelectedValuesList();

            for (int i = 0; i < paquetesSeleccionados.size(); i++) {
                String idPaq = paquetesSeleccionados.get(i);

                Paquete p = modelo.obtenerPaquete(idPaq);
                p.setEstado("Recibido");
                
            }

            for (int j = 0; j < liPaquetesEnvio.getModel().getSize(); j++) {
                String idPaquete = liPaquetesEnvio.getModel().getElementAt(j);
                if (!paquetesSeleccionados.contains(idPaquete)) {
                    boolean estadoPaquete = modelo.EliminarPaqueteEnvio(idEnvio, idPaquete);
                }
            }

            modelo.registrarTransaccion("Recepción de envío número " + idEnvio);
            actualizarListas();
            

        } else {

        }

        // revisar
//        if (liEnvios.getSelectedValue() == null) {
//            JOptionPane.showMessageDialog(this, "Seleccione un envio");
//        } else {
//
//            Envio e = modelo.obtenerEnvio(Integer.parseInt(liEnvios.getSelectedValue().replace("Envio ", "").trim()));
//
//            String[] paquetesLista = new String[e.getPaquetes().size()];
//            for (int i = 0; i < e.getPaquetes().size(); i++) {
//                paquetesLista[i] = e.getPaquetes().get(i).toString();
//            }
//
//            liPaquetesEnvio.setListData(paquetesLista);
//
//        }

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void liEnviosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_liEnviosValueChanged
        if (liEnvios.getSelectedValue() != null) {
            
            //OBTIENE TEXTO ENVIO X + REMPLAZA ENVIO DEJANDO SOLO EL NUMERO Y PARSEINT
            int id = Integer.parseInt(liEnvios.getSelectedValue().split(" - ")[0].replace("Envio ", "").trim());

            //System.out.println("Buscando envio con id: " + id);
            Envio e = modelo.obtenerEnvio(id);
            //System.out.println("Envio encontrado: " + e);
            
           

            String[] paquetesLista = new String[e.getPaquetes().size()];
            for (int i = 0; i < e.getPaquetes().size(); i++) {
                paquetesLista[i] = e.getPaquetes().get(i).getId();
                
            }
            liPaquetesEnvio.setListData(paquetesLista);
            if(e.isRecepcionado()){
                btnConfirmar.setEnabled(false);
            }else{
                btnConfirmar.setEnabled(true);
            }
            
            

        }
    }//GEN-LAST:event_liEnviosValueChanged

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void actualizarListas() {

        String[] envios = new String[modelo.getEnvios().size()];
        int indice = 0;
        for (int i = modelo.getEnvios().size() - 1; i >= 0; i--) {
            envios[indice] = "Envio " + modelo.getEnvios().get(i).getId()
                    + " - Fecha: " + modelo.getEnvios().get(i).getFechaEnvio();
            indice++;
        }
        
        liEnvios.setListData(envios);
        
        liPaquetesEnvio.setListData(new String[0]);

    }

    private class EnvioListRenderer extends DefaultListCellRenderer {

        public Component getListCellRendererComponent(JList<?> list, Object value,
                int index, boolean isSelected, boolean cellHasFocus) {

            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

            if (value instanceof String) {
                String texto = (String) value;
                int id = Integer.parseInt(texto.split(" - ")[0].replace("Envio ", "").trim());
                Envio envio = modelo.obtenerEnvio(id);

                if (envio.isRecepcionado()) {
                    setBackground(Color.GREEN);
                    setForeground(Color.BLACK);
                    
                } else {
                    setBackground(Color.YELLOW);
                    setForeground(Color.BLACK);
                     
                   
                  
                }

                if (isSelected) {
                    setBorder(BorderFactory.createLineBorder(Color.BLACK));
                }
            }

            return this;
        }
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
@Override
    public void update(Observable o, Object arg) {
        actualizarListas();
    }
}
