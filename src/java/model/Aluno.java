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
public class Aluno extends Usuario{
      
    @Id
    @GeneratedValue
    private Integer id;
    
    public Aluno() {        
        super.addOpcaoMenu(Opcoes.NOTAS);
        super.addOpcaoMenu(Opcoes.CALENDARIO);
        super.addOpcaoMenu(Opcoes.MATRICULA);        
    }          
        
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }
    
}
