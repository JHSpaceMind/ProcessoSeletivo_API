package org.serratec.processosseletivos.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "candidatos")
public class Candidato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private LocalDate dataNascimento;
	private String cpf;
	private Escolaridade escolaridade;
	private VagaDesejada vagaDesejada;
	private StatusCurriculo statuscurriculo;

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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Escolaridade getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}

	public StatusCurriculo getStatuscurriculo() {
		return statuscurriculo;
	}

	public void setStatuscurriculo(StatusCurriculo statuscurriculo) {
		this.statuscurriculo = statuscurriculo;
	}

	public VagaDesejada getVagaDesejada() {
		return vagaDesejada;
	}

	public void setVagaDesejada(VagaDesejada vagaDesejada) {
		this.vagaDesejada = vagaDesejada;
	}

}
