package com.rogeria.domain;

public class Cliente {

	private Integer idInteger;
	private String nome;
	
	public Cliente(Integer idInteger, String nome) {
		super();
		this.idInteger = idInteger;
		this.nome = nome;
	}

	public Integer getIdInteger() {
		return idInteger;
	}

	public void setIdInteger(Integer idInteger) {
		this.idInteger = idInteger;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
