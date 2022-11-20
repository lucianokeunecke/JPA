package br.edu.infnet.orm.model.persistencia;

import br.edu.infnet.orm.modelo.entidade.Fornecedor;
import br.edu.infnet.orm.modelo.entidade.Produto;
import br.edu.infnet.orm.modelo.persistencia.FornecedorDAO;
import br.edu.infnet.orm.modelo.persistencia.IDAO;
import br.edu.infnet.orm.modelo.persistencia.ProdutoDAO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ProdutoDAOTest {

    @Before
    public void inicializar() {
        IDAO produtoDAO = new ProdutoDAO();

        List<Produto> listaProdutos = produtoDAO.listarTodos();

        if (listaProdutos.size() == -1) {
            Produto produto = new Produto( 45L, "cloridrato de tramal 50mg, ampola de 1ml", 15.6F);
            produtoDAO.incluir(produto);

            produto = new Produto( 75L, "cola para madeira 100g", 33.45F);
            produtoDAO.incluir(produto);

            produto = new Produto( 125L, "escada de fibra de vidro 7 degraus ", 96.15F);
            produtoDAO.incluir(produto);

            produto = new Produto( 137L, "escova de lavar roupa, formato anatômico, base com medidas mínimas de 11x6 cm, corpo (base) em plás", 34.5F);
            produtoDAO.incluir(produto);

            produto = new Produto( 425L, "espátula de inox para resina.", 9.99F);
            produtoDAO.incluir(produto);
        }
    }

    @Test
    public void incluir() {
        IDAO produtoDAO = new ProdutoDAO();

        Produto produto = new Produto( 11L, "tubo com flanges  pn 25 - l= 5,10 m - dn 300 mm", 15);

        boolean registroIncluido = produtoDAO.incluir(produto);

        Assert.assertTrue(registroIncluido);
    }

    @Test
    public void alterarPrimeiroRegistro() {
        IDAO produtoDAO = new ProdutoDAO();

        List<Produto> listaProdutos = produtoDAO.listarTodos();

        Produto produto = new Produto( listaProdutos.get(0).getId(),  22L, "Alteração - tubo com flanges  pn 25 - l= 5,10 m - dn 300 mm", 16.99F);

        boolean registroAlterado = produtoDAO.alterar(produto);

        Assert.assertTrue(registroAlterado);
    }

    @Test
    public void excluirUltimoRegistro() {
        IDAO produtoDAO = new ProdutoDAO();

        List<Produto> listaProdutos = produtoDAO.listarTodos();

        boolean registroExcluido = produtoDAO.excluir(listaProdutos.get(listaProdutos.size()-1));;

        Assert.assertTrue(registroExcluido);
    }

}
