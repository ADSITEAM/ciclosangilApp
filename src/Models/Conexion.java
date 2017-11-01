/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Aprendiz
 */
public class Conexion {
      Connection conexBD = null;

    public Connection getConexBD() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexBD = DriverManager.getConnection("jdbc:mysql://localhost/ciclosangil", "root", "");

        } catch (Exception e) {
            System.out.println("Error.conexion" + e.getMessage());
        }
        return conexBD;

    }
}
