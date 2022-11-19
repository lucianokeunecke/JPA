package br.edu.infnet.orm.modelo.persistencia;

import java.util.List;

public interface IDAO<T> {

	Boolean incluir(T t);

	Boolean alterar(T t);

	Boolean excluir(T t);

	T buscarPeloId(Long id);

	List<T> listarTodos();

}