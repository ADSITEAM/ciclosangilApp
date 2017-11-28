/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class modelNormalized {
    Conexion obj = new Conexion();
    Connection cnx = obj.getConexBD();
    public ResultSet getEPS(){
        String query = "select * from eps order by(nombre)";
        try {
            Statement st = cnx.createStatement();
            return st.executeQuery(query);
        } catch (Exception e) {
            System.out.println("Error en select eps");
            System.out.println(e.getMessage());
            return null;
        }
    }
    public String getEPS(String id){
        String query = "select nombre from eps where id ='"+id+"'";
        try {
            Statement st = cnx.createStatement();
            String eps = "";
            ResultSet data = st.executeQuery(query);
            while (data.next()) {
                eps =data.getString("nombre");
            }
            return eps;
        } catch (Exception e) {
            System.out.println("Error en select eps");
            System.out.println(e.getMessage());
            return null;
        }
    }
    public ResultSet getRH(){
        String query = "select * from RH";
        try {
            Statement st = cnx.createStatement();
            return st.executeQuery(query);
        } catch (Exception e) {
            System.out.println("Error en select RH");
            System.out.println(e.getMessage());
            return null;
        }
    }
    public int getID(String name, String table){
        int id = -1;
        String query ="select id from "+table+" where nombre = '"+name+"'";
        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (Exception e) {
            System.out.println("Error cargar id " + table);
            System.out.println(e.getMessage());
        }
        return id;
    }
}
