package com.senai.manutencao.models.manutencoes;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Manutencao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private EnumTipoManutencao tipo;
    private String codigoEspecial;
    private int tempoOperacional;
    private String prioridade;
    private String setor;
    @OneToOne
    private StatusManutencao status;
    @OneToMany
    private List<Anexo> anexos;
}
