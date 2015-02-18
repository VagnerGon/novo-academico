/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conexao;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author 20102bsi0278
 */
public class HibernateUtil {

    //objeto que fabrica uma ou mais instância de sessões de acesso ao banco a partir das configurações do objeto serviceRegistry

    private static final SessionFactory sessionFactory;
    
    //objeto responsável pela configurações do hibernate.cfg.xml
    private static ServiceRegistry serviceRegistry;

    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml)  
            // config file.
            //sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            
            Configuration configuration = new Configuration();

             //método que lê e valida as configurações em hibernate.cfg.xml
             configuration.configure();

             //aplica e carrega as configurações no objeto serviceRegistry
             serviceRegistry = new
            ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();

             /*cria uma ou mais instâncias de sessão da configuração. Geralmente uma aplicação tem uma única instância de sessão e threads servindo pedidos de clientes
            obtendo instâncias da sessão do factory (fábrica)*/
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            
        } catch (Throwable ex) {
            // Log the exception. 
            ex.printStackTrace();
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
