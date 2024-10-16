package org.serratec.processosseletivos.service;

import java.util.List;
import java.util.Optional;

import org.serratec.processosseletivos.dto.CandidatoDto;
import org.serratec.processosseletivos.model.Candidato;
import org.serratec.processosseletivos.model.Escolaridade;
import org.serratec.processosseletivos.model.VagaDesejada;
import org.serratec.processosseletivos.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidatoService {
	@Autowired
	private CandidatoRepository repositorio;

	public List<CandidatoDto> obterTodos() {
		return repositorio.findAll().stream().map(c -> CandidatoDto.toDto(c)).toList();
	}

	public Optional<CandidatoDto> obterPorId(Long id) {
		if (!repositorio.existsById(id)) {
			return Optional.empty();
		}
		return Optional.of(CandidatoDto.toDto(repositorio.findById(id).get()));
	}

	public CandidatoDto salvarCandidato(CandidatoDto dto) {
		return CandidatoDto.toDto(repositorio.save(dto.toEntity()));
	}

	public boolean apagarCandidato(Long id) {
		if (!repositorio.existsById(id)) {
			return false;
		}
		repositorio.deleteById(id);
		return true;
	}

	public Optional<CandidatoDto> alterarCandidato(Long id, CandidatoDto Dto) {
		if (!repositorio.existsById(id)) {
			return Optional.empty();
		}
		Candidato candidatoEntity = Dto.toEntity();
		candidatoEntity.setId(id);
		repositorio.save(candidatoEntity);
		return Optional.of(CandidatoDto.toDto(candidatoEntity));
	}

	public List<CandidatoDto> obterPorVaga(VagaDesejada vagaDesejada) {
		List<Candidato> candidato = repositorio.findByVagaDesejada(vagaDesejada);
		return candidato.stream().map(c -> CandidatoDto.toDto(c)).toList();
	}

	public List<CandidatoDto> obterPorEscolaridade(Escolaridade escolaridade) {
		List<Candidato> candidato = repositorio.findByEscolaridade(escolaridade);
		return candidato.stream().map(c -> CandidatoDto.toDto(c)).toList();
	}
}
