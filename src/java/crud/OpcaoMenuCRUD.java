/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import conexao.HibernateUtil;
import java.util.List;
import model.OpcaoMenu;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author 20102bsi0278
 */
public class OpcaoMenuCRUD {

    /*
     * Método que salva um usuário no banco de dados
     */
    public void salvar(OpcaoMenu opcao) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = null;
        try {
            //abre um sessão com o banco de dados.
            //inicia um transacao
            transacao = sessao.beginTransaction();
            //salva o usuário
            //sessao.persist(opcao);
            sessao.save(opcao);
            //confirma a transacao
            transacao.commit();
        } catch (HibernateException e) {
            //throw new ExceptionInInitializerError("Não foi possível inserir um usuario. Erro": + e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            try {
                //fecha a sessao com o banco de dados
                sessao.close();
            } catch (Throwable e) {
                e.printStackTrace();
                throw new ExceptionInInitializerError("Erro ao fechar a operacao de usuario. Erro: " + e.getMessage());
            }
        }
    }

    public List<OpcaoMenu> listar() {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao;
        Query consulta;
        List<OpcaoMenu> resultado;
        try {
            //Abre uma sessao no banco de dados            
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from OpcaoMenu");
            resultado = consulta.list();    
            transacao.commit();            
            return resultado;
        }catch(HibernateException e){
            return null;
        }finally{
            try{
            sessao.close();
            }catch ( Throwable e){
            }
        }
    }
    
    public OpcaoMenu buscar(int id) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao;
        Query consulta;
        List<OpcaoMenu> resultado;
        
        try {
            //Abre uma sessao no banco de dados            
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from OpcaoMenu where id= :parametro");
            consulta.setInteger("parametro",id);
            
            OpcaoMenu opcaoMenu = (OpcaoMenu) consulta.uniqueResult();
            transacao.commit();
            return opcaoMenu;
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            return null;
        }finally{
            try{
                sessao.close();
            }catch (Throwable e){
                System.out.println(e.getMessage());
            }
        }
    }
}
