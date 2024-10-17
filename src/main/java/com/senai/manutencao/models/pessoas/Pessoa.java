package com.senai.manutencao.models.pessoas;

import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;

@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class Pessoa extends EntidadeBase {
    private String nome;
    private String documento;
    @Embedded
    private Endereco endereco;
    @Embedded
    private Contato contato;
}
