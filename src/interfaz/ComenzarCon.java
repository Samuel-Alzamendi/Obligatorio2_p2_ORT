package interfaz;

import dominio.Sistema;
import persistencia.Persistencia;

/**
 * Michelle Katz 220144
 * Samuel Alzamendi 355626
 */
public class ComenzarCon extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ComenzarCon.class.getName());
    private Sistema modelo= new Sistema();
    
    public ComenzarCon(Sistema modelo) {
        this.modelo = modelo;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGrupoOps = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jrbSistemaNuevo = new javax.swing.JRadioButton();
        jrbUltimosDatos = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comenzar con...");
        setName("Comenzar con..."); // NOI18N

        jPanel1.setName("Comenzar Con..."); // NOI18N
        jPanel1.setLayout(null);

        bgGrupoOps.add(jrbSistemaNuevo);
        jrbSistemaNuevo.setText("Un sistema nuevo");
        jPanel1.add(jrbSistemaNuevo);
        jrbSistemaNuevo.setBounds(80, 80, 240, 21);

        bgGrupoOps.add(jrbUltimosDatos);
        jrbUltimosDatos.setText("Los datos de la ultima ejecución");
        jrbUltimosDatos.addActionListener(this::jrbUltimosDatosActionPerformed);
        jPanel1.add(jrbUltimosDatos);
        jrbUltimosDatos.setBounds(80, 50, 240, 21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
        );

        setBounds(0, 0, 416, 160);
    }// </editor-fold>//GEN-END:initComponents

    private void jrbUltimosDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbUltimosDatosActionPerformed
        Persistencia p =new Persistencia();
        modelo = p.deserializar();
        if(modelo == null){
            modelo = new Sistema();
        }
        
        Menu menu = new Menu(modelo);
        menu.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jrbUltimosDatosActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgGrupoOps;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbSistemaNuevo;
    private javax.swing.JRadioButton jrbUltimosDatos;
    // End of variables declaration//GEN-END:variables
}
