/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author vagner
 */
@ManagedBean(name="login")
@RequestScoped
public class Login {

    private String usuario;
    
    public String logar(){
        
        if(usuario.equals("teste")){
            return "index";
        }
        
        FacesContext contexto = FacesContext.getCurrentInstance();
        contexto.addMessage("error_login", new FacesMessage(FacesMessage.SEVERITY_ERROR, "usuário ou senha inválidos", "erro de logon"));        
        return null;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public Login() {
    }
    
}