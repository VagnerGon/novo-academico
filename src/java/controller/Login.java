/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import crud.UsuarioCRUD;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import model.Aluno;
import model.Usuario;

/**
 *
 * @author vagner
 */
@ManagedBean(name="login")
@RequestScoped
public class Login {

    private String usuario;
    private String senha;
    
    private Usuario user;
    
    public String logar(){
        
        UsuarioCRUD users = new UsuarioCRUD();
        user = users.buscarLogin(usuario);
        if(user != null){
            if(user.getSenha().equals(senha)){
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", user);
                return "index";
            }
        }        
        if(usuario.equals("aluno")){   
            user = new Aluno();
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", user);
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Login() {
    }
    
}
