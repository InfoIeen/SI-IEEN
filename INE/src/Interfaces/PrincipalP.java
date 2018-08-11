/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Conexion;
import Clases.CrearPDF;
import Clases.ManagerPases;
import Formularios.addSolicitudPermisos;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guillermo
 */
public class PrincipalP extends javax.swing.JFrame {
    
    Conexion cbd = new Conexion();
    Connection cn = cbd.getConexion();
    ManagerPases manager_pases;
    DefaultTableModel modelo;
    boolean limpiar = false;

    /**
     * Creates new form PrincipalP
     */
    public PrincipalP() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        //tablasolic.setModel(manager_soviaticos.getTasol()); 
        tablapase.getTableHeader().setReorderingAllowed(false);
        manager_pases = new ManagerPases();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPases = new javax.swing.JPopupMenu();
        Nueva = new javax.swing.JMenuItem();
        Imprimir = new javax.swing.JMenuItem();
        Hora_llegada = new javax.swing.JMenuItem();
        Cancelar = new javax.swing.JMenuItem();
        solicpase = new javax.swing.JTabbedPane();
        solicitudviaticos1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        tablapase = new JTable(){  public boolean isCellEditable(int rowIndex, int colIndex){  return false;  }  };
        jLabel17 = new javax.swing.JLabel();
        txtbusquedasoli = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemAnterior = new javax.swing.JMenuItem();
        itemSiguiente = new javax.swing.JMenuItem();
        mi_inventario = new javax.swing.JMenuItem();
        item_viaticos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuOpciones = new javax.swing.JMenu();
        menuPermisos = new javax.swing.JMenuItem();
        menuPuestoArea = new javax.swing.JMenuItem();
        MenuSolicitud = new javax.swing.JMenuItem();

        Nueva.setText("Nuevo");
        Nueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaActionPerformed(evt);
            }
        });
        MenuPases.add(Nueva);

        Imprimir.setText("Imprimir");
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });
        MenuPases.add(Imprimir);

        Hora_llegada.setText("Actualizar hora de llegada");
        Hora_llegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hora_llegadaActionPerformed(evt);
            }
        });
        MenuPases.add(Hora_llegada);

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        MenuPases.add(Cancelar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        solicpase.setBackground(new java.awt.Color(255, 204, 204));
        solicpase.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N

        solicitudviaticos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                solicitudviaticos1MouseReleased(evt);
            }
        });
        solicitudviaticos1.setLayout(null);

        jPanel16.setBackground(java.awt.Color.white);

        jScrollPane11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jScrollPane11MouseReleased(evt);
            }
        });

        tablapase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Nombre", "Puesto", "Aréa", "Fecha", "Hora_E/S", "Hora_llegada", "Horas", "Tipo_horario", "Tipo_asunto"
            }
        ));
        tablapase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablapaseMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablapaseMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(tablapase);

        jTabbedPane1.addTab("Solicitud de Pase E/S", new javax.swing.ImageIcon(getClass().getResource("/Iconos/solicitud.png")), jScrollPane11); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        solicitudviaticos1.add(jPanel16);
        jPanel16.setBounds(20, 170, 1300, 410);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Busqueda:");
        solicitudviaticos1.add(jLabel17);
        jLabel17.setBounds(40, 120, 100, 22);

        txtbusquedasoli.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtbusquedasoli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbusquedasoliKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbusquedasoliKeyReleased(evt);
            }
        });
        solicitudviaticos1.add(txtbusquedasoli);
        txtbusquedasoli.setBounds(130, 120, 290, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IEE.png"))); // NOI18N
        solicitudviaticos1.add(jLabel9);
        jLabel9.setBounds(150, 20, 190, 84);
        solicitudviaticos1.add(jLabel18);
        jLabel18.setBounds(10, 10, 1350, 80);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        solicitudviaticos1.add(jLabel19);
        jLabel19.setBounds(0, 0, 1367, 769);

        solicpase.addTab("Solicitud de Pase E/S", new javax.swing.ImageIcon(getClass().getResource("/Iconos/solicitud.png")), solicitudviaticos1); // NOI18N

        jMenu1.setText("Archivo");

        itemAnterior.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_LEFT, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemAnterior.setText("Anterior");
        itemAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAnteriorActionPerformed(evt);
            }
        });
        jMenu1.add(itemAnterior);

        itemSiguiente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_RIGHT, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemSiguiente.setText("Siguiente");
        itemSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSiguienteActionPerformed(evt);
            }
        });
        jMenu1.add(itemSiguiente);

        mi_inventario.setText("Inventario");
        mi_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_inventarioActionPerformed(evt);
            }
        });
        jMenu1.add(mi_inventario);

        item_viaticos.setText("Viaticos");
        item_viaticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_viaticosActionPerformed(evt);
            }
        });
        jMenu1.add(item_viaticos);
        jMenu1.add(jSeparator1);

        itemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(itemSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        menuOpciones.setText("Permisos");

        menuPermisos.setText("Permisos puestos");
        menuPermisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPermisosActionPerformed(evt);
            }
        });
        menuOpciones.add(menuPermisos);

        menuPuestoArea.setText("Puestos & Áreas");
        menuPuestoArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPuestoAreaActionPerformed(evt);
            }
        });
        menuOpciones.add(menuPuestoArea);

        MenuSolicitud.setText("Permisos solicitud");
        MenuSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSolicitudActionPerformed(evt);
            }
        });
        menuOpciones.add(MenuSolicitud);

        jMenuBar1.add(menuOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(solicpase, javax.swing.GroupLayout.DEFAULT_SIZE, 1378, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(solicpase, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemAnteriorActionPerformed

    private void itemSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemSiguienteActionPerformed

    private void mi_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_inventarioActionPerformed
        try {
            Principal a = new Principal();
            a.setVisible(true);
            //this.dispose();
            this.setVisible(false);
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(PrincipalP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mi_inventarioActionPerformed

    private void item_viaticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_viaticosActionPerformed
        // TODO add your handling code here:
        PrincipalS b = new PrincipalS();
        b.setVisible(true);
        //this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_item_viaticosActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        // TODO add your handling code here:
        Object[] botones = {"Confirmar", "Cancelar"};
        int opcion = JOptionPane.showOptionDialog(this, "¿Salir del Sistema?", "Confirmación",
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, botones, botones[0]);

        if (opcion == 0) {
            System.exit(0);
        } else if (opcion == 1) {
            //Cerrar sesion
        }
    }//GEN-LAST:event_itemSalirActionPerformed

    private void menuPermisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPermisosActionPerformed
        // TODO add your handling code here:
        /*if((manager_permisos.alta_permisos(Username) && manager_permisos.baja_permisos(Username)) || manager_permisos.consulta_permisos(Username)){
            if(manager_permisos.alta_permisos(Username) && manager_permisos.baja_permisos(Username)){
                Ventana_permisos_puesto ob = new Ventana_permisos_puesto(this, true);
                ob.setVisible(true);
            }else{
                Ventana_permisos_puesto_consulta ob = new Ventana_permisos_puesto_consulta(this, true);
                ob.setVisible(true);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usted no tiene acceso a los permisos estaticos de los puestos.");
        }*/
    }//GEN-LAST:event_menuPermisosActionPerformed

    private void menuPuestoAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPuestoAreaActionPerformed
        // TODO add your handling code here:
        /*Ventana_Puestos_Area ob = new Ventana_Puestos_Area(this, true);
        ob.setVisible(true);*/
    }//GEN-LAST:event_menuPuestoAreaActionPerformed

    private void MenuSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSolicitudActionPerformed
        // TODO add your handling code here:
        /* if((manager_permisos.alta_permisos(Username) && manager_permisos.baja_permisos(Username)) || manager_permisos.consulta_permisos(Username)){
            if(manager_permisos.alta_permisos(Username) && manager_permisos.baja_permisos(Username)){
                Ventana_permisosSolicitud ob = new Ventana_permisosSolicitud(this, true);
                ob.setVisible(true);
            }else{
                Ventana_permisosSolicitud_consulta ob = new Ventana_permisosSolicitud_consulta(this, true);
                ob.setVisible(true);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usted no tiene acceso a los permisos de las solicitudes.");
        }*/
    }//GEN-LAST:event_MenuSolicitudActionPerformed

    private void tablapaseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablapaseMouseReleased
        // TODO add your handling code here:
        if (SwingUtilities.isRightMouseButton(evt)) {
            int r = tablapase.rowAtPoint(evt.getPoint());
            if (r >= 0 && r < tablapase.getRowCount()) {
                tablapase.setRowSelectionInterval(r, r);
            }
            MenuPases.show(evt.getComponent(), evt.getX(), evt.getY());//Mostramos el popMenu en la posición donde esta el cursor

        }//clic derecho
    }//GEN-LAST:event_tablapaseMouseReleased

    private void tablapaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablapaseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablapaseMouseClicked

    private void jScrollPane11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane11MouseReleased
        // TODO add your handling code here:
        if (SwingUtilities.isRightMouseButton(evt)) {
            //MenuPanelSolicitudViatico.show(evt.getComponent(), evt.getX(), evt.getY());//Mostramos el popMenu en la posición donde esta el cursor
        }//clic derecho
    }//GEN-LAST:event_jScrollPane11MouseReleased

    private void txtbusquedasoliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedasoliKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusquedasoliKeyPressed

    private void txtbusquedasoliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedasoliKeyReleased
        // TODO add your handling code here:
        
            modelo = new DefaultTableModel() {
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return false;
                }
            };
            //modelo.addColumn("idSolicitud");
            modelo.addColumn("Folio");
            modelo.addColumn("Nombre");
            modelo.addColumn("Puesto");
            modelo.addColumn("Area");
            modelo.addColumn("Fecha");
            modelo.addColumn("Hora_E/S");
            modelo.addColumn("Hora_llegada");
            modelo.addColumn("Tipo_horario");
            modelo.addColumn("Tipo_asunto");
            //modelo.addColumn("Estado");
            this.tablapase.setModel(modelo);
            try {

                Statement sentencia = cn.createStatement();

                ResultSet rs = sentencia.executeQuery("SELECT Folio, Nombre, Puesto, Area, Fecha, Hora_ES, Hora_Llegada, Tipo_Horario, Tipo_Asunto FROM solicitud_pase WHERE Folio LIKE '%" + txtbusquedasoli.getText() + "%'"
                    + "OR Nombre LIKE '%" + txtbusquedasoli.getText() + "%' OR Puesto LIKE '%" + txtbusquedasoli.getText() + "%' OR Area LIKE '%" + txtbusquedasoli.getText() + "%' OR Fecha LIKE '%" + txtbusquedasoli.getText() + "%'"
                    + "OR Hora_ES LIKE '%" + txtbusquedasoli.getText() + "%' OR Hora_Llegada LIKE '%" + txtbusquedasoli.getText() + "%' OR Tipo_Horario LIKE '%" + txtbusquedasoli.getText() + "%' OR Tipo_Asunto LIKE '%" + txtbusquedasoli.getText() + "%'");

                String solicitud[] = new String[9];
                while (rs.next()) {
                    solicitud[0] = rs.getString("Folio");
                    solicitud[1] = rs.getString("Nombre");
                    solicitud[2] = rs.getString("Puesto");
                    solicitud[3] = rs.getString("Area");
                    solicitud[4] = rs.getString("Fecha");
                    solicitud[5] = rs.getString("Hora_ES");
                    solicitud[6] = rs.getString("Hora_Llegada");
                    solicitud[7] = rs.getString("Tipo_Horario");
                    solicitud[8] = rs.getString("Tipo_Asunto");
                    //solicitud[9] = rs.getString("Estado");
                    modelo.addRow(solicitud);
                }

            } catch (SQLException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "Error en la consulta");

            }
        
    }//GEN-LAST:event_txtbusquedasoliKeyReleased

    private void solicitudviaticos1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solicitudviaticos1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_solicitudviaticos1MouseReleased

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        tablapase.setModel(manager_pases.getTasolpa());
    }//GEN-LAST:event_formWindowActivated

    private void NuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaActionPerformed
        // TODO add your handling code here:
        addSolicitudPermisos asv = new addSolicitudPermisos(this, true);
        asv.setVisible(true);
    }//GEN-LAST:event_NuevaActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        // TODO add your handling code here:
        int fila = tablapase.getSelectedRow();;
        limpiar = false;
        String id = null;
        try {

            tablapase.clearSelection();
            CrearPDF pdf = new CrearPDF();
            if (fila >= 0) {
                id = tablapase.getValueAt(fila, 0).toString();
                pdf.generarPDFSolicitud(id);
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_ImprimirActionPerformed

    private void Hora_llegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hora_llegadaActionPerformed
        // TODO add your handling code here:
        int k = tablapase.getSelectedRow();
        if (k >= 0) {
            if(tablapase.getValueAt(k,8).toString().equals("Intermedio")){
                //javax.swing.JOptionPane.showMessageDialog(null, "Si se puede");
                String folio = tablapase.getValueAt(k, 0).toString();
                //javax.swing.JOptionPane.showMessageDialog(null,id);
            try {
                Statement sentencia = cn.createStatement();
                String horallegada = javax.swing.JOptionPane.showInputDialog("Asignar hora de llegada");
                if (horallegada.equals("")) {
                    javax.swing.JOptionPane.showMessageDialog(null, "El Formato de horas debe ser 00:00, vuelva a intentarlo");  
                } else {
                    
                    if (horallegada.split(":").length!=2) {
                        javax.swing.JOptionPane.showMessageDialog(null, "El Formato de horas debe ser 00:00, vuelva a intentarlo");
                    } else {
                        sentencia.executeUpdate("UPDATE solicitud_pase SET Hora_Llegada = '" + horallegada + "' WHERE Folio = '" + folio + "';");
                        //javax.swing.JOptionPane.showMessageDialog(null, horallegada); 
                        javax.swing.JOptionPane.showMessageDialog(null, "Hora de llegada actualizada"); 
                    }
                }
            } catch (SQLException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "Error en la actualización");
            }

        } else {
                javax.swing.JOptionPane.showMessageDialog(null, "No se puede actualizar hora de llegada");
        }
            tablapase.setModel(manager_pases.getTasolpa());                
            }else{
                javax.swing.JOptionPane.showMessageDialog(null, "Seleccionar solicitud");                
            }
    }//GEN-LAST:event_Hora_llegadaActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
        int k = tablapase.getSelectedRow();
        if (k >= 0) {
            String folio = tablapase.getValueAt(k, 0).toString();
                try {
                    Statement sentencia = cn.createStatement();
                    sentencia.executeUpdate("UPDATE solicitud_pase SET Estado = 'C' WHERE Folio = '" + folio + "';");
                    javax.swing.JOptionPane.showMessageDialog(null, "Solicitud cancelada");
                } catch (SQLException ex) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Error al cancelar");
                }
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Seleccionar solicitud");
        }
        tablapase.setModel(manager_pases.getTasolpa()); 
    }//GEN-LAST:event_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cancelar;
    private javax.swing.JMenuItem Hora_llegada;
    private javax.swing.JMenuItem Imprimir;
    private javax.swing.JPopupMenu MenuPases;
    private javax.swing.JMenuItem MenuSolicitud;
    private javax.swing.JMenuItem Nueva;
    private javax.swing.JMenuItem itemAnterior;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenuItem itemSiguiente;
    private javax.swing.JMenuItem item_viaticos;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenu menuOpciones;
    private javax.swing.JMenuItem menuPermisos;
    private javax.swing.JMenuItem menuPuestoArea;
    private javax.swing.JMenuItem mi_inventario;
    private javax.swing.JPanel solicitudviaticos1;
    public static javax.swing.JTabbedPane solicpase;
    public static javax.swing.JTable tablapase;
    private javax.swing.JTextField txtbusquedasoli;
    // End of variables declaration//GEN-END:variables
}
