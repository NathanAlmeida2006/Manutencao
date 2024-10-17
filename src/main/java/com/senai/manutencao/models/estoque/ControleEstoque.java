package com.senai.manutencao.models.estoque;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
public class ControleEstoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantidadeMinima;
    private int quantidadeMaxima;
    private int quantidadeAtual;
    private Date ultimaContagem;
}
