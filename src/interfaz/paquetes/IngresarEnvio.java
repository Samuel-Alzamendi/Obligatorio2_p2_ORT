/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz.paquetes;

import dominio.Cliente;
import dominio.Envio;
import dominio.Funcionario;
import dominio.Paquete;
import dominio.Sistema;
import dominio.Zona;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author samue
 */
public class IngresarEnvio extends javax.swing.JFrame implements Observer {

    DefaultListModel<String> modeloPendientes = new DefaultListModel<>();
    DefaultListModel<String> limpieza = new DefaultListModel<>();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(IngresarEnvio.class.getName());

    private Sistema modelo;

    //Paquete pLista = new Paquete();
    ArrayList<Paquete> pLista = new ArrayList<>();

    public IngresarEnvio(Sistema modelo) {
        this.modelo = modelo;
        modelo.addObserver(this);
        initComponents();
        comboFun();
        numEnvio();
        actualizarListas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        spEnvio = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        liZonas = new javax.swing.JList<>();
        lblNumEnvio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spPaPendientes = new javax.swing.JScrollPane();
        liPendientes = new javax.swing.JList<>();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblListaEnvio = new javax.swing.JLabel();
        spListaPaquetes = new javax.swing.JScrollPane();
        liPaqueteEnvio = new javax.swing.JList<>();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        cbFuncionarios = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hacer envio");
        getContentPane().setLayout(null);

        jLabel1.setText("Numero de envio");

        jLabel2.setText("Fecha");

        txtDia.addActionListener(this::txtDiaActionPerformed);

        jLabel3.setText("Zona");

        liZonas.addListSelectionListener(this::liZonasValueChanged);
        jScrollPane2.setViewportView(liZonas);

        lblNumEnvio.setText("________");

        jLabel4.setText("Paquetes pendientes");

        spPaPendientes.setViewportView(liPendientes);

        btnConfirmar.setText("Confirmar envio");
        btnConfirmar.addActionListener(this::btnConfirmarActionPerformed);

        btnCancelar.setText("Cancelar envio");
        btnCancelar.setToolTipText("");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        lblListaEnvio.setText("Lista de paquetes para el envio");

        spListaPaquetes.setViewportView(liPaqueteEnvio);

        btnEliminar.setText("Eliminar paquete");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnAgregar.setText("Agregar paquete");
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);

        jLabel5.setText("Funcionario");

        txtMes.addActionListener(this::txtMesActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spPaPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblListaEnvio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(spListaPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(spEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblNumEnvio)
                            .addComponent(lblListaEnvio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(spListaPaquetes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAgregar)
                                    .addComponent(btnEliminar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnConfirmar)
                                    .addComponent(btnCancelar)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(126, 126, 126)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spPaPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 10, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 620, 360);

        setBounds(0, 0, 614, 386);
    }// </editor-fold>//GEN-END:initComponents

    private void liZonasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_liZonasValueChanged
        String zona = (String) liZonas.getSelectedValue();

        limpieza.clear();
        pLista.clear();
        liPaqueteEnvio.setModel(limpieza);
        modeloPendientes.clear();
        liPendientes.clearSelection();

        if (zona != null) {
            if (modelo.ObtenerPaquetePen(zona).size() >= 1) {
                ArrayList<Paquete> paquetesPendientes = modelo.ObtenerPaquetePen(zona);
                for (Paquete p : paquetesPendientes) {
                    modeloPendientes.addElement(p.getId());

                }
            } else {
                liPendientes.clearSelection();

            }
        }

        liPendientes.setModel(modeloPendientes); // siempre se setea el modelo

    }//GEN-LAST:event_liZonasValueChanged

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaActionPerformed

    private void txtMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMesActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        Zona z = new Zona();
        ArrayList<Paquete> paquetesParaEnvio = new ArrayList<>();
        Paquete p = new Paquete();
        boolean zonaCumple = true;
        boolean cumpleFecha = true;
        boolean cumple = true;

        int dia = 0;
        int mes = 0;
        int ano = 0;
        //CHECKEO DE QUE CAMPOS ESTEN LLENOS Y BIEN
        if (liPaqueteEnvio.getModel().getSize() != 0) {

            if (cbFuncionarios.getSelectedItem() != null) {
                Funcionario f = new Funcionario();

                if (txtDia.getText().trim().isEmpty()
                        || txtMes.getText().trim().isEmpty()
                        || txtAno.getText().trim().isEmpty()) {
                    cumple = false;
                    JOptionPane.showMessageDialog(this, "Error... Falta fecha");
                } else {
                    try {

                        dia = Integer.parseInt(txtDia.getText());
                        mes = Integer.parseInt(txtMes.getText());
                        ano = Integer.parseInt(txtAno.getText());

                        if (dia < 1 || dia > 31
                                || mes < 1 || mes > 12
                                || ano < 2026 || ano > 2080) {
                            JOptionPane.showMessageDialog(this, "Error... Fecha mal ingresada");
                            cumpleFecha = false;
                            cumple = false;
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "La fecha debe contener solo números");
                        cumple = false;
                    }
                }

                if (cumple) {
                    //LLAMAR A SISTEMA
                    Envio e = new Envio();
                    e.setFechaEnvio(dia + "/" + mes + "/" + ano);
                    e.setFuncionario(f);
                    e.setId(Integer.parseInt(lblNumEnvio.getText()));

                    //PASA LISTA DE PAQUETES DE ENVIOS(ID) A UN ARRAY PARA LLAMAR METODO cambiarEstadoPaquete()
                    String[] ids = new String[liPaqueteEnvio.getModel().getSize()];
                    for (int i = 0; i < ids.length; i++) {
                        ids[i] = liPaqueteEnvio.getModel().getElementAt(i);
                    }
                    modelo.cambiarEstadoPaquete(ids);
                    for (int i = 0; i < ids.length; i++) {
                        Paquete pa = modelo.obtenerPaquete(ids[i]);
                        e.agregarPaquete(pa);
                    }
                    modelo.agregarEnvio(e);
                    JOptionPane.showMessageDialog(this, "Envio confirmado exitosamente");
                    this.dispose();

                }

            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un funcionario");
            }

        } else {
            JOptionPane.showMessageDialog(this, "No hay ningun paquete seleccionado");
        }


    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (liZonas.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(this, "Seleccione una zona");
        } else {
            if (liPendientes.getSelectedValue() == null) {
                JOptionPane.showMessageDialog(this, "Seleccione un paquete pendiente");
            } else {
                String paqueteElegido = (String) liPendientes.getSelectedValue();
                int indexSeleccionado = liPendientes.getSelectedIndex();

                for (int i = 0; i < modelo.getPaquetes().size(); i++) {
                    Paquete a = modelo.getPaquetes().get(i);
                    if (a.getId().equalsIgnoreCase(paqueteElegido)) {
                        pLista.add(a);
                    }
                }

                String[] listaPaquete = new String[pLista.size()];
                for (int i = 0; i < listaPaquete.length; i++) {
                    listaPaquete[i] = pLista.get(i).getId();
                }

                liPaqueteEnvio.setListData(listaPaquete);

                DefaultListModel<String> modeloPendientes = (DefaultListModel<String>) liPendientes.getModel();
                modeloPendientes.remove(indexSeleccionado);
            }
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (liPaqueteEnvio.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un paquete para quitar");
        } else {
            String paqueteElegido = (String) liPaqueteEnvio.getSelectedValue();
            int indexSeleccionado = liPaqueteEnvio.getSelectedIndex();

            for (int i = 0; i < pLista.size(); i++) {
                if ((pLista.get(i).getId()).equalsIgnoreCase(paqueteElegido)) {
                    pLista.remove(i);
                }
            }

            String[] listaPaquete = new String[pLista.size()];
            for (int i = 0; i < listaPaquete.length; i++) {
                listaPaquete[i] = pLista.get(i).getId();
            }
            liPaqueteEnvio.setListData(listaPaquete);

            DefaultListModel<String> modeloPendientes = (DefaultListModel<String>) liPendientes.getModel();
            modeloPendientes.addElement(paqueteElegido.replace("Paquete con ID: ", ""));
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // cargar los funcionarios en el combo box
    public void comboFun() {
        for (int i = 0; i < modelo.getFuncionarios().size(); i++) {
            cbFuncionarios.addItem(modelo.getFuncionarios().get(i).getNombre());
        }
    }

    private void actualizarListas() {
//        String[] idsPaquetes = new String[modelo.ObtenerPaquetePen().size()];
//        ArrayList<Paquete> paquetesPendientes = new ArrayList<>();
//        paquetesPendientes = modelo.ObtenerPaquetePen();
//
//        for (int i = 0; i < idsPaquetes.length; i++) {
//            idsPaquetes[i] = paquetesPendientes.get(i).getId();
//        }
//        liPendientes.setListData(idsPaquetes);

        String[] zonas = new String[modelo.getZonas().size()];
        for (int i = 0; i < modelo.getZonas().size(); i++) {
            zonas[i] = modelo.getZonas().get(i).getNombre();
        }
        liZonas.setListData(zonas);

        String[] envios = new String[modelo.getEnvios().size()];
        for (int i = 0; i < modelo.getEnvios().size(); i++) {
            envios[i] = modelo.getEnvios().get(i).getId() + "";
        }
        liZonas.setListData(zonas);

    }

    // carga el numero de envio
    private void numEnvio() {
        lblNumEnvio.setText((modelo.getEnvios().size() + 1) + "");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbFuncionarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblListaEnvio;
    private javax.swing.JLabel lblNumEnvio;
    private javax.swing.JList<String> liPaqueteEnvio;
    private javax.swing.JList<String> liPendientes;
    private javax.swing.JList<String> liZonas;
    private javax.swing.JScrollPane spEnvio;
    private javax.swing.JScrollPane spListaPaquetes;
    private javax.swing.JScrollPane spPaPendientes;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        actualizarListas();
        comboFun();
    }
}
