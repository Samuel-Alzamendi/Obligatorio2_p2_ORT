package interfaz.datos;

import dominio.Cliente;
import dominio.Sistema;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Michelle Katz 220144 Samuel Alzamendi 355626
 */
public class ClienteInterfaz extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ClienteInterfaz.class.getName());

    private Sistema modelo;

    public ClienteInterfaz(Sistema modelo) {
        this.modelo = modelo;
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
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");

        lblNombre.setText("Nombre");

        lblTel.setText("Telefono");

        lblEmail.setText("Email");

        liClientes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        spLista.setViewportView(liClientes);

        btnCrearCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCrearCliente.setText("Crear cliente");
        btnCrearCliente.addActionListener(this::btnCrearClienteActionPerformed);

        btnModficarCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnModficarCliente.setText("Modificar cliente");

        jButton1.setText("jButton1");
        jButton1.addActionListener(this::jButton1ActionPerformed);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModficarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed
        String nombre = txtNombre.getText();
        String telefono = txtTel.getText();
        String email = txtEmail.getText();

        serializar(nombre, telefono, email);
    }//GEN-LAST:event_btnCrearClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

    //        public static void serializar(){
//        Persona p1 = new Persona();
//        p1.setNombre("Luis");
//        p1.setEdad(55);
//        //p1.setMascota(a1);
//        
//        Persona p2 = new Persona();
//        p2.setNombre("Ana");
//        p2.setEdad(22);
//        //p2.setMascota(a2);
//        try{
//            ObjectOutputStream out = new ObjectOutputStream(new 
//                FileOutputStream("sistema.ser"));
//            out.writeObject(p1);
//            out.writeObject(p2);
//            out.close();
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//    }
//    
//    private static void deserializar(){
//        
//        try{
//            ObjectInputStream in = new ObjectInputStream(
//                new FileInputStream("sistema.ser"));
//            Persona p3 = (Persona) in.readObject();
//            Persona p4 = (Persona) in.readObject();
//            System.out.println(p3);
//            System.out.println(p4);
//        }catch(IOException | ClassNotFoundException ex){
//            ex.printStackTrace();
//        }
//        
//    }
    private static void serializar(String nombre, String telefono, String email) {

        Cliente c = new Cliente();
        ArrayList<Integer> paquetes = new ArrayList<>();

        c.setNombre(nombre);
        c.setTelefono(telefono);
        c.setMail(email);
        c.setPaquetes(paquetes);

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("clientes.ser"));
            out.writeObject(c);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializar() {
        try {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("clientes.ser"));
                Cliente c = (Cliente) in.readObject();
            System.out.println();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } 
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JButton btnModficarCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTel;
    private javax.swing.JList<Object> liClientes;
    private javax.swing.JScrollPane spLista;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
