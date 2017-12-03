/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Interfaces.Principal;
import javax.swing.JTable;
import Clases.ManagerPermisos;
import javax.swing.JOptionPane;
/**
 *
 * @author kevin
 */
public class Ventana_permisos_consulta extends javax.swing.JDialog {
    ManagerPermisos manager_permisos;
    /**
     * Creates new form Ventana_permisos
     */
    public Ventana_permisos_consulta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        //Asginamos memoria la objeto
        manager_permisos = new ManagerPermisos();
        
        //Etiqueta para indicar a cual usuario se realizaran actualizaciones de permisos o consulta de los mismos
        lblUsuario.setText("Permisos del usuario: "+Principal.usuario);
        
        //Deshabilitamos el momvimiento de los encabezados de la tabla
        tablaPermisos.getTableHeader().setReorderingAllowed(false);
        //Llenamos la tabla con la información del usuario
        tablaPermisos.setModel(manager_permisos.getPermisos(tablaPermisos,Principal.usuario));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPermisos = new JTable(){  public boolean isCellEditable(int rowIndex, int colIndex){ return false;} };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        btnCancelar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        btnCancelar.setMnemonic('C');
        btnCancelar.setText(" Cerrar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(400, 380, 118, 33);

        tablaPermisos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modulo", "Alta", "Baja", "Actualizar", "Consulta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPermisos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 731, 308);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baner Permisos.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 731, 33);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formularios.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-10, 0, 820, 430);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(lblUsuario);
        lblUsuario.setBounds(700, 340, 47, 11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_permisos_consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_permisos_consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_permisos_consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_permisos_consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ventana_permisos_consulta dialog = new Ventana_permisos_consulta(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tablaPermisos;
    // End of variables declaration//GEN-END:variables
}
