package com.senai.manutencao.models.servicos;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
public class StatusOS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private EnumEstado estado;
    private Date dataAtualizacao;
    private String observacao;
}
