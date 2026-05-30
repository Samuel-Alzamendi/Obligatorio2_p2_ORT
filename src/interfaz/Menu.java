package interfaz;
import interfaz.datos.*;
/**
 * Michelle Katz 220144
 * Samuel Alzamendi 355626
 */
public class Menu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Menu.class.getName());
    private Menu modelo;
    
    public Menu(Menu unModelo) {
        this.modelo = unModelo;
        objetoAPantalla();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mDatos = new javax.swing.JMenu();
        miClientes = new javax.swing.JMenuItem();
        miFuncionarios = new javax.swing.JMenuItem();
        miTarifa = new javax.swing.JMenuItem();
        mPaquetes = new javax.swing.JMenu();
        miIngreso = new javax.swing.JMenuItem();
        miEnvio = new javax.swing.JMenuItem();
        miRecepcion = new javax.swing.JMenuItem();
        mReportes = new javax.swing.JMenu();
        miPaquetesEstado = new javax.swing.JMenuItem();
        miConsultaCliente = new javax.swing.JMenuItem();
        miLogTransacciones = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        mDatos.setText("Datos");

        miClientes.setText("Clientes");
        miClientes.addActionListener(this::miClientesActionPerformed);
        mDatos.add(miClientes);

        miFuncionarios.setText("Funcionarios");
        mDatos.add(miFuncionarios);

        miTarifa.setText("Tarifa");
        mDatos.add(miTarifa);

        jMenuBar1.add(mDatos);

        mPaquetes.setText("Paquetes");

        miIngreso.setText("Ingreso");
        mPaquetes.add(miIngreso);

        miEnvio.setText("Envío");
        mPaquetes.add(miEnvio);

        miRecepcion.setText("Recepción");
        mPaquetes.add(miRecepcion);

        jMenuBar1.add(mPaquetes);

        mReportes.setText("Reportes");

        miPaquetesEstado.setText("Paquetes por estado");
        mReportes.add(miPaquetesEstado);

        miConsultaCliente.setText("Consulta por Cliente");
        mReportes.add(miConsultaCliente);

        miLogTransacciones.setText("Log de transacciones");
        mReportes.add(miLogTransacciones);

        jMenuBar1.add(mReportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        setBounds(0, 0, 609, 380);
    }// </editor-fold>//GEN-END:initComponents

    private void miClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClientesActionPerformed

        ClienteInterfaz ci = new ClienteInterfaz();
        ci.setVisible(true);
        
    }//GEN-LAST:event_miClientesActionPerformed
    
    private void objetoAPantalla(){
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mDatos;
    private javax.swing.JMenu mPaquetes;
    private javax.swing.JMenu mReportes;
    private javax.swing.JMenuItem miClientes;
    private javax.swing.JMenuItem miConsultaCliente;
    private javax.swing.JMenuItem miEnvio;
    private javax.swing.JMenuItem miFuncionarios;
    private javax.swing.JMenuItem miIngreso;
    private javax.swing.JMenuItem miLogTransacciones;
    private javax.swing.JMenuItem miPaquetesEstado;
    private javax.swing.JMenuItem miRecepcion;
    private javax.swing.JMenuItem miTarifa;
    // End of variables declaration//GEN-END:variables
}
