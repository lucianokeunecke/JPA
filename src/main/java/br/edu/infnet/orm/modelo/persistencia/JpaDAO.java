package br.edu.infnet.orm.modelo.persistencia;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import jakarta.persistence.EntityManager;

public abstract class JpaDAO<T>  implements IDAO<T>{

	protected EntityManager em;
	
	private Class<T> entityClass;

	public JpaDAO() {
		ParameterizedType generic = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = (Class<T>) generic.getActualTypeArguments()[0];
		em = JpaUtil.createEntityManager();
	}

	@Override
	public Boolean incluir(T t) {
		try {
			em.getTransaction().begin();
			em.persist(t);
			em.getTransaction().commit();

			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Boolean alterar(T t) {
		try {
			em.getTransaction().begin();
			em.merge(t);
			em.getTransaction().commit();

			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Boolean excluir(T t) {
		try {
			em.getTransaction().begin();
			em.remove(t);
			em.getTransaction().commit();

			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public T buscarPeloId(Long id) {
		return em.find(entityClass, id);
	}

	@Override
	public List<T> listarTodos() {
		return em.createQuery("from " + entityClass.getName()).getResultList();
	}

}