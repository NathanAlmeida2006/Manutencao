package com.senai.manutencao.repositories.permissoes;

import com.senai.manutencao.models.permissoes.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissaoRepository extends JpaRepository<Permissao, Long> {
}
