package br.edu.infnet.orm.model.persistencia;

import br.edu.infnet.orm.modelo.entidade.Fornecedor;
import br.edu.infnet.orm.modelo.persistencia.FornecedorDAO;
import br.edu.infnet.orm.modelo.persistencia.IDAO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FornecedorDAOTest {

    @Before
    public void inicializar() {
        IDAO fornecedorDAO = new FornecedorDAO();

        Fornecedor fornecedor = new Fornecedor("Luciano Keunecke", "031.897.349-92", "Rua Max Weise", 290, "BL 28 AP 31", "Água Verde", 89032280, "Blumenau");
        fornecedorDAO.salvar(fornecedor);

        fornecedor = new Fornecedor("Casa das Tintas", "05.698.650/0001-76", "Rua XV de Novembro", 746, "Sala 530", "Centro", 89035287, "Indaial");
        fornecedorDAO.salvar(fornecedor);

        fornecedor = new Fornecedor("Marcos da Silva", "075.976.954-97", "Rua das Palmeiras", 2465, "Apto 103", "Velha Central", 89074280, "Blumenau");
        fornecedorDAO.salvar(fornecedor);

        fornecedor = new Fornecedor("Serralheria do Zeca", "27.291.881/0001-01", "Rua Joinville", 475, "", "Passo Manso", 75965432, "Jaragua do Sul");
        fornecedorDAO.salvar(fornecedor);
    }

    @Test
    public void testIncluir() {
        IDAO fornecedorDAO = new FornecedorDAO();
        Fornecedor fornecedor = new Fornecedor("Maquinas Omil", "35.417.536/0001-91", "Rua Dr Getulio Vargas", 3563, "", "Bela Vista", 89140000, "Ibirama");

        fornecedorDAO.salvar(fornecedor);

        boolean validacao = true;
        Assert.assertTrue(validacao);
    }

}
