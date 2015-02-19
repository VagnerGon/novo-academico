/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author vagner
 */
public class UsuarioDAO {

    private final SessionFactory factory;

    public UsuarioDAO() throws Exception {
        factory = new Configuration().addClass(Usuario.class).buildSessionFactory();

    }

    public void UsInserir(Usuario us) throws Exception {
        Session session = factory.openSession();
        session.save(us);
        session.flush();
        session.close();
    }

    public void UsAlterar(Usuario us) throws Exception {
        Session session = factory.openSession();
        session.update(us);
        session.flush();
        session.close();
    }

    public void UsExcluir(Usuario us) throws Exception {
        Session session = factory.openSession();
        session.delete(us);
        session.flush();
        session.close();
    }

}
