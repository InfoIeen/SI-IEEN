/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.ManagerUsers;
import Clases.ManagerComplemento;
import Clases.ManagerPermisos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author kevin
 */
public class changePassword extends javax.swing.JDialog {
    ManagerUsers manager_users;
    ManagerComplemento manager_complemento;
    ManagerPermisos manager_permisos;
    /**
     * Creates new form addEmpleados
     */
    public changePassword(java.awt.Frame parent, boolean modal,String user) {
        super(parent, modal);
        initComponents();
        
        //Asignamos memoria a los objetos
        manager_users = new ManagerUsers();
        manager_complemento = new ManagerComplemento();
        manager_permisos = new ManagerPermisos();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Cambio de contraseña");
        
        txtUsuario.setText(user);
        txtUsuario.setEnabled(false);
    }

    private changePassword(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_empleado = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAContraseña = new javax.swing.JPasswordField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtNContraseña = new javax.swing.JPasswordField();
        txtCNContraseña = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_empleado.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Usuario:");
        pn_empleado.add(jLabel11);
        jLabel11.setBounds(150, 40, 50, 17);

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        pn_empleado.add(txtUsuario);
        txtUsuario.setBounds(210, 40, 202, 23);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Antigüa contraseña:");
        pn_empleado.add(jLabel12);
        jLabel12.setBounds(80, 70, 130, 17);

        txtAContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pn_empleado.add(txtAContraseña);
        txtAContraseña.setBounds(210, 70, 202, 23);

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/aceptar.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        pn_empleado.add(btnAceptar);
        btnAceptar.setBounds(90, 200, 121, 33);

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pn_empleado.add(btnCancelar);
        btnCancelar.setBounds(280, 200, 121, 33);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Nueva contraseña:");
        pn_empleado.add(jLabel15);
        jLabel15.setBounds(90, 110, 120, 20);

        txtNContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNContraseñaFocusLost(evt);
            }
        });
        pn_empleado.add(txtNContraseña);
        txtNContraseña.setBounds(210, 110, 202, 23);

        txtCNContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pn_empleado.add(txtCNContraseña);
        txtCNContraseña.setBounds(210, 140, 202, 23);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Confirmar nueva contraseña:");
        pn_empleado.add(jLabel16);
        jLabel16.setBounds(30, 140, 190, 17);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formularios.png"))); // NOI18N
        pn_empleado.add(jLabel17);
        jLabel17.setBounds(0, 0, 490, 280);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_empleado, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private int validar(){
        if(txtUsuario.getText().isEmpty()){
            return 1;
        }
        //Antigüa contraseña vacia
        if(txtAContraseña.getText().isEmpty()){
            return 2;
        }
        //Nueva contraseña vacia
        if(txtNContraseña.getText().isEmpty()){
            return 3;
        }
        //Confirmación de contraseña vacio
        if(txtCNContraseña.getText().isEmpty()){
            return 4;
        }
        //Comparación de la nueva contraseña con su confirmación
        if(!(manager_users.passwordEquals(txtUsuario.getText(), txtAContraseña.getText()))){
            return 5;
        }
        //Comparación de la nueva contraseña con su confirmación
        if(!(txtCNContraseña.getText().equals(txtNContraseña.getText()))){
            return 6;
        }
        //Comprobación de la antigüa contraseña con el usuario
        return 0;
    }//validar()
    
    public void limpiar(){
        txtAContraseña.setText("");
        txtNContraseña.setText("");
        txtCNContraseña.setText("");
    }//limpiar()
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        int res = validar();
        
        switch(res){
            case 0:
                boolean cambiar = manager_users.changePass(txtUsuario.getText(),txtAContraseña.getText(),txtNContraseña.getText());
                if(cambiar){
                    JOptionPane.showMessageDialog(null, "Se actualizó la contraseña exitosamente.");
                }else{
                    JOptionPane.showMessageDialog(null, "Verificar con el distribuidor.");
                }
                this.dispose();
                break;    
            case 2:
                JOptionPane.showMessageDialog(null, "Por favor, ingresa la antigüa contraseña");
                txtAContraseña.requestFocus();
                limpiar();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Por favor, ingresa la nueva contraseña");
                txtNContraseña.requestFocus();
                limpiar();
                break;    
            case 4:
                JOptionPane.showMessageDialog(null, "Por favor, ingresa la confirmación de la contraseña");
                txtCNContraseña.requestFocus();
                limpiar();
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "La antigüa contraseña no coincide con el usuario");
                txtUsuario.requestFocus();
                limpiar();
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "La nueva contraseña con la confirmación no coinciden");
                txtUsuario.requestFocus();
                limpiar();
                break;
        }//switch        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
         // TODO add your handling code here:
         this.dispose();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNContraseñaFocusLost
        // TODO add your handling code here:
        if(txtNContraseña.getText().equals(txtAContraseña.getText())){
            txtNContraseña.setText("");
            JOptionPane.showMessageDialog(null, "La nueva contraseña debe ser diferente a la actual.");
            txtNContraseña.requestFocus();
        }
    }//GEN-LAST:event_txtNContraseñaFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                changePassword dialog = new changePassword(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel pn_empleado;
    private javax.swing.JPasswordField txtAContraseña;
    private javax.swing.JPasswordField txtCNContraseña;
    private javax.swing.JPasswordField txtNContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
