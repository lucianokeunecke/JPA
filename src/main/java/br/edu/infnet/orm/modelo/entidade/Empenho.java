package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Empenho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numero;
    private LocalDateTime data;
    private float valor;
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idFornecedor")
    private Fornecedor fornecedor;
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idProcessoLicitatorio")
    private ProcessoLicitatorio processoLicitatorio;

}
