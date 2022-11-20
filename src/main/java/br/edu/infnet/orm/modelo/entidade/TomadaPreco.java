package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class TomadaPreco extends ProcessoLicitatorio {

    private boolean permiteSubcontratacao;
    private String condicaoPagamento;
    private float valorEstimadoDotacaoOrcamentaria;

    public TomadaPreco(int numero, LocalDate dataExpedicao, String objetoLicitacao, float valorEstimadoEdital, boolean permiteSubcontratacao, String condicaoPagamento, float valorEstimadoDotacaoOrcamentaria) {
        super(numero, dataExpedicao, objetoLicitacao, valorEstimadoEdital);
        this.permiteSubcontratacao = permiteSubcontratacao;
        this.condicaoPagamento = condicaoPagamento;
        this.valorEstimadoDotacaoOrcamentaria = valorEstimadoDotacaoOrcamentaria;
    }

    public TomadaPreco(Long id, int numero, LocalDate dataExpedicao, String objetoLicitacao, float valorEstimadoEdital, boolean permiteSubcontratacao, String condicaoPagamento, float valorEstimadoDotacaoOrcamentaria) {
        super(id, numero, dataExpedicao, objetoLicitacao, valorEstimadoEdital);
        this.permiteSubcontratacao = permiteSubcontratacao;
        this.condicaoPagamento = condicaoPagamento;
        this.valorEstimadoDotacaoOrcamentaria = valorEstimadoDotacaoOrcamentaria;
    }

    public TomadaPreco() {

    }

    @Override
    public String toString() {
        return super.toString() + " TomadaPreco{" +
                "permiteSubcontratacao=" + permiteSubcontratacao +
                ", condicaoPagamento='" + condicaoPagamento + '\'' +
                ", valorEstimadoDotacaoOrcamentaria=" + valorEstimadoDotacaoOrcamentaria +
                '}';
    }
}
