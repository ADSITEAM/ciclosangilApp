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
 * @author Aprendiz
 */
public class modelCiclistas {

    formMessage modal = new formMessage();
    boolean error = true;
    String text = "";
    Conexion obj = new Conexion();
    Connection cnx = obj.getConexBD();

    String getId(String doc) {
        String id = "";
        String query = "select id from ciclistas where n_documento='" + doc + "'";
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

    public boolean save(Object[] data) {
        boolean state = false;
        String query = "insert into ciclistas (n_documento, tipo_documento, nombres,apellidos,fecha_nacimiento,lugar_nacimiento,colegio,jornada,rh,eps,direccion,email,telefono,nombre_madre,nombre_padre,modalidad,sexo,fecha_inscripcion,estado) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = cnx.prepareStatement(query);
            for (int i = 0; i < data.length; i++) {
                statement.setString(i + 1, data[i].toString());
            }
            int count = statement.executeUpdate();
            error = false;
            text = "<html><center>Deportista: " + data[2].toString() + " " + data[3].toString() + "<br>inscrito correctamente.</center></html>";
            controllerDocs docs = new controllerDocs();
            String doc = data[0].toString();
            docs.generateDoc(getId(doc));
            state = true;
        } catch (Exception e) {
            System.out.println("Error en save ciclistas:");
            System.out.println(e.getMessage());
            text = "Error al inscribir el deportista.";
        }
        modal.showModal(error, text);
        return state;
    }

    public ResultSet selectDoc(String id) {
        String query = "SELECT ciclistas.*, eps.nombre as nombreEPS, rh.nombre as nombreRH FROM ((ciclistas INNER JOIN eps ON eps.id = ciclistas.eps) INNER JOIN rh ON rh.id = ciclistas.rh) where ciclistas.id = '" + id + "'";
        try {
            Statement st = cnx.createStatement();
            return st.executeQuery(query);
        } catch (Exception e) {
            System.out.println("Error en select from docs:");
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void update(Object[] data) {
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
        String query = "update ciclistas set n_documento='" + doc + "',eps='" + eps + "',direccion='" + dir + "',email='" + mail + "',telefono='" + tel + "', jornada='" + jor + "', tipo_documento='" + type + "', nombres='" + nombres + "', apellidos='" + apellidos + "', colegio='" + col + "' where id='" + id + "'";
        try {
            PreparedStatement statement = cnx.prepareStatement(query);
            statement.executeUpdate();
            text = "Actualización Correcta";
            error = false;
            controllerDocs docs = new controllerDocs();
            docs.generateDoc(id);
        } catch (Exception e) {
            text = "Error al actualizar";
            System.out.println("Error en update " + e.getMessage());
        }
        modal.showModal(error, text);
    }

    public void delete(String id) {
        String query = "update ciclistas set estado=0 where id = '" + id + "'";
        try {
            PreparedStatement statement = cnx.prepareStatement(query);
            statement.executeUpdate();
            error = false;
            text = "Ciclista retirado correctamente";
        } catch (Exception e) {
            text = "Error al reitrar ciclista";
        }

        modal.showModal(error, text);
    }

    public ResultSet fillTable() {
        String query = "select n_documento, nombres, apellidos, sexo, fecha_nacimiento from ciclistas where estado=1";
        try {
            Statement st = cnx.createStatement();
            return st.executeQuery(query);
        } catch (Exception e) {
            System.out.println("Error en select from delete:");
            System.out.println(e.getMessage());
            return null;
        }
    }

    public ResultSet selectEdit(String doc) {
        String query = "select * from ciclistas where n_documento='" + doc + "'";
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
