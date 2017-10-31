/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.controllerCiclistas;
import java.awt.Color;
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
        txtFocussable.requestFocusInWindow();
        showPlaceholder(txtNombres, "Nombres");
        showPlaceholder(txtApellidos, "Apellidos");        
        showPlaceholder(txtNumeroDoc, "N° de Documento");
        showPlaceholder(txtRH, "RH (O+)");        
        showPlaceholder(txtEps, "EPS");
        showPlaceholder(txtColegio, "Institución Educativa");
        showPlaceholder(txtDireccion, "Dirección de recidencia");
        showPlaceholder(txtEmail, "Correo Electrónico");
        showPlaceholder(txtModalidad, "Modalidad");
        showPlaceholder(txtLugarNac, "Lugar de Nacimiento");
        showPlaceholder(txtNombreMadre, "Nombre de la Madre");
        showPlaceholder(txtNombrePadre, "Nombre del Padre");
        showPlaceholder(txtTelefono, "Teléfono");

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
        lbTitle = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        txtEps = new javax.swing.JTextField();
        txtRH = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Journey = new javax.swing.JComboBox<>();
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
        btnSubmit = new javax.swing.JButton();
        txtFocussable = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Inscripción Deportista");
        jPanel1.add(lbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 580, -1));

        txtNombres.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNombres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombresFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombresFocusLost(evt);
            }
        });
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 116, 208, -1));

        txtApellidos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidosFocusLost(evt);
            }
        });
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 116, 208, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tipo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 154, -1, 22));

        cbxTipo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta de Identidad", "Cedula de Ciudadanía", "Cedula de Extranjería" }));
        jPanel1.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 150, 24));

        txtEps.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtEps.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEpsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEpsFocusLost(evt);
            }
        });
        jPanel1.add(txtEps, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 277, 128, -1));

        txtRH.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtRH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRHFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRHFocusLost(evt);
            }
        });
        jPanel1.add(txtRH, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 277, 70, -1));

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionFocusLost(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 208, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Jornada:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 237, -1, 22));

        Journey.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Journey.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Mañana", "Tarde", "Noche" }));
        jPanel1.add(Journey, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 140, 24));

        txtLugarNac.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtLugarNac.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLugarNacFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLugarNacFocusLost(evt);
            }
        });
        jPanel1.add(txtLugarNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 197, 208, -1));

        txtNumeroDoc.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNumeroDoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumeroDocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumeroDocFocusLost(evt);
            }
        });
        jPanel1.add(txtNumeroDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 155, 208, -1));

        dateChoser.setBackground(new java.awt.Color(255, 255, 255));
        dateChoser.setToolTipText("Fecha de Nacimiento");
        dateChoser.setDateFormatString("dd-MM-yyyy");
        dateChoser.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel1.add(dateChoser, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 196, 130, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Fecha Nac:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 196, 73, 22));

        txtColegio.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtColegio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtColegioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtColegioFocusLost(evt);
            }
        });
        jPanel1.add(txtColegio, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 237, 208, -1));

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 208, -1));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 208, -1));

        txtModalidad.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtModalidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtModalidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtModalidadFocusLost(evt);
            }
        });
        jPanel1.add(txtModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 208, -1));

        txtNombrePadre.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNombrePadre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombrePadreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombrePadreFocusLost(evt);
            }
        });
        jPanel1.add(txtNombrePadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 208, -1));

        txtNombreMadre.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNombreMadre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreMadreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreMadreFocusLost(evt);
            }
        });
        jPanel1.add(txtNombreMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 208, -1));

        btnSubmit.setText("Inscribir");
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 208, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 500));
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

    private void txtRHFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRHFocusGained
        unshowPlaceholder(txtRH, "RH (O+)");
    }//GEN-LAST:event_txtRHFocusGained

    private void txtRHFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRHFocusLost
        showPlaceholder(txtRH, "RH (O+)");
    }//GEN-LAST:event_txtRHFocusLost

    private void txtEpsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEpsFocusGained
        unshowPlaceholder(txtEps, "EPS");
    }//GEN-LAST:event_txtEpsFocusGained

    private void txtEpsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEpsFocusLost
        showPlaceholder(txtEps, "EPS");
    }//GEN-LAST:event_txtEpsFocusLost

    private void txtDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusGained
        unshowPlaceholder(txtDireccion, "Dirección de recidencia");
    }//GEN-LAST:event_txtDireccionFocusGained

    private void txtDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusLost
        showPlaceholder(txtDireccion, "Dirección de recidencia");
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
    void save(){
        String firstName = txtNombres.getText();
        String lastName = txtApellidos.getText();
        String document = txtNumeroDoc.getText();
        int type = cbxTipo.getSelectedIndex();
        int journey = Journey.getSelectedIndex();
        String placeBorn = txtLugarNac.getText();
        String dateBorn = getDate();
        String school = txtColegio.getText();
        String RH = txtRH.getText();
        String eps = txtEps.getText();
        String direcion = txtDireccion.getText();
        String mail = txtEmail.getText();
        String phone = txtTelefono.getText();
        String motherName = txtNombreMadre.getText();
        String fatherName = txtNombrePadre.getText();
        String modality = txtModalidad.getText();
        Object [] data = {document,type,firstName,lastName,dateBorn,placeBorn,school,journey,RH,eps,direcion,mail,phone,motherName,fatherName,modality};
        controllerCiclistas ctrl = new controllerCiclistas();
        
    }
    String getDate(){
        SimpleDateFormat Fecha = new SimpleDateFormat("dd-MMM-yyyy");
        return Fecha.format(dateChoser.getDate());
    }
    void showPlaceholder(JTextField element, String placeholderText) {
        if (element.getText().equals("")) {
            element.setForeground(Color.decode("#818181"));
            element.setText(placeholderText);
        }
    }

    void unshowPlaceholder(JTextField element , String placeholderText) {
        String text = element.getText();
        if (text.equals(placeholderText)) {
            element.setText("");
            element.setForeground(Color.decode("#000000"));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Journey;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cbxTipo;
    private com.toedter.calendar.JDateChooser dateChoser;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtColegio;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEps;
    private javax.swing.JTextField txtFocussable;
    private javax.swing.JTextField txtLugarNac;
    private javax.swing.JTextField txtModalidad;
    private javax.swing.JTextField txtNombreMadre;
    private javax.swing.JTextField txtNombrePadre;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumeroDoc;
    private javax.swing.JTextField txtRH;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}
