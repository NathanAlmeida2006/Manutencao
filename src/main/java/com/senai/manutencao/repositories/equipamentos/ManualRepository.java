package com.senai.manutencao.repositories.equipamentos;

import com.senai.manutencao.models.equipamentos.Manual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManualRepository extends JpaRepository<Manual, Long> {
}
