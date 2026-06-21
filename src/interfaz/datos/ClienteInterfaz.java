/**
 * Michelle Katz 220144 
 * Samuel Alzamendi 355626
 */
package interfaz.datos;

import dominio.Cliente;
import dominio.Sistema;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

public class ClienteInterfaz extends javax.swing.JFrame implements Observer {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ClienteInterfaz.class.getName());

    private Sistema modelo;

    public ClienteInterfaz(Sistema modelo) {
        this.modelo = modelo;
        modelo.addObserver(this);
        initComponents();
        actualizarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        spLista = new javax.swing.JScrollPane();
        liClientes = new javax.swing.JList<>();
        btnCrearCliente = new javax.swing.JButton();
        btnModficarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");

        txtNombre.addActionListener(this::txtNombreActionPerformed);

        lblNombre.setText("Nombre");

        lblTel.setText("Telefono");

        lblEmail.setText("Email");

        liClientes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        liClientes.addListSelectionListener(this::liClientesValueChanged);
        spLista.setViewportView(liClientes);

        btnCrearCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCrearCliente.setText("Crear cliente");
        btnCrearCliente.addActionListener(this::btnCrearClienteActionPerformed);

        btnModficarCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnModficarCliente.setText("Modificar cliente");
        btnModficarCliente.addActionListener(this::btnModficarClienteActionPerformed);

        jLabel1.setText("Clientes registrados");

        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(this::CerrarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(spLista, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail)
                                    .addComponent(lblNombre))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNombre))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtTel))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btnModficarCliente)
                .addGap(19, 19, 19)
                .addComponent(btnCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblTel)
                        .addGap(12, 12, 12)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spLista, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnModficarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //BOTON CREAR CLIENTE
    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed
        String nombre = txtNombre.getText();
        String telefono = txtTel.getText();
        String email = txtEmail.getText();

        boolean letrasNombre = nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]*");
        if (letrasNombre) {
            boolean correcto = modelo.agregarCliente(nombre, email, telefono);
            // se borran datos y se actualiza lista
            if (correcto) {
                actualizarLista();
                txtNombre.setText("");
                txtTel.setText("");
                txtEmail.setText("");
                JOptionPane.showMessageDialog(this, "Se agrego exitosamente");
                modelo.registrarTransaccion("Ingreso de cliente " + nombre);
            } else {
                JOptionPane.showMessageDialog(this, "El nombre ya existe");
            }
        } else {
            JOptionPane.showMessageDialog(this, "El nombre no es valido");
        }

    }//GEN-LAST:event_btnCrearClienteActionPerformed

    // boton para traer datos de la lista a los txt
    private void liClientesValueChanged(javax.swing.event.ListSelectionEvent evt) {                                        

        String nombreSeleccionado = (String) liClientes.getSelectedValue();
        if (nombreSeleccionado != null) {
            for (int i = 0; i < modelo.getClientes().size(); i++) {
                if (modelo.getClientes().get(i).toString().equalsIgnoreCase(nombreSeleccionado)) {
                    txtNombre.setText(modelo.getClientes().get(i).toString());
                    txtEmail.setText(modelo.getClientes().get(i).getMail());
                    txtTel.setText(modelo.getClientes().get(i).getTelefono());
                }
            }
        }

    }

    // boton para modificar al cliente
    private void btnModficarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModficarClienteActionPerformed
        String nombre = txtNombre.getText();
        String telefono = txtTel.getText();
        String mail = txtEmail.getText();
        String nombreSeleccionado = (String) liClientes.getSelectedValue();

        if (nombreSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un cliente");
        } else if(telefono.equals("")|| nombre.equals("")|| mail.equals("")) {
             JOptionPane.showMessageDialog(this, "Datos incompletos");
        } else if (!nombre.equalsIgnoreCase(nombreSeleccionado)) {
            Cliente otro = modelo.obtenerCliente(nombre);
            if (otro.toString() != null && otro.toString().equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(this, "El nombre ya existe");
            } else {
                boolean letrasNombre = nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]*");
                if (letrasNombre) {
                    boolean correcto = modelo.eliminarCliente(nombreSeleccionado);
                    correcto = modelo.agregarCliente(nombre, mail, telefono);
                    if (correcto) {
                        JOptionPane.showMessageDialog(this, "Se modifico correctamente");
                        modelo.registrarTransaccion("Modificación de cliente " + nombre);
                        actualizarLista();
                        txtNombre.setText("");
                        txtTel.setText("");
                        txtEmail.setText("");
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo modificar correctamente");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El nombre no es valido");
                }
            }
        } else {
            boolean letrasNombre = nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]*");
            if (letrasNombre) {
                boolean correcto = modelo.eliminarCliente(nombreSeleccionado);
                correcto = modelo.agregarCliente(nombre, mail, telefono);
                if (correcto) {
                    JOptionPane.showMessageDialog(this, "Se modifico correctamente");
                    modelo.registrarTransaccion("Modificación de cliente " + nombre);
                    actualizarLista();
                    txtNombre.setText("");
                    txtTel.setText("");
                    txtEmail.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo modificar correctamente");
                }
            } else {
                JOptionPane.showMessageDialog(this, "El nombre no es valido");
            }
        }
    }//GEN-LAST:event_btnModficarClienteActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }

    // metodo actualizarLista
    private void actualizarLista() {
        ArrayList<String> nombres = new ArrayList<>();

        for (int i = 0; i < modelo.getClientes().size(); i++) {
            nombres.add(modelo.getClientes().get(i).toString());
        }

        Collections.sort(nombres);

        String[] datos = new String[nombres.size()];
        for (int i = 0; i < nombres.size(); i++) {
            datos[i] = nombres.get(i);
        }

        liClientes.setListData(datos);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JButton btnModficarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTel;
    private javax.swing.JList<Object> liClientes;
    private javax.swing.JScrollPane spLista;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        actualizarLista();
    }
}
