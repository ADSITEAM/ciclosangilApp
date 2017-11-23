/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class modelEPS {

    Conexion obj = new Conexion();
    Connection cnx = obj.getConexBD();

    public void save(String eps) {
        String query = "insert into EPS (nombre) values (?)";
        try {
            PreparedStatement statement = cnx.prepareStatement(query);
            statement.setString(1, eps);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, eps + " registrada correctamente.");
        } catch (Exception e) {
            System.out.println("Error en save users:");
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al registrar usuarios.");
        }
    }
    public void delete(int id) {
        String query = "delete from EPS where id='"+id+"'";
        try {
            PreparedStatement statement = cnx.prepareStatement(query);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "EPS retirada correctamente");
        } catch (Exception e) {
            System.out.println("Error en save users:");
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al retirar EPS.");
        }
    }
}
