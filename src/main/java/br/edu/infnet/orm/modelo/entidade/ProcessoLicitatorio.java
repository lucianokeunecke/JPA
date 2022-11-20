package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract  class ProcessoLicitatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

    public ProcessoLicitatorio(Long id, int numero, LocalDate dataExpedicao, String objetoLicitacao, float valorEstimadoEdital) {
        this.id = id;
        this.numero = numero;
        this.dataExpedicao = dataExpedicao;
        this.objetoLicitacao = objetoLicitacao;
        this.valorEstimadoEdital = valorEstimadoEdital;
    }

    public ProcessoLicitatorio() {

    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ProcessoLicitatorio{" +
                "id=" + id +
                ", numero=" + numero +
                ", dataExpedicao=" + dataExpedicao +
                ", objetoLicitacao='" + objetoLicitacao + '\'' +
                ", valorEstimadoEdital=" + valorEstimadoEdital +
                '}';
    }
}
