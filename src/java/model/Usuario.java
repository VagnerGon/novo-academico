package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
    
    @Column(name = "nome",unique=true)
    String nome;
    String senha;
    
    @OneToMany(targetEntity = OpcaoMenu.class)
    List<OpcaoMenu> opcoes;
    
    public boolean getVisibilidadeOpcao(OpcaoMenu opcao){
        return true;
    }
    
    protected void addOpcaoMenu(Opcoes opcao){
        this.opcoes.add(new OpcaoMenu(opcao));
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
        
    public List<OpcaoMenu> getOpcoes() {
        return opcoes;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setOpcoes(List<OpcaoMenu> opcoes) {
        this.opcoes = opcoes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}
