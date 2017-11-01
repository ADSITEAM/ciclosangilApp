/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.modelCiclistas;
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

    public ResultSet selectDelete() {
        modelCiclistas model = new modelCiclistas();
        return model.selectDelete();
    }

    
}
