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

    public Object[] selectDelete() {
        modelCiclistas model = new modelCiclistas();
        ResultSet rs = model.show();
        String[] categorias = {};
        int i = 0;
        try {
            while (rs.next()) {
                i++;
            }
            categorias = new String[i];
            i = 0;
            while (rs.next()) {
                categorias[i] = getCategoria(rs.getString("fecha_nacimiento"));
                i++;
            }
        } catch (Exception e) {
            System.out.println("error recorriendo Array " + e.getMessage());
        }
        Object[] data = {rs, categorias};
        return data;
    }

    public String getCategoria(String fechaNacimiento) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        String cat = "";
        try {
            Date fechaNac = format.parse(fechaNacimiento);
            Calendar today = Calendar.getInstance();
            today.set(Calendar.HOUR_OF_DAY, 0);
            int yearNow = today.getInstance().get(Calendar.YEAR);
            int yearNac = fechaNac.getYear() + 1900;
            int age = yearNow-yearNac;
            if (age > 23) {
                cat = "Elite";
            }else if (age >= 19 && age <= 23) {
                cat = "Sub23";
            }else if (age >= 17 && age <= 18) {
                cat = "Juvenil";
            }else if(age >= 15 && age <= 16){
                cat = "PreJuvenil";
            }else if(age >= 13 && age <= 14){
                cat = "Infantil";
            }else if(age >= 11 && age <= 12){
                cat = "PreInfantil";
            }else if(age >= 9 && age <= 10){
                cat = "Principiante";
            }else if(age >= 7 && age <= 8){
                cat = "Pitufo";
            }else if(age >= 5 && age <= 6){
                cat = "Retoñito";
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return cat;
    }
}
