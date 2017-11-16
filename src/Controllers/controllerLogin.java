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
    String Usuario, Clave;
    modelLogin objBD_Login = new modelLogin();
    
    
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }
    public void validarLogin(){
        objBD_Login.validarLogin(Usuario, Clave);
    }
    
    public int ContarUsu(){
        int ContarUsu = objBD_Login.getContarUsu();
        return ContarUsu;
    }
    //
}
