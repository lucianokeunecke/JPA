package br.edu.infnet.orm.modelo.persistencia;

import java.util.List;

public interface IDAO<T> {

	Boolean incluir(T t);

	void alterar(T t);

	void excluir(T t);

	T buscarPeloId(Long id);

	List<T> listaTodos();

}