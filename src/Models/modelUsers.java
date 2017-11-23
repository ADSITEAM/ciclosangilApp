/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Controllers.controllerDocs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class modelUsers {

    Conexion obj = new Conexion();
    Connection cnx = obj.getConexBD();

    public void save(Object[] data) {
        String query = "insert into usuarios values (?,?,?)";
        try {
            PreparedStatement statement = cnx.prepareStatement(query);
            for (int i = 0; i < data.length; i++) {
                statement.setString(i + 1, data[i].toString());
            }
            int count = statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario " + data[0].toString() + " creado correctamente.");
        } catch (Exception e) {
            System.out.println("Error en save users:");
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al registrar usuarios.");
        }
    }
    public boolean validateUser(String user){
        boolean state = false;
        int count = 0;
        String query = "select count(username) as count from usuarios where username='"+user+"'";
        try {
            Statement st = cnx.createStatement();
            ResultSet data = st.executeQuery(query);
            while (data.next()) {
                count = data.getInt("count");
            }
            if (count==0) {
                state = true;
            }
        } catch (Exception e) {
            System.out.println("Error en select from delete:");
            System.out.println(e.getMessage());
        }
        return state;
    }
}
