package com.senai.manutencao.models.estoque;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
public class PedidoEstoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantidade;
    private Date dataPedido;
    @Enumerated(EnumType.STRING)
    private StatusPedido status;
    private double custoTotal;
}
