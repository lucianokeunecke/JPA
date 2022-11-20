package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Empenho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long numero;
    private LocalDate data;
    private float valor;
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idFornecedor")
    private Fornecedor fornecedor;
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idProcessoLicitatorio")
    private ProcessoLicitatorio processoLicitatorio;

    public Empenho(Long numero, LocalDate data, float valor, Fornecedor fornecedor, ProcessoLicitatorio processoLicitatorio) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.fornecedor = fornecedor;
        this.processoLicitatorio = processoLicitatorio;
    }

    public Empenho() {

    }
}
