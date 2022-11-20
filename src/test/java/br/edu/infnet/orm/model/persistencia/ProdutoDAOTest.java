package br.edu.infnet.orm.model.persistencia;

import br.edu.infnet.orm.modelo.entidade.Produto;
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

        if (listaProdutos.size() == 0) {
            Produto produto = new Produto( 1L, "cloridrato de tramal 50mg, ampola de 1ml", 15.6F);
            produtoDAO.incluir(produto);

            produto = new Produto( 5L, "cola para madeira 100g", 33.45F);
            produtoDAO.incluir(produto);

            produto = new Produto( 12L, "escada de fibra de vidro 7 degraus ", 96.15F);
            produtoDAO.incluir(produto);

            produto = new Produto( 15L, "escova de lavar roupa, formato anatômico, base com medidas mínimas de 11x6 cm, corpo (base) em plás", 34.5F);
            produtoDAO.incluir(produto);

            produto = new Produto( 26L, "espátula de inox para resina.", 9.99F);
            produtoDAO.incluir(produto);

            produto = new Produto( 31L, "espatula para manicure.", 1.6F);
            produtoDAO.incluir(produto);

            produto = new Produto( 33L, "espátula para resina composta.", 3.35F);
            produtoDAO.incluir(produto);

            produto = new Produto( 37L, "faca para lamina de cortador.", 6.36F);
            produtoDAO.incluir(produto);

            produto = new Produto( 39L, "extrato de tomate concentrado, embalagem com no mínimo 300g.", 12.3F);
            produtoDAO.incluir(produto);

            produto = new Produto( 41L, "extintor de incendio 5 anos, 02 kg.", 9.99F);
            produtoDAO.incluir(produto);

            produto = new Produto( 43L, "extensor elástico 2mt", 1.6F);
            produtoDAO.incluir(produto);

            produto = new Produto( 48L, "execução de passeio (calçada) em concreto (cimento/areia/seixorolado), praparo mecanico, espessura 7", 3.35F);
            produtoDAO.incluir(produto);

            produto = new Produto( 57L, "etinilestradiol 0,03mg + levonogestrel 0,15mg", 6.36F);
            produtoDAO.incluir(produto);

            produto = new Produto( 61L, "estetoscópio infantil simples.", 12.3F);
            produtoDAO.incluir(produto);

            produto = new Produto( 67L, "estante para arquivo, em madeira, nas medidas 2,70x0,36x3,10m.", 9.99F);
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

    @Test
    public void listarTodosProdutos() {
        IDAO produtoDAO = new ProdutoDAO();

        List<Produto> listaProdutos = produtoDAO.listarTodos();

        listaProdutos.forEach(produtos -> System.out.println(produtos));

        Assert.assertTrue(listaProdutos.size() > 0);
    }

    @Test
    public void listarPrimeiroProduto() {
        IDAO produtoDAO = new ProdutoDAO();

        List<Produto> listaProdutos = produtoDAO.listarTodos();

        Object produto = produtoDAO.buscarPeloId(listaProdutos.get(0).getId());

        System.out.println(produto);

        Assert.assertNotNull(produto);
    }

}
