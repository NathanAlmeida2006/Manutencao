package com.senai.manutencao.repositories.pessoas;

import com.senai.manutencao.models.pessoas.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
