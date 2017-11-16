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
    
    

    public void save(Object[] data) {
        modelCiclistas model = new modelCiclistas();
        model.save(data);
    }

    public ResultSet fillTable() {
        modelCiclistas model = new modelCiclistas();
        return model.fillTable();
    }
    public ResultSet selectEdit(String doc){
        modelCiclistas model = new modelCiclistas();
        return model.selectEdit(doc);
    }
    public void update(Object[] data) {
        modelCiclistas model = new modelCiclistas();
        model.update(data);
    }
    public void delete(String id){
        modelCiclistas model = new modelCiclistas();
        model.delete(id);
    }
    public ResultSet getEps(){
        modelNormalized model = new modelNormalized();
        return model.getEPS();
    }
    public ResultSet getRH(){
        modelNormalized model = new modelNormalized();
        return model.getRH();
    }
}
