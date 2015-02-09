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
public class Aluno extends Usuario{
       
    public Aluno() {        
        super.opcoes.add(Opcoes.NOTAS);
        super.opcoes.add(Opcoes.CALENDARIO);
        super.opcoes.add(Opcoes.MATRICULA);        
    }          
}
