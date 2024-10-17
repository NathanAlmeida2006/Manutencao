package com.senai.manutencao.models.servicos;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Time;

@Entity
@Data
public class ItemServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Time tempoEstimado;
    private Time tempoReal;
    @OneToOne
    private StatusItem status;
}
