
package Vista;

import Modelo.Clase;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MulDev
 *  www.muldev.tech
 *  Software ejemplo en Java Swing
 */
public class DialogClases extends javax.swing.JDialog {

    public static DefaultTableModel modeloClases;
    private ArrayList <Clase> listaLunes;
    private ArrayList <Clase> listaMartes;
    private ArrayList <Clase> listaMierc;
    private ArrayList <Clase> listaJueves;
    private ArrayList <Clase> listaViernes;
    private ArrayList <Clase> listaSabado;
    private ArrayList <Clase> listaDom;
    
    public DialogClases(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jLabel1.setOpaque(true);
        modeloClases = new DefaultTableModel();
        TablaClases.setModel(modeloClases);
        modeloClases.addColumn("LUNES");
        modeloClases.addColumn("MARTES");
        modeloClases.addColumn("MIERCOLES");
        modeloClases.addColumn("JUEVES");
        modeloClases.addColumn("VIERNES");
        modeloClases.addColumn("SABADO");
        modeloClases.addColumn("DOMINGO");
 
                
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaClases = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLASES DIRIGIDAS");

        TablaClases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaClases);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        dispose();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //metodo que carga las clases de la bbdd
        cargarClases();
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
            java.util.logging.Logger.getLogger(DialogClases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogClases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogClases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogClases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogClases dialog = new DialogClases(new javax.swing.JFrame(), true);
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
    
    public void cargarClases(){
        listaLunes = Inicio.ctrl.getClases(1);
        listaMartes = Inicio.ctrl.getClases(2);
        listaMierc = Inicio.ctrl.getClases(3);
        listaJueves = Inicio.ctrl.getClases(4);
        listaViernes = Inicio.ctrl.getClases(5);
        listaSabado = Inicio.ctrl.getClases(6);
        listaDom = Inicio.ctrl.getClases(7);
        modeloClases.addRow(new Object[10]);
        for (Clase c: listaLunes){
            modeloClases.addRow(new Object[]{c.getNombreClase()});

        }
        for (int i=0;i<listaMartes.size();i++){
           modeloClases.setValueAt(listaMartes.get(i).getNombreClase(), i, 1);
        }
        for (int i=0;i<listaMierc.size();i++){
           modeloClases.setValueAt(listaMierc.get(i).getNombreClase(), i, 2);
        }
        for (int i=0;i<listaJueves.size();i++){
           modeloClases.setValueAt(listaJueves.get(i).getNombreClase(), i, 3);
        }
        for (int i=0;i<listaViernes.size();i++){
           modeloClases.setValueAt(listaViernes.get(i).getNombreClase(), i, 4);
        }
        for (int i=0;i<listaSabado.size();i++){
           modeloClases.setValueAt(listaSabado.get(i).getNombreClase(), i, 5);
        }
        for (int i=0;i<listaDom.size();i++){
           modeloClases.setValueAt(listaDom.get(i).getNombreClase(), i, 6);
        }
  
  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaClases;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
