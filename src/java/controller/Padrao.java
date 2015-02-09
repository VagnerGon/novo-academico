/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.faces.application.FacesMessage;
import model.Aluno;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import model.Usuario;

/**
 *
 * @author Vagmer
 */
@ManagedBean(name="padrao")
@RequestScoped
public class Padrao {    
    
    private String user_name;
    
    public Padrao() {
        Usuario aluno = new Aluno();
        aluno.setNome("Gernivaldo");        
        user_name = aluno.getNome();
    }    
    
    public void logout() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("login.xhtml");
    }
    
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
