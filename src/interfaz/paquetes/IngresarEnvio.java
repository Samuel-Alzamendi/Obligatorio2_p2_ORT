/**
 * Michelle Katz 220144 
 * Samuel Alzamendi 355626
 */
package interfaz.paquetes;

import dominio.Cliente;
import dominio.Envio;
import dominio.Funcionario;
import dominio.Paquete;
import dominio.Sistema;
import dominio.Zona;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
        txtFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
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
        jSeparator1 = new javax.swing.JSeparator();
        lblCanPa = new javax.swing.JLabel();
        lblCantPNum = new javax.swing.JLabel();
        lblPesoTNum = new javax.swing.JLabel();
        lblPesoT = new javax.swing.JLabel();
        lblMontoT = new javax.swing.JLabel();
        lblMontoTNum = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hacer envio");
        getContentPane().setLayout(null);

        jLabel1.setText("Numero de envio");

        jLabel2.setText("Fecha");

        txtFecha.addActionListener(this::txtFechaActionPerformed);

        jLabel3.setText("Zona");

        liZonas.addListSelectionListener(this::liZonasValueChanged);
        jScrollPane2.setViewportView(liZonas);

        lblNumEnvio.setText("________");

        jLabel4.setText("Paquetes pendientes");

        spPaPendientes.setViewportView(liPendientes);

        btnConfirmar.setText("Confirmar envio");
        btnConfirmar.addActionListener(this::btnConfirmarActionPerformed);

        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        lblListaEnvio.setText("Lista de paquetes para el envio");

        spListaPaquetes.setViewportView(liPaqueteEnvio);

        btnEliminar.setText("Eliminar paquete");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnAgregar.setText("Agregar paquete");
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);

        jLabel5.setText("Funcionario");

        lblCanPa.setText("Cantidad de paquetes a enviar");

        lblCantPNum.setText("0");

        lblPesoTNum.setText("0");

        lblPesoT.setText("Peso total");

        lblMontoT.setText("Monto total $");

        lblMontoTNum.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNumEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(spPaPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblListaEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(spListaPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jSeparator1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPesoT)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblPesoTNum, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblMontoT)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblMontoTNum, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCanPa)
                                .addGap(18, 18, 18)
                                .addComponent(lblCantPNum, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNumEnvio))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbFuncionarios)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblListaEnvio)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spListaPaquetes, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(spPaPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCanPa)
                    .addComponent(lblCantPNum))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPesoT)
                            .addComponent(lblPesoTNum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMontoT)
                            .addComponent(lblMontoTNum))))
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 550, 380);

        setBounds(0, 0, 541, 417);
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

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        Zona z = new Zona();
        Paquete p = new Paquete();
        boolean cumpleFecha = true;
        boolean cumple = true;

        // verificacion hecha
        if (liZonas.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(this, "Seleccione una zona");
        } else {
            if (liPaqueteEnvio.getModel().getSize() != 0) {

                if (cbFuncionarios.getSelectedItem() != null) {
                    Funcionario f = modelo.obtenerFuncionario(cbFuncionarios.getSelectedItem().toString());

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
                                JOptionPane.showMessageDialog(this, "Error... Fecha mal ingresada");
                                cumpleFecha = false;
                                cumple = false;
                            } else {
                                SimpleDateFormat formatoSalida = new SimpleDateFormat("dd/MM/yyyy");
                                fechaTexto = formatoSalida.format(fecha);
                            }
                        } catch (ParseException e) {
                            JOptionPane.showMessageDialog(this, "Error... Fecha mal ingresada. Use el formato dd/MM/aaaa");
                            cumpleFecha = false;
                            cumple = false;
                        }
                    }

                    if (cumple) {
                        //LLAMAR A SISTEMA
                        Envio e = new Envio();
                        e.setFechaEnvio(fechaTexto);
                        e.setFuncionario(f);
                        e.setId(Integer.parseInt(lblNumEnvio.getText()));
                        z = modelo.obtenerZona(liZonas.getSelectedValue().toString());
                        e.setZona(z);
                        e.setrecepcionado(false);

                        float pesoTotal = Float.parseFloat(lblPesoTNum.getText());
                        e.setPesoTotalPaquetes(pesoTotal);

                        float montoActual = Float.parseFloat(lblMontoTNum.getText());
                        e.setPrecio(montoActual);

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
                        modelo.registrarTransaccion("Ingreso de envío número " + e.toString());
                        JOptionPane.showMessageDialog(this, "Envio confirmado exitosamente");
                        this.dispose();

                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Seleccione un funcionario");

                }
            } else {
                JOptionPane.showMessageDialog(this, "No hay ningun paquete seleccionado");
            }
        }
        //CHECKEO DE QUE CAMPOS ESTEN LLENOS Y BIEN

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

                        // cantidad de paquetes en envio
                        int cant = 0;

                        try {
                            cant = Integer.parseInt(lblCantPNum.getText());
                        } catch (NumberFormatException e) {
                            System.out.println(e);
                        }

                        cant += 1;
                        lblCantPNum.setText(cant + "");

                        // peso total de paquetes en envio
                        float pesoActual = Float.parseFloat(lblPesoTNum.getText());
                        float pesoTotal = ((pesoActual * 1000) + a.getPeso()) / 1000;
                        lblPesoTNum.setText(pesoTotal + "");

                        // monto actual
                        // al ser float tengo q crear dos variables, sino me da error
                        float montoActual = Float.parseFloat(lblMontoTNum.getText());
                        float montoTotal = montoActual + a.getPrecio();
                        lblMontoTNum.setText(montoTotal + "");

                    }
                }

                String[] listaPaquete = new String[pLista.size()];
                for (int i = 0; i < listaPaquete.length; i++) {
                    listaPaquete[i] = pLista.get(i).getId();
                }

                liPaqueteEnvio.setListData(listaPaquete);

                DefaultListModel<String> modeloPendientes = (DefaultListModel<String>) liPendientes.getModel();
                modeloPendientes.remove(indexSeleccionado);

                // peso total en envio
                //lblPesoTNum
            }
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (liPaqueteEnvio.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un paquete para quitar");
        } else {
            String paqueteElegido = (String) liPaqueteEnvio.getSelectedValue();

            for (int i = 0; i < pLista.size(); i++) {
                if ((pLista.get(i).getId()).equalsIgnoreCase(paqueteElegido)) {
                    Paquete a = pLista.get(i);

                    // peso total de paquetes en envio
                    float pesoActual = Float.parseFloat(lblPesoTNum.getText()) * 1000;
                    float pesoTotal = (pesoActual - a.getPeso()) / 1000;
                    lblPesoTNum.setText(pesoTotal + "");

                    // monto total de paquetes en envio
                    float montoActual = Float.parseFloat(lblMontoTNum.getText());
                    float montoTotal = montoActual - a.getPrecio();
                    lblMontoTNum.setText(montoTotal + "");

                    pLista.remove(i);
                    break;
                }
            }

            String[] listaPaquete = new String[pLista.size()];
            for (int i = 0; i < listaPaquete.length; i++) {
                listaPaquete[i] = pLista.get(i).getId();
            }
            liPaqueteEnvio.setListData(listaPaquete);

            DefaultListModel<String> modeloPendientes = (DefaultListModel<String>) liPendientes.getModel();
            modeloPendientes.addElement(paqueteElegido);

            int cant = 0;
            try {
                cant = Integer.parseInt(lblCantPNum.getText());
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
            cant -= 1;
            lblCantPNum.setText(cant + "");
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

        String[] zonas = new String[modelo.getZonas().size()];
        for (int i = 0; i < modelo.getZonas().size(); i++) {
            zonas[i] = modelo.getZonas().get(i).getNombre();
        }
        liZonas.setListData(zonas);

    }

    // carga el numero de envio
    private void numEnvio() {
        int maxId = 0;
        for (int i = 0; i < modelo.getEnvios().size(); i++) {
            if (modelo.getEnvios().get(i).getId() > maxId) {
                maxId = modelo.getEnvios().get(i).getId();
            }
        }
        lblNumEnvio.setText((maxId + 1) + "");
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCanPa;
    private javax.swing.JLabel lblCantPNum;
    private javax.swing.JLabel lblListaEnvio;
    private javax.swing.JLabel lblMontoT;
    private javax.swing.JLabel lblMontoTNum;
    private javax.swing.JLabel lblNumEnvio;
    private javax.swing.JLabel lblPesoT;
    private javax.swing.JLabel lblPesoTNum;
    private javax.swing.JList<String> liPaqueteEnvio;
    private javax.swing.JList<String> liPendientes;
    private javax.swing.JList<String> liZonas;
    private javax.swing.JScrollPane spListaPaquetes;
    private javax.swing.JScrollPane spPaPendientes;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        actualizarListas();
    }
}
