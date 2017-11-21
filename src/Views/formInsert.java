/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.controllerCiclistas;
import Controllers.controllerDocs;
import java.awt.Color;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author FamiliaArias
 */
public class formInsert extends javax.swing.JFrame {

    /**
     * Creates new form formInsert
     */
    public formInsert() {
        initComponents();
        setLocationRelativeTo(null);
        allPlaceholders();
        loadCbx();

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
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Journey = new javax.swing.JComboBox<>();
        lbTitle = new javax.swing.JLabel();
        txtLugarNac = new javax.swing.JTextField();
        txtNumeroDoc = new javax.swing.JTextField();
        dateChoser = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        txtColegio = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtModalidad = new javax.swing.JTextField();
        txtNombrePadre = new javax.swing.JTextField();
        txtNombreMadre = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cbxEPS = new javax.swing.JComboBox<>();
        cbxRH = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        txtFocussable = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombres.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNombres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombresFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombresFocusLost(evt);
            }
        });
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 208, -1));

        txtApellidos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidosFocusLost(evt);
            }
        });
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 208, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tipo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, 22));

        cbxTipo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta de Identidad", "Cedula de Ciudadanía", "Cedula de Extranjería" }));
        cbxTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 210, 24));

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionFocusLost(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 208, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Jornada:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, 22));

        Journey.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Journey.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Mañana", "Tarde", "Noche" }));
        Journey.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(Journey, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 210, 24));

        lbTitle.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        lbTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logox100px.png"))); // NOI18N
        lbTitle.setText(" Sección Inscripción Deportista");
        lbTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 520, -1));

        txtLugarNac.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtLugarNac.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLugarNacFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLugarNacFocusLost(evt);
            }
        });
        jPanel1.add(txtLugarNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 208, -1));

        txtNumeroDoc.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNumeroDoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumeroDocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumeroDocFocusLost(evt);
            }
        });
        jPanel1.add(txtNumeroDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 208, -1));

        dateChoser.setBackground(new java.awt.Color(255, 255, 255));
        dateChoser.setToolTipText("Fecha de Nacimiento");
        dateChoser.setDateFormatString("dd-MM-yyyy");
        dateChoser.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel1.add(dateChoser, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 210, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Fecha Nac:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 73, 22));

        txtColegio.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtColegio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtColegioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtColegioFocusLost(evt);
            }
        });
        jPanel1.add(txtColegio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 208, -1));

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 208, -1));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 208, -1));

        txtModalidad.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtModalidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtModalidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtModalidadFocusLost(evt);
            }
        });
        jPanel1.add(txtModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 208, -1));

        txtNombrePadre.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNombrePadre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombrePadreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombrePadreFocusLost(evt);
            }
        });
        jPanel1.add(txtNombrePadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 208, -1));

        txtNombreMadre.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNombreMadre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreMadreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreMadreFocusLost(evt);
            }
        });
        jPanel1.add(txtNombreMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 208, -1));

        btnVolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVolver.setText("Menú Principal");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 210, -1));

        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSubmit.setText("Inscribir");
        btnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 210, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombres");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Documeto");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Lugar de nacimiento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Institucion");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("EPS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Correo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Nombre del padre");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Nombre de la madre");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Apellidos");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Direccion");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Telefono");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Modalidad");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Tipo de sangre");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        cbxEPS.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cbxEPS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una EPS" }));
        jPanel1.add(cbxEPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 210, -1));

        cbxRH.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cbxRH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tipo de sangre" }));
        jPanel1.add(cbxRH, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 210, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 810, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 690));
        getContentPane().add(txtFocussable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 60, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        txtFocussable.requestFocusInWindow();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void txtNombresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombresFocusGained
        unshowPlaceholder(txtNombres, "Nombres");
    }//GEN-LAST:event_txtNombresFocusGained

    private void txtNombresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombresFocusLost
        showPlaceholder(txtNombres, "Nombres");
    }//GEN-LAST:event_txtNombresFocusLost

    private void txtApellidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusGained
        unshowPlaceholder(txtApellidos, "Apellidos");
    }//GEN-LAST:event_txtApellidosFocusGained

    private void txtApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusLost
        showPlaceholder(txtApellidos, "Apellidos");
    }//GEN-LAST:event_txtApellidosFocusLost

    private void txtNumeroDocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroDocFocusGained
        unshowPlaceholder(txtNumeroDoc, "N° de Documento");
    }//GEN-LAST:event_txtNumeroDocFocusGained

    private void txtNumeroDocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroDocFocusLost
        showPlaceholder(txtNumeroDoc, "N° de Documento");
    }//GEN-LAST:event_txtNumeroDocFocusLost

    private void txtLugarNacFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLugarNacFocusGained
        unshowPlaceholder(txtLugarNac, "Lugar de Nacimiento");
    }//GEN-LAST:event_txtLugarNacFocusGained

    private void txtColegioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtColegioFocusGained
        unshowPlaceholder(txtColegio, "Institución Educativa");
    }//GEN-LAST:event_txtColegioFocusGained

    private void txtColegioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtColegioFocusLost
        showPlaceholder(txtColegio, "Institución Educativa");
    }//GEN-LAST:event_txtColegioFocusLost

    private void txtLugarNacFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLugarNacFocusLost
        showPlaceholder(txtLugarNac, "Lugar de Nacimiento");
    }//GEN-LAST:event_txtLugarNacFocusLost

    private void txtDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusGained
        unshowPlaceholder(txtDireccion, "Dirección de Residencia");
    }//GEN-LAST:event_txtDireccionFocusGained

    private void txtDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusLost
        showPlaceholder(txtDireccion, "Dirección de Residencia");
    }//GEN-LAST:event_txtDireccionFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        unshowPlaceholder(txtEmail, "Correo Electrónico");
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusGained
        unshowPlaceholder(txtTelefono, "Teléfono");
    }//GEN-LAST:event_txtTelefonoFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        showPlaceholder(txtEmail, "Correo Electrónico");
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        showPlaceholder(txtTelefono, "Teléfono");
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void txtNombreMadreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreMadreFocusGained
        unshowPlaceholder(txtNombreMadre, "Nombre de la Madre");
    }//GEN-LAST:event_txtNombreMadreFocusGained

    private void txtNombreMadreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreMadreFocusLost
        showPlaceholder(txtNombreMadre, "Nombre de la Madre");
    }//GEN-LAST:event_txtNombreMadreFocusLost

    private void txtNombrePadreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombrePadreFocusGained
        unshowPlaceholder(txtNombrePadre, "Nombre del Padre");
    }//GEN-LAST:event_txtNombrePadreFocusGained

    private void txtNombrePadreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombrePadreFocusLost
        showPlaceholder(txtNombrePadre, "Nombre del Padre");
    }//GEN-LAST:event_txtNombrePadreFocusLost

    private void txtModalidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtModalidadFocusGained
        unshowPlaceholder(txtModalidad, "Modalidad");
    }//GEN-LAST:event_txtModalidadFocusGained

    private void txtModalidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtModalidadFocusLost
        showPlaceholder(txtModalidad, "Modalidad");
    }//GEN-LAST:event_txtModalidadFocusLost

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        save();
        limpiar();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        formMain form = new formMain();
        form.setVisible(true);
        form.setResizable(false);
        form.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(formInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formInsert().setVisible(true);
            }
        });
    }
    void limpiar(){
        txtApellidos.setText("");
        txtNombres.setText("");
        txtColegio.setText("");
        txtDireccion.setText("");
        txtEmail.setText("");
        txtLugarNac.setText("");
        txtModalidad.setText("");
        txtNombrePadre.setText("");
        txtNombreMadre.setText("");
        txtNumeroDoc.setText("");
        txtTelefono.setText("");
        dateChoser.setDateFormatString("");
        txtFocussable.requestFocusInWindow();
        showPlaceholder(txtNombres, "Nombres");
        showPlaceholder(txtApellidos, "Apellidos");
        showPlaceholder(txtNumeroDoc, "N° de Documento");
        showPlaceholder(txtColegio, "Institución Educativa");
        showPlaceholder(txtDireccion, "Dirección de Residencia");
        showPlaceholder(txtEmail, "Correo Electrónico");
        showPlaceholder(txtModalidad, "Modalidad");
        showPlaceholder(txtLugarNac, "Lugar de Nacimiento");
        showPlaceholder(txtNombreMadre, "Nombre de la Madre");
        showPlaceholder(txtNombrePadre, "Nombre del Padre");
        showPlaceholder(txtTelefono, "Teléfono");
    }
    void save(){
        controllerCiclistas ctrl = new controllerCiclistas();
        String firstName = txtNombres.getText();
        String lastName = txtApellidos.getText();
        String document = txtNumeroDoc.getText();
        int type = cbxTipo.getSelectedIndex();
        int journey = Journey.getSelectedIndex();
        String placeBorn = txtLugarNac.getText();
        String dateBorn = getDate();
        String school = validateText(txtColegio, "Institución Educativa");
        int RH = ctrl.getID(cbxRH.getSelectedItem().toString(), "RH");
        int eps = ctrl.getID(cbxEPS.getSelectedItem().toString(), "eps");
        String direcion = txtDireccion.getText();
        String mail = validateText(txtEmail, "Correo Electrónico");
        String phone = validateText(txtTelefono, "Teléfono");
        String motherName = validateText(txtNombreMadre, "Nombre de la Madre");
        String fatherName = validateText(txtNombrePadre, "Nombre del Padre");
        String modality = txtModalidad.getText();
        Object[] data = {document, type, firstName, lastName, dateBorn, placeBorn, school, journey, RH, eps, direcion, mail, phone, motherName, fatherName, modality};
        
        ctrl.save(data);
    }
    void loadCbx(){
        loadEps();
        loadRH();
    }
    void loadEps(){
        controllerCiclistas ctrl = new controllerCiclistas();
        ResultSet data = ctrl.getEps();
        try {
            while (data.next()) {
                cbxEPS.addItem(data.getString("nombre"));
            }
        } catch (Exception e) {
            System.out.println("Error loading eps");
        }
    }
    void loadRH(){
        controllerCiclistas ctrl = new controllerCiclistas();
        ResultSet data = ctrl.getRH();
        try {
            while (data.next()) {
                cbxRH.addItem(data.getString("nombre"));
            }
        } catch (Exception e) {
            System.out.println("Error loading rh");
        }
    }
    String validateText(JTextField txtField, String placeholderText){
        String text;
        if (txtField.getText().equals(placeholderText)) {
            text = "";
        }else text = txtField.getText();
        return text;
    }

    String getDate() {
        SimpleDateFormat Fecha = new SimpleDateFormat("dd-MM-yyyy");
        return Fecha.format(dateChoser.getDate());
    }
    void showPlaceholder(JTextField element, String placeholderText) {
        if (element.getText().equals("")) {
            element.setForeground(Color.decode("#818181"));
            element.setText(placeholderText);
        }
    }

    void unshowPlaceholder(JTextField element, String placeholderText) {
        String text = element.getText();
        if (text.equals(placeholderText)) {
            element.setText("");
            element.setForeground(Color.decode("#000000"));
        }
    }
    void allPlaceholders(){
        txtFocussable.requestFocusInWindow();
        showPlaceholder(txtNombres, "Nombres");
        showPlaceholder(txtApellidos, "Apellidos");
        showPlaceholder(txtNumeroDoc, "N° de Documento");
        showPlaceholder(txtColegio, "Institución Educativa");
        showPlaceholder(txtDireccion, "Dirección de Residencia");
        showPlaceholder(txtEmail, "Correo Electrónico");
        showPlaceholder(txtModalidad, "Modalidad");
        showPlaceholder(txtLugarNac, "Lugar de Nacimiento");
        showPlaceholder(txtNombreMadre, "Nombre de la Madre");
        showPlaceholder(txtNombrePadre, "Nombre del Padre");
        showPlaceholder(txtTelefono, "Teléfono");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Journey;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxEPS;
    private javax.swing.JComboBox<String> cbxRH;
    private javax.swing.JComboBox<String> cbxTipo;
    private com.toedter.calendar.JDateChooser dateChoser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtColegio;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFocussable;
    private javax.swing.JTextField txtLugarNac;
    private javax.swing.JTextField txtModalidad;
    private javax.swing.JTextField txtNombreMadre;
    private javax.swing.JTextField txtNombrePadre;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumeroDoc;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}
