package interfaz;
import dominio.Sistema;
import interfaz.Reportes.*;
import interfaz.datos.*;
import interfaz.paquetes.*;
/**
 * Michelle Katz 220144
 * Samuel Alzamendi 355626
 */
public class Menu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Menu.class.getName());
    
    private Sistema modelo;
    
    public Menu(Sistema modelo) {
        this.modelo = modelo;
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
        miFuncionarios.addActionListener(this::miFuncionariosActionPerformed);
        mDatos.add(miFuncionarios);

        miTarifa.setText("Tarifa");
        miTarifa.addActionListener(this::miTarifaActionPerformed);
        mDatos.add(miTarifa);

        jMenuBar1.add(mDatos);

        mPaquetes.setText("Paquetes");

        miIngreso.setText("Ingreso");
        miIngreso.addActionListener(this::miIngresoActionPerformed);
        mPaquetes.add(miIngreso);

        miEnvio.setText("Envío");
        miEnvio.addActionListener(this::miEnvioActionPerformed);
        mPaquetes.add(miEnvio);

        miRecepcion.setText("Recepción");
        miRecepcion.addActionListener(this::miRecepcionActionPerformed);
        mPaquetes.add(miRecepcion);

        jMenuBar1.add(mPaquetes);

        mReportes.setText("Reportes");

        miPaquetesEstado.setText("Paquetes por estado");
        miPaquetesEstado.addActionListener(this::miPaquetesEstadoActionPerformed);
        mReportes.add(miPaquetesEstado);

        miConsultaCliente.setText("Consulta por Cliente");
        miConsultaCliente.addActionListener(this::miConsultaClienteActionPerformed);
        mReportes.add(miConsultaCliente);

        miLogTransacciones.setText("Log de transacciones");
        miLogTransacciones.addActionListener(this::miLogTransaccionesActionPerformed);
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
    
    //-----------------------------
    // datos
    private void miClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClientesActionPerformed
        ClienteInterfaz v = new ClienteInterfaz(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_miClientesActionPerformed

    private void miFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFuncionariosActionPerformed
        FuncionarioInterfaz v = new FuncionarioInterfaz(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_miFuncionariosActionPerformed

    private void miTarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTarifaActionPerformed
        Tarifa v = new Tarifa(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_miTarifaActionPerformed

    //-----------------------------
    // paquetes
    private void miIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miIngresoActionPerformed
        Ingreso v = new Ingreso(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_miIngresoActionPerformed

    private void miEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEnvioActionPerformed
        Envio v = new Envio(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_miEnvioActionPerformed

    private void miRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRecepcionActionPerformed
        Recepcion v = new Recepcion(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_miRecepcionActionPerformed
    
    //-----------------------------
    // reportes
    private void miPaquetesEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPaquetesEstadoActionPerformed
        PaquetesPorEstado v = new PaquetesPorEstado(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_miPaquetesEstadoActionPerformed

    private void miConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaClienteActionPerformed
        ConsultaPorCliente v = new ConsultaPorCliente(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_miConsultaClienteActionPerformed

    private void miLogTransaccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLogTransaccionesActionPerformed
        LogDeTransacciones v = new LogDeTransacciones(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_miLogTransaccionesActionPerformed


    
    
    
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
