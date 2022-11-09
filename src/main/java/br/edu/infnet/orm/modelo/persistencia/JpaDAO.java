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
	public void salvar(T t) {
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
	}

	@Override
	public void atualizar(T t) {
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
	}

	@Override
	public void deletar(T t) {
		em.getTransaction().begin();
		em.remove(t);
		em.getTransaction().commit();
	}

	@Override
	public T obter(Long id) {
		return em.find(entityClass, id);
	}

	@Override
	public List<T> listaTodos() {
		return em.createQuery("from " + entityClass.getName()).getResultList();
	}

}