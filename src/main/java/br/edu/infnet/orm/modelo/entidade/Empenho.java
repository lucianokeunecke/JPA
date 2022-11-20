package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ItensEmpenho> itensEmpenho;

    public Empenho(Long numero, LocalDate data, float valor, Fornecedor fornecedor, ProcessoLicitatorio processoLicitatorio) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.fornecedor = fornecedor;
        this.processoLicitatorio = processoLicitatorio;
    }

    public Empenho(Long id, Long numero, LocalDate data, float valor, Fornecedor fornecedor, ProcessoLicitatorio processoLicitatorio) {
        this.id = id;
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.fornecedor = fornecedor;
        this.processoLicitatorio = processoLicitatorio;
    }

    public Empenho() {

    }

    public Long getId() {
        return id;
    }

    public List<ItensEmpenho> getItensEmpenho() {
        return itensEmpenho;
    }

    public void setItensEmpenho(List<ItensEmpenho> itensEmpenho) {
        this.itensEmpenho = itensEmpenho;
    }

    @Override
    public String toString() {
        return "Empenho{" +
                "id=" + id +
                ", numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                ", " + fornecedor +
                ", " + processoLicitatorio +
                '}';
    }
}
