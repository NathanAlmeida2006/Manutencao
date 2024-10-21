package com.senai.manutencao.repositories.pessoas;

import com.senai.manutencao.models.pessoas.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
