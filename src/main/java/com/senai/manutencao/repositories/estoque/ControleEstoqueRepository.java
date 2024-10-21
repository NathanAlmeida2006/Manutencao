package com.senai.manutencao.repositories.estoque;

import com.senai.manutencao.models.estoque.ControleEstoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControleEstoqueRepository extends JpaRepository<ControleEstoque, Long> {
}
