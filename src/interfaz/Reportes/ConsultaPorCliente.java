/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz.Reportes;

import dominio.Cliente;
import dominio.Paquete;
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

        String[] datos = new String[modelo.getClientes().size()];
        for (int i = 0; i < modelo.getClientes().size(); i++) {
            Cliente c = modelo.getClientes().get(i);
            datos[i] = c.getNombre();
        }
        liClientes.setListData(datos);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pMain = new javax.swing.JPanel();
        spClientes = new javax.swing.JScrollPane();
        liClientes = new javax.swing.JList<>();
        lblPendientes = new javax.swing.JLabel();
        lblTotalPendientes = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblEnviados = new javax.swing.JLabel();
        lblTotalEnviados = new javax.swing.JLabel();
        lblRecibidos = new javax.swing.JLabel();
        lblTotalRecibidos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta por cliente");

        pMain.setLayout(null);

        liClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                liClientesMouseClicked(evt);
            }
        });
        spClientes.setViewportView(liClientes);

        pMain.add(spClientes);
        spClientes.setBounds(10, 10, 400, 290);

        lblPendientes.setText("Total de paquetes pendientes");
        pMain.add(lblPendientes);
        lblPendientes.setBounds(420, 10, 170, 17);

        lblTotalPendientes.setText("_____");
        pMain.add(lblTotalPendientes);
        lblTotalPendientes.setBounds(420, 30, 35, 17);

        btnCancelar.setText("Cerrar");
        btnCancelar.setToolTipText("");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);
        pMain.add(btnCancelar);
        btnCancelar.setBounds(421, 260, 170, 40);

        lblEnviados.setText("Total de paquetes enviados");
        pMain.add(lblEnviados);
        lblEnviados.setBounds(420, 60, 170, 17);

        lblTotalEnviados.setText("_____");
        pMain.add(lblTotalEnviados);
        lblTotalEnviados.setBounds(420, 80, 35, 17);

        lblRecibidos.setText("Total de paquetes recibidos");
        pMain.add(lblRecibidos);
        lblRecibidos.setBounds(420, 110, 170, 17);

        lblTotalRecibidos.setText("_____");
        pMain.add(lblTotalRecibidos);
        lblTotalRecibidos.setBounds(420, 130, 35, 17);

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

    private void liClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_liClientesMouseClicked
        String clienteElegido = liClientes.getSelectedValue();
        Cliente clienteEncontrado = null;
        for (int i = 0; i < modelo.getClientes().size(); i++) {
            if (modelo.getClientes().get(i).getNombre().equalsIgnoreCase(clienteElegido)) {
                clienteEncontrado = modelo.getClientes().get(i);
            }
        }

        //Seteamos texto de cant pendiente
        int cantPendiente = 0;

        for (int i = 0; i < modelo.getPaquetes().size(); i++) {
            Paquete p = modelo.getPaquetes().get(i);;
            if (p.getCliente().equals(clienteEncontrado) && p.getEstado().equals("Pendiente")) {
                cantPendiente++;
            }

        }

        lblTotalPendientes.setText(cantPendiente + "");

        //Seteamos texto de cant enviado
        int cantEnviado = 0;

        for (int i = 0; i < modelo.getPaquetes().size(); i++) {
            Paquete p = modelo.getPaquetes().get(i);;
            if (p.getCliente().equals(clienteEncontrado) && p.getEstado().equals("Enviado")) {
                cantEnviado++;
            }

        }

        lblTotalEnviados.setText(cantEnviado + "");
        
           int cantRecibido = 0;

        for (int i = 0; i < modelo.getPaquetes().size(); i++) {
            Paquete p = modelo.getPaquetes().get(i);;
            if (p.getCliente().equals(clienteEncontrado) && p.getEstado().equals("Enviado")) {
                cantRecibido++;
            }

        }

        //Seteamos texto de cant total
        int cantTotal = cantEnviado + cantPendiente + cantRecibido;

        lblTotalRecibidos.setText(cantTotal + "");

    }//GEN-LAST:event_liClientesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
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
