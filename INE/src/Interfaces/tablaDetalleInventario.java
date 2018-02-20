/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JTable;
import Clases.ManagerInventario;
import Clases.ManagerSolicitud;
import Formularios.modificar_addInventario;
import static Interfaces.Principal.tablaVehiculos;
import static Interfaces.ventana_modificar_vehiculo.campo;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author kevin
 */
public class tablaDetalleInventario extends javax.swing.JDialog {
    
    ManagerInventario manager_inventario;
    ManagerSolicitud manager_solicitud;
    
    public static String clave,producto,tipoSolicitud;
    
    /**
     * Creates new form tablaDetalleInventario
     */
    public tablaDetalleInventario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //Asignamos memoria al objeto
        manager_inventario = new ManagerInventario();
        manager_solicitud = new ManagerSolicitud();
        
        //Deshabilitamos el movimiento de los encabezados
        tablaCoincidencias.getTableHeader().setReorderingAllowed(false);
        this.setLocationRelativeTo(null);
        
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuCoincidencias = new javax.swing.JPopupMenu();
        Asignar = new javax.swing.JMenuItem();
        AsignarP = new javax.swing.JMenuItem();
        Solicitar = new javax.swing.JMenu();
        Baja = new javax.swing.JMenuItem();
        Comodato = new javax.swing.JMenuItem();
        Donación = new javax.swing.JMenuItem();
        Reemplazo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Modificar = new javax.swing.JMenuItem();
        pn_tablaCoincidencias = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCoincidencias = new JTable(){  public boolean isCellEditable(int rowIndex, int colIndex){  return false;  }  };
        jLabel12 = new javax.swing.JLabel();
        txtBusquedaInventario = new javax.swing.JTextField();
        comboFiltroInventario = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        imagenProducto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        Asignar.setText("Reemplazar a un equipo de conjunto");
        Asignar.setToolTipText("");
        Asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignarActionPerformed(evt);
            }
        });
        MenuCoincidencias.add(Asignar);

        AsignarP.setText("Reemplazar una asignación personal");
        MenuCoincidencias.add(AsignarP);

        Solicitar.setText("Solicitar...");

        Baja.setText("Baja");
        Baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaActionPerformed(evt);
            }
        });
        Solicitar.add(Baja);

        Comodato.setText("Comodato");
        Comodato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComodatoActionPerformed(evt);
            }
        });
        Solicitar.add(Comodato);

        Donación.setText("Donación");
        Donación.setToolTipText("");
        Donación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonaciónActionPerformed(evt);
            }
        });
        Solicitar.add(Donación);

        Reemplazo.setText("Reemplazo");
        Reemplazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReemplazoActionPerformed(evt);
            }
        });
        Solicitar.add(Reemplazo);

        MenuCoincidencias.add(Solicitar);
        MenuCoincidencias.add(jSeparator1);

        Modificar.setText("Modificar información");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        MenuCoincidencias.add(Modificar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_tablaCoincidencias.setLayout(null);

        tablaCoincidencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave", "Producto", "Almacén", "Descripción", "No. serie", "Marca", "Observaciones", "Modelo", "Color", "Estatus"
            }
        ));
        tablaCoincidencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCoincidenciasMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaCoincidenciasMouseReleased(evt);
            }
        });
        tablaCoincidencias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaCoincidenciasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCoincidencias);

        pn_tablaCoincidencias.add(jScrollPane1);
        jScrollPane1.setBounds(10, 262, 847, 230);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Busqueda por ");
        pn_tablaCoincidencias.add(jLabel12);
        jLabel12.setBounds(20, 10, 115, 22);

        txtBusquedaInventario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBusquedaInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaInventarioActionPerformed(evt);
            }
        });
        txtBusquedaInventario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaInventarioKeyReleased(evt);
            }
        });
        pn_tablaCoincidencias.add(txtBusquedaInventario);
        txtBusquedaInventario.setBounds(370, 10, 490, 30);

        comboFiltroInventario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboFiltroInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiltroInventarioActionPerformed(evt);
            }
        });
        pn_tablaCoincidencias.add(comboFiltroInventario);
        comboFiltroInventario.setBounds(140, 10, 210, 28);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagenProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagenProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
        );

        pn_tablaCoincidencias.add(jPanel1);
        jPanel1.setBounds(270, 50, 370, 200);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formularios.png"))); // NOI18N
        pn_tablaCoincidencias.add(jLabel1);
        jLabel1.setBounds(0, 0, 870, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_tablaCoincidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_tablaCoincidencias, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        //Llenamos la tabla
        
        comboFiltroInventario.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        comboFiltroInventario.addItem("Clave");
        comboFiltroInventario.addItem("Almacén");
        comboFiltroInventario.addItem("Descripción");
        comboFiltroInventario.addItem("No. serie");
        comboFiltroInventario.addItem("Marca");
        comboFiltroInventario.addItem("Observaciones");
        comboFiltroInventario.addItem("Modelo");
        comboFiltroInventario.addItem("Color");
        comboFiltroInventario.addItem("Estatus");
        
        tablaCoincidencias.setModel(manager_inventario.getInventarioCoincidencias(Principal.prodInventario));
        
        
    }//GEN-LAST:event_formWindowOpened

    private void tablaCoincidenciasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCoincidenciasMouseReleased
        // TODO add your handling code here:
        if(SwingUtilities.isRightMouseButton(evt)){
            int r = tablaCoincidencias.rowAtPoint(evt.getPoint());
            if (r >= 0 && r < tablaCoincidencias.getRowCount())
            tablaCoincidencias.setRowSelectionInterval(r, r);
            MenuCoincidencias.show(evt.getComponent(), evt.getX(), evt.getY());//Mostramos el popMenu en la posición donde esta el cursor
        }//clic derecho
    }//GEN-LAST:event_tablaCoincidenciasMouseReleased

    private void AsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignarActionPerformed
        // TODO add your handling code here:
        int fila = tablaCoincidencias.getSelectedRow();
        
        clave = tablaCoincidencias.getValueAt(fila, 0).toString();
        String estado = manager_solicitud.estadoProducto(clave);
        
        if(estado.equals("DISPONIBLE")){
            
            producto = tablaCoincidencias.getValueAt(fila, 1).toString();
            Ventana_EquipoComputo2 ob = new Ventana_EquipoComputo2(this,true);
            ob.setVisible(true);
            
        }else{
            JOptionPane.showMessageDialog(null, "El producto se encuentra "+estado);
        }
    }//GEN-LAST:event_AsignarActionPerformed
    public void cargarImagen(String producto) throws IOException, SQLException {
        
        Image i = null;
        i = javax.imageio.ImageIO.read(manager_inventario.leerImagen(producto).getBinaryStream());
//        ImageIcon image = new ImageIcon(i);
//        imagenVehiculo.setIcon(image);
//        this.repaint();
        try {
            ImageIcon fot = new ImageIcon(i);
            ImageIcon icono = new ImageIcon(fot.getImage().getScaledInstance(imagenProducto.getWidth(), imagenProducto.getHeight(), Image.SCALE_DEFAULT));
            imagenProducto.setIcon(icono);
            this.repaint();
        } catch (java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la imagen del producto!", "Información!", JOptionPane.WARNING_MESSAGE);

        }//catch
               
    }
    private void BajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaActionPerformed
        // TODO add your handling code here:
        
        int fila = tablaCoincidencias.getSelectedRow();
        clave = tablaCoincidencias.getValueAt(fila, 0).toString();
        tipoSolicitud = "Solicitud Baja";
        
        String estado = manager_solicitud.estadoProducto(clave);
        
        if(estado.equals("DISPONIBLE")){
            
            Principal.banderaSolicitud = 1;
            Ventana_solicitud ob = new Ventana_solicitud(this,true);
            ob.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "El producto se encuentra "+estado);
        }
        
    }//GEN-LAST:event_BajaActionPerformed

    private void ComodatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComodatoActionPerformed
        // TODO add your handling code here:
        int fila = tablaCoincidencias.getSelectedRow();
        clave = tablaCoincidencias.getValueAt(fila, 0).toString();
        tipoSolicitud = "Solicitud Comodato";
        
        String estado = manager_solicitud.estadoProducto(clave);
        
        if(estado.equals("DISPONIBLE")){
            
            Principal.banderaSolicitud = 1;
            Ventana_solicitud ob = new Ventana_solicitud(this,true);
            ob.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "El producto se encuentra "+estado);
        }
        
    }//GEN-LAST:event_ComodatoActionPerformed

    private void DonaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonaciónActionPerformed
        // TODO add your handling code here:
        
        int fila = tablaCoincidencias.getSelectedRow();
        clave = tablaCoincidencias.getValueAt(fila, 0).toString();
        tipoSolicitud = "Solicitud Donación";
        
        String estado = manager_solicitud.estadoProducto(clave);
        
        if(estado.equals("DISPONIBLE")){
            
            Principal.banderaSolicitud = 1;
            Ventana_solicitud ob = new Ventana_solicitud(this,true);
            ob.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "El producto se encuentra "+estado);
        }
        
    }//GEN-LAST:event_DonaciónActionPerformed

    private void txtBusquedaInventarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaInventarioKeyReleased
        // TODO add your handling code here:
        //Llenamos la tabla del inventario
        int filtro = comboFiltroInventario.getSelectedIndex();
        String busqueda = txtBusquedaInventario.getText();

        //Si no hay nada en el campo entonces buscamos todos los productos del inventario o inventario a granel
        if(busqueda.equals("")){
            tablaCoincidencias.setModel(manager_inventario.getInventarioCoincidencias(Principal.prodInventario));
        }//if

        else{

            //Si hay coincidencias entonces muestra
            if(manager_inventario.existeProductoCoincidenciaEspecifico(filtro, Principal.prodInventario, busqueda)){
                tablaCoincidencias.setModel(manager_inventario.getInventarioCoincidenciasEspecifico(filtro, Principal.prodInventario, busqueda));
            }//if

            //Si no hay coincidecnias entonces mostramos el inventario o el inventario a granel
            else{
                tablaCoincidencias.setModel(manager_inventario.getInventarioCoincidencias(Principal.prodInventario));
            }//Segundo else

        }//Primer else
    }//GEN-LAST:event_txtBusquedaInventarioKeyReleased

    private void comboFiltroInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltroInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFiltroInventarioActionPerformed

    private void txtBusquedaInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaInventarioActionPerformed

    private void ReemplazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReemplazoActionPerformed
        // TODO add your handling code here:
        int fila = tablaCoincidencias.getSelectedRow();
        clave = tablaCoincidencias.getValueAt(fila, 0).toString();
        tipoSolicitud = "Solicitud Reemplazo";
        
        String estado = manager_solicitud.estadoProducto(clave);
        
        if(estado.equals("DISPONIBLE") || estado.equals("ASIGNADO")){
            
            Principal.banderaSolicitud = 1;
            Ventana_solicitud ob = new Ventana_solicitud(this,true);
            ob.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "El producto se encuentra "+estado);
        }
    }//GEN-LAST:event_ReemplazoActionPerformed

    private void tablaCoincidenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCoincidenciasMouseClicked
         // TODO add your handling code here:
        metodoImagen();
    }//GEN-LAST:event_tablaCoincidenciasMouseClicked

    private void tablaCoincidenciasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaCoincidenciasKeyReleased
        // TODO add your handling code here:
        metodoImagen();
    }//GEN-LAST:event_tablaCoincidenciasKeyReleased

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
        try {
            modificar_addInventario ob = new modificar_addInventario(this, true);

            modificar_addInventario.txtClave.setText(tablaCoincidencias.getValueAt(tablaCoincidencias.getSelectedRow(), 0).toString());
            ob.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione un vehiculo!", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ModificarActionPerformed
    public void metodoImagen() {
        int fila = tablaCoincidencias.getSelectedRow();
        System.err.println("" + tablaCoincidencias.getValueAt(fila, 0).toString());
        try {
            cargarImagen(tablaCoincidencias.getValueAt(fila, 0).toString());
        } catch (IOException ex) {
            Logger.getLogger(tablaDetalleInventario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tablaDetalleInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(tablaDetalleInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablaDetalleInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablaDetalleInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablaDetalleInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                tablaDetalleInventario dialog = new tablaDetalleInventario(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Asignar;
    private javax.swing.JMenuItem AsignarP;
    private javax.swing.JMenuItem Baja;
    private javax.swing.JMenuItem Comodato;
    private javax.swing.JMenuItem Donación;
    private javax.swing.JPopupMenu MenuCoincidencias;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JMenuItem Reemplazo;
    private javax.swing.JMenu Solicitar;
    private javax.swing.JComboBox<String> comboFiltroInventario;
    private javax.swing.JLabel imagenProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPanel pn_tablaCoincidencias;
    public static javax.swing.JTable tablaCoincidencias;
    private javax.swing.JTextField txtBusquedaInventario;
    // End of variables declaration//GEN-END:variables
}
