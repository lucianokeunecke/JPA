package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Pregao extends ProcessoLicitatorio {

    private boolean registroPreco;
    private String criterioJulgamento;
    private float indiceReajuste;

    public Pregao(int numero, LocalDate dataExpedicao, String objetoLicitacao, float valorEstimadoEdital) {
        super(numero, dataExpedicao, objetoLicitacao, valorEstimadoEdital);
    }
}
