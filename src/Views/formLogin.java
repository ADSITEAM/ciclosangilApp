/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.controllerLogin;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class formLogin extends javax.swing.JFrame {

    controllerLogin ctrlLogin = new controllerLogin();
    String placeholderUser = "Nombre de Usuario.";
    String placeholderPass = "Contraseña.";

    /**
     * Creates new form NewJFrame
     */
    public formLogin() {
        initComponents();
        setLocationRelativeTo(null);
        setIcon();
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lbAlert = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        lbPassPlaceholder = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        txtFocus = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logox200px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingrese al Sistema");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 670, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 560, 10));

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
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 260, 40));

        btnLogin.setBackground(new java.awt.Color(0, 0, 51));
        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Ingresar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 140, 30));

        btnCancel.setBackground(new java.awt.Color(102, 0, 0));
        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancelar");
        btnCancel.setBorder(null);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 140, 30));

        lbAlert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbAlert.setForeground(new java.awt.Color(255, 0, 0));
        lbAlert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAlert.setToolTipText("");
        jPanel1.add(lbAlert, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 300, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/key.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 300, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 300, 10));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/man-user.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        lbPassPlaceholder.setBackground(new java.awt.Color(129, 129, 129));
        lbPassPlaceholder.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbPassPlaceholder.setForeground(new java.awt.Color(129, 129, 129));
        lbPassPlaceholder.setText("Contraseña.");
        jPanel1.add(lbPassPlaceholder, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

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
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 260, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 410));

        txtFocus.setText("jTextField1");
        getContentPane().add(txtFocus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        cancelar();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        validateLogin();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        validateLogin();
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        txtFocus.requestFocusInWindow();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        unshowPlaceholder(txtUsuario, placeholderUser);
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        showPlaceholder(txtUsuario, placeholderUser);
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusGained
        unshowPassPlaceholder(txtContraseña, lbPassPlaceholder);
    }//GEN-LAST:event_txtContraseñaFocusGained

    private void txtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusLost
        showPassPlaceholder(txtContraseña, lbPassPlaceholder, placeholderPass);
    }//GEN-LAST:event_txtContraseñaFocusLost

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        txtContraseña.requestFocusInWindow();
    }//GEN-LAST:event_txtUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formLogin().setVisible(true);
            }
        });
    }

    void validateLogin() {
        String user = txtUsuario.getText();
        String pass = txtContraseña.getText();
        int validate = ctrlLogin.validarLogin(user, pass);
        if (validate == 1) {
            int rol = ctrlLogin.getRol(user);
            if (rol == 1) {
                formAdmin form = new formAdmin();
                showForm(form);
            } else {
                formMain form = new formMain();
                showForm(form);
            }
        } else {
            txtContraseña.setText("");
            txtContraseña.requestFocusInWindow();
            lbAlert.setText("Usuario y/o contraseña incorrectos.");
        }
    }

    void showForm(JFrame form) {
        this.dispose();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
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
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbAlert;
    private javax.swing.JLabel lbPassPlaceholder;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtFocus;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(new ImageIcon(getClass().getResource("icono.png")).getImage());
    }

    private void cancelar() {
        txtContraseña.setText("");
        txtUsuario.setText("");
        showPassPlaceholder(txtContraseña, lbPassPlaceholder, placeholderPass);
        showPlaceholder(txtUsuario, placeholderUser);
    }
}
