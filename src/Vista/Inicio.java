
package Vista;

import Modelo.*;
import Controlador.*;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author MulDev
 *  www.muldev.tech
 *  Software ejemplo en Java Swing
 */
public class Inicio extends javax.swing.JFrame {

    public static DialogLogin login;
    public static String nomUsu;
    public static DefaultTableModel modeloTabla;
    public static DialogClases dClases;
    public static DialogNuevoUsuario dUsuario;
    public static ArrayList <Usuario> listaUsuarios;
    public static ArrayList <Usuario> listaBusqueda;
    public static ArrayList <Incidencia> listaIncidencias;
    public static ArrayList <Personal> listaPersonal;
    public static ArrayList <Clase> listaClases;
    public static ArrayList <Tarifas> listaTarifas;
    public static DialogIncidencia dInci;
    public static CtrlBD ctrl;
    public static int indiceUsuario;
    public static DialogDatosUsuario modiUsuario;
    public static Double totalEntrada;
    public static Double totalSalida;
    public static DocXml crearXml;
    public static File img;
    
    public Inicio() {
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        //dialog de login y posicion
        login = new DialogLogin(this, true);
        login.setLocationRelativeTo(this);
        login.setLocation(500, 230);
        login.setResizable(false);
        PanelUsuarios.setVisible(false);
        //tabla de usuarios estara dentro del frame principal no editable
        modeloTabla = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int col){
            return false;
            }
        };
        TableUsuarios.setModel(modeloTabla);
        modeloTabla.addColumn("IDUSUARIO");
        modeloTabla.addColumn("NOMBRE");
        modeloTabla.addColumn("APELLIDOS");
        modeloTabla.addColumn("TARIFA");
        modeloTabla.addColumn("DIRECCION");
        modeloTabla.addColumn("ESTADO PAGO");
        
        //dialogs de clases e incidencias
        dClases = new DialogClases(this,true);
        dInci = new DialogIncidencia(this,true);
        dUsuario = new DialogNuevoUsuario(this,true);
        //modiUsuario = new DialogDatosUsuario(this,true);
        
        //label de menu opaco
        jLabel1.setOpaque(true);
        
        ctrl = new CtrlBD();
        
        if(!ctrl.conectarBd()){
            JOptionPane.showMessageDialog(this, "Error en la conexion a la base de datos");
            System.exit(0);
        }
                
        obtenerRegistros();
       

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        LabelUser = new javax.swing.JLabel();
        LbBanner = new javax.swing.JLabel();
        PanelMenu = new javax.swing.JPanel();
        BtUsuarios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtOrg = new javax.swing.JButton();
        BtClases = new javax.swing.JButton();
        BtIncidencias = new javax.swing.JButton();
        PanelUsuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableUsuarios = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        BTAlta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TFApellido = new javax.swing.JTextField();
        BTBuscar = new javax.swing.JButton();
        BTBaja = new javax.swing.JButton();
        BTTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);

        LbBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/banner.png"))); // NOI18N

        BtUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        BtUsuarios.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        BtUsuarios.setText("USUARIOS");
        BtUsuarios.setBorder(new javax.swing.border.MatteBorder(null));
        BtUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtUsuariosMouseExited(evt);
            }
        });
        BtUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtUsuariosActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 102, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");

        BtOrg.setBackground(new java.awt.Color(255, 255, 255));
        BtOrg.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtOrg.setForeground(new java.awt.Color(0, 0, 0));
        BtOrg.setText("ORGANIZACION");
        BtOrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtOrgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtOrgMouseExited(evt);
            }
        });
        BtOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtOrgActionPerformed(evt);
            }
        });

        BtClases.setBackground(new java.awt.Color(255, 255, 255));
        BtClases.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtClases.setForeground(new java.awt.Color(0, 0, 0));
        BtClases.setText("CLASES");
        BtClases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtClasesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtClasesMouseExited(evt);
            }
        });
        BtClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtClasesActionPerformed(evt);
            }
        });

        BtIncidencias.setBackground(new java.awt.Color(255, 255, 255));
        BtIncidencias.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtIncidencias.setForeground(new java.awt.Color(0, 0, 0));
        BtIncidencias.setText("INCIDENCIAS");
        BtIncidencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtIncidenciasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtIncidenciasMouseExited(evt);
            }
        });
        BtIncidencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtIncidenciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuLayout.createSequentialGroup()
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtUsuarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(BtClases, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(BtOrg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtIncidencias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtClases, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtIncidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        TableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        TableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableUsuarios);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BUSCAR CLIENTE");

        BTAlta.setBackground(new java.awt.Color(51, 204, 0));
        BTAlta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BTAlta.setForeground(new java.awt.Color(255, 255, 255));
        BTAlta.setText("NUEVO CLIENTE");
        BTAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTAltaActionPerformed(evt);
            }
        });

        jLabel3.setText("APELLIDO:");

        BTBuscar.setText("BUSCAR");
        BTBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTBuscarActionPerformed(evt);
            }
        });

        BTBaja.setBackground(new java.awt.Color(255, 0, 0));
        BTBaja.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BTBaja.setForeground(new java.awt.Color(255, 255, 255));
        BTBaja.setText("BAJA CLIENTE");
        BTBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTBajaActionPerformed(evt);
            }
        });

        BTTodos.setText("MOSTRAR TODOS");
        BTTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelUsuariosLayout = new javax.swing.GroupLayout(PanelUsuarios);
        PanelUsuarios.setLayout(PanelUsuariosLayout);
        PanelUsuariosLayout.setHorizontalGroup(
            PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUsuariosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelUsuariosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelUsuariosLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFApellido))
                            .addGroup(PanelUsuariosLayout.createSequentialGroup()
                                .addComponent(BTTodos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTBuscar)))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        PanelUsuariosLayout.setVerticalGroup(
            PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUsuariosLayout.createSequentialGroup()
                .addGroup(PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelUsuariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTBuscar)
                            .addComponent(BTTodos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(PanelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addComponent(LbBanner)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addComponent(LbBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1358, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtUsuariosActionPerformed
        PanelUsuarios.setVisible(true);
    }//GEN-LAST:event_BtUsuariosActionPerformed

    private void BtUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtUsuariosMouseEntered
        BtUsuarios.setBackground(Color.blue);
        BtUsuarios.setForeground(Color.white);
    }//GEN-LAST:event_BtUsuariosMouseEntered

    private void BtUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtUsuariosMouseExited
        BtUsuarios.setBackground(Color.white);
        BtUsuarios.setForeground(Color.black);
    }//GEN-LAST:event_BtUsuariosMouseExited

    private void BtClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtClasesActionPerformed
        // abrimos el Dialog clases
        dClases.setVisible(true);
    }//GEN-LAST:event_BtClasesActionPerformed

    private void BtIncidenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtIncidenciasActionPerformed
        // hacemos visible el dialog de incidencias
        dInci.setVisible(true);
    }//GEN-LAST:event_BtIncidenciasActionPerformed

    private void BtOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtOrgActionPerformed
        // OBTENEMOS DOCUMENTO CON FACTURACION MENSUAL
        totalEntrada = ctrl.getFacturacion();
        totalSalida = ctrl.getSueldos();
        crearXml = new DocXml();
        if(crearXml.crearDoc()){
            JOptionPane.showMessageDialog(this, "Archivo creado correctamente en el escritorio");
        }
        else{
            JOptionPane.showMessageDialog(this, "Se ha producido un error, ruta inaccesible", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_BtOrgActionPerformed

    private void BtClasesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtClasesMouseEntered
        BtClases.setBackground(Color.blue);
        BtClases.setForeground(Color.white);
    }//GEN-LAST:event_BtClasesMouseEntered

    private void BtIncidenciasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtIncidenciasMouseEntered
        BtIncidencias.setBackground(Color.blue);
        BtIncidencias.setForeground(Color.white);
    }//GEN-LAST:event_BtIncidenciasMouseEntered

    private void BtOrgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtOrgMouseEntered
        BtOrg.setBackground(Color.blue);
        BtOrg.setForeground(Color.white);
    }//GEN-LAST:event_BtOrgMouseEntered

    private void BtClasesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtClasesMouseExited
        BtClases.setBackground(Color.white);
        BtClases.setForeground(Color.black);
    }//GEN-LAST:event_BtClasesMouseExited

    private void BtIncidenciasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtIncidenciasMouseExited
        BtIncidencias.setBackground(Color.white);
        BtIncidencias.setForeground(Color.black);
    }//GEN-LAST:event_BtIncidenciasMouseExited

    private void BtOrgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtOrgMouseExited
        BtOrg.setBackground(Color.white);
        BtOrg.setForeground(Color.black);
    }//GEN-LAST:event_BtOrgMouseExited

    private void BTAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTAltaActionPerformed
        // aqui se da de alta un nuevo cliente en la bbdd, creamos el dialog
        dUsuario.setVisible(true);
        
    }//GEN-LAST:event_BTAltaActionPerformed

    private void TableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableUsuariosMouseClicked
        indiceUsuario = TableUsuarios.getSelectedRow();
        modiUsuario = new DialogDatosUsuario(this,true);
        modiUsuario.setVisible(true);
    }//GEN-LAST:event_TableUsuariosMouseClicked

    private void BTBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTBajaActionPerformed
        if (TableUsuarios.getSelectedRow()!=-1){
            ctrl.bajaUsuario(listaUsuarios.get(TableUsuarios.getSelectedRow()).getIdUsuario());
            obtenerRegistros();
        }
        else{
            JOptionPane.showMessageDialog(this, "No hay usuario seleccionado");
        }
        
    }//GEN-LAST:event_BTBajaActionPerformed

    private void BTBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTBuscarActionPerformed
        if(!TFApellido.getText().equals("")){
            String apellido = TFApellido.getText();
            String ap = apellido.substring(0, 1).toUpperCase() + apellido.substring(1);
            listaBusqueda = ctrl.busquedaUsuariosApellido(ap);
            if(!listaBusqueda.isEmpty()){
                int estado;
                modeloTabla.setRowCount(0);
                //recorremos array de usuarios y añadimos
                for (Usuario us:listaBusqueda){
                estado = ctrl.estadoPago(us.getIdUsuario());
                String tarifa = listaTarifas.get(us.getTipoTarifa()-1).getNomTarifa();
                String estadoPago="PAGADO";

                if (estado==0){
                    estadoPago = "NO PAGADO";
                }
                modeloTabla.addRow(new Object[]{us.getIdUsuario(), us.getNombreUsuario(),
                (us.getApellidoUsuario()+" "+us.getSegundoApellidoUsuario()), tarifa,
                us.getDireccion(), estadoPago});
                }  
            }
            else{
                JOptionPane.showMessageDialog(this, "No hay registros");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Error en los campos");
        }
    }//GEN-LAST:event_BTBuscarActionPerformed

    private void BTTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTTodosActionPerformed
        obtenerRegistros();
    }//GEN-LAST:event_BTTodosActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
                login.setVisible(true);
            }
        });
    }
    
    public static void obtenerRegistros(){
        //metodo que inserta todos los registros de la bbdd en memoria
        
        //obtenemos datos de la bd
        listaUsuarios = ctrl.getUsuarios();
        listaTarifas = ctrl.getTarifas();
        //int de estado y modelo a 0 para reutilizar la funcion
        int estado;
        modeloTabla.setRowCount(0);
        //recorremos array de usuarios y añadimos
        for (Usuario us:listaUsuarios){
            estado = ctrl.estadoPago(us.getIdUsuario());
            
            String tarifa = listaTarifas.get(us.getTipoTarifa()-1).getNomTarifa();
            
            String estadoPago="PAGADO";
            
            if (estado==0){
                estadoPago = "NO PAGADO";
            }
            modeloTabla.addRow(new Object[]{us.getIdUsuario(), us.getNombreUsuario(),
            (us.getApellidoUsuario()+" "+us.getSegundoApellidoUsuario()), tarifa,
            us.getDireccion(), estadoPago});
        }
        
    }
    

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTAlta;
    private javax.swing.JButton BTBaja;
    private javax.swing.JButton BTBuscar;
    private javax.swing.JButton BTTodos;
    private javax.swing.JButton BtClases;
    private javax.swing.JButton BtIncidencias;
    private javax.swing.JButton BtOrg;
    private javax.swing.JButton BtUsuarios;
    private javax.swing.JLabel LabelUser;
    private javax.swing.JLabel LbBanner;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelUsuarios;
    private javax.swing.JTextField TFApellido;
    private javax.swing.JTable TableUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
