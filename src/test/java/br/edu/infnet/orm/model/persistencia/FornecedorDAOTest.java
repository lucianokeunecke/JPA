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

        List<Fornecedor> listaFornecedores = fornecedorDAO.listarTodos();

        if (listaFornecedores.size() == 0) {
            Fornecedor fornecedor = new Fornecedor("Luciano Keunecke", "031.897.349-92", "Rua Max Weise", 290, "BL 28 AP 31", "Água Verde", 89032280, "Blumenau");
            fornecedorDAO.incluir(fornecedor);

            fornecedor = new Fornecedor("Casa das Tintas", "05.698.650/0001-76", "Rua XV de Novembro", 746, "Sala 530", "Centro", 89035287, "Indaial");
            fornecedorDAO.incluir(fornecedor);

            fornecedor = new Fornecedor("Marcos da Silva", "075.976.954-97", "Rua das Palmeiras", 2465, "Apto 103", "Velha Central", 89074280, "Blumenau");
            fornecedorDAO.incluir(fornecedor);

            fornecedor = new Fornecedor("mercantil cristal ltda", "27.291.881/0001-01", "Rua Ibira", 475, "", "Passo Manso", 75965432, "Jaragua do Sul");
            fornecedorDAO.incluir(fornecedor);

            fornecedor = new Fornecedor("ricardo teixeira de oliveira", "28.291.881/0001-01", "Rua das Flores", 475, "", "Vila Nova", 75965463, "lontras");
            fornecedorDAO.incluir(fornecedor);

            fornecedor = new Fornecedor("Serralheria do Zeca", "29.291.881/0001-01", "Rua das Missoes", 345, "", "Vila Itoupava", 76965432, "Indaial");
            fornecedorDAO.incluir(fornecedor);

            fornecedor = new Fornecedor("jauru empresa jornalistica ltda", "30.291.881/0001-01", "Rua Jose Reuter", 34, "", "Ponto Chick", 69965432, "Gaspar");
            fornecedorDAO.incluir(fornecedor);

            fornecedor = new Fornecedor("roni ivo ratzlaff", "31.291.881/0001-01", "Rua Artur Weise", 87, "", "Santias", 35965432, "Sao Joaquim");
            fornecedorDAO.incluir(fornecedor);

            fornecedor = new Fornecedor("itaipu auto pecas ltda", "32.291.881/0001-01", "Rua Walter Ideker", 234, "", "Badenfurt", 42965432, "Lages");
            fornecedorDAO.incluir(fornecedor);

            fornecedor = new Fornecedor("marlene alves pape", "33.291.881/0001-01", "Rua Bernando", 853, "", "Rio Ferro", 33965432, "Rio do Sul");
            fornecedorDAO.incluir(fornecedor);

            fornecedor = new Fornecedor("tarcila leonida fuchs", "34.291.881/0001-01", "Rua das Ostras", 12, "", "Escola Agricola", 79965432, "Brusque");
            fornecedorDAO.incluir(fornecedor);

            fornecedor = new Fornecedor("arlindo friedrich", "35.291.881/0001-01", "Rua 1º de Janeiro", 53, "", "Floriano", 67965432, "Itajai");
            fornecedorDAO.incluir(fornecedor);

            fornecedor = new Fornecedor("blavel  blaut veiculos ltda", "36.291.881/0001-01", "Rua Onze de Outro", 1050, "", "Verde Vale", 15935432, "Florianopolis");
            fornecedorDAO.incluir(fornecedor);

            fornecedor = new Fornecedor("sertemaq-serv.assist.tec.maq.ltda", "37.291.881/0001-01", "Centro", 3563, "", "Ponta Aguda", 25965432, "Sao Bendo do sul");
            fornecedorDAO.incluir(fornecedor);

        }
    }

    @Test
    public void incluir() {
        IDAO fornecedorDAO = new FornecedorDAO();

        Fornecedor fornecedor = new Fornecedor("Maquinas Omil", "35.417.536/0001-91", "Rua Dr Getulio Vargas", 3563, "", "Bela Vista", 89140000, "Ibirama");

        boolean registroIncluido = fornecedorDAO.incluir(fornecedor);

        Assert.assertTrue(registroIncluido);
    }

    @Test
    public void alterarPrimeiroRegistro() {
        IDAO fornecedorDAO = new FornecedorDAO();

        List<Fornecedor> listaFornecedores = fornecedorDAO.listarTodos();

        Fornecedor fornecedor = new Fornecedor( listaFornecedores.get(0).getId(), "Teste Alteração do Fornecedor", "13.219.981/0001-04", "Teste Alteracao do Endereco", 1234, "Teste Alteracao Complemento", "Teste Alteracao Bairro", 12345678, "Teste Alteracao da Cidade");

        boolean registroAlterado = fornecedorDAO.alterar(fornecedor);

        Assert.assertTrue(registroAlterado);
    }

    @Test
    public void excluirUltimoRegistro() {
        IDAO fornecedorDAO = new FornecedorDAO();

        List<Fornecedor> listaFornecedores = fornecedorDAO.listarTodos();

        boolean registroExcluido = fornecedorDAO.excluir(listaFornecedores.get(listaFornecedores.size()-1));;

        Assert.assertTrue(registroExcluido);
    }

    @Test
    public void listarTodosFornecedores() {
        IDAO fornecedorDAO = new FornecedorDAO();

        List<Fornecedor> listaFornecedores = fornecedorDAO.listarTodos();

        listaFornecedores.forEach(fornecedores -> System.out.println(fornecedores));

        Assert.assertTrue(listaFornecedores.size() > 0);
    }

    @Test
    public void listarPrimeiroFornecedor() {
        IDAO fornecedorDAO = new FornecedorDAO();

        List<Fornecedor> listaFornecedores = fornecedorDAO.listarTodos();

        Object fornecedor = fornecedorDAO.buscarPeloId(listaFornecedores.get(0).getId());

        System.out.println(fornecedor);

        Assert.assertNotNull(fornecedor);
    }

}
