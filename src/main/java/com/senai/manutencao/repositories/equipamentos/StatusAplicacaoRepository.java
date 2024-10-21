package com.senai.manutencao.repositories.equipamentos;

import com.senai.manutencao.models.equipamentos.StatusAplicacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusAplicacaoRepository extends JpaRepository<StatusAplicacao, Long> {
}
