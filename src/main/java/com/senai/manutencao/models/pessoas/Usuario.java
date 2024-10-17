package com.senai.manutencao.models.pessoas;

import com.senai.manutencao.models.permissoes.Permissao;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Usuario extends PessoaFisica {
    private String matricula;
    private String email;
    private String senha;
    @Enumerated(EnumType.STRING)
    private EnumPerfil perfil;
    @Lob
    private byte[] assinatura;
    private List<Permissao> permissoes;
}
