package br.edu.infnet.orm.model.persistencia;

import br.edu.infnet.orm.modelo.entidade.Concorrencia;
import br.edu.infnet.orm.modelo.entidade.TomadaPreco;
import br.edu.infnet.orm.modelo.persistencia.ConcorrenciaDAO;
import br.edu.infnet.orm.modelo.persistencia.IDAO;
import br.edu.infnet.orm.modelo.persistencia.TomadaPrecoDAO;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class TomadaPrecoTest {

    @Test
    public void testIncluir() {
        IDAO tomadaPrecoDAO = new TomadaPrecoDAO();

        TomadaPreco tomadaPreco = new TomadaPreco(305, LocalDate.now(), "Aquisição de óleo lubrificante e filtro para substituição nos veículos e máquinas da frota do Município.", 75000, true, "20/40/60 dias", 110000);

        boolean registroIncluido = tomadaPrecoDAO.incluir(tomadaPreco);

        Assert.assertTrue(registroIncluido);
    }

    @Test
    public void alterarPrimeiroRegistro() {
        IDAO tomadaPrecoDAO = new TomadaPrecoDAO();

        List<TomadaPreco> listaTomadasPrecos = tomadaPrecoDAO.listarTodos();

        TomadaPreco tomadaPreco = new TomadaPreco( listaTomadasPrecos.get(0).getId(),306, LocalDate.now(), "Alteração - Aquisição de óleo lubrificante e filtro para substituição nos veículos e máquinas da frota do Município.", 79500, false, "25/45/65 dias", 120000);

        boolean registroAlterado = tomadaPrecoDAO.alterar(tomadaPreco);

        Assert.assertTrue(registroAlterado);
    }

}
