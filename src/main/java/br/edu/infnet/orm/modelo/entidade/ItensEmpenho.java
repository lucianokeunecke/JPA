package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.*;

@Entity
public class ItensEmpenho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idProduto")
    private Produto produto;
    private float quantidade;
    private float valorUnitario;

    public ItensEmpenho(Produto produto, float quantidade, float valorUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public ItensEmpenho() {

    }
}
