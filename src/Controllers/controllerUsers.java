/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.modelUsers;

/**
 *
 * @author user
 */
public class controllerUsers {
    modelUsers model = new modelUsers();
    public boolean validateUser(String User){
        return model.validateUser(User);
    }
    public void save(Object[] data){
        model.save(data);
    }
}
