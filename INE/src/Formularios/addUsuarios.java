/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.CrearUsuarioPDF;
import Clases.ManagerUsers;
import Clases.ManagerComplemento;
import Clases.ManagerPermisos;

import Interfaces.Principal;
import static Interfaces.Principal.comboEmpUsu;
import com.itextpdf.text.DocumentException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author kevin
 */
public class addUsuarios extends javax.swing.JDialog {
    String usuario,contraseña,area,puesto,USU,busqueda;
    int id,filtro;
    
    ManagerUsers manager_users;
    ManagerComplemento manager_complemento;
    ManagerPermisos manager_permisos;
    /**
     * Creates new form addEmpleados
     */
    public addUsuarios(java.awt.Frame parent, boolean modal,int id_empleado,int filtro, String busqueda) {
        super(parent, modal);
        initComponents();
        
        this.busqueda = busqueda;
        this.filtro = filtro;
        
        //Asignamos memoria a los objetos
        manager_users = new ManagerUsers();
        manager_complemento = new ManagerComplemento();
        manager_permisos = new ManagerPermisos();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Asignación de usuario");
        this.id = id_empleado;
        
        txtNombre.setVisible(false);
        txtApellidoP.setVisible(false);
        txtApellidoM.setVisible(false);
        
    }

    private addUsuarios(JFrame jFrame, boolean b) {
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
        pn_usuario = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        comboCargo = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblAviso = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_empleado.setLayout(null);

        pn_usuario.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Usuario:");

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Contraseña:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Perfil de usuario:");

        comboCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/aceptar.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtApellidoP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtApellidoM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pn_usuarioLayout = new javax.swing.GroupLayout(pn_usuario);
        pn_usuario.setLayout(pn_usuarioLayout);
        pn_usuarioLayout.setHorizontalGroup(
            pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_usuarioLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblAviso)
                .addContainerGap(541, Short.MAX_VALUE))
            .addGroup(pn_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_usuarioLayout.createSequentialGroup()
                        .addGroup(pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pn_usuarioLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_usuarioLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(comboCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pn_usuarioLayout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pn_usuarioLayout.setVerticalGroup(
            pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_usuarioLayout.createSequentialGroup()
                        .addGroup(pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pn_usuarioLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAceptar)
                        .addComponent(btnCancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAviso)
                .addGap(106, 106, 106))
        );

        pn_empleado.add(pn_usuario);
        pn_usuario.setBounds(20, 60, 580, 170);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Asignación de Usuario");
        pn_empleado.add(jLabel1);
        jLabel1.setBounds(220, 20, 240, 30);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formularios.png"))); // NOI18N
        pn_empleado.add(jLabel17);
        jLabel17.setBounds(-10, 0, 630, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_empleado, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void getInfo(){
        
        usuario = txtUsuario.getText();
        contraseña = txtContraseña.getText();
        puesto = comboCargo.getSelectedItem().toString();
        
    }//getInfo()
    
    private int validar(){
        if(txtUsuario.getText().isEmpty()){
            return 4;
        }
        if(txtContraseña.getText().isEmpty()){
            return 5;
        }
        return 0;
    }//validar()
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        int res = validar();
        if(manager_permisos.accesoModulo("alta","Usuarios",Principal.Username)){
            switch(res){
                case 0:
                    //Creamos un cuadro de dialogo para que confirme la eliminación del usuario o la cancele
                    Object[] botones = {"Confirmar","Cancelar"};
                    int opcion = JOptionPane.showOptionDialog(this,"¿Desea continuar con la alta del nuevo usuario?", "Confirmación",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE  , null, botones, botones[0]);

                    //Acepta eliminar al usuario
                    if(opcion == 0){
                        getInfo();
                        boolean insertar = manager_users.asignarUsuario(id, usuario, contraseña, puesto);
                        if (insertar) {
                            //metodo para pdf
                            Object []botones2 = {"Si", "No", "Cancelar"};
                            opcion = JOptionPane.showOptionDialog(this, "¿Al generar el reporte, desea abrirlo?", "Confirmación",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, botones2, botones2[0]);

                            if (opcion == 0) {
                                metodo(1);
                            } else if (opcion == 1) {
                                metodo(0);
                            }

                            JOptionPane.showMessageDialog(null, "El usuario \""+usuario+"\" ha sido registrado en la base de datos exitosamente.");
                            if(manager_permisos.accesoModulo("consulta","Empleados",Principal.Username)){
                                if(comboEmpUsu.getSelectedItem().toString().equals("Empleados sin usuario")){
                                    Principal.tablaUsuarios.setModel(manager_users.getEmpleadosSinUsuario(filtro,busqueda,Principal.comboEmpUsuEstatus.getSelectedItem().toString()));
                                }else{
                                    Principal.tablaUsuarios.setModel(manager_users.getEmpleados(Principal.Username,filtro,busqueda,Principal.comboEmpUsuEstatus.getSelectedItem().toString()));
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "Han revocado sus permisos para consulta de empleados");
                                Principal.tablaUsuarios.setModel(new DefaultTableModel());
                            }
                            this.dispose();
                        }else{
                                JOptionPane.showMessageDialog(null, "Verificar con el distribuidor.");
                                this.dispose();
                        }
                    }
                    break;    
                case 4:
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese el nombre de usuario");
                    txtUsuario.requestFocus();
                    break;    
                case 5:
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese la contraseña");
                    txtContraseña.requestFocus();
                    break;
            }//switch
        }else{
            JOptionPane.showMessageDialog(null, "No cuenta con permisos para asignar nuevos usuarios.");
        }
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        //Llenamos los combobox
        if(Principal.banderaUser == 1){
            comboCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
            manager_complemento.getComboPerfiles(comboCargo);
        }
        Calendar calendario = Calendar.getInstance();
   
        String min,sec = "";
        
        min = "" +calendario.get(Calendar.MINUTE);
        sec = "" +calendario.get(Calendar.SECOND);
        char a,b;

        Random r = new Random();

        double aleatorio = Math.floor(Math.random() * (122 - 97 + 1) + 97);

        a = (char) aleatorio;      
        aleatorio = Math.floor(Math.random()*(122-97+1)+97);
        
        b = (char) aleatorio;
        aleatorio = Math.floor(Math.random()*(122-97+1)+97);
        
       
        
        USU = txtNombre.getText().substring(0,1)+txtApellidoP.getText().substring(0,1)+a+b+sec;
        txtUsuario.setText(USU);
        txtContraseña.setText(generarContra(min));
    }//GEN-LAST:event_formWindowOpened
    
    public String generarContra(String min){
        char a,b,c,d;
        
       
        Random r = new Random();
        
        double aleatorio = Math.floor(Math.random()*(122-97+1)+97);
       
        a = (char)aleatorio;
        aleatorio = Math.floor(Math.random()*(122-97+1)+97);
        b = (char)aleatorio;
        aleatorio = Math.floor(Math.random()*(122-97+1)+97);
        c = (char)aleatorio;
        aleatorio = Math.floor(Math.random()*(122-97+1)+97);
        d = (char)aleatorio;
        aleatorio = Math.floor(Math.random()*(122-97+1)+97);
        
        return a+min+b+c+d;
    }
    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        // TODO add your handling code here:
        if(!(txtUsuario.getText().isEmpty())){
            
            //Comparamos si existe o no
            if(manager_users.existeUsuario(txtUsuario.getText())){
                //Existe, entonces pintamos en rojo los TextField
                txtUsuario.setBackground(java.awt.Color.RED);
                btnAceptar.setEnabled(false);
                lblAviso.setText("El nombre de usuario ya se encuentra registrado.");
                
            }else{
                //Si no existe, entonces pintamos de verde los TextField
                txtUsuario.setBackground(java.awt.Color.GREEN);
                btnAceptar.setEnabled(true);
                lblAviso.setText("");
            }
            
        }//Buscar si existe o no
        else{
            txtUsuario.setBackground(java.awt.Color.WHITE);
            btnAceptar.setEnabled(true);
            lblAviso.setText("");
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
         // TODO add your handling code here:
         this.dispose();
        
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    public void metodo(int res){
        CrearUsuarioPDF ob = new CrearUsuarioPDF();
         //Instanciamos el objeto Calendar
        //en fecha obtenemos la fecha y hora del sistema
        Calendar fecha = new GregorianCalendar();
        //Obtenemos el valor del año, mes, día,
        //hora, minuto y segundo del sistema
        //usando el método get y el parámetro correspondiente
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);
        
         Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("dd_MM_yyyy HH_mm_ss");
        
        //Parse
        String a = hourdateFormat.format(date);
        
        String cadena = txtUsuario.getText()+"_"+a;
       
        String cadena1 = ""+ dia + "/" + (mes+1) + "/" + año;
        String cadena2 = ""+hora+":"+minuto+":"+segundo;
        
        System.out.println(""+cadena1+" "+cadena2);
        try {
            ob.createTicket(cadena, txtUsuario.getText(), txtContraseña.getText(), res,cadena1,cadena2);
        } catch (DocumentException ex) {
            Logger.getLogger(addUsuarios.class.getName()).log(Level.SEVERE, null, ex);
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
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                addUsuarios dialog = new addUsuarios(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> comboCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JPanel pn_empleado;
    private javax.swing.JPanel pn_usuario;
    public static javax.swing.JTextField txtApellidoM;
    public static javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtContraseña;
    public static javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
