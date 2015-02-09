package model;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vagmer
 */
public abstract class Usuario {
    
    String nome;
    List<Opcoes> opcoes;

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

    public void setOpcoes(List<Opcoes> opcoes) {
        this.opcoes = opcoes;
    }
    
}
