package br.edu.infnet.orm.model.persistencia;

import br.edu.infnet.orm.modelo.entidade.TomadaPreco;
import br.edu.infnet.orm.modelo.persistencia.IDAO;
import br.edu.infnet.orm.modelo.persistencia.TomadaPrecoDAO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class TomadaPrecoDAOTest {

    @Before
    public void inicializar() {

        Random gerador = new Random();

        IDAO tomadaPrecoDAO = new TomadaPrecoDAO();

        List<TomadaPreco> listaTomadasPrecos = tomadaPrecoDAO.listarTodos();

        if (listaTomadasPrecos.size() == 0) {
            TomadaPreco tomadaPreco = new TomadaPreco(gerador.nextInt(9999), LocalDate.now(), "Aquisição de veículo de passeio novo para utilização nos serviços da Secretaria Municipal de Educação, Cultura e Esportes.", 97000, false, "A vista", 78000);
            tomadaPrecoDAO.incluir(tomadaPreco);

            tomadaPreco = new TomadaPreco(gerador.nextInt(9999), LocalDate.now(), "Aquisição de gêneros alimentícios para utilização no preparo da merenda escolar em atendimento aos alunos da Educação Básica do Município.", 45000, false, "45/90 dias", 35000);
            tomadaPrecoDAO.incluir(tomadaPreco);

            tomadaPreco = new TomadaPreco(gerador.nextInt(9999), LocalDate.now(), "Locação de Software de informática para controle dos Serviços Prestados.", 160000, true, "20/40/60 dias", 148000);
            tomadaPrecoDAO.incluir(tomadaPreco);

            tomadaPreco = new TomadaPreco(gerador.nextInt(9999), LocalDate.now(), "Contratação de show artístico com duração de 3:30h (três horas e trinta minutos) para o dia 13 de dezembro de 2015 durante as festividades do Natal Luz, tendo como local o Centro de Eventos Vânia Vanzin Casanova.", 35000, true, "180 dias", 225000);
            tomadaPrecoDAO.incluir(tomadaPreco);
        }
    }

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

    @Test
    public void excluirUltimoRegistro() {
        IDAO tomadaPrecoDAO = new TomadaPrecoDAO();

        List<TomadaPreco> listaTomadasPrecos = tomadaPrecoDAO.listarTodos();

        boolean registroExcluido = tomadaPrecoDAO.excluir(listaTomadasPrecos.get(listaTomadasPrecos.size()-1));

        Assert.assertTrue(registroExcluido);
    }

    @Test
    public void listarTodasTomadasPrecos() {
        IDAO tomadaPrecoDAO = new TomadaPrecoDAO();

        List<TomadaPreco> listaTomadasPrecos = tomadaPrecoDAO.listarTodos();

        listaTomadasPrecos.forEach(tomadasPrecos -> System.out.println(tomadasPrecos));

        Assert.assertTrue(listaTomadasPrecos.size() > 0);
    }

    @Test
    public void listarPrimeiraTomadaPreco() {
        IDAO tomadaPrecoDAO = new TomadaPrecoDAO();

        List<TomadaPreco> listaTomadasPrecos = tomadaPrecoDAO.listarTodos();

        Object tomadaPreco = tomadaPrecoDAO.buscarPeloId(listaTomadasPrecos.get(0).getId());

        System.out.println(tomadaPreco);

        Assert.assertNotNull(tomadaPreco);
    }

}
