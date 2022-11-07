package br.edu.infnet.orm.modelo.persistencia;

import java.util.List;

import br.edu.infnet.orm.modelo.entidade.Cliente;
import jakarta.persistence.EntityManager;

public class ClienteDAO {

	private EntityManager em;
	
	public ClienteDAO() {
		em = JpaUtil.createEntityManager();
	}
	
	public void salvar(Cliente cliente) {
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
	}
	
	
	public void atualizar(Cliente cliente) {
		em.getTransaction().begin();
		em.merge(cliente);
		em.getTransaction().commit();
	}
	
	public void deletar(Cliente cliente) {
		em.getTransaction().begin();
		em.remove(cliente);
		em.getTransaction().commit();
	}
	
	
	public Cliente obter(Long id) {
		return em.find(Cliente.class, id);
	}
	
	
	public List<Cliente> listaTodos(){
		return em.createQuery("select c from Cliente c").getResultList();
	}

	
	
	
	
	
}
