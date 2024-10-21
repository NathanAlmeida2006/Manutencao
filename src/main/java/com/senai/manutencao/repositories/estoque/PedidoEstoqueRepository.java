package com.senai.manutencao.repositories.estoque;

import com.senai.manutencao.models.estoque.PedidoEstoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoEstoqueRepository extends JpaRepository<PedidoEstoque, Long> {
}
