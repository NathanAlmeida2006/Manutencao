package com.senai.manutencao.models.estoque;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String nome;
    @Enumerated(EnumType.STRING)
    private EnumCategoria categoria;
    @OneToOne
    private ControleEstoque controle;
    @OneToMany
    private List<MovimentacaoEstoque> movimentacoes;
}
