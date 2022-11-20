package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.Entity;

@Entity
public class Concorrencia extends ProcessoLicitatorio {

    private boolean eletronica;
    private String prazoExecucao;
    private float valorMinimoCapital;

}
