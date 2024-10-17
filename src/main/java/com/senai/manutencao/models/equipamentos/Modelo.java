package com.senai.manutencao.models.equipamentos;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String nome;
    private String especificacoes;
    @OneToMany
    private List<Manual> manuais;
}
