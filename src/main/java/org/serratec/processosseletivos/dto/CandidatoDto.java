package org.serratec.processosseletivos.dto;

import java.time.LocalDate;

import org.serratec.processosseletivos.model.Candidato;
import org.serratec.processosseletivos.model.Escolaridade;
import org.serratec.processosseletivos.model.StatusCurriculo;
import org.serratec.processosseletivos.model.VagaDesejada;

public record CandidatoDto(Long id, String nome, LocalDate dataNascimento, String cpf, Escolaridade escolaridade,
		VagaDesejada vagaDesejada, StatusCurriculo statuscurriculo) {

	public Candidato toEntity() {
		Candidato candidato = new Candidato();
		candidato.setId(this.id);
		candidato.setNome(this.nome);
		candidato.setDataNascimento(this.dataNascimento);
		candidato.setCpf(this.cpf);
		candidato.setEscolaridade(this.escolaridade);
		candidato.setVagaDesejada(this.vagaDesejada);
		candidato.setStatuscurriculo(this.statuscurriculo);
		return candidato;
	}

	public static CandidatoDto toDto(Candidato candidato) {
		return new CandidatoDto(candidato.getId(), candidato.getNome(), candidato.getDataNascimento(),
				candidato.getCpf(), candidato.getEscolaridade(), candidato.getVagaDesejada(),
				candidato.getStatuscurriculo());
	}
}