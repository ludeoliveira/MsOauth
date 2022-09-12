package com.aulas.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String descricao;
	private float preco;
	private float estoque;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getEstoque() {
		return estoque;
	}
	public void setEstoque(float estoque) {
		this.estoque = estoque;
	}
	public Produto(String descricao, float preco, float estoque) {
		this.descricao = descricao;
		this.preco = preco;
		this.estoque = estoque;
	}
	public Produto() {
	}
	
	
}
