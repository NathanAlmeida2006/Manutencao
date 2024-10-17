package com.senai.manutencao.models.servicos;

import com.senai.manutencao.models.estoque.PedidoEstoque;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class OrdemServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    @Enumerated(EnumType.STRING)
    private EnumPrioridade prioridade;
    private Date prazoInicio;
    private Date prazoFim;
    @OneToOne
    private StatusOS status;
    @OneToMany
    private List<ItemServico> itensServico;
    @OneToMany
    private List<PedidoEstoque> pedidosEstoque;
}
