package com.senai.manutencao.repositories.equipamentos;

import com.senai.manutencao.models.equipamentos.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FabricanteRepository extends JpaRepository<Fabricante, Long> {
}
