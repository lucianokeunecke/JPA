package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	private String nome;

	public Cliente() {
	}

	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

	public Cliente(String nome, Long codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + "]";
	}

}
