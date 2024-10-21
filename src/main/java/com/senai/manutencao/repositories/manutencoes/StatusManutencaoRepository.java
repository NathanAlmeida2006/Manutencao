package com.senai.manutencao.repositories.manutencoes;

import com.senai.manutencao.models.manutencoes.StatusManutencao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusManutencaoRepository extends JpaRepository<StatusManutencao, Long> {
}
