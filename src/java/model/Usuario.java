package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vagmer
 */
@Entity
public abstract class Usuario {
    
    @Id
    @GeneratedValue
    private Integer id;    
    
    String nome;
    String senha;
    
    List<Opcoes> opcoes;
    
    public boolean getVisibilidadeOpcao(Opcoes opcao){
        return true;
    }
    
    public Usuario(){
        opcoes = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Opcoes> getOpcoes() {
        return opcoes;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setOpcoes(List<Opcoes> opcoes) {
        this.opcoes = opcoes;
    }
    
}
