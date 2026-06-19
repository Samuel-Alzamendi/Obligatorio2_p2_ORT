/**
 * Michelle Katz 220144 
 * Samuel Alzamendi 355626
 */
package interfaz.Reportes;

import dominio.Cliente;
import dominio.Paquete;
import dominio.Sistema;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author samue
 */
public class ConsultaPorCliente extends javax.swing.JFrame implements Observer {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ConsultaPorCliente.class.getName());

    private Sistema modelo;

    public ConsultaPorCliente(Sistema modelo) {
        initComponents();
        this.modelo = modelo;
        // agregado completo
        modelo.addObserver(this);
        actualizarLista();
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
            if (p.getCliente().equals(clienteEncontrado) && p.getEstado().equalsIgnoreCase("Pendiente")) {
                cantPendiente++;
            }
        }

        lblTotalPendientes.setText(cantPendiente + "");

        //Seteamos texto de cant enviado
        int cantEnviado = 0;

        for (int i = 0; i < modelo.getPaquetes().size(); i++) {
            Paquete p = modelo.getPaquetes().get(i);;
            if (p.getCliente().equals(clienteEncontrado) && p.getEstado().equalsIgnoreCase("Enviado")) {
                cantEnviado++;
            }

        }

        lblTotalEnviados.setText(cantEnviado + "");

        int cantRecibido = 0;

        for (int i = 0; i < modelo.getPaquetes().size(); i++) {
            Paquete p = modelo.getPaquetes().get(i);;
            if (p.getCliente().equals(clienteEncontrado) && p.getEstado().equalsIgnoreCase("Recibido")) {
                cantRecibido++;
            }

        }

        //Seteamos texto de cant recibido
        lblTotalRecibidos.setText(cantRecibido + "");

    }//GEN-LAST:event_liClientesMouseClicked

    private void actualizarLista() {
        String[] datos = new String[modelo.getClientes().size()];
        ArrayList<String> datosOr = new ArrayList<>();

        for (int i = 0; i < modelo.getClientes().size(); i++) {
            datosOr.add(modelo.getClientes().get(i).toString());
        }
        Collections.sort(datosOr);

        for (int i = 0; i < modelo.getClientes().size(); i++) {
            datos[i] = datosOr.get(i);
        }

        liClientes.setListData(datos);

//                ArrayList<String> nombres = new ArrayList<>();
//
//        for (int i = 0; i < modelo.getClientes().size(); i++) {
//            nombres.add(modelo.getClientes().get(i).toString());
//        }
//
//        Collections.sort(nombres);
//
//        String[] datos = new String[nombres.size()];
//        for (int i = 0; i < nombres.size(); i++) {
//            datos[i] = nombres.get(i);
//        }
//
//        liClientes.setListData(datos);
    }

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

    @Override
    public void update(Observable o, Object arg) {
       actualizarLista();
    }
}
