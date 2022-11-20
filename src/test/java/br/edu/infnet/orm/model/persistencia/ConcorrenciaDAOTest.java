package br.edu.infnet.orm.model.persistencia;

import br.edu.infnet.orm.modelo.entidade.Concorrencia;
import br.edu.infnet.orm.modelo.persistencia.ConcorrenciaDAO;
import br.edu.infnet.orm.modelo.persistencia.IDAO;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class ConcorrenciaDAOTest {

    @Test
    public void testIncluir() {
        IDAO concorrenciaDAO = new ConcorrenciaDAO();

        Concorrencia concorrencia = new Concorrencia(103, LocalDate.now(), "Descrição do Objeto da Licitação", 150000, true, "15/30/45 dias", 750000);

        boolean registroIncluido = concorrenciaDAO.incluir(concorrencia);

        Assert.assertTrue(registroIncluido);
    }
}
