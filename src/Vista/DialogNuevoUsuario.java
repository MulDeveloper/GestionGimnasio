
package Vista;


import Modelo.Tarifas;
import Modelo.Usuario;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author MulDev
 *  www.muldev.tech
 *  Software ejemplo en Java Swing
 */
public class DialogNuevoUsuario extends javax.swing.JDialog {

    public DefaultComboBoxModel modeloTarifas;
    private int cod;
    private Usuario user;

    
    public DialogNuevoUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        modeloTarifas = new DefaultComboBoxModel();
        CBTarifas.setModel(modeloTarifas);
        TFId.setEditable(false);
        TFId.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelFoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TFId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TFNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TFPrimer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TFSegundo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFNif = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CBTarifas = new javax.swing.JComboBox<>();
        BTAceptar = new javax.swing.JButton();
        BTCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TFDireccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("ID CLIENTE");

        jLabel2.setText("NOMBRE");

        jLabel3.setText("APELLIDO");

        jLabel4.setText("SEGUNDO APELLIDO");

        jLabel5.setText("NIF");

        jLabel6.setText("TARIFA");

        CBTarifas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BTAceptar.setBackground(new java.awt.Color(51, 204, 0));
        BTAceptar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BTAceptar.setForeground(new java.awt.Color(255, 255, 255));
        BTAceptar.setText("ACEPTAR");
        BTAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTAceptarActionPerformed(evt);
            }
        });

        BTCancelar.setBackground(new java.awt.Color(255, 0, 0));
        BTCancelar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BTCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BTCancelar.setText("CANCELAR");

        jLabel7.setText("DIRECCION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)))
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFId)
                            .addComponent(TFNombre)
                            .addComponent(TFPrimer)
                            .addComponent(TFSegundo)
                            .addComponent(TFNif)
                            .addComponent(CBTarifas, 0, 271, Short.MAX_VALUE)
                            .addComponent(TFDireccion))
                        .addContainerGap(70, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TFPrimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TFSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TFNif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(LabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CBTarifas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(BTAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTAceptarActionPerformed
        // insertar usuario
        insertarUsuario();
    }//GEN-LAST:event_BTAceptarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTarifas();
        cargarId();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DialogNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogNuevoUsuario dialog = new DialogNuevoUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    public void cargarTarifas(){
        for (Tarifas t:Inicio.listaTarifas){
            modeloTarifas.addElement(t.getNomTarifa());
        }
    }
    public void cargarId(){
        cod = Inicio.ctrl.getId()+1;
        TFId.setText(""+cod);
    }
    
    public void insertarUsuario(){
       if (comprobarDatos()){
           String nombre = TFNombre.getText();
           String primer = TFPrimer.getText();
           String seg = TFSegundo.getText();
           String nif = TFNif.getText();
           int tarifa = CBTarifas.getSelectedIndex()+1;
           String dir = TFDireccion.getText();
           user = new Usuario(cod,nombre,primer,seg,nif,tarifa,dir);
           if(Inicio.ctrl.insertarUsuario(user)==1){
               TFNombre.setText("");
               TFPrimer.setText("");
               TFSegundo.setText("");
               TFNif.setText("");
               CBTarifas.setSelectedIndex(0);
               TFDireccion.setText("");
               Inicio.obtenerRegistros();
               cargarId();
               dispose();
           }
           else{
               JOptionPane.showMessageDialog(this, "Error, Revisa los campos");
           }
           
       }

    }
    public boolean comprobarDatos(){
        if ( !(TFNombre.getText().equals("")) && !(TFPrimer.getText().equals("")) && !(TFSegundo.getText().equals("")) && !(TFNif.getText().equals("")) ){
            return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTAceptar;
    private javax.swing.JButton BTCancelar;
    private javax.swing.JComboBox<String> CBTarifas;
    private javax.swing.JLabel LabelFoto;
    private javax.swing.JTextField TFDireccion;
    private javax.swing.JTextField TFId;
    private javax.swing.JTextField TFNif;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JTextField TFPrimer;
    private javax.swing.JTextField TFSegundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
