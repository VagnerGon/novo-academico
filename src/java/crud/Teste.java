/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crud;

import model.OpcaoMenu;

/**
 *
 * @author 20102bsi0278
 */
public class Teste {
    public static void main(String[] args) {
        OpcaoMenu opcao = new OpcaoMenu("", "Teste", "add", "afad");
        OpcaoMenuCRUD omcrud = new OpcaoMenuCRUD();
        omcrud.salvar(opcao);
    }
}
