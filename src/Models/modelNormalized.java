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
    public ResultSet getEPS(){
        Conexion obj = new Conexion();
        Connection cnx = obj.getConexBD();
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
    public ResultSet getRH(){
        Conexion obj = new Conexion();
        Connection cnx = obj.getConexBD();
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
    
}
