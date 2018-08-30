/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.PreConexion;
import static Interfaces.Principal.Username;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.ImageIcon;
import javax.swing.UnsupportedLookAndFeelException;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author oscar
 */
public class PrimerInicio extends javax.swing.JFrame {
    ventanaCliente ventanacliente;
    ventanaServer ventanaserver;
    PreConexion preconexion;
    Login login;
    public static boolean estado = true; 
    /**
     * Creates new form PrimerInicio
     */
    public PrimerInicio() {
        //Memoria de objetos
        preconexion = new PreConexion();
        login = new Login();
        if (!leer().equals("")) {
            login.setVisible(true);
            estado = false;
        } else {
            initComponents();
            ventanacliente = new ventanaCliente();
            ventanaserver = new ventanaServer();
            this.setLocationRelativeTo(null);
            //Grupo para evitar que se seleccionen dos opciones
            grupoServicios.add(opServer);
            grupoServicios.add(opCliente);
            //Opcion de cliente por default
            opCliente.setSelected(true);

            //Asignar icono 
            setIconImage(new ImageIcon(getClass().getResource("/Iconos/IEE.png")).getImage());
            avisoLabel.setVisible(false);

        }
    }
    
    
    public boolean validarPrimerInicio(){
        boolean res = false;
       
        if(!preconexion.existeHost()){
            System.err.println("No hay datos"+preconexion.existeHost());
        }else{
            System.err.println("Hay datos"+preconexion.existeHost());
            res = true;
        }
        return res;
    }
    
    public void metodoTipoInstalacion(){
        if(opServer.isSelected()){
            avisoLabel.setVisible(true);
        }else{
            avisoLabel.setVisible(false);
        }
    }
    
    public String leer() {
        String texto = "";
        try {
            //Creamos un archivo FileReader que obtiene lo que tenga el archivo
            FileReader lector = new FileReader("cnfg.init");

            //El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido = new BufferedReader(lector);

            Username = contenido.readLine();
            texto = Username;
        } catch (Exception e) {

        }
        return texto;
    }//leer()

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoServicios = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        opServer = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        avisoLabel = new javax.swing.JLabel();
        opCliente = new javax.swing.JRadioButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Primer inicio - Instituto Estatal Electoral de Nayarit");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        opServer.setBackground(new java.awt.Color(255, 255, 255));
        opServer.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        opServer.setText("Ejecutar como servidor.");
        opServer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opServerMouseClicked(evt);
            }
        });
        jPanel1.add(opServer);
        opServer.setBounds(160, 60, 170, 25);

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        jButton1.setText(" Cancelar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(240, 160, 120, 30);

        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/aceptar.png"))); // NOI18N
        jButton2.setText(" Continuar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(80, 160, 130, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/instalacion.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 450, 48);

        avisoLabel.setForeground(new java.awt.Color(153, 153, 153));
        avisoLabel.setText("Nota: Si ejecuta como servidor necesitará de un registro unico.");
        jPanel1.add(avisoLabel);
        avisoLabel.setBounds(60, 130, 360, 14);

        opCliente.setBackground(new java.awt.Color(255, 255, 255));
        opCliente.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        opCliente.setText("Ejecutar como cliente.");
        opCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opClienteMouseClicked(evt);
            }
        });
        jPanel1.add(opCliente);
        opCliente.setBounds(160, 90, 170, 25);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formularios.png"))); // NOI18N
        fondo.setText("jLabel1");
        jPanel1.add(fondo);
        fondo.setBounds(0, 0, 460, 210);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opServerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opServerMouseClicked
        // TODO add your handling code here:
        metodoTipoInstalacion();
    }//GEN-LAST:event_opServerMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (opServer.isSelected()) {
            ventanaserver.setVisible(true);
            this.dispose();
        } else {
            ventanacliente.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         // TODO add your handling code here:
         
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         // TODO add your handling code here:
         
    }//GEN-LAST:event_formWindowActivated

    private void opClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opClienteMouseClicked
        // TODO add your handling code here:
        metodoTipoInstalacion();
    }//GEN-LAST:event_opClienteMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.OfficeSilver2007Skin");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new PrimerInicio().setVisible(estado);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.ButtonGroup grupoServicios;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton opCliente;
    private javax.swing.JRadioButton opServer;
    // End of variables declaration//GEN-END:variables
}
