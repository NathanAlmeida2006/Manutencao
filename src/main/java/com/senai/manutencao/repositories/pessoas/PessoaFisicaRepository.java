package com.senai.manutencao.repositories.pessoas;

import com.senai.manutencao.models.pessoas.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Long> {
}
