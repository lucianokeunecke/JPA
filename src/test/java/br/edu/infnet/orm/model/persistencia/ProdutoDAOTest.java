package br.edu.infnet.orm.model.persistencia;

import br.edu.infnet.orm.modelo.entidade.Produto;
import br.edu.infnet.orm.modelo.persistencia.IDAO;
import br.edu.infnet.orm.modelo.persistencia.ProdutoDAO;
import org.junit.Assert;
import org.junit.Test;

public class ProdutoDAOTest {

    @Test
    public void incluir() {
        IDAO produtoDAO = new ProdutoDAO();

        Produto produto = new Produto( 11L, "tubo com flanges  pn 25 - l= 5,10 m - dn 300 mm", 15);

        boolean registroIncluido = produtoDAO.incluir(produto);

        Assert.assertTrue(registroIncluido);
    }


}
