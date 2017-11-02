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
 * @author Aprendiz
 */
public class modelCiclistas {
    public void save(Object[] data){
        Conexion obj = new Conexion();
        Connection cnx = obj.getConexBD();
        String query = "insert into ciclistas (n_documento, tipo_documento, nombres,apellidos,fecha_nacimiento,lugar_nacimiento,colegio,jornada,rh,eps,direccion,email,telefono,nombre_madre,nombre_padre,modalidad) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = cnx.prepareStatement(query);
            for (int i = 0; i < data.length; i++) {
                statement.setString(i+1, data[i].toString());
            }
            int count = statement.executeUpdate();
            JOptionPane.showMessageDialog(null,"Deportista "+data[2].toString()+" "+data[3].toString()+" inscrito correctamente.");
        } catch (Exception e) {
            System.out.println("Error en save ciclistas:");
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al inscribir el deportista.");
        }
    }
    public ResultSet selectDelete(){
        Conexion obj = new Conexion();
        Connection cnx = obj.getConexBD();
        String query = "select id, n_documento, nombres, apellidos,fecha_nacimiento from ciclistas";
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
