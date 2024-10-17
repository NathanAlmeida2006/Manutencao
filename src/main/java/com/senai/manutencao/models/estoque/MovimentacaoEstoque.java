package com.senai.manutencao.models.estoque;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
public class MovimentacaoEstoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dataMovimentacao;
    private int quantidade;
    private String tipoMovimentacao;
    private String descricao;
}
