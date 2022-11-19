package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cnpjCpf;
    private String endereco;
    private long numeroEndereco;
    private String complementoEndereco;
    private String bairro;
    private long numeroCep;
    private String nomeCidade;

    public Fornecedor(String nome, String cnpjCpf, String endereco, long numeroEndereco, String complementoEndereco, String bairro, long numeroCep, String nomeCidade) {
        this.nome = nome;
        this.cnpjCpf = cnpjCpf;
        this.endereco = endereco;
        this.numeroEndereco = numeroEndereco;
        this.complementoEndereco = complementoEndereco;
        this.bairro = bairro;
        this.numeroCep = numeroCep;
        this.nomeCidade = nomeCidade;
    }

    public Fornecedor(Long id, String nome, String cnpjCpf, String endereco, long numeroEndereco, String complementoEndereco, String bairro, long numeroCep, String nomeCidade) {
        this.id = id;
        this.nome = nome;
        this.cnpjCpf = cnpjCpf;
        this.endereco = endereco;
        this.numeroEndereco = numeroEndereco;
        this.complementoEndereco = complementoEndereco;
        this.bairro = bairro;
        this.numeroCep = numeroCep;
        this.nomeCidade = nomeCidade;
    }

    public Fornecedor() {

    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cnpjCpf='" + cnpjCpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", numeroEndereco=" + numeroEndereco +
                ", complementoEndereco='" + complementoEndereco + '\'' +
                ", bairro='" + bairro + '\'' +
                ", numeroCep=" + numeroCep +
                ", nomeCidade='" + nomeCidade + '\'' +
                '}';
    }
}
