package com.senai.manutencao.repositories.manutencoes;

import com.senai.manutencao.models.manutencoes.Anexo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnexoRepository extends JpaRepository<Anexo, Long> {
}
