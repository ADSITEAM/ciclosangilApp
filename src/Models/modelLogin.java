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
 * @author Aprendiz
 */
public class modelLogin {
    static String username;
    Conexion obj = new Conexion();
    Connection cnx = obj.getConexBD();

    

    public int validarLogin(String user, String pass) {
        int ContarUsu = 0;
        try {
            String sql = "select Count(username), username from usuarios where username = '" + user + "' and password = '" + pass + "'";
            Statement st = cnx.createStatement();
            ResultSet rsUsu = st.executeQuery(sql);

            while (rsUsu.next()) {
                ContarUsu = rsUsu.getInt(1);
                if(ContarUsu==1){
                    username = rsUsu.getString(2);
                }
            }
            
        } catch (Exception e) {
            System.out.println("Login BD -- validar " + e.getMessage());
        }
        return ContarUsu;
    }
    public int getRol(String user){
        int rol = 0;
        try {
            String sql = "select rol from usuarios where username = '" + user + "'";
            Statement st = cnx.createStatement();
            ResultSet rsUsu = st.executeQuery(sql);

            while (rsUsu.next()) {
                rol = rsUsu.getInt(1);
            }

        } catch (Exception e) {
            System.out.println("Login BD -- get rol " + e.getMessage());
        }
        
        return rol;
    }
    public String getUser(){
        return username;
    }
}
