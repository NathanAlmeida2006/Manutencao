package com.senai.manutencao.repositories.manutencoes;

import com.senai.manutencao.models.manutencoes.Manutencao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManutencaoRepository extends JpaRepository<Manutencao, Long> {
}
