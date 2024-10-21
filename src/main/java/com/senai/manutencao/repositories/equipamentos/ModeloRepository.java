package com.senai.manutencao.repositories.equipamentos;

import com.senai.manutencao.models.equipamentos.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Long> {
}
