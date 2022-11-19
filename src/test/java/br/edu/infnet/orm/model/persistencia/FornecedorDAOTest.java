package br.edu.infnet.orm.model.persistencia;

import br.edu.infnet.orm.modelo.entidade.Fornecedor;
import br.edu.infnet.orm.modelo.persistencia.FornecedorDAO;
import br.edu.infnet.orm.modelo.persistencia.IDAO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FornecedorDAOTest {

    @Before
    public void inicializar() {
        IDAO fornecedorDAO = new FornecedorDAO();

        Fornecedor fornecedor = new Fornecedor("Luciano Keunecke", "031.897.349-92", "Rua Max Weise", 290, "BL 28 AP 31", "Água Verde", 89032280, "Blumenau");
        fornecedorDAO.incluir(fornecedor);

        fornecedor = new Fornecedor("Casa das Tintas", "05.698.650/0001-76", "Rua XV de Novembro", 746, "Sala 530", "Centro", 89035287, "Indaial");
        fornecedorDAO.incluir(fornecedor);

        fornecedor = new Fornecedor("Marcos da Silva", "075.976.954-97", "Rua das Palmeiras", 2465, "Apto 103", "Velha Central", 89074280, "Blumenau");
        fornecedorDAO.incluir(fornecedor);

        fornecedor = new Fornecedor("Serralheria do Zeca", "27.291.881/0001-01", "Rua Joinville", 475, "", "Passo Manso", 75965432, "Jaragua do Sul");
        fornecedorDAO.incluir(fornecedor);
    }

    @Test
    public void testIncluir() {
        IDAO fornecedorDAO = new FornecedorDAO();

        Fornecedor fornecedor = new Fornecedor("Maquinas Omil", "35.417.536/0001-91", "Rua Dr Getulio Vargas", 3563, "", "Bela Vista", 89140000, "Ibirama");

        boolean registroIncluido = fornecedorDAO.incluir(fornecedor);

        Assert.assertTrue(registroIncluido);
    }

    @Test
    public void testAlterarPrimeiroRegistro() {
        IDAO fornecedorDAO = new FornecedorDAO();

        List<Fornecedor> listaFornecedores = fornecedorDAO.listarTodos();

        Fornecedor fornecedor = new Fornecedor( listaFornecedores.get(0).getId(), "Teste Alteração do Fornecedor", "13.219.981/0001-04", "Teste Alteracao do Endereco", 1234, "Teste Alteracao Complemento", "Teste Alteracao Bairro", 12345678, "Teste Alteracao da Cidade");

        boolean registroAlterado = fornecedorDAO.alterar(fornecedor);

        Assert.assertTrue(registroAlterado);
    }

    @Test
    public void testExcluirUltimoRegistro() {
        IDAO fornecedorDAO = new FornecedorDAO();

        List<Fornecedor> listaFornecedores = fornecedorDAO.listarTodos();

        boolean registroExcluido = fornecedorDAO.excluir(listaFornecedores.get(listaFornecedores.size()-1));;

        Assert.assertTrue(registroExcluido);
    }

    @Test
    public void testListarTodosFornecedores() {
        IDAO fornecedorDAO = new FornecedorDAO();

        List<Fornecedor> listaFornecedores = fornecedorDAO.listarTodos();

        listaFornecedores.forEach(fornecedores -> System.out.println(fornecedores));

        Assert.assertTrue(listaFornecedores.size() > 0);
    }

    @Test
    public void testListarPrimeiroFornecedor() {
        IDAO fornecedorDAO = new FornecedorDAO();

        List<Fornecedor> listaFornecedores = fornecedorDAO.listarTodos();

        Object fornecedor = fornecedorDAO.buscarPeloId(listaFornecedores.get(0).getId());

        System.out.println(fornecedor);

        Assert.assertNotNull(fornecedor);
    }

}
