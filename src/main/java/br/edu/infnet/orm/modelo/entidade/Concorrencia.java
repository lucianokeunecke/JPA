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

    public Concorrencia() {

    }
}
