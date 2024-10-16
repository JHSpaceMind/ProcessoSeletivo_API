package org.serratec.processosseletivos.controller;

import java.util.List;
import java.util.Optional;

import org.serratec.processosseletivos.dto.CandidatoDto;
import org.serratec.processosseletivos.model.Escolaridade;
import org.serratec.processosseletivos.model.VagaDesejada;
import org.serratec.processosseletivos.service.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {
	@Autowired
	private CandidatoService servico;

	@GetMapping
	public List<CandidatoDto> obterTodos() {
		return servico.obterTodos();
	}

	@GetMapping("/{id}")
	public ResponseEntity<CandidatoDto> obterPorId(@PathVariable Long id) {
		Optional<CandidatoDto> Dto = servico.obterPorId(id);
		if (!Dto.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(Dto.get());
	}

	@GetMapping("/vagaDesejada/{vagaDesejada}")
	public List<CandidatoDto> obterPorId(@PathVariable VagaDesejada vagaDesejada) {
		return servico.obterPorVaga(vagaDesejada);
	}

	@GetMapping("/escolaridade/{escolaridade}")
	public List<CandidatoDto> obterPorId(@PathVariable Escolaridade escolaridade) {
		return servico.obterPorEscolaridade(escolaridade);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public CandidatoDto salvarCandidato(@RequestBody CandidatoDto Dto) {
		return servico.salvarCandidato(Dto);
	}

	@PutMapping("/{id}")
	public ResponseEntity<CandidatoDto> alterarCandidato(@PathVariable Long id, @RequestBody CandidatoDto Dto) {
		Optional<CandidatoDto> CandidatoAlterado = servico.alterarCandidato(id, Dto);

		if (!CandidatoAlterado.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(CandidatoAlterado.get());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> ApagarCandidato(@PathVariable Long id) {
		if (!servico.apagarCandidato(id)) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.noContent().build();
	}
}