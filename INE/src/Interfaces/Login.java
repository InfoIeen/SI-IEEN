/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

//import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
import java.awt.Color;
import javax.swing.ImageIcon;
//import javax.swing.UIManager;
//import javax.swing.UnsupportedLookAndFeelException;

//Importamos los TDA que haraán la conexión con la BD
import Clases.Conexion;
import Clases.ManagerLogin;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author oscar
 */
public class Login extends javax.swing.JFrame {
    private String password;
    private String user;
    private Conexion check_con;
    private ManagerLogin manager;
    /**
     * Creates new form LogIn
     */
    public Login(){
        super();
        
        initComponents();
        //asignacion de memoria a objetos
        //centrar texto
        this.setLocationRelativeTo(null);
        leer();
        tf_campoUsuario.setHorizontalAlignment (tf_campoUsuario.CENTER);
        tf_campoContraseña.setHorizontalAlignment (tf_campoContraseña.CENTER);
        setBackground(new Color(0, 255, 0, 0));
        pn_principal_Login.setBackground(new Color(0, 255, 0, 0));
        setIconImage(new ImageIcon(getClass().getResource("/Iconos/IEE.png")).getImage());
        
        //Asignación de memoria a objetos
        manager = new ManagerLogin();
        check_con = new Conexion();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_principal_Login = new javax.swing.JPanel();
        tf_campoUsuario = new javax.swing.JTextField();
        recordarUsuario = new javax.swing.JCheckBox();
        tf_campoContraseña = new javax.swing.JPasswordField();
        lb_logoIEEN_Login = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        lb_contraseña = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        lb_usuario = new javax.swing.JLabel();
        lb_background_Login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        pn_principal_Login.setBackground(new java.awt.Color(255, 204, 0));
        pn_principal_Login.setLayout(null);

        tf_campoUsuario.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        tf_campoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_campoUsuarioKeyReleased(evt);
            }
        });
        pn_principal_Login.add(tf_campoUsuario);
        tf_campoUsuario.setBounds(220, 100, 200, 30);

        recordarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        recordarUsuario.setText("Recordar usuario.");
        recordarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordarUsuarioActionPerformed(evt);
            }
        });
        pn_principal_Login.add(recordarUsuario);
        recordarUsuario.setBounds(220, 180, 200, 23);

        tf_campoContraseña.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tf_campoContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_campoContraseñaKeyReleased(evt);
            }
        });
        pn_principal_Login.add(tf_campoContraseña);
        tf_campoContraseña.setBounds(220, 140, 200, 28);

        lb_logoIEEN_Login.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        lb_logoIEEN_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/banerLogin.png"))); // NOI18N
        lb_logoIEEN_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_logoIEEN_LoginMouseClicked(evt);
            }
        });
        pn_principal_Login.add(lb_logoIEEN_Login);
        lb_logoIEEN_Login.setBounds(20, 20, 530, 80);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("v1.0");
        pn_principal_Login.add(jLabel1);
        jLabel1.setBounds(500, 230, 24, 14);

        btn_ingresar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btn_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/aceptar.png"))); // NOI18N
        btn_ingresar.setText("  Ingresar");
        btn_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        pn_principal_Login.add(btn_ingresar);
        btn_ingresar.setBounds(170, 220, 120, 30);

        lb_contraseña.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        lb_contraseña.setText("Contraseña :");
        pn_principal_Login.add(lb_contraseña);
        lb_contraseña.setBounds(110, 140, 110, 20);

        btn_cancelar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        btn_cancelar.setText("  Cancelar");
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        pn_principal_Login.add(btn_cancelar);
        btn_cancelar.setBounds(310, 220, 120, 30);

        lb_usuario.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        lb_usuario.setText("Usuario :");
        pn_principal_Login.add(lb_usuario);
        lb_usuario.setBounds(140, 110, 80, 20);

        lb_background_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoLogin.png"))); // NOI18N
        pn_principal_Login.add(lb_background_Login);
        lb_background_Login.setBounds(0, 0, 580, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_principal_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_principal_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void escribir(String usuario) throws IOException {
        if (recordarUsuario.isSelected()) {
            File archivo = new File("cnfg.init");

            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            BufferedWriter escribir = new BufferedWriter(new FileWriter(archivo));

            //Escribimos en el archivo con el metodo write 
            escribir.write("");
            escribir.write(usuario + ",1");

            //Cerramos la conexion
            escribir.close();
        } else {
            File archivo = new File("cnfg.init");

            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            BufferedWriter escribir = new BufferedWriter(new FileWriter(archivo));

            //Escribimos en el archivo con el metodo write 
            escribir.write("");
            escribir.write(usuario);

            //Cerramos la conexion
            escribir.close();
        }
    }

    public void obtenerUsuario(String usuario) throws IOException {

        File archivo = new File("cnfg.cfg");

        //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
        BufferedWriter escribir = new BufferedWriter(new FileWriter(archivo));

        //Escribimos en el archivo con el metodo write 
        escribir.write("");
        escribir.write(usuario);

        //Cerramos la conexion
        escribir.close();

    }
    
    public String leer() {
        String texto = "";
        try {
            //Creamos un archivo FileReader que obtiene lo que tenga el archivo
            FileReader lector = new FileReader("cnfg.init");

            //El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido = new BufferedReader(lector);

            String usuario = contenido.readLine();
            String[] obtener = usuario.split(",");
            if (obtener[1].equals("1")) {
                tf_campoUsuario.setText(obtener[0]);
                recordarUsuario.setSelected(true);
                tf_campoContraseña.requestFocus();
            }
        } catch (Exception e) {

        }
        return texto;
    }//leer()
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        // TODO add your handling code here:

        if (check_con.hayConexion()) {
            if (iniciarSesion()) {
                try {
                    obtenerUsuario(tf_campoUsuario.getText());
                } catch (IOException e) {

                }
                try {
                    // TODO add your handling code here:

                    obtenerUsuario(tf_campoUsuario.getText());

                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    escribir(tf_campoUsuario.getText());
                    Principal ob = new Principal();
                    this.hide();
                    ob.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "NO HAY CONEXION CON LA BASE DE DATOS");
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void lb_logoIEEN_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_logoIEEN_LoginMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 15) {
            JOptionPane.showMessageDialog(null, "Este software es una donación por parte del Instituto\nelaborado por:\nInventario:\n- Ibañez Loreto Oscar Abraham.\n- Mendez Santana Kevin Alejandro.\n- Pazos Rodriguez Javier Abraham.\n\nViaticos:\n- Espinoza Abando Denisse Yaneth.\n- Gil Llanos Juan Pedro.\n- Reyes Guerrero Guillermo Guadalupe.\n\nPara el Instituto Estatal Electoral de Nayarit.\n15/Agosto/2018.", "Instituto Tecnologico de Tepic", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_lb_logoIEEN_LoginMouseClicked

    private void tf_campoContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_campoContraseñaKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(0);

        }else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (iniciarSesion()) {
                try{
                    obtenerUsuario(tf_campoUsuario.getText());
                }catch(IOException e){

                }

                try {
                    //       if(){

                        //       }else{
                        escribir(tf_campoUsuario.getText());
                        Principal ob = new Principal();
                        this.hide();
                        ob.setVisible(true);
                        //         }
                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }//GEN-LAST:event_tf_campoContraseñaKeyReleased

    private void recordarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordarUsuarioActionPerformed
        try {
            // TODO add your handling code here:

            escribir(tf_campoUsuario.getText());
            tf_campoContraseña.requestFocus();
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_recordarUsuarioActionPerformed

    private void tf_campoUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_campoUsuarioKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
    }//GEN-LAST:event_tf_campoUsuarioKeyReleased
   
    public boolean validar(){
        boolean res = false;
        if(tf_campoUsuario.getText().isEmpty() || tf_campoContraseña.getText().isEmpty()){
            res = true;
        }
        return res;
    }
    
    private boolean validarID() {

        if (tf_campoUsuario.getText().equals("")) {
            return false; //si no ingreso ningun numero
        }
        return true;

    }//validarID
    
    private boolean validarPassword() {
        password = tf_campoContraseña.getText();
        if (password.isEmpty()) {
            return false; //se retorna false si no ingreso contraseÃ±a
        }
        return true;
    }//validarPasswo
    
    private boolean iniciarSesion() {
        if (validarID()) {
            if (validarPassword()) {
                user = tf_campoUsuario.getText();
                int resultado = manager.iniciarSesion(user, password); //obtenemos de la base de datos informacion sobre el si se concreto el login
                if (resultado == 0) {
                    JOptionPane.showMessageDialog(this, "El usuario no existe","Información",JOptionPane.INFORMATION_MESSAGE);
                    tf_campoUsuario.setText("");
                    tf_campoContraseña.setText("");
                    tf_campoUsuario.requestFocus();
                    return false;
                }//
                if (resultado == 1) {
                    JOptionPane.showMessageDialog(this, "La contraseña puede ser incorrecta o el usuario puede haber sido dado de baja","Información",JOptionPane.WARNING_MESSAGE);
                    tf_campoContraseña.setText("");
                    tf_campoContraseña.requestFocus();
                    return false;
                }//

                if (resultado == 3) {
                    return true;
                }//

            } else {
                JOptionPane.showMessageDialog(this, "Ingrese una contraseña");
                tf_campoContraseña.requestFocus();

            }//
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un usuario valido");

        }//

        return false;
    }//Iniciar Sesion
    
    /**
     * @param args the command line arguments
     * @throws javax.swing.UnsupportedLookAndFeelException
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {

        // TODO add your handling code here:
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.OfficeSilver2007Skin");

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Login().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_background_Login;
    private javax.swing.JLabel lb_contraseña;
    private javax.swing.JLabel lb_logoIEEN_Login;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JPanel pn_principal_Login;
    private javax.swing.JCheckBox recordarUsuario;
    private javax.swing.JPasswordField tf_campoContraseña;
    private javax.swing.JTextField tf_campoUsuario;
    // End of variables declaration//GEN-END:variables
}
