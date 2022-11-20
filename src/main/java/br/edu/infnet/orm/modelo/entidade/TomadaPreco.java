package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.Entity;

@Entity
public class TomadaPreco extends ProcessoLicitatorio {

    private boolean permiteSubcontratacao;
    private String condicaoPagamento;
    private float valorEstimadoDotacaoOrcamentaria;

}
