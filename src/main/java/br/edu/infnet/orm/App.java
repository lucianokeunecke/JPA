package br.edu.infnet.orm;

import br.edu.infnet.orm.modelo.entidade.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	em.getTransaction().begin();
    	Cliente cliente = new Cliente("jose dos santos");
    	em.persist(cliente);
    	em.getTransaction().commit();
    	
    }
}
