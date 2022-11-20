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

}
