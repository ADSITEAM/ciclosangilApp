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
 * @author Aprendiz
 */
public class modelCiclistas {
    String getId(String doc){
        Conexion obj = new Conexion();
        Connection cnx = obj.getConexBD();
        String id ="";
        String query = "select id from ciclistas where n_documento='"+doc+"'";
        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                id = rs.getString("id");
                
            }
        } catch (Exception e) {
            System.out.println("Error en getID:");
            System.out.println(e.getMessage());
        }
        return id;
    }
    public void save(Object[] data){
        Conexion obj = new Conexion();
        Connection cnx = obj.getConexBD();
        String query = "insert into ciclistas (n_documento, tipo_documento, nombres,apellidos,fecha_nacimiento,lugar_nacimiento,colegio,jornada,rh,eps,direccion,email,telefono,nombre_madre,nombre_padre,modalidad,sexo) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = cnx.prepareStatement(query);
            for (int i = 0; i < data.length; i++) {
                statement.setString(i+1, data[i].toString());
            }
            int count = statement.executeUpdate();
            JOptionPane.showMessageDialog(null,"Deportista "+data[2].toString()+" "+data[3].toString()+" inscrito correctamente.");
            controllerDocs docs = new controllerDocs();
            String doc = data[0].toString();
            docs.generateDoc(getId(doc));
        } catch (Exception e) {
            System.out.println("Error en save ciclistas:");
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al inscribir el deportista.");
        }
    }

    public ResultSet selectDoc(String id){
        Conexion obj = new Conexion();
        Connection cnx = obj.getConexBD();
        String query = "SELECT ciclistas.*, eps.nombre as nombreEPS, rh.nombre as nombreRH FROM ((ciclistas INNER JOIN eps ON eps.id = ciclistas.eps) INNER JOIN rh ON rh.id = ciclistas.rh) where ciclistas.id = '"+id+"'";
        try {
            Statement st = cnx.createStatement();
            return st.executeQuery(query);
        } catch (Exception e) {
            System.out.println("Error en select from docs:");
            System.out.println(e.getMessage());
            return null;
        }
    }
    public void update(Object[] data){
        Conexion obj = new Conexion();
        Connection cnx = obj.getConexBD();
        String id = data[0].toString();
        String doc = data[1].toString();
        String type = data[2].toString();
        String nombres = data[3].toString();
        String apellidos = data[4].toString();
        String col = data[5].toString();
        String jor = data[6].toString();
        String mail = data[7].toString();
        String tel = data[8].toString();
        String dir = data[9].toString();
        String eps = data[10].toString();
        String query = "update ciclistas set n_documento='"+doc+"',eps='"+eps+"',direccion='"+dir+"',email='"+mail+"',telefono='"+tel+"', jornada='"+jor+"', tipo_documento='"+type+"', nombres='"+nombres+"', apellidos='"+apellidos+"', colegio='"+col+"' where id='"+id+"'";
        try {
            PreparedStatement statement = cnx.prepareStatement(query);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualización Correcta");
            controllerDocs docs = new controllerDocs();
            docs.generateDoc(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar");
            System.out.println("Error en update " + e.getMessage());
        }
    }
    public void delete(String id){
        Conexion obj = new Conexion();
        Connection cnx = obj.getConexBD();
        String query = "delete from ciclistas where id = '"+id+"'";
        try {
            PreparedStatement statement = cnx.prepareStatement(query);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ciclista retirado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al reitrar ciclista");
        }
        
        
    }
    public ResultSet fillTable(){
        Conexion obj = new Conexion();
        Connection cnx = obj.getConexBD();
        String query = "select n_documento, nombres, apellidos, sexo, fecha_nacimiento from ciclistas";
        try {
            Statement st = cnx.createStatement();
            return st.executeQuery(query);
        } catch (Exception e) {
            System.out.println("Error en select from delete:");
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public ResultSet selectEdit(String doc){
        Conexion obj = new Conexion();
        Connection cnx = obj.getConexBD();
        String query = "select * from ciclistas where n_documento='"+doc+"'";
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
