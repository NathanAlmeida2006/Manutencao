package com.senai.manutencao.repositories.equipamentos;

import com.senai.manutencao.models.equipamentos.CoberturaGarantia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoberturaGarantiaRepository extends JpaRepository<CoberturaGarantia, Long> {
}
