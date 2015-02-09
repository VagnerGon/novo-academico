/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Vagmer
 */
public enum Opcoes {
    
    DIARIO("diario.xhtml","Diário","boletim.png","Diário"),
    CALENDARIO("calendario.html","Calendário","calendario.png","Calendário"),
    MATRICULA("index.xhtml","Matrícula","matricula.png","Diário"),
    NOTAS("notas.xhtml","Notas","notas.png","Notas");
    
    public final String url;
    public final String nome;
    public final String imagem;
    public final String alt;    

    private Opcoes(String url, String nome, String imagem, String alt) {
        this.url = url;
        this.nome = nome;
        this.imagem = imagem;
        this.alt = alt;
    }   
}
