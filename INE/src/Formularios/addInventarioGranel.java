/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.ManagerInventario;
import Clases.ManagerPermisos;
import Clases.ManagerInventarioGranel;
import Clases.Validaciones;

import Interfaces.Principal;
import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
/**
 *
 * @author kevin
 */
public class addInventarioGranel extends javax.swing.JDialog {
    ManagerInventario manager_inventario;
    ManagerPermisos manager_permisos;
    ManagerInventarioGranel manager_inventario_granel;
    
    String extension,producto,almacen,marca,descripcion,observaciones,categoria;
    int stockmin,stock,num;
    
    /**
     * Creates new form addInventario
	 * @param parent
	 * @param modal
     */
    public addInventarioGranel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //Asginamos memoria al objeto
        manager_inventario = new ManagerInventario();
        manager_permisos = new ManagerPermisos();
        manager_inventario_granel = new ManagerInventarioGranel();
        this.setLocationRelativeTo(null);
        this.setTitle("Nuevo registro de consumible");
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
        jLabel1 = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        txtNum = new javax.swing.JTextField();
        txtExtension = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        comboCategoria = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescripcion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtStockMin = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblAviso = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        comboUbicacion = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_addInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pn_addInventario.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Clave:");
        pn_addInventario.add(jLabel1);
        jLabel1.setBounds(50, 16, 38, 17);

        txtFolio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFolio.setText("EY-99");
        txtFolio.setToolTipText("");
        txtFolio.setEnabled(false);
        txtFolio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFolioFocusLost(evt);
            }
        });
        pn_addInventario.add(txtFolio);
        txtFolio.setBounds(110, 10, 50, 30);

        txtNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNum.setToolTipText("");
        txtNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumFocusLost(evt);
            }
        });
        txtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumActionPerformed(evt);
            }
        });
        txtNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumKeyTyped(evt);
            }
        });
        pn_addInventario.add(txtNum);
        txtNum.setBounds(170, 10, 70, 30);

        txtExtension.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtExtension.setToolTipText("");
        txtExtension.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtExtensionFocusLost(evt);
            }
        });
        txtExtension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExtensionActionPerformed(evt);
            }
        });
        txtExtension.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExtensionKeyTyped(evt);
            }
        });
        pn_addInventario.add(txtExtension);
        txtExtension.setBounds(250, 10, 50, 30);

        txtProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        pn_addInventario.add(txtProducto);
        txtProducto.setBounds(110, 50, 220, 30);

        pn_addInventario.add(comboCategoria);
        comboCategoria.setBounds(110, 170, 210, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Categoria:");
        pn_addInventario.add(jLabel11);
        jLabel11.setBounds(30, 180, 70, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Producto:");
        pn_addInventario.add(jLabel2);
        jLabel2.setBounds(30, 60, 62, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Descripción:");
        pn_addInventario.add(jLabel3);
        jLabel3.setBounds(392, 16, 75, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ubucación:");
        pn_addInventario.add(jLabel4);
        jLabel4.setBounds(26, 100, 70, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Marca:");
        pn_addInventario.add(jLabel5);
        jLabel5.setBounds(50, 140, 41, 17);

        txtMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        pn_addInventario.add(txtMarca);
        txtMarca.setBounds(110, 130, 215, 30);

        txtAreaDescripcion.setColumns(20);
        txtAreaDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAreaDescripcion.setRows(5);
        txtAreaDescripcion.setToolTipText("");
        jScrollPane1.setViewportView(txtAreaDescripcion);
        txtAreaDescripcion.getAccessibleContext().setAccessibleDescription("");

        pn_addInventario.add(jScrollPane1);
        jScrollPane1.setBounds(471, 13, 358, 110);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Stock min:");
        pn_addInventario.add(jLabel8);
        jLabel8.setBounds(30, 220, 66, 17);

        txtStockMin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtStockMin.setText("1");
        txtStockMin.setToolTipText("");
        txtStockMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockMinActionPerformed(evt);
            }
        });
        txtStockMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockMinKeyTyped(evt);
            }
        });
        pn_addInventario.add(txtStockMin);
        txtStockMin.setBounds(110, 210, 215, 30);

        txtStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtStock.setText("1");
        txtStock.setToolTipText("Ingrese cantidad numérica entera ejemplo: 10");
        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });
        pn_addInventario.add(txtStock);
        txtStock.setBounds(110, 250, 215, 30);
        txtStock.getAccessibleContext().setAccessibleDescription("");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Stock:");
        pn_addInventario.add(jLabel9);
        jLabel9.setBounds(50, 260, 40, 17);

        lblAviso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pn_addInventario.add(lblAviso);
        lblAviso.setBounds(39, 241, 15, 7);

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
        btnAceptar.setBounds(260, 320, 130, 33);

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
        btnCancelar.setBounds(420, 320, 150, 33);

        pn_addInventario.add(comboUbicacion);
        comboUbicacion.setBounds(110, 90, 210, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formularios.png"))); // NOI18N
        pn_addInventario.add(jLabel6);
        jLabel6.setBounds(0, 0, 850, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_addInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_addInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtStockMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockMinActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    public void getInfo(){
        
        num = Integer.parseInt(txtNum.getText());
        extension = txtExtension.getText();
        producto = txtProducto.getText();
        almacen = comboUbicacion.getSelectedItem().toString();
        //Marca
        if(txtMarca.getText().isEmpty()){
            marca = "Sin especificar";
        }else{
            marca = txtMarca.getText();
        }
        //Stock minimo
        if(txtStockMin.getText().isEmpty()){
            stockmin = 1;
        }else{
            stockmin = Integer.parseInt(txtStockMin.getText());
        }
        //Stock
        if(txtStock.getText().isEmpty()){
            stock = 1;
        }else{
            stock = Integer.parseInt(txtStock.getText());
        }
        //Descripción
        if(txtAreaDescripcion.getText().isEmpty()){
            descripcion = "Sin descripción";
        }else{
            descripcion = txtAreaDescripcion.getText();
        }
        categoria = comboCategoria.getSelectedItem().toString();
        
    }//getInfo
    
    public void clearCampos(){
        txtProducto.setText("");
        txtMarca.setText("");
        txtStockMin.setText("");
        txtStock.setText("");
        txtAreaDescripcion.setText("");
        txtNum.setText("");
        txtNum.setBackground(Color.white);
        txtExtension.setText("");
        txtExtension.setBackground(Color.white);
    }
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        getInfo();
        if(manager_permisos.accesoModulo("alta","Inventario",Principal.Username)){
            
            if(manager_inventario_granel.insertarInventarioG(num,extension, producto, almacen, marca, stockmin, stock, descripcion,categoria)){
                JOptionPane.showMessageDialog(null,"Se inserto correctamente al inventario");
                
                if(manager_permisos.accesoModulo("consulta","Inventario",Principal.Username)){
                    String estatus2 = Principal.comboEstatus.getSelectedItem().toString();
                    int filtro = Principal.comboFiltro.getSelectedIndex();
                    String busqueda = Principal.txtBusqueda.getText();
                    Principal.tablaInventario.setModel(manager_inventario_granel.getBusquedaInventario(filtro, busqueda, categoria,estatus2));
                    Principal.lblProductosTotales.setText("Productos Totales: ".concat(String.valueOf(manager_inventario_granel.getcountBusquedaInventario(filtro, busqueda, categoria, estatus2))));
                    Principal.comboCategoriaConsumible.setSelectedItem(categoria);
                }
                
            }else{
                JOptionPane.showMessageDialog(null,"Verificar con el distribuidor.");
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"No cuenta con permisos para dar de alta consumibles.");
        }
        clearCampos();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtFolioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFolioFocusLost
        // TODO add your handling code here:
        if(!(txtFolio.getText().isEmpty())){
            
            //Comparamos si existe o no
            if(manager_inventario_granel.existeInventario(txtFolio.getText())){
                //Existe, entonces pintamos en rojo los TextField
                txtFolio.setBackground(java.awt.Color.RED);
                btnAceptar.setEnabled(false);
                lblAviso.setText("La clave ya se encuentra registrada.");
                
            }else{
                //Si no existe, entonces pintamos de verde los TextField
                txtFolio.setBackground(java.awt.Color.GREEN);
                btnAceptar.setEnabled(true);
                lblAviso.setText("");
            }
            
        }//Buscar si existe o no
        else{
            txtFolio.setBackground(java.awt.Color.WHITE);
            btnAceptar.setEnabled(true);
            lblAviso.setText("");
        }
    }//GEN-LAST:event_txtFolioFocusLost

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
         // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        //comboUbicacion
        manager_inventario.getBodegas(comboUbicacion);
        
        //Sugerencia del siguiente número
        txtNum.setText(""+manager_inventario_granel.sugNumero());
        
        manager_inventario_granel.getCategorias(comboCategoria);
        
    }//GEN-LAST:event_formWindowOpened

    private void txtNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumFocusLost
        // TODO add your handling code here:
        if(!(txtNum.getText().isEmpty())){

            existeClave();
            txtExtension.setEditable(true);

        }//Buscar si existe o no
        else{
            txtFolio.setBackground(java.awt.Color.WHITE);
            txtNum.setBackground(java.awt.Color.WHITE);
            txtExtension.setBackground(java.awt.Color.WHITE);
            txtExtension.setEditable(false);
            txtExtension.setText("");
            btnAceptar.setEnabled(false);
            lblAviso.setText("");
        }
    }//GEN-LAST:event_txtNumFocusLost

    private void txtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumActionPerformed

    private void txtNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if(caracter != evt.getKeyChar()){

        }
        if(caracter < '0' || caracter > '9'){
            evt.consume();
        }

    }//GEN-LAST:event_txtNumKeyTyped

    public void existeClave(){
    
        //Comparamos si existe o no
        if(manager_inventario_granel.existeInventario(txtFolio.getText()+"-"+txtNum.getText()+txtExtension.getText())){
            //Existe, entonces pintamos en rojo los TextField
            txtNum.setBackground(java.awt.Color.RED);
            txtExtension.setBackground(java.awt.Color.RED);
            btnAceptar.setEnabled(false);
            lblAviso.setText("La clave ya se encuentra registrada.");
        }else{
            //Si no existe, entonces pintamos de verde los TextField
            txtNum.setBackground(java.awt.Color.GREEN);
            txtExtension.setBackground(java.awt.Color.GREEN);
            btnAceptar.setEnabled(true);
            lblAviso.setText("");
        }
        
    }//existeClave
    
    private void txtExtensionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtExtensionFocusLost
        // TODO add your handling code here:
        if(!(txtNum.getText().isEmpty() && txtExtension.getText().isEmpty())){

            existeClave();

        }//Buscar si existe o no
        else{
            txtFolio.setBackground(java.awt.Color.WHITE);
            txtNum.setBackground(java.awt.Color.WHITE);
            txtExtension.setBackground(java.awt.Color.WHITE);
            btnAceptar.setEnabled(false);
            lblAviso.setText("");
        }
    }//GEN-LAST:event_txtExtensionFocusLost

    private void txtExtensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExtensionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExtensionActionPerformed

    private void txtExtensionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExtensionKeyTyped
        // TODO add your handling code here:

        char caracter = evt.getKeyChar();
        if(caracter != evt.getKeyChar()){

        }
        if(txtExtension.getText().length() == 1){
            evt.consume();
        }else{
            if(caracter != 'A'){
                if(caracter != 'B'){
                    evt.consume();
                }else{

                }
            }else{

            }
        }
    }//GEN-LAST:event_txtExtensionKeyTyped

    private void txtStockMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockMinKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if(caracter != evt.getKeyChar()){

        }
        if(caracter < '0' || caracter > '9'){
            evt.consume();
        }
    }//GEN-LAST:event_txtStockMinKeyTyped

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if(caracter != evt.getKeyChar()){

        }
        if(caracter < '0' || caracter > '9'){
            evt.consume();
        }
    }//GEN-LAST:event_txtStockKeyTyped

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
    private javax.swing.JComboBox comboCategoria;
    private javax.swing.JComboBox comboUbicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JPanel pn_addInventario;
    private javax.swing.JTextArea txtAreaDescripcion;
    private javax.swing.JTextField txtExtension;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtStockMin;
    // End of variables declaration//GEN-END:variables
}
