/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import model.OpcaoMenu;
import model.Opcoes;
import model.Usuario;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Vagmer
 */
@ManagedBean(name="home")
@RequestScoped
public class Home {

    private List<OpcaoMenu> opcoes;
    private List<OpcaoMenu> opcoesOcultas;
    /**
     * Creates a new instance of Home
     */
    public Home() throws IOException {
        
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("user");
        if(usuario == null){
            FacesContext contexto = FacesContext.getCurrentInstance();
            contexto.getExternalContext().redirect("login.xhtml");
            contexto.addMessage("error_login", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Você precisa estar logado para acessar esta área", "Acesso negado"));                       
        }
        opcoes = new ArrayList<>();
        for(Opcoes opcao : usuario.getOpcoes()){   
            
            OpcaoMenu opcaoMenu = new OpcaoMenu(opcao);
            
            if(usuario.getVisibilidadeOpcao(opcao))
                opcoes.add(opcaoMenu);
            else
                opcoesOcultas.add(opcaoMenu);            
        }
    }
        
    public void adicionarElemento(){
        RequestContext.getCurrentInstance().openDialog("adicionarCarro");
    }

    public List<OpcaoMenu> getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(List<OpcaoMenu> opcoes) {
        this.opcoes = opcoes;
    }

    public List<OpcaoMenu> getOpcoesOcultas() {
        return opcoesOcultas;
    }

    public void setOpcoesOcultas(List<OpcaoMenu> opcoesOcultas) {
        this.opcoesOcultas = opcoesOcultas;
    }
        
}
