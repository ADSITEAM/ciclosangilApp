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

    Conexion obj = new Conexion();
    Connection cnx = obj.getConexBD();

    int ContarUsu;

    public void validarLogin(String usu, String clave) {
        try {
            String sql = "select Count(usuario) from login where usuario = '" + usu + "' and clave = '" + clave + "'";
            Statement st = cnx.createStatement();
            ResultSet rsUsu = st.executeQuery(sql);

            while (rsUsu.next()) {
                ContarUsu = rsUsu.getInt(1);
            }

        } catch (Exception e) {
            System.out.println("Login BD -- validar " + e.getMessage());
        }

    }

    public int getContarUsu() {
        return ContarUsu;
    }

}
