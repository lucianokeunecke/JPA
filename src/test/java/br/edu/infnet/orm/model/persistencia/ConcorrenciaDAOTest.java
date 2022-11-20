package br.edu.infnet.orm.model.persistencia;

import br.edu.infnet.orm.modelo.entidade.Concorrencia;
import br.edu.infnet.orm.modelo.persistencia.ConcorrenciaDAO;
import br.edu.infnet.orm.modelo.persistencia.IDAO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class ConcorrenciaDAOTest {

    @Before
    public void inicializar() {
        IDAO concorrenciaDAO = new ConcorrenciaDAO();

        Concorrencia concorrencia = new Concorrencia(103, LocalDate.now(), "Aquisição de peças/serviços para manutenção na máquina Escavadeira Hidráulca Caterpillar 312CL, utilizada nos serviços da Secretaria Municipal de Obras e Servilços Públicos.", 150000, true, "15/30/45 dias", 500000);
        concorrenciaDAO.incluir(concorrencia);

        concorrencia = new Concorrencia(115, LocalDate.now(), "Aquisição de Pneus para reposição no equipamento rodoviário Pá Carregadeira Michegan N°. 03, utilizado nos serviços da Secretaria Municipal de Obras e Serviços Públicos. ", 175000, false, "30/60/90 dias", 157000);
        concorrenciaDAO.incluir(concorrencia);

        concorrencia = new Concorrencia(137, LocalDate.now(), "Aquisição de Gás de cozinha GLP para utilização no preparo da alimentação dos alunos da rede Municipal de Educação de Ensino Escola Pequeno Cidadão.", 115000, false, "180 dias", 350000);
        concorrenciaDAO.incluir(concorrencia);

        concorrencia = new Concorrencia(147, LocalDate.now(), "Contratação do Consórcio para assegurar a realização a gestão do mercado público regional, um espaço destinado a comercialização dos produtos agrícolas.", 275000, true, "45/90 dias", 750000);
        concorrenciaDAO.incluir(concorrencia);
    }

    @Test
    public void testIncluir() {
        IDAO concorrenciaDAO = new ConcorrenciaDAO();

        Concorrencia concorrencia = new Concorrencia(153, LocalDate.now(), "Empreitada  global para execução de obra para conclusão  da praça da Av. João Corso, conforme Projeto Nº 4450/13 do departamento de engenharia da AMOSC.", 670000, true, "12 meses", 1500000);

        boolean registroIncluido = concorrenciaDAO.incluir(concorrencia);

        Assert.assertTrue(registroIncluido);
    }

    @Test
    public void alterarPrimeiroRegistro() {
        IDAO concorrenciaDAO = new ConcorrenciaDAO();

        List<Concorrencia> listaConcorrencias = concorrenciaDAO.listarTodos();

        Concorrencia concorrencia = new Concorrencia( listaConcorrencias.get(0).getId(), 199, LocalDate.now(), "Alteração - Empreitada  global para execução de obra para conclusão  da praça da Av. João Corso, conforme Projeto Nº 4450/13 do departamento de engenharia da AMOSC.", 666000, false, "13 meses", 2500000);

        boolean registroAlterado = concorrenciaDAO.alterar(concorrencia);

        Assert.assertTrue(registroAlterado);
    }

}
