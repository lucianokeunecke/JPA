package br.edu.infnet.orm.model.persistencia;

import br.edu.infnet.orm.modelo.entidade.*;
import br.edu.infnet.orm.modelo.persistencia.*;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class EmpenhoDAOTest {

    private Object retornarUmFornecedorAleatorio() {

        Random gerador = new Random();

        IDAO fornecedorDAO = new FornecedorDAO();

        List<Fornecedor> listaFornecedores = fornecedorDAO.listarTodos();

        return fornecedorDAO.buscarPeloId(listaFornecedores.get(gerador.nextInt(listaFornecedores.size())).getId());
    }

    private Object retornarUmaConcorrenciaAleatoria() {

        Random gerador = new Random();

        IDAO concorrenciaDAO = new ConcorrenciaDAO();

        List<Concorrencia> listaConcorrencias = concorrenciaDAO.listarTodos();

        return concorrenciaDAO.buscarPeloId(listaConcorrencias.get(gerador.nextInt(listaConcorrencias.size())).getId());
    }

    @Test
    public void incluir() {
        IDAO empenhoDAO = new EmpenhoDAO();

        Empenho empenho = new Empenho( 101L, LocalDate.now(), 35000F, (Fornecedor) retornarUmFornecedorAleatorio(), (ProcessoLicitatorio) retornarUmaConcorrenciaAleatoria());

        boolean registroIncluido = empenhoDAO.incluir(empenho);

        Assert.assertTrue(registroIncluido);
    }

    @Test
    public void alterarPrimeiroRegistro() {
        IDAO empenhoDAO = new EmpenhoDAO();

        List<Empenho> listaEmpenhos = empenhoDAO.listarTodos();

        Empenho empenho = new Empenho(listaEmpenhos.get(0).getId(), 121L, LocalDate.now(), 45000F, (Fornecedor) retornarUmFornecedorAleatorio(), (ProcessoLicitatorio) retornarUmaConcorrenciaAleatoria());

        boolean registroAlterado = empenhoDAO.alterar(empenho);

        Assert.assertTrue(registroAlterado);
    }

    @Test
    public void excluirUltimoRegistro() {
        IDAO empenhoDAO = new EmpenhoDAO();

        List<Empenho> listaEmpenhos = empenhoDAO.listarTodos();

        boolean registroExcluido = empenhoDAO.excluir(listaEmpenhos.get(listaEmpenhos.size()-1));;

        Assert.assertTrue(registroExcluido);
    }

}
