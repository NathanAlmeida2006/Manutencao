package com.senai.manutencao.repositories.servicos;

import com.senai.manutencao.models.servicos.StatusOS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusOSRepository extends JpaRepository<StatusOS, Long> {
}
