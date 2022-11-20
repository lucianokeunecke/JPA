package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Pregao extends ProcessoLicitatorio {

    private boolean registroPreco;
    private String criterioJulgamento;
    private float indiceReajuste;

    public Pregao(int numero, LocalDate dataExpedicao, String objetoLicitacao, float valorEstimadoEdital, boolean registroPreco, String criterioJulgamento, float indiceReajuste) {
        super(numero, dataExpedicao, objetoLicitacao, valorEstimadoEdital);
        this.registroPreco = registroPreco;
        this.criterioJulgamento = criterioJulgamento;
        this.indiceReajuste = indiceReajuste;
    }

    public Pregao(Long id, int numero, LocalDate dataExpedicao, String objetoLicitacao, float valorEstimadoEdital, boolean registroPreco, String criterioJulgamento, float indiceReajuste) {
        super(id, numero, dataExpedicao, objetoLicitacao, valorEstimadoEdital);
        this.registroPreco = registroPreco;
        this.criterioJulgamento = criterioJulgamento;
        this.indiceReajuste = indiceReajuste;
    }

    public Pregao() {

    }

    @Override
    public String toString() {
        return super.toString() +  " Pregao{" +
                "registroPreco=" + registroPreco +
                ", criterioJulgamento='" + criterioJulgamento + '\'' +
                ", indiceReajuste=" + indiceReajuste +
                '}';
    }
}
