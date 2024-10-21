package com.senai.manutencao.repositories.servicos;

import com.senai.manutencao.models.servicos.ItemServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemServicoRepository extends JpaRepository<ItemServico, Long> {
}
