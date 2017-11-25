/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Controllers.controllerDocs;
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
public class modelUsers {

    Conexion obj = new Conexion();
    formMessage modal = new formMessage();
    Connection cnx = obj.getConexBD();

    public void save(Object[] data) {
        String text ="";
        boolean error = true;
        String query = "insert into usuarios values (?,?,?)";
        try {
            PreparedStatement statement = cnx.prepareStatement(query);
            for (int i = 0; i < data.length; i++) {
                statement.setString(i + 1, data[i].toString());
            }
            statement.executeUpdate();
            error = false;
            text = "<html><center>Usuario " + data[0].toString() + "<br>creado correctamente.</center></html>";
        } catch (Exception e) {
            System.out.println("Error en save users:");
            System.out.println(e.getMessage());
            text = "Error al registrar usuarios.";
        }
        modal.showModal(error, text);
    }
    public void update(String[] data) {
        String text ="";
        boolean error = true;
        String query = "update usuarios set username='"+data[0]+"', password='"+data[1]+"' where username='"+data[2]+"'";
        try {
            PreparedStatement statement = cnx.prepareStatement(query);
            statement.executeUpdate();
            error = false;
            text = "<html><center>Usuario " + data[0] + "<br>actualizado correctamente.</center></html>";
        } catch (Exception e) {
            System.out.println("Error en save users:");
            System.out.println(e.getMessage());
            text = "Error al registrar usuarios.";
        }
        modal.showModal(error, text);
    }
    public void delete(String user){
        boolean error = true;
        String text ="";
        String query = "delete from usuarios where username='"+user+"'";
        try {
            PreparedStatement statement = cnx.prepareStatement(query);
            statement.executeUpdate();
            error = false;
            text = "<html><center>Usuaraio " + user + "<br>eliminado correctamente</center></html>";
        } catch (Exception e) {
            System.out.println("Error en delete user");
            System.out.println(e.getMessage());
            text = "Error al eliminar usuario "+ user;
        }
        modal.showModal(error, text);
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
    public ResultSet selectUsers(){
        String query = "select username from usuarios where rol='0'";
        try {
            Statement st = cnx.createStatement();
            return st.executeQuery(query);
        } catch (Exception e) {
            System.out.println("Error en select from delete:");
            System.out.println(e.getMessage());
            return null;
        }
    }
}