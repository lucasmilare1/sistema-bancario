package com.zabbix.sistemabancario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

/**
 * @author janaina militão
 */

@Entity(name = "pessoa")
public class Pessoa {

	@Id
	@SequenceGenerator(name = "pessoa_seq", sequenceName = "pessoa_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa_seq")
	private Long id;	

	@NotNull
	@Column(name= "nome")
	private String nome;

	@NotNull
	@Column (name="cpf")
	private String cpf;

	public Pessoa() {

	}

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	

}