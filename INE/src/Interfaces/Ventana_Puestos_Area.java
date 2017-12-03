/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.ManagerComplemento;

import javax.swing.JTable;
import javax.swing.SwingUtilities;

/**
 *
 * @author kevin
 */
public class Ventana_Puestos_Area extends javax.swing.JDialog {
    ManagerComplemento manager_complemento;
    /**
     * Creates new form Ventana_Puestos
     */
    public Ventana_Puestos_Area(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        //Asignamos memoria al objeto
        manager_complemento = new ManagerComplemento();
        
        //Deshabilitamos el movimiento de los encabezados de las tablas
        tablaPuestos.getTableHeader().setReorderingAllowed(false);
        tablaAreas.getTableHeader().setReorderingAllowed(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPuesto = new javax.swing.JPopupMenu();
        AñadirP = new javax.swing.JMenuItem();
        MenuArea = new javax.swing.JPopupMenu();
        AñadirA = new javax.swing.JMenuItem();
        pn_puestos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPuestos = new JTable(){  public boolean isCellEditable(int rowIndex, int colIndex){  return false;  }  };
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaAreas = new JTable(){  public boolean isCellEditable(int rowIndex, int colIndex){  return false;  }  };
        jLabel1 = new javax.swing.JLabel();

        AñadirP.setText("Añadir");
        MenuPuesto.add(AñadirP);

        AñadirA.setText("Añadir");
        MenuArea.add(AñadirA);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_puestos.setLayout(null);

        tablaPuestos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Puestos"
            }
        ));
        tablaPuestos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaPuestosMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tablaPuestos);

        pn_puestos.add(jScrollPane2);
        jScrollPane2.setBounds(20, 20, 200, 281);

        tablaAreas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Áreas"
            }
        ));
        tablaAreas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaAreasMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tablaAreas);

        pn_puestos.add(jScrollPane3);
        jScrollPane3.setBounds(270, 20, 200, 281);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formularios.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        pn_puestos.add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_puestos, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_puestos, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        //Llenamos las tablas
        tablaPuestos.setModel(manager_complemento.getPuestos());
        tablaAreas.setModel(manager_complemento.getAreas());
    }//GEN-LAST:event_formWindowOpened

    private void tablaPuestosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPuestosMouseReleased
        // TODO add your handling code here:
        
        //Esto es para seleccionar con el click derecho y desplegar el menu solo cuando se seleccione una fila de la tabla
        if(SwingUtilities.isRightMouseButton(evt)){
            int r = tablaPuestos.rowAtPoint(evt.getPoint());
            if (r >= 0 && r < tablaPuestos.getRowCount())
            tablaPuestos.setRowSelectionInterval(r, r);
            MenuPuesto.show(evt.getComponent(), evt.getX(), evt.getY());//Mostramos el popMenu en la posición donde esta el cursor
        }//clic derecho
        
    }//GEN-LAST:event_tablaPuestosMouseReleased

    private void tablaAreasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAreasMouseReleased
        // TODO add your handling code here:
        
        //Esto es para seleccionar con el click derecho y desplegar el menu solo cuando se seleccione una fila de la tabla
        if(SwingUtilities.isRightMouseButton(evt)){
            int r = tablaAreas.rowAtPoint(evt.getPoint());
            if (r >= 0 && r < tablaAreas.getRowCount())
            tablaAreas.setRowSelectionInterval(r, r);
            MenuArea.show(evt.getComponent(), evt.getX(), evt.getY());//Mostramos el popMenu en la posición donde esta el cursor
        }//clic derecho
        
    }//GEN-LAST:event_tablaAreasMouseReleased

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
            java.util.logging.Logger.getLogger(Ventana_Puestos_Area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Puestos_Area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Puestos_Area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Puestos_Area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ventana_Puestos_Area dialog = new Ventana_Puestos_Area(new javax.swing.JFrame(), true);
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
    private javax.swing.JMenuItem AñadirA;
    private javax.swing.JMenuItem AñadirP;
    private javax.swing.JPopupMenu MenuArea;
    private javax.swing.JPopupMenu MenuPuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pn_puestos;
    private javax.swing.JTable tablaAreas;
    private javax.swing.JTable tablaPuestos;
    // End of variables declaration//GEN-END:variables
}
