/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Views.formMessage;
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
    formMessage modal = new formMessage();

    public void save(String eps) {
        String query = "insert into EPS (nombre) values (?)";
        boolean error = true;
        String text ="";
        try {
            PreparedStatement statement = cnx.prepareStatement(query);
            statement.setString(1, eps);
            statement.executeUpdate();
            error = false;
            text = eps + " registrada correctamente.";
        } catch (Exception e) {
            System.out.println("Error en save users:");
            System.out.println(e.getMessage());
            text = "Error al registrar la EPS.";
        }
        modal.showModal(error, text);
    }
    public boolean validateEPS(String eps){
        boolean state = false;
        String query = "select count(nombre) as count from EPS where nombre='"+eps+"'";
        try {
            Statement st = cnx.createStatement();
            ResultSet data = st.executeQuery(query);
            int count = 1;
            while (data.next()) {
                count = data.getInt("count");
            }
            if (count==0) {
                state = true;
            }
        } catch (Exception e) {
            System.out.println("Error en validate EPS");
            System.out.println(e.getMessage());
        }
        return state;
    }
    public void delete(int id) {
        boolean error = true;
        String text ="";
        String query = "delete from EPS where id='"+id+"'";
        try {
            PreparedStatement statement = cnx.prepareStatement(query);
            statement.executeUpdate();
            error = false;
            text =  "EPS retirada correctamente";
        } catch (Exception e) {
            System.out.println("Error en save users:");
            System.out.println(e.getMessage());
            text = "Error al retirar EPS.";
        }
        modal.showModal(error, text);
    }
}
