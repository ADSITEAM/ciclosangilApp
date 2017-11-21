/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.modelLogin;

/**
 *
 * @author Aprendiz
 */
public class controllerLogin {
    modelLogin model = new modelLogin();
    
    public int validarLogin(String user, String pass){
        return model.validarLogin(user, pass);
    }
    public int getRol(String user){
        return model.getRol(user);
    }
    public String getUser(){
        return model.getUser();
    }
}
