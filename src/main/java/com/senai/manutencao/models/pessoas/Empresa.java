package com.senai.manutencao.models.pessoas;

import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Empresa extends PessoaJuridica {
    private String razaoSocial;
    private String nomeFantasia;
    private String responsavel;
    @Lob
    private byte[] logo;
    private String atividades;
}
