package br.edu.infnet.orm.model.persistencia;

import br.edu.infnet.orm.modelo.entidade.*;
import br.edu.infnet.orm.modelo.persistencia.*;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class EmpenhoDAOTest {

    private Object retornarFornecedor(int indice) {

        IDAO fornecedorDAO = new FornecedorDAO();

        List<Fornecedor> listaFornecedores = fornecedorDAO.listarTodos();

        return fornecedorDAO.buscarPeloId(listaFornecedores.get(indice).getId());
    }

    private Object retornarConcorrencia(int indice) {

        IDAO concorrenciaDAO = new ConcorrenciaDAO();

        List<Concorrencia> listaConcorrencias = concorrenciaDAO.listarTodos();

        return concorrenciaDAO.buscarPeloId(listaConcorrencias.get(indice).getId());
    }

    @Test
    public void incluir() {
        IDAO empenhoDAO = new EmpenhoDAO();

        Empenho empenho = new Empenho( 101L, LocalDate.now(), 35000F, (Fornecedor) retornarFornecedor(1), (ProcessoLicitatorio) retornarConcorrencia(1));

        boolean registroIncluido = empenhoDAO.incluir(empenho);

        Assert.assertTrue(registroIncluido);
    }

    @Test
    public void alterarPrimeiroRegistro() {
        IDAO empenhoDAO = new EmpenhoDAO();

        List<Empenho> listaEmpenhos = empenhoDAO.listarTodos();

        Empenho empenho = new Empenho(listaEmpenhos.get(0).getId(), 121L, LocalDate.now(), 45000F, (Fornecedor) retornarFornecedor(2), (ProcessoLicitatorio) retornarConcorrencia(3));

        boolean registroAlterado = empenhoDAO.alterar(empenho);

        Assert.assertTrue(registroAlterado);
    }

}
