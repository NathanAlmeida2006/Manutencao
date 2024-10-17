package com.senai.manutencao.models.equipamentos;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Manual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String nome;
    private String especificacoes;
}
