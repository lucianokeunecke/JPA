package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.Entity;

@Entity
public class Pregao extends ProcessoLicitatorio {

    private boolean registroPreco;
    private String criterioJulgamento;
    private float indiceReajuste;

}
