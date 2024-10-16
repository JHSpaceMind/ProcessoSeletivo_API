package org.serratec.processosseletivos.repository;

import java.util.List;

import org.serratec.processosseletivos.model.Candidato;
import org.serratec.processosseletivos.model.Escolaridade;
import org.serratec.processosseletivos.model.VagaDesejada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
	List<Candidato> findByVagaDesejada(VagaDesejada vagaDesejada);

	List<Candidato> findByEscolaridade(Escolaridade escolaridade);
}
