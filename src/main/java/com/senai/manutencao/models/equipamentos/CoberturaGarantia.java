package com.senai.manutencao.models.equipamentos;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CoberturaGarantia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private boolean ativo;
}
