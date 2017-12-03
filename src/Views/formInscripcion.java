/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.controllerCategorias;
import Controllers.controllerCiclistas;
import Controllers.controllerInscripciones;
import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author user
 */
public class formInscripcion extends javax.swing.JFrame {

    /**
     * Creates new form formInscripcion
     */
    DefaultTableModel tableModel;
    formMessage modal = new formMessage();

    public formInscripcion() {
        initComponents();
        setIcon();
        createColumns(tablaRacers);
        createColumns(tabla);
        fillTable();
        allPlaceholders();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRacers = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAdd = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCarrera = new javax.swing.JTextField();
        txtDT = new javax.swing.JTextField();
        txtDelegado = new javax.swing.JTextField();
        txtTelDT = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtTelDelegado = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        focussable = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setViewportView(tablaRacers);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 530, 270));

        btnDelete.setText("<<");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, -1, -1));

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearch.setToolTipText("Ingrese Tarjeta de Identidad");
        txtSearch.setBorder(null);
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 500, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 530, 10));

        btnAdd.setText(">>");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, -1, -1));

        jScrollPane3.setViewportView(tabla);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 540, 270));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phone.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 150, 30, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/race.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 30, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dt.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, -1, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/del.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, -1, 40));

        txtCarrera.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCarrera.setBorder(null);
        txtCarrera.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCarreraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCarreraFocusLost(evt);
            }
        });
        jPanel1.add(txtCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 490, 30));

        txtDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDT.setBorder(null);
        txtDT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDTFocusLost(evt);
            }
        });
        jPanel1.add(txtDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 280, 30));

        txtDelegado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDelegado.setBorder(null);
        txtDelegado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDelegadoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDelegadoFocusLost(evt);
            }
        });
        jPanel1.add(txtDelegado, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 280, 30));

        txtTelDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelDT.setBorder(null);
        txtTelDT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelDTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelDTFocusLost(evt);
            }
        });
        jPanel1.add(txtTelDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 100, 140, 30));

        jButton3.setBackground(new java.awt.Color(0, 0, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Generar Inscripción");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 493, 140, 30));

        btnVolver.setBackground(new java.awt.Color(102, 102, 0));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Menú Principal ");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 493, 130, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logox100px.png"))); // NOI18N
        jLabel7.setText("  Sección de Inscripciones");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 410, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 180, 170, 10));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phone.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 100, 30, 30));

        txtTelDelegado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelDelegado.setBorder(null);
        txtTelDelegado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelDelegadoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelDelegadoFocusLost(evt);
            }
        });
        jPanel1.add(txtTelDelegado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 150, 140, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 530, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 320, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 130, 170, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 320, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 540));

        focussable.setText("jTextField1");
        getContentPane().add(focussable, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        changueTable(tablaRacers, tabla);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        unshowPlaceholder(txtSearch, "Ingrese el nombre o documento del deportista...");
    }//GEN-LAST:event_txtSearchFocusGained

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        showPlaceholder(txtSearch, "Ingrese el nombre o documento del deportista...");
    }//GEN-LAST:event_txtSearchFocusLost

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String text = txtSearch.getText();
        filter(text);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        changueTable(tabla, tablaRacers);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        formMain form = new formMain();
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        focussable.requestFocusInWindow();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked

    }//GEN-LAST:event_btnAddMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        sendInscripcion();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtCarreraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCarreraFocusGained
        unshowPlaceholder(txtCarrera, "Nombre de la carrera.");
    }//GEN-LAST:event_txtCarreraFocusGained

    private void txtCarreraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCarreraFocusLost
        showPlaceholder(txtCarrera, "Nombre de la carrera.");
    }//GEN-LAST:event_txtCarreraFocusLost

    private void txtDTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDTFocusLost
        showPlaceholder(txtDT, "Nombre del director técnico.");
    }//GEN-LAST:event_txtDTFocusLost

    private void txtDTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDTFocusGained
        unshowPlaceholder(txtDT, "Nombre del director técnico.");
    }//GEN-LAST:event_txtDTFocusGained

    private void txtDelegadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDelegadoFocusGained
        unshowPlaceholder(txtDelegado, "Nombre del delegado.");
    }//GEN-LAST:event_txtDelegadoFocusGained

    private void txtDelegadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDelegadoFocusLost
        showPlaceholder(txtDelegado, "Nombre del delegado.");
    }//GEN-LAST:event_txtDelegadoFocusLost

    private void txtTelDTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelDTFocusLost
        showPlaceholder(txtTelDT, "Teléfono.");
    }//GEN-LAST:event_txtTelDTFocusLost

    private void txtTelDTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelDTFocusGained
        unshowPlaceholder(txtTelDT, "Teléfono.");
    }//GEN-LAST:event_txtTelDTFocusGained

    private void txtTelDelegadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelDelegadoFocusGained
        unshowPlaceholder(txtTelDelegado, "Teléfono.");
    }//GEN-LAST:event_txtTelDelegadoFocusGained

    private void txtTelDelegadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelDelegadoFocusLost
        showPlaceholder(txtTelDelegado, "Teléfono.");
    }//GEN-LAST:event_txtTelDelegadoFocusLost

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
            java.util.logging.Logger.getLogger(formInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formInscripcion().setVisible(true);
            }
        });
    }
    private void setIcon() {
        Image icon = new ImageIcon(getClass().getResource("icono.png")).getImage();
        setIconImage(icon);
    }
    void createColumns(JTable tabla) {
        tableModel = (DefaultTableModel) tabla.getModel();
        tableModel.addColumn("Nombres");
        tableModel.addColumn("Apellidos");
        tableModel.addColumn("Sexo");
        tableModel.addColumn("N° Documento");
        tableModel.addColumn("Categoría");
        tabla.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(10);
    }

    void filter(String query) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tableModel);
        tabla.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }

    void fillTable() {
        controllerCiclistas ctrl = new controllerCiclistas();
        controllerCategorias ctrlCat = new controllerCategorias();
        try {
            ResultSet rs = ctrl.fillTable();
            while (rs.next()) {
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                int sexo = rs.getInt("sexo");
                String sex;
                if (sexo == 1) {
                    sex = "M";
                } else {
                    sex = "F";
                }
                String doc = rs.getString("n_documento");
                String cat = ctrlCat.getCategoria(rs.getString("fecha_nacimiento"));
                String[] row = {nombres, apellidos, sex, doc, cat};
                tableModel.addRow(row);
            }
        } catch (Exception e) {
            System.out.println("Error recorrer array vista: " + e.getMessage());
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

    void sendInscripcion() {
        String raceName = txtCarrera.getText();
        String dt = txtDT.getText();
        String dtTel = txtTelDT.getText();
        String delegado = txtDelegado.getText();
        String delTel = txtTelDelegado.getText();
        String alertMessage = "";
        String camps = "";
        int campCount = 0;
        if (raceName.equals("Nombre de la carrera.")) {
            campCount++;
            camps = "Nombre de la Carrera";
        } else if (dt.equals("Nombre del director técnico.")) {
            camps = "Director Técnico";
            campCount++;
        } else if (dtTel.equals("Teléfono.")) {
            camps = "Teléfono Director Técnico";
            campCount++;
        } else if (delegado.equals("Nombre del delegado.")) {
            camps = "Delegado";
            campCount++;
        } else if (delTel.equals("Teléfono.")) {
            camps += "Teléfono Delegado";
            campCount++;
        }
        if (campCount > 0) {
            alertMessage = "<html><center>Hay que llenar el campo:<br>";
            alertMessage += camps + "</center></html>";
            modal.showModal(true, alertMessage);
        } else {
            String[] raceData = {raceName, dt, dtTel, delegado, delTel};
            DefaultTableModel model = (DefaultTableModel) tablaRacers.getModel();
            int rows = model.getRowCount();
            if (rows > 0) {
                int cols = model.getColumnCount();
                String[][] racers = new String[rows][cols];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        racers[i][j] = model.getValueAt(i, j).toString();
                    }
                }
                controllerInscripciones ctrl = new controllerInscripciones();
                ctrl.generarInscripcion(raceData, racers);
                limpiar();
            } else {
                modal.showModal(true, "Debe inscribir almenos un deportista.");
            }
        }

    }
    void limpiar(){
        txtCarrera.setText("");
        txtDT.setText("");
        txtDelegado.setText("");
        txtTelDT.setText("");
        txtTelDelegado.setText("");
        allPlaceholders();
        int rows = tablaRacers.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tablaRacers.getModel();
        for (int i = rows-1; i >= 0; i--) {
            model.removeRow(i);
        }
        model = (DefaultTableModel) tabla.getModel();
        rows = tabla.getRowCount();
        for (int i = rows-1; i >= 0; i--) {
            model.removeRow(i);
        }
        fillTable();
    }
    void changueTable(JTable from, JTable to) {
        int row = from.getSelectedRow();
        if (row > -1) {
            Object[] data = new Object[5];
            for (int i = 0; i < 5; i++) {
                data[i] = from.getValueAt(row, i);
            }
            DefaultTableModel fromModel, toModel;
            fromModel = (DefaultTableModel) from.getModel();
            toModel = (DefaultTableModel) to.getModel();
            fromModel.removeRow(row);
            toModel.addRow(data);
        } else {
            modal.showModal(true, "Seleccione un deportista");
        }
    }
    void allPlaceholders(){
        showPlaceholder(txtCarrera, "Nombre de la carrera.");
        showPlaceholder(txtDT, "Nombre del director técnico.");
        showPlaceholder(txtTelDT, "Teléfono.");
        showPlaceholder(txtTelDelegado, "Teléfono.");
        showPlaceholder(txtDelegado, "Nombre del delegado.");
        showPlaceholder(txtSearch, "Ingrese el nombre o documento del deportista...");
        focussable.requestFocusInWindow();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField focussable;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tablaRacers;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtDT;
    private javax.swing.JTextField txtDelegado;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTelDT;
    private javax.swing.JTextField txtTelDelegado;
    // End of variables declaration//GEN-END:variables
}
