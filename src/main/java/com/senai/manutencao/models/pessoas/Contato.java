package com.senai.manutencao.models.pessoas;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Contato {
    private String email;
    private String telefoneFixo;
    private String telefoneCelular;
}
