package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Concorrencia extends ProcessoLicitatorio {

    private boolean eletronica;
    private String prazoExecucao;
    private float valorMinimoCapital;

    public Concorrencia(int numero, LocalDate dataExpedicao, String objetoLicitacao, float valorEstimadoEdital, boolean eletronica, String prazoExecucao, float valorMinimoCapital) {
        super(numero, dataExpedicao, objetoLicitacao, valorEstimadoEdital);
        this.eletronica = eletronica;
        this.prazoExecucao = prazoExecucao;
        this.valorMinimoCapital = valorMinimoCapital;
    }

    public Concorrencia(int id, int numero, LocalDate dataExpedicao, String objetoLicitacao, float valorEstimadoEdital, boolean eletronica, String prazoExecucao, float valorMinimoCapital) {
        super(id, numero, dataExpedicao, objetoLicitacao, valorEstimadoEdital);
        this.eletronica = eletronica;
        this.prazoExecucao = prazoExecucao;
        this.valorMinimoCapital = valorMinimoCapital;
    }

    public Concorrencia() {

    }

    @Override
    public String toString() {
        return super.toString() + " Concorrencia{" +
                "eletronica=" + eletronica +
                ", prazoExecucao='" + prazoExecucao + '\'' +
                ", valorMinimoCapital=" + valorMinimoCapital +
                '}';
    }
}
