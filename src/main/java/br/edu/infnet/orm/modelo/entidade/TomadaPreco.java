package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class TomadaPreco extends ProcessoLicitatorio {

    private boolean permiteSubcontratacao;
    private String condicaoPagamento;
    private float valorEstimadoDotacaoOrcamentaria;

    public TomadaPreco(int numero, LocalDate dataExpedicao, String objetoLicitacao, float valorEstimadoEdital) {
        super(numero, dataExpedicao, objetoLicitacao, valorEstimadoEdital);
    }
}
