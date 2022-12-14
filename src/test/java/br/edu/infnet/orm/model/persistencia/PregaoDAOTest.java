package br.edu.infnet.orm.model.persistencia;

import br.edu.infnet.orm.modelo.entidade.Pregao;
import br.edu.infnet.orm.modelo.persistencia.IDAO;
import br.edu.infnet.orm.modelo.persistencia.PregaoDAO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class PregaoDAOTest {

    @Before
    public void inicializar() {

        Random gerador = new Random();

        IDAO pregaoDAO = new PregaoDAO();

        List<Pregao> listaPregoes = pregaoDAO.listarTodos();

        if (listaPregoes.size() == 0) {
            Pregao pregao = new Pregao(gerador.nextInt(9999), LocalDate.now(), "Prestação de serviço de mão de obra mecânica e mão de obra elétrica para conserto/manutenção dos veículos e máquinas da frota do Município.", 170000, false, "Menor Preço", 5);
            pregaoDAO.incluir(pregao);

            pregao = new Pregao(gerador.nextInt(9999), LocalDate.now(), "Aquisição de materiais hidráulicos para manutenção/conserto/instalação da rede de abastecimento de água do Município, conforme autorizado pela Lei Municipal Nº.714/2014 de 03 de abril de 2014.", 270000, false, "Maior Desconto", 3);
            pregaoDAO.incluir(pregao);

            pregao = new Pregao(gerador.nextInt(9999), LocalDate.now(), "Aquisição de materiais diversos e doces para confecção de ovos e coelhos de chocolate para os alunos da Creche Municipal Cantinho da Alegria e Escola Municipal Pequeno Cidadão, objetivando a comemoração da Páscoa.", 415000, true, "Maior Retorno Economico", 2);
            pregaoDAO.incluir(pregao);

            pregao = new Pregao(gerador.nextInt(9999), LocalDate.now(), "Execução de obra de construção de cabeceira de ponte na Linha Madoglio e Linha Piccoli com área de 55,00m² cada ponte, conforme memorial descritivo, prancha A-01, A-02 e E-01 e cronograma físico e financeiro.", 185000, true, "Maior Lance ou Oferta", 4);
            pregaoDAO.incluir(pregao);
        }
    }

    @Test
    public void testIncluir() {
        IDAO pregaoDAO = new PregaoDAO();

        Pregao pregao = new Pregao(215, LocalDate.now(), "Prestação de serviços de engenharia civil.", 179000, false, "Técnica e Preço", 6);

        boolean registroIncluido = pregaoDAO.incluir(pregao);

        Assert.assertTrue(registroIncluido);
    }

    @Test
    public void alterarPrimeiroRegistro() {
        IDAO pregaoDAO = new PregaoDAO();

        List<Pregao> listaPregoes = pregaoDAO.listarTodos();

        Pregao pregao = new Pregao( listaPregoes.get(0).getId(), 299, LocalDate.now(), "Alteração - Prestação de serviços de engenharia civil.", 199876, true, "Não se Aplica", 11);

        boolean registroAlterado = pregaoDAO.alterar(pregao);

        Assert.assertTrue(registroAlterado);
    }

    @Test
    public void excluirUltimoRegistro() {
        IDAO pregaoDAO = new PregaoDAO();

        List<Pregao> listaPregoes = pregaoDAO.listarTodos();

        boolean registroExcluido = pregaoDAO.excluir(listaPregoes.get(listaPregoes.size()-1));;

        Assert.assertTrue(registroExcluido);
    }

    @Test
    public void listarTodosPregoes() {
        IDAO pregaoDAO = new PregaoDAO();

        List<Pregao> listaPregoes = pregaoDAO.listarTodos();

        listaPregoes.forEach(pregoes -> System.out.println(pregoes));

        Assert.assertTrue(listaPregoes.size() > 0);
    }

    @Test
    public void listarPrimeiroPregao() {
        IDAO pregaoDAO = new PregaoDAO();

        List<Pregao> listaPregoes = pregaoDAO.listarTodos();

        Object pregao = pregaoDAO.buscarPeloId(listaPregoes.get(0).getId());

        System.out.println(pregao);

        Assert.assertNotNull(pregao);
    }

}
