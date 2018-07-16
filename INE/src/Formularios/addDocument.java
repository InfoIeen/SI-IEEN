/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.ManagerDocumentos;
import Clases.ManagerPermisos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author kevin
 */
public class addDocument extends javax.swing.JDialog {
    ManagerDocumentos manager_documentos;
    
    /**
     * Creates new form addInventario
     */
    public addDocument(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //Asginamos memoria al objeto
        manager_documentos = new ManagerDocumentos();
        
        tablaSeleccionProductos.getTableHeader().setReorderingAllowed(false);
        
        this.setLocationRelativeTo(null);
        this.setTitle("Nuevo documento");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_addInventario = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        comboEstatus = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSeleccionProductos = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_addInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pn_addInventario.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Selecciona el tipo del nuevo documento:");
        pn_addInventario.add(jLabel4);
        jLabel4.setBounds(20, 20, 260, 17);

        comboEstatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baja", "Comodato", "Donación" }));
        comboEstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstatusActionPerformed(evt);
            }
        });
        pn_addInventario.add(comboEstatus);
        comboEstatus.setBounds(280, 10, 120, 30);
        pn_addInventario.add(jSeparator1);
        jSeparator1.setBounds(10, 50, 830, 10);

        tablaSeleccionProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "¿Cuáles se van?", "Clave", "Nombre corto", "No. de serie", "Descripción", "Observaciones", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(tablaSeleccionProductos);

        pn_addInventario.add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 830, 390);

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/aceptar.png"))); // NOI18N
        btnAceptar.setText(" Aceptar");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        pn_addInventario.add(btnAceptar);
        btnAceptar.setBounds(260, 460, 150, 33);

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        btnCancelar.setText(" Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pn_addInventario.add(btnCancelar);
        btnCancelar.setBounds(420, 460, 150, 33);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formularios.png"))); // NOI18N
        pn_addInventario.add(jLabel6);
        jLabel6.setBounds(0, 0, 860, 510);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Clave:");
        pn_addInventario.add(jLabel7);
        jLabel7.setBounds(60, 70, 38, 17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_addInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_addInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel inventario = (DefaultTableModel)tablaSeleccionProductos.getModel();
        
        String status = comboEstatus.getSelectedItem().toString();
        
        Boolean[] cambio = new Boolean[inventario.getRowCount()];
        String[] ids = new String[inventario.getRowCount()];

        //Llenamos los arreglos con la información
        for(int i = 0; i<ids.length; i++){
            cambio[i] = Boolean.parseBoolean(tablaSeleccionProductos.getValueAt(i, 0).toString());
            ids[i] = tablaSeleccionProductos.getValueAt(i, 1).toString();
        }//for
        
        if(manager_documentos.crearDocumento(ids,cambio,status)){
            JOptionPane.showMessageDialog(null, "Se registro exitosamente el documento.");
            this.dispose();
        }//if
        else{
            JOptionPane.showMessageDialog(null, "Verificar con el distribuidor.");
        }
        
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
         // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    tablaSeleccionProductos.setModel(manager_documentos.productosParaAsignar("Baja"));            
    }//GEN-LAST:event_formWindowOpened

    private void comboEstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstatusActionPerformed
        // TODO add your handling code here:
        //Obtenemos el estatus para mostrarle los productos de ese tipo
        String status = comboEstatus.getSelectedItem().toString();
        
        tablaSeleccionProductos.setModel(manager_documentos.productosParaAsignar(status));
        
    }//GEN-LAST:event_comboEstatusActionPerformed
    
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
            java.util.logging.Logger.getLogger(addInventarioGranel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addInventarioGranel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addInventarioGranel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addInventarioGranel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                addInventarioGranel dialog = new addInventarioGranel(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> comboEstatus;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pn_addInventario;
    private javax.swing.JTable tablaSeleccionProductos;
    // End of variables declaration//GEN-END:variables
}