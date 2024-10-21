package com.senai.manutencao.repositories.servicos;

import com.senai.manutencao.models.servicos.StatusItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusItemRepository extends JpaRepository<StatusItem, Long> {
}
