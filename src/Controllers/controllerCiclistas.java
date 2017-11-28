/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.modelCiclistas;
import Models.modelNormalized;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Aprendiz
 */
public class controllerCiclistas {

    modelCiclistas model = new modelCiclistas();
    modelNormalized modelNormalized = new modelNormalized();

    public boolean save(Object[] data) {
         return model.save(data);
    }

    public ResultSet fillTable() {
        return model.fillTable();
    }

    public ResultSet selectEdit(String doc) {
        return model.selectEdit(doc);
    }

    public void update(Object[] data) {
        model.update(data);
    }

    public void delete(String id) {
        model.delete(id);
    }

    public ResultSet getEps() {
        return modelNormalized.getEPS();
    }
    public String getEps(String id) {
        return modelNormalized.getEPS(id);
    }
    public ResultSet getRH() {
        return modelNormalized.getRH();
    }

    public int getID(String name, String tabla) {
        return modelNormalized.getID(name, tabla);
    }
}
