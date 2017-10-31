/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.modelCiclistas;

/**
 *
 * @author Aprendiz
 */
public class controllerCiclistas {
    public void save(Object [] data){
        modelCiclistas model = new modelCiclistas();
        model.save(data);
    }
}
