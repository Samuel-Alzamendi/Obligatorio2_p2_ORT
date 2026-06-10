package interfaz.datos;

import dominio.Cliente;
import dominio.Sistema;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

/**
 * Michelle Katz 220144 Samuel Alzamendi 355626
 */
public class ClienteInterfaz extends javax.swing.JFrame implements Observer {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ClienteInterfaz.class.getName());

    private Sistema modelo;

    public ClienteInterfaz(Sistema modelo) {
        this.modelo = modelo;
        modelo.addObserver(this);
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTel)
                            .addComponent(lblEmail)
                            .addComponent(lblNombre)
                            .addComponent(txtTel, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(txtEmail)
                            .addComponent(txtNombre)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModficarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spLista, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModficarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //BOTON CREAR CLIENTE
    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed
        String nombre = txtNombre.getText();
        String telefono = txtTel.getText();
        String email = txtEmail.getText();

        boolean correcto = modelo.agregarCliente(nombre, email, telefono);
        // se borran datos y se actualiza lista
        if (correcto) {
            actualizarLista();
            txtNombre.setText("");
            txtTel.setText("");
            txtEmail.setText("");

        } else {
            JOptionPane.showMessageDialog(this, "El nombre ya existe o está vacío");
        }


    }//GEN-LAST:event_btnCrearClienteActionPerformed

    // boton para traer datos de la lista a los txt
    private void liClientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_liClientesValueChanged

        String nombreSeleccionado = (String) liClientes.getSelectedValue();
        if (nombreSeleccionado != null) {
            for (int i = 0; i < modelo.getClientes().size(); i++) {
                if (modelo.getClientes().get(i).getNombre().equalsIgnoreCase(nombreSeleccionado)) {
                    txtNombre.setText(modelo.getClientes().get(i).getNombre());
                    txtEmail.setText(modelo.getClientes().get(i).getMail());
                    txtTel.setText(modelo.getClientes().get(i).getTelefono());
                }
            }
        }

    }//GEN-LAST:event_liClientesValueChanged

    // boton para modificar al cliente
    private void btnModficarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModficarClienteActionPerformed
        String nombre = txtNombre.getText();
        String telefono = txtTel.getText();
        String mail = txtEmail.getText();
        String nombreSeleccionado = (String) liClientes.getSelectedValue();

        boolean correcto = modelo.eliminarCliente(nombreSeleccionado);
        correcto = modelo.agregarCliente(nombre, mail, telefono);

        if (correcto) {
            JOptionPane.showMessageDialog(this, "Se modifico correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo modificar correctamente");
        }
        actualizarLista();
    }//GEN-LAST:event_btnModficarClienteActionPerformed

//metodo actualizarLista (creamos string de largo cleintes y en for ponemos dentro. Luego la mostramos en lista
    private void actualizarLista() {
        String[] nombres = new String[modelo.getClientes().size()];
        for (int i = 0; i < modelo.getClientes().size(); i++) {
            nombres[i] = modelo.getClientes().get(i).getNombre();
        }
        liClientes.setListData(nombres);
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JButton btnModficarCliente;
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
