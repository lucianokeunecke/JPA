package br.edu.infnet.orm.model.persistencia;

import br.edu.infnet.orm.modelo.entidade.Concorrencia;
import br.edu.infnet.orm.modelo.entidade.TomadaPreco;
import br.edu.infnet.orm.modelo.persistencia.ConcorrenciaDAO;
import br.edu.infnet.orm.modelo.persistencia.IDAO;
import br.edu.infnet.orm.modelo.persistencia.TomadaPrecoDAO;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class TomadaPrecoTest {

    @Test
    public void testIncluir() {
        IDAO tomadaPrecoDAO = new TomadaPrecoDAO();

        TomadaPreco tomadaPreco = new TomadaPreco(305, LocalDate.now(), "Aquisição de óleo lubrificante e filtro para substituição nos veículos e máquinas da frota do Município.", 75000, true, "20/40/60 dias", 110000);

        boolean registroIncluido = tomadaPrecoDAO.incluir(tomadaPreco);

        Assert.assertTrue(registroIncluido);
    }

}
