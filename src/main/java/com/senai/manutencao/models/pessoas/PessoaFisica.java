package com.senai.manutencao.models.pessoas;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Date;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class PessoaFisica extends Pessoa {
    private String cpf;
    private String rg;
    private Date dataNascimento;
}
