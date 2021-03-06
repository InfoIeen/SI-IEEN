/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JTable;
import Clases.ManagerPermisos;
import Clases.ManagerComplemento;
import Clases.ManagerVehiculos;
import Clases.enviarFotoPOST;
import Formularios.modificarFotos;
import static Interfaces.Principal.Username;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kevin
 */
public class ventana_modificar_vehiculo extends javax.swing.JDialog {
    int tipo = 0;
    ManagerVehiculos vehiculos;
    ManagerPermisos manager_permisos;
    public static DefaultTableModel modelo;
    enviarFotoPOST managerPost;
    
    private String path, absolute_path, name;
    private int returnVal;
    File[] rutas;
    int contadorRutas;
    
    /**
     * Creates new form Ventana_permisos_puesto
     */
    public ventana_modificar_vehiculo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        nuevasFotos.setVisible(false);
        contadorImg.setVisible(false);
        campoRuta.setVisible(false);
        campo.setVisible(false);
        this.setLocationRelativeTo(null);

        vehiculos = new ManagerVehiculos();
        manager_permisos = new ManagerPermisos();
        managerPost = new enviarFotoPOST();

        //        //Quitar la coma al spinner
//        JSpinner.NumberEditor editor = new JSpinner.NumberEditor(campoMotor, "#"); campoMotor.setEditor(editor);
        //Quitar editable a spinner
        ((DefaultEditor) campoMotor.getEditor()).getTextField().setEditable(false);        
        JSpinner.NumberEditor editor2 = new JSpinner.NumberEditor(campoModelo, "#"); campoModelo.setEditor(editor2);
        //Quitar editable a spinner
        ((DefaultEditor) campoModelo.getEditor()).getTextField().setEditable(false);
        //campoMatricula.setEditable(false);
        campo_descripcion.setLineWrap(true);
        campoObservaciones1.setLineWrap(true);
        campoMarca.requestFocus();
        JTextFieldDateEditor date_Salida_Editor=(JTextFieldDateEditor) campo_fecha_compra.getDateEditor();
        date_Salida_Editor.setEditable(false);
        campo_fecha_compra.getJCalendar().setMaxSelectableDate(new Date()); // sets today as minimum selectable date 
        
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_permisos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoMotor = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campo_descripcion = new javax.swing.JTextArea();
        campoMatricula = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        campoColor = new javax.swing.JTextField();
        campoMarca = new javax.swing.JTextField();
        campoModelo = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoObservaciones1 = new javax.swing.JTextArea();
        campoLinea = new javax.swing.JTextField();
        campoKilometraje = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        campo_no_factura = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        campo_importe = new javax.swing.JTextField();
        campo_no_motor = new javax.swing.JTextField();
        campo_fecha_compra = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        imagenVehiculo = new javax.swing.JPanel();
        btnImagen = new javax.swing.JButton();
        btnImagen1 = new javax.swing.JButton();
        contenedor = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        contadorImg = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        campoRuta = new javax.swing.JTextField();
        campo = new javax.swing.JTextField();
        nuevasFotos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar datos del vehículo.");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_permisos.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel1.setText("* Linea:");
        pn_permisos.add(jLabel1);
        jLabel1.setBounds(20, 130, 70, 16);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel3.setText("* Marca:");
        pn_permisos.add(jLabel3);
        jLabel3.setBounds(20, 80, 70, 16);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel4.setText("Modelo:");
        pn_permisos.add(jLabel4);
        jLabel4.setBounds(340, 20, 60, 20);

        campoMotor.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        campoMotor.setModel(new javax.swing.SpinnerListModel(new String[] {"3", "4", "6", "8"}));
        campoMotor.setToolTipText("Numero de cilindros del vehiculo ...");
        campoMotor.setNextFocusableComponent(campoMatricula);
        pn_permisos.add(campoMotor);
        campoMotor.setBounds(400, 120, 100, 30);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel5.setText("Motor:");
        pn_permisos.add(jLabel5);
        jLabel5.setBounds(350, 130, 40, 16);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel6.setText("Descripción:");
        pn_permisos.add(jLabel6);
        jLabel6.setBounds(370, 310, 100, 16);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel7.setText("* Color:");
        pn_permisos.add(jLabel7);
        jLabel7.setBounds(340, 80, 50, 16);

        campo_descripcion.setColumns(20);
        campo_descripcion.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        campo_descripcion.setRows(5);
        campo_descripcion.setTabSize(0);
        campo_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campo_descripcionKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(campo_descripcion);

        pn_permisos.add(jScrollPane1);
        jScrollPane1.setBounds(370, 330, 340, 120);

        campoMatricula.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        campoMatricula.setNextFocusableComponent(campo_fecha_compra);
        campoMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoMatriculaKeyTyped(evt);
            }
        });
        pn_permisos.add(campoMatricula);
        campoMatricula.setBounds(400, 170, 100, 30);

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel15.setText("Clave:");
        pn_permisos.add(jLabel15);
        jLabel15.setBounds(30, 30, 50, 16);

        txtFolio.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtFolio.setText("EY-10");
        txtFolio.setEnabled(false);
        pn_permisos.add(txtFolio);
        txtFolio.setBounds(100, 20, 80, 30);

        txtNumero.setEditable(false);
        txtNumero.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumeroFocusLost(evt);
            }
        });
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        pn_permisos.add(txtNumero);
        txtNumero.setBounds(190, 20, 80, 30);

        campoColor.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        campoColor.setNextFocusableComponent(campoMotor);
        campoColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoColorKeyTyped(evt);
            }
        });
        pn_permisos.add(campoColor);
        campoColor.setBounds(400, 70, 100, 30);

        campoMarca.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        campoMarca.setNextFocusableComponent(campoLinea);
        campoMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoMarcaKeyTyped(evt);
            }
        });
        pn_permisos.add(campoMarca);
        campoMarca.setBounds(100, 70, 170, 30);

        campoModelo.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        campoModelo.setNextFocusableComponent(campoColor);
        pn_permisos.add(campoModelo);
        campoModelo.setBounds(400, 20, 100, 30);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel8.setText("* Matricula:");
        pn_permisos.add(jLabel8);
        jLabel8.setBounds(320, 180, 70, 16);

        campoObservaciones1.setColumns(20);
        campoObservaciones1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        campoObservaciones1.setRows(5);
        campoObservaciones1.setTabSize(0);
        campoObservaciones1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoObservaciones1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(campoObservaciones1);

        pn_permisos.add(jScrollPane2);
        jScrollPane2.setBounds(30, 330, 320, 120);

        campoLinea.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        campoLinea.setNextFocusableComponent(campoKilometraje);
        campoLinea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoLineaKeyTyped(evt);
            }
        });
        pn_permisos.add(campoLinea);
        campoLinea.setBounds(100, 120, 170, 30);

        campoKilometraje.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        campoKilometraje.setNextFocusableComponent(campo_no_motor);
        campoKilometraje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoKilometrajeKeyTyped(evt);
            }
        });
        pn_permisos.add(campoKilometraje);
        campoKilometraje.setBounds(100, 170, 170, 30);

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel13.setText("* No. de factura:");
        pn_permisos.add(jLabel13);
        jLabel13.setBounds(10, 280, 100, 16);

        campo_no_factura.setNextFocusableComponent(campoModelo);
        campo_no_factura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_no_facturaKeyTyped(evt);
            }
        });
        pn_permisos.add(campo_no_factura);
        campo_no_factura.setBounds(100, 270, 170, 30);

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel11.setText("Observaciones:");
        pn_permisos.add(jLabel11);
        jLabel11.setBounds(30, 310, 100, 16);

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel14.setText("* Importe:");
        pn_permisos.add(jLabel14);
        jLabel14.setBounds(330, 280, 80, 16);

        campo_importe.setNextFocusableComponent(campoObservaciones1);
        campo_importe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_importeKeyTyped(evt);
            }
        });
        pn_permisos.add(campo_importe);
        campo_importe.setBounds(400, 270, 210, 30);

        campo_no_motor.setNextFocusableComponent(campo_no_factura);
        campo_no_motor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_no_motorKeyTyped(evt);
            }
        });
        pn_permisos.add(campo_no_motor);
        campo_no_motor.setBounds(100, 220, 170, 30);

        campo_fecha_compra.setNextFocusableComponent(campo_importe);
        pn_permisos.add(campo_fecha_compra);
        campo_fecha_compra.setBounds(402, 220, 210, 30);

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel12.setText("* Fecha de compra:");
        pn_permisos.add(jLabel12);
        jLabel12.setBounds(280, 230, 110, 16);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel10.setText("* No. de motor:");
        pn_permisos.add(jLabel10);
        jLabel10.setBounds(10, 230, 100, 16);

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel9.setText("* Kilometraje:");
        pn_permisos.add(jLabel9);
        jLabel9.setBounds(20, 180, 80, 16);

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        jButton1.setText(" Cerrar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pn_permisos.add(jButton1);
        jButton1.setBounds(370, 480, 140, 30);

        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/aceptar.png"))); // NOI18N
        jButton2.setText(" Guardar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pn_permisos.add(jButton2);
        jButton2.setBounds(210, 480, 140, 30);

        imagenVehiculo.setBackground(new java.awt.Color(255, 255, 255));
        imagenVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        imagenVehiculo.setLayout(null);

        btnImagen.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        btnImagen.setText("+");
        btnImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenActionPerformed(evt);
            }
        });
        imagenVehiculo.add(btnImagen);
        btnImagen.setBounds(160, 170, 40, 20);

        btnImagen1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        btnImagen1.setText("...");
        btnImagen1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImagen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagen1ActionPerformed(evt);
            }
        });
        imagenVehiculo.add(btnImagen1);
        btnImagen1.setBounds(0, 170, 40, 20);
        imagenVehiculo.add(contenedor);
        contenedor.setBounds(0, 0, 200, 190);

        pn_permisos.add(imagenVehiculo);
        imagenVehiculo.setBounds(520, 10, 200, 190);

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel16.setText("* Campos obligatorios.");
        pn_permisos.add(jLabel16);
        jLabel16.setBounds(30, 460, 160, 16);

        contadorImg.setText("0");
        pn_permisos.add(contadorImg);
        contadorImg.setBounds(510, 300, 90, 30);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formularios.png"))); // NOI18N
        fondo.setText("jLabel1");
        pn_permisos.add(fondo);
        fondo.setBounds(0, 0, 770, 570);
        pn_permisos.add(campoRuta);
        campoRuta.setBounds(430, 380, 90, 30);
        pn_permisos.add(campo);
        campo.setBounds(640, 360, 50, 20);

        nuevasFotos.setText("0");
        pn_permisos.add(nuevasFotos);
        nuevasFotos.setBounds(490, 390, 50, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_permisos, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_permisos, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ///NOTA-------- FALTA HACER COINCIDIR EL COMBO DEL TIPO DE AUTO
    public void cargarDatos() throws IOException, SQLException, ParseException{
        //marca,linea,clase,kilometraje,modelo,color,motor,matricula,observaciones,estado
        Vector vVehiculos = vehiculos.infoVehiculos(campo.getText());
        String temporal[] = vVehiculos.get(0).toString().split(",,");
        
        
        campoMarca.setText(temporal[0]);
        campoLinea.setText(temporal[1]);
        campoKilometraje.setText(temporal[3]);
        campoModelo.setValue(Integer.parseInt(temporal[4]));
        campoColor.setText(temporal[5]);
        
        campoMotor.setValue(temporal[6]);
        campoMatricula.setText(temporal[7]);
        campoObservaciones1.setText(temporal[8]);
        contadorImg.setText(temporal[9]);
        campo_no_motor.setText(temporal[11]);
        campo_no_factura.setText(temporal[13]);
        campo_importe.setText(temporal[14]);
        campo_descripcion.setText(temporal[15]);
        txtNumero.setText(temporal[16]);
        
        String sDate1 = temporal[12];
        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
        campo_fecha_compra.setDate(date1);
    }
    
    
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            cargarDatos();
            // marca,linea,clase,kilometraje,modelo,color,motor,matricula,observaciones,estado
            //Cantidad
            //String temporal[] = vVehiculos.get(0).toString().split(",");
            //campoMarca.setText(temporal[1]);
//        etiquetaLinea.setText(temporal[1]);
//        etiquetaKilometraje.setText(temporal[3]+" km");
//        etiquetaAño.setText(temporal[4]);
//        campoObservaciones.setText(temporal[8]);
//        
//        etiquetaEstado.setText(temporal[9]);
// TODO add your handling code here:
// TODO add your handling code here: 
//        ImageIcon imgThisImg = new ImageIcon(campoRuta.getText());
//        ImageIcon icono = new ImageIcon(imgThisImg.getImage().getScaledInstance(contenedor.getWidth(), contenedor.getHeight(), Image.SCALE_DEFAULT));
//        contenedor.setIcon(icono);
//
//        
//       // ImageIcon imagen = new ImageIcon(path);
//        //ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(contenedor.getWidth(), contenedor.getHeight(), Image.SCALE_DEFAULT));
        Calendar cal= Calendar.getInstance();
        int año = cal.get(Calendar.YEAR);
        SpinnerModel model = new SpinnerNumberModel(2000, //initial value
                                                    1900, //min
                                                    (año + 1), //max
                                                    1);                //step
        campoModelo.setModel(model);
        } catch (IOException ex) {
            Logger.getLogger(ventana_modificar_vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ventana_modificar_vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ventana_modificar_vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_formWindowOpened

    private void campoMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoMatriculaKeyTyped
        // TODO add your handling code here:
        char caracter2 = evt.getKeyChar();
        if (campoMatricula.getText().length() == 8) {
            evt.consume();
        } else if (caracter2 != evt.getKeyCode()) {
        }
        char c = evt.getKeyChar();
        
        if(Character.isLowerCase(c)){
            String cad = (""+c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_campoMatriculaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean validarCampos() {
        boolean res = true;
        String marca, linea, kilometraje, matricula, color = "";
        marca = campoMarca.getText();
        linea = campoLinea.getText();
        kilometraje = campoKilometraje.getText();
        matricula = campoMatricula.getText();
        color = campoColor.getText();

        if (marca.isEmpty() || linea.isEmpty() || kilometraje.isEmpty() || matricula.isEmpty() || color.isEmpty()) {
            res = false;
        }
        return res;
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = formato.format(campo_fecha_compra.getDate());

        if (manager_permisos.accesoModulo("actualizar", "Vehiculos", Username)) {
            if (validarCampos()) {
                if (contadorImg.getText().equals("0")) {
                    if (vehiculos.actualizarVehiculo(campoMarca.getText(), campoLinea.getText(), campoColor.getText(),
                            campoModelo.getValue().toString(), campoMotor.getValue().toString(), campoKilometraje.getText(),
                            campoMatricula.getText(), campoObservaciones1.getText(), 0, campo_no_motor.getText(),
                            fecha, campo_no_factura.getText(), campo_importe.getText(), campo_descripcion.getText())) {
                        String nombreParametro = "EY-10-" + txtNumero.getText();
                        JOptionPane.showMessageDialog(null, "Informacion actualizada correctamente!", "Información!", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                        Principal.tablaVehiculos.setModel(vehiculos.getVehiculos());
                        System.out.println("ENTRO");
                        managerPost.prepararImagenesVehiculoActualizarNuevasfotos(rutas, nombreParametro, contadorRutas);
                        vehiculos.actualizarCantidadFotosVehiculo(campoMatricula.getText(), contadorRutas);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al actualizar!", "Información!", JOptionPane.WARNING_MESSAGE);
                    }//else
                } else {

                    //en este metodo la informacion se guarda sin cambios en la imagen
                    if (vehiculos.actualizarVehiculo(campoMarca.getText(), campoLinea.getText(), campoColor.getText(),
                            campoModelo.getValue().toString(), campoMotor.getValue().toString(), campoKilometraje.getText(),
                            campoMatricula.getText(), campoObservaciones1.getText(), contadorRutas + Integer.parseInt(contadorImg.getText()), campo_no_motor.getText(),
                            fecha, campo_no_factura.getText(), campo_importe.getText(), campo_descripcion.getText())) {
                        String nombreParametro = "EY-10-" + txtNumero.getText();
                        JOptionPane.showMessageDialog(null, "Informacion actualizada correctamente!", "Información!", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                        Principal.tablaVehiculos.setModel(vehiculos.getVehiculos());
                        managerPost.prepararImagenesVehiculoActualizar(rutas, nombreParametro, contadorRutas, Integer.parseInt(contadorImg.getText()));

                    } else {
                        JOptionPane.showMessageDialog(null, "Error al actualizar!", "Información!", JOptionPane.WARNING_MESSAGE);
                    }//else
                }//Vemos si tenemos fotos anteriormente o no
            } else {
                JOptionPane.showMessageDialog(null, "Llene todos los campos requeridos!", "Información!", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No cuenta con permisos para actualizar la información del vehiculo.", "Información!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser(System.getProperty("user.home") + "\\Pictures");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagenes JPG,GIF & PNG", "jpg", "gif", "png");
        chooser.setMultiSelectionEnabled(true);
        chooser.setFileFilter(filter);
        returnVal = chooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            name = chooser.getSelectedFile().getName();
            absolute_path = chooser.getSelectedFile().getAbsolutePath();
            path = chooser.getSelectedFile().getPath();

            rutas = chooser.getSelectedFiles();
            contadorRutas = chooser.getSelectedFiles().length;
            //System.out.println("Archivo: " + name);
            //System.out.println("Absolute Path: " + absolute_path);
            //System.out.println("Path: " + path);
            BufferedImage img = null;
            nuevasFotos.setText("" + contadorRutas);
            nuevasFotos.setVisible(true);

            try {
                img = ImageIO.read(new File(absolute_path));
                Image dimg = img.getScaledInstance(contenedor.getWidth(), contenedor.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(dimg);
                contenedor.setText("");
                contenedor.setIcon(image);
                //this.jButton1.setEnabled(true);
            } catch (IOException e) {
                System.err.println(e.toString());
            }

        }

    }//GEN-LAST:event_btnImagenActionPerformed

    private void campoKilometrajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoKilometrajeKeyTyped
         // TODO add your handling code here:
                 // TODO add your handling code here:
         char caracter = evt.getKeyChar();

        if (campoKilometraje.getText().length() == 6) {
            evt.consume();
        } else if (caracter != evt.getKeyCode()) {
        }
        if (((caracter < '0') || (caracter > '9'))) {

            evt.consume();
        } else {

        }
    }//GEN-LAST:event_campoKilometrajeKeyTyped

    private void btnImagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagen1ActionPerformed
         // TODO add your handling code here:
         // Para crear la carpeta se concatena la marca el color y la placa del vehiculo
         
        modificarFotos ob = new modificarFotos(this, true);
        
        ob.recuperarCantidad(Integer.parseInt(contadorImg.getText()),txtFolio.getText()+"-"+txtNumero.getText());
        ob.setVisible(true);
    }//GEN-LAST:event_btnImagen1ActionPerformed

    private void txtNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroFocusLost
        // TODO add your handling code here:
    
    }//GEN-LAST:event_txtNumeroFocusLost

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if(caracter != evt.getKeyChar()){

        }
        if(caracter < '0' || caracter > '9'){
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void campoObservaciones1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoObservaciones1KeyPressed
         // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            campo_descripcion.requestFocus();
        }
    }//GEN-LAST:event_campoObservaciones1KeyPressed

    private void campo_descripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_descripcionKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            jButton2.requestFocus();
        }
    }//GEN-LAST:event_campo_descripcionKeyPressed

    private void campoMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoMarcaKeyTyped
         // TODO add your handling code here:
        char caracter2 = evt.getKeyChar();
        if (campoMarca.getText().length() == 15) {
            evt.consume();
        } else if (caracter2 != evt.getKeyCode()) {
        }
        char c = evt.getKeyChar();
        
        if(Character.isLowerCase(c)){
            String cad = (""+c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_campoMarcaKeyTyped

    private void campoLineaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoLineaKeyTyped
       // TODO add your handling code here:
        char caracter2 = evt.getKeyChar();
        if (campoLinea.getText().length() == 15) {
            evt.consume();
        } else if (caracter2 != evt.getKeyCode()) {
        }
        char c = evt.getKeyChar();
        
        if(Character.isLowerCase(c)){
            String cad = (""+c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_campoLineaKeyTyped

    private void campo_no_motorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_no_motorKeyTyped
         // TODO add your handling code here:
        char caracter2 = evt.getKeyChar();
        if (campo_no_motor.getText().length() == 30) {
            evt.consume();
        } else if (caracter2 != evt.getKeyCode()) {
        }
        char c = evt.getKeyChar();
        
        if(Character.isLowerCase(c)){
            String cad = (""+c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_campo_no_motorKeyTyped

    private void campo_no_facturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_no_facturaKeyTyped
        // TODO add your handling code here:
        // TODO add your handling code here:
        char caracter2 = evt.getKeyChar();
        if (campo_no_factura.getText().length() == 8) {
            evt.consume();
        } else if (caracter2 != evt.getKeyCode()) {
        }
        if (((caracter2 < '0') || (caracter2 > '9'))) {

            evt.consume();
        } else {

        }
        char c = evt.getKeyChar();
        
        if(Character.isLowerCase(c)){
            String cad = (""+c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_campo_no_facturaKeyTyped

    private void campoColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoColorKeyTyped
                // TODO add your handling code here:
        // TODO add your handling code here:
        char caracter2 = evt.getKeyChar();
        if (campoColor.getText().length() == 15) {
            evt.consume();
        } else if (caracter2 != evt.getKeyCode()) {
        }
        char c = evt.getKeyChar();
        
        if(Character.isLowerCase(c)){
            String cad = (""+c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_campoColorKeyTyped

    private void campo_importeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_importeKeyTyped
                // TODO add your handling code here:
        char caracter2 = evt.getKeyChar();
        if (campo_importe.getText().length() == 7) {
            evt.consume();
        } else if (caracter2 != evt.getKeyCode()) {
        }
        if (((caracter2 < '0') || (caracter2 > '9'))) {

            evt.consume();
        } else {

        }
    }//GEN-LAST:event_campo_importeKeyTyped
    
    
    
    public static void limpiarTablaPermisos() {
        int a = modelo.getRowCount() - 1;
        for (int i = 0; i <= a; i++) {
            modelo.removeRow(0);
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ventana_modificar_vehiculo dialog = new ventana_modificar_vehiculo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnImagen;
    private javax.swing.JButton btnImagen1;
    public static javax.swing.JTextField campo;
    private javax.swing.JTextField campoColor;
    private javax.swing.JTextField campoKilometraje;
    private javax.swing.JTextField campoLinea;
    private javax.swing.JTextField campoMarca;
    private javax.swing.JTextField campoMatricula;
    private javax.swing.JSpinner campoModelo;
    private javax.swing.JSpinner campoMotor;
    private javax.swing.JTextArea campoObservaciones1;
    private javax.swing.JTextField campoRuta;
    private javax.swing.JTextArea campo_descripcion;
    private com.toedter.calendar.JDateChooser campo_fecha_compra;
    private javax.swing.JTextField campo_importe;
    private javax.swing.JTextField campo_no_factura;
    private javax.swing.JTextField campo_no_motor;
    private javax.swing.JLabel contadorImg;
    private javax.swing.JLabel contenedor;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel imagenVehiculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nuevasFotos;
    private javax.swing.JPanel pn_permisos;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
