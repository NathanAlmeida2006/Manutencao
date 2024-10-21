package com.senai.manutencao.repositories.equipamentos;

import com.senai.manutencao.models.equipamentos.Aplicacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AplicacaoRepository extends JpaRepository<Aplicacao, Long> {
}
