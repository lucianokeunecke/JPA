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

}
