/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.controllerUsers;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class formNewUser extends javax.swing.JFrame {

    String placeholderUser = "Nombre de Usuario.";
    String placeholderPass = "Contraseña.";
    formMessage modal = new formMessage();

    /**
     * Creates new form formUsers
     */
    public formNewUser() {
        initComponents();
        txtFocus.requestFocusInWindow();
        showPlaceholder(txtUsuario, placeholderUser);
        showPassPlaceholder(txtContraseña, lbPassPlaceholder, placeholderPass);
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
        btnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbPassPlaceholder = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        cbxRol = new javax.swing.JComboBox<>();
        btnCrear = new javax.swing.JButton();
        txtFocus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancel.setBackground(new java.awt.Color(102, 0, 0));
        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Volver");
        btnCancel.setBorder(null);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 100, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel2.setText("Nuevo Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/locked x64.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, -1));

        lbPassPlaceholder.setBackground(new java.awt.Color(129, 129, 129));
        lbPassPlaceholder.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbPassPlaceholder.setForeground(new java.awt.Color(129, 129, 129));
        lbPassPlaceholder.setText("Contraseña.");
        jPanel1.add(lbPassPlaceholder, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 480, 10));

        txtContraseña.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtContraseña.setBorder(null);
        txtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusLost(evt);
            }
        });
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 210, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 250, 10));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/key.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/man-user.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 210, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 250, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Rol:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        cbxRol.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador" }));
        jPanel1.add(cbxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 190, 40));

        btnCrear.setBackground(new java.awt.Color(0, 0, 51));
        btnCrear.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 250, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 440));
        getContentPane().add(txtFocus, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 50, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        formAdmin form = new formAdmin();
        showForm(form);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusGained
        unshowPassPlaceholder(txtContraseña, lbPassPlaceholder);
    }//GEN-LAST:event_txtContraseñaFocusGained

    private void txtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusLost
        showPassPlaceholder(txtContraseña, lbPassPlaceholder, placeholderPass);
    }//GEN-LAST:event_txtContraseñaFocusLost

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed

    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        unshowPlaceholder(txtUsuario, placeholderUser);
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        showPlaceholder(txtUsuario, placeholderUser);
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        txtContraseña.requestFocusInWindow();
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        register();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        txtFocus.requestFocusInWindow();
    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(formNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formNewUser().setVisible(true);
            }
        });
    }

    void showForm(JFrame form) {
        this.dispose();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
    }

    void register() {
        controllerUsers ctrl = new controllerUsers();
        String user = txtUsuario.getText();
        String pass = txtContraseña.getText();
        int rol = cbxRol.getSelectedIndex();
        Object[] data = {user, pass, rol};
        if (!user.equals(placeholderUser) && !pass.equals("")) {
            boolean state = ctrl.validateUser(user);
            if (state) {
                ctrl.save(data);
                txtUsuario.setText("");
                txtContraseña.setText("");
                cbxRol.setSelectedIndex(0);
                showPlaceholder(txtUsuario, placeholderUser);
                showPassPlaceholder(txtContraseña, lbPassPlaceholder, placeholderPass);
            } else {
                modal.showModal(true, "El usuario ya está registrado");
            }
        } else {
            modal.showModal(true, "Debe llenar ambos campos");
        }

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

    void showPassPlaceholder(JPasswordField el, JLabel lb, String text) {
        if (el.getText().equals("")) {
            lb.setText(text);
        }
    }

    void unshowPassPlaceholder(JPasswordField el, JLabel lb) {
        lb.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCrear;
    private javax.swing.JComboBox<String> cbxRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbPassPlaceholder;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtFocus;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
