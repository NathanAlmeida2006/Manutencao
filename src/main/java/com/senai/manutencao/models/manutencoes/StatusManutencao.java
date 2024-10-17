package com.senai.manutencao.models.manutencoes;

import com.senai.manutencao.models.servicos.EnumEstado;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
public class StatusManutencao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private EnumEstado estado;
    private Date dataAtualizacao;
    private String observacao;
}
