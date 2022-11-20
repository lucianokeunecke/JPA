package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract  class ProcessoLicitatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numero;
    private LocalDate dataExpedicao;
    private String objetoLicitacao;
    private float valorEstimadoEdital;

    public ProcessoLicitatorio(int numero, LocalDate dataExpedicao, String objetoLicitacao, float valorEstimadoEdital) {
        this.numero = numero;
        this.dataExpedicao = dataExpedicao;
        this.objetoLicitacao = objetoLicitacao;
        this.valorEstimadoEdital = valorEstimadoEdital;
    }

    public ProcessoLicitatorio(int id, int numero, LocalDate dataExpedicao, String objetoLicitacao, float valorEstimadoEdital) {
        this.id = id;
        this.numero = numero;
        this.dataExpedicao = dataExpedicao;
        this.objetoLicitacao = objetoLicitacao;
        this.valorEstimadoEdital = valorEstimadoEdital;
    }

    public ProcessoLicitatorio() {

    }
}
