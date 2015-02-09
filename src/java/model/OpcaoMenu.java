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
public class OpcaoMenu {
    
    private String url;
    private String nome;
    private String imagem;
    private String alt;

    public OpcaoMenu(String url, String nome, String imagem, String alt) {
        this.url = url;
        this.nome = nome;
        this.imagem = imagem;
        this.alt = alt;
    }
    
    public OpcaoMenu(Opcoes tipo){
        this.url = tipo.url;
        this.nome = tipo.nome;
        this.imagem = tipo.imagem;
        this.alt = tipo.alt;
    }

    public OpcaoMenu() {
    }        
        
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }
    
}
