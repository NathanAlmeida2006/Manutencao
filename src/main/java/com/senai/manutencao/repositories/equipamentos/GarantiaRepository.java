package com.senai.manutencao.repositories.equipamentos;

import com.senai.manutencao.models.equipamentos.Garantia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarantiaRepository extends JpaRepository<Garantia, Long> {
}
