package interfaz.datos;

import dominio.Cliente;
import dominio.Funcionario;
import dominio.Sistema;
import java.util.ArrayList;
import java.util.Collections;
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
        actualizarLista();
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
        jLabel1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

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

        jLabel1.setText("Funcionarios registrados");

        lblId.setText("Numero Funcionario");

        txtId.addActionListener(this::txtIdActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnModificarFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCrearFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(spListaFun, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNombre1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addComponent(txtAñoIngreso, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblTel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblId)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(jLabel1))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lblNombre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAñoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spListaFun))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearFuncionarioActionPerformed
        String nombre = txtNombre.getText();
        String telefono = txtTel.getText();
        int ano = 0;
        int id = 0;
        boolean cumple = false;
        boolean letrasNombre = nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]*");
        if (letrasNombre) {
            try {
                ano = Integer.parseInt(txtAñoIngreso.getText());

                if (ano < 1900 || ano > 2026) {
                    JOptionPane.showMessageDialog(this, "Error... Año mal ingresada");
                    cumple = false;
                } else {
                    cumple = true;
                }
            } catch (NumberFormatException e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(this, "Ingrese solamente numeros en año");
            }
            try {
                id = Integer.parseInt(txtId.getText());
            } catch (NumberFormatException e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(this, "Ingrese solamente numeros en año");
            }

            boolean idRepetido = modelo.existeIdFuncionario(id);
            boolean correcto = true;
            if (cumple) {

                correcto = modelo.agregarFuncionario(nombre, ano, telefono, id);
            }
            if (correcto && cumple && idRepetido) {
                actualizarLista();
                txtId.setText("");
                txtNombre.setText("");
                txtTel.setText("");
                txtAñoIngreso.setText("");
                JOptionPane.showMessageDialog(this, "Se creo correctamente");
                modelo.registrarTransaccion("Ingreso de funcionario " + nombre);
            } else if (cumple) {
                JOptionPane.showMessageDialog(this, "El nombre ya existe o está vacío");
            }
        } else {
            JOptionPane.showMessageDialog(this, "El nombre no es valido");
        }
    }//GEN-LAST:event_btnCrearFuncionarioActionPerformed

    private void btnModificarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarFuncionarioActionPerformed
        String nombre = txtNombre.getText();
        String telefono = txtTel.getText();
        int ano = 0;
        int id = 0;
        boolean cumple = false;
        String nombreSeleccionado = (String) liFun.getSelectedValue();

        if (nombreSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un funcionario");
        } else if (telefono.equals("") || nombre.equals("") || ano == 0) {
            JOptionPane.showMessageDialog(this, "Datos incompletos");
        } else if (!nombre.equalsIgnoreCase(nombreSeleccionado)) {
            Funcionario otro = modelo.obtenerFuncionario(nombre);
            if (otro.getNombre() != null && otro.getNombre().equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(this, "El nombre ya existe");
            } else {
                boolean letrasNombre = nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]*");
                if (letrasNombre) {
                    try {
                        ano = Integer.parseInt(txtAñoIngreso.getText());

                        if (ano < 1900 || ano > 2026) {
                            JOptionPane.showMessageDialog(this, "Error... Año mal ingresada");
                            cumple = false;
                        } else {
                            cumple = true;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(e);
                        JOptionPane.showMessageDialog(this, "Ingrese solamente numeros en año");

                    }
                    try {
                        id = Integer.parseInt(txtId.getText());
                    } catch (NumberFormatException e) {
                        System.out.println(e);
                        JOptionPane.showMessageDialog(this, "Ingrese solamente numeros en año");
                    }
                    if (cumple) {
                        boolean correcto = modelo.eliminarFuncionario(nombreSeleccionado);
                        correcto = modelo.agregarFuncionario(nombre, ano, telefono, id);
                        if (correcto) {
                            JOptionPane.showMessageDialog(this, "Se modifico correctamente");
                            modelo.registrarTransaccion("Modificación de funcionario " + nombre);
                            actualizarLista();
                            txtNombre.setText("");
                            txtTel.setText("");
                            txtAñoIngreso.setText("");
                            txtId.setText("");
                        } else {
                            JOptionPane.showMessageDialog(this, "No se pudo modificar correctamente");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El nombre no es valido");
                }
            }
        } else {
            boolean letrasNombre = nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]*");
            if (letrasNombre) {
                try {
                    ano = Integer.parseInt(txtAñoIngreso.getText());
                    if (ano < 1900 || ano > 2026) {
                        JOptionPane.showMessageDialog(this, "Error... Año mal ingresada");
                    } else {
                        cumple = true;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Ingrese solamente numeros en año");
                }
                if (cumple) {
                    boolean correcto = modelo.eliminarFuncionario(nombreSeleccionado);
                    correcto = modelo.agregarFuncionario(nombre, ano, telefono,id);
                    if (correcto) {
                        JOptionPane.showMessageDialog(this, "Se modifico correctamente");
                        modelo.registrarTransaccion("Modificación de funcionario " + nombre);
                        actualizarLista();
                        txtNombre.setText("");
                        txtTel.setText("");
                        txtAñoIngreso.setText("");
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo modificar correctamente");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "El nombre no es valido");
            }
        }
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

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void actualizarLista() {
        ArrayList<Funcionario> lista = new ArrayList<>(modelo.getFuncionarios());
        Collections.sort(lista, (f1, f2) -> f2.getAnoIngreso() - f1.getAnoIngreso());

        String[] datos = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            datos[i] = lista.get(i).getNombre();
        }

        liFun.setListData(datos);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearFuncionario;
    private javax.swing.JButton btnModificarFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblTel;
    private javax.swing.JList<Object> liFun;
    private javax.swing.JScrollPane spListaFun;
    private javax.swing.JTextField txtAñoIngreso;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        actualizarLista();
    }
}
