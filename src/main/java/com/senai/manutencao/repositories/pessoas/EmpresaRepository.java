package com.senai.manutencao.repositories.pessoas;

import com.senai.manutencao.models.pessoas.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
