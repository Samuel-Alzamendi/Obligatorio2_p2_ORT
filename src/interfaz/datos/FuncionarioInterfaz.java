package interfaz.datos;

import dominio.Sistema;
import java.util.InputMismatchException;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

/**
 * Michelle Katz 220144 Samuel Alzamendi 355626
 */
public class FuncionarioInterfaz extends javax.swing.JFrame implements Observer {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FuncionarioInterfaz.class.getName());

    private Sistema modelo;

    public FuncionarioInterfaz(Sistema modelo) {
        this.modelo = modelo;
        modelo.addObserver(this);

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spListaFun = new javax.swing.JScrollPane();
        liFun = new javax.swing.JList<>();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        txtAñoIngreso = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        btnCrearFuncionario = new javax.swing.JButton();
        btnModificarFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funcionarios");

        liFun.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        liFun.addListSelectionListener(this::liFunValueChanged);
        spListaFun.setViewportView(liFun);

        lblNombre.setText("Nombre");

        lblTel.setText("Telefono");

        lblNombre1.setText("Año de ingreso");

        btnCrearFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCrearFuncionario.setText("Crear funcionario");
        btnCrearFuncionario.addActionListener(this::btnCrearFuncionarioActionPerformed);

        btnModificarFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnModificarFuncionario.setText("Modificar funcionario");
        btnModificarFuncionario.addActionListener(this::btnModificarFuncionarioActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spListaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtTel)
                            .addComponent(txtAñoIngreso)
                            .addComponent(lblNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCrearFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spListaFun)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(lblTel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(lblNombre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAñoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//BOTON CREAR FUNCIONARIO
    private void btnCrearFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearFuncionarioActionPerformed
        String nombre = txtNombre.getText();
        String telefono = txtTel.getText();
        int ano = 0;
        boolean cumple = false;
        try {
            ano = Integer.parseInt(txtAñoIngreso.getText());

            if (ano < 1900 || ano > 2026) {
                JOptionPane.showMessageDialog(this, "Error... Año mal ingresada");
                cumple = false;
            }else{
                cumple = true;
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Ingrese solamente numeros en año");
        }

        boolean correcto = true;
        if (cumple) {
            correcto = modelo.agregarFuncionario(nombre, ano, telefono);
        }
        // se borran datos y se actualiza lista
        if (correcto && cumple) {
            actualizarLista();
            txtNombre.setText("");
            txtTel.setText("");
            txtAñoIngreso.setText("");

        } else {
            JOptionPane.showMessageDialog(this, "Error, verifique los campos");
        }
    }//GEN-LAST:event_btnCrearFuncionarioActionPerformed
    //BOTON MODIFICAR
    private void btnModificarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarFuncionarioActionPerformed
        String nombre = txtNombre.getText();
        String telefono = txtTel.getText();
        int ano = 0;
        String nombreSeleccionado = (String) liFun.getSelectedValue();

        try {
            ano = Integer.parseInt(txtAñoIngreso.getText());
        } catch (InputMismatchException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Ingrese solamente numeros en año");
        }

        boolean correcto = modelo.eliminarFuncionario(nombreSeleccionado);
        correcto = modelo.agregarFuncionario(nombre, ano, telefono);
        if (correcto) {
            JOptionPane.showMessageDialog(this, "se modifico correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo modificar correctamente");
        }
        actualizarLista();
    }//GEN-LAST:event_btnModificarFuncionarioActionPerformed

    private void liFunValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_liFunValueChanged

        String nombreSeleccionado = (String) liFun.getSelectedValue();
        if (nombreSeleccionado != null) {
            for (int i = 0; i < modelo.getFuncionarios().size(); i++) {
                if (modelo.getFuncionarios().get(i).getNombre().equalsIgnoreCase(nombreSeleccionado)) {
                    txtNombre.setText(modelo.getFuncionarios().get(i).getNombre());
                    txtTel.setText(modelo.getFuncionarios().get(i).getCelular());
                    txtAñoIngreso.setText(String.valueOf(modelo.getFuncionarios().get(i).getAnoIngreso()));
                }
            }
        }
    }//GEN-LAST:event_liFunValueChanged

    private void actualizarLista() {
        String[] nombres = new String[modelo.getFuncionarios().size()];
        for (int i = 0; i < modelo.getFuncionarios().size(); i++) {
            nombres[i] = modelo.getFuncionarios().get(i).getNombre();
        }
        liFun.setListData(nombres);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearFuncionario;
    private javax.swing.JButton btnModificarFuncionario;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblTel;
    private javax.swing.JList<Object> liFun;
    private javax.swing.JScrollPane spListaFun;
    private javax.swing.JTextField txtAñoIngreso;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        actualizarLista();
    }
}
