package com.senai.manutencao.models.equipamentos;

import com.senai.manutencao.models.manutencoes.Manutencao;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Aplicacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patrimonio;
    private String numeroSerie;
    @OneToOne
    private Fabricante fabricante;
    @OneToOne
    private Modelo modelo;
    private Date dataAquisicao;
    private Date dataInstalacao;
    @OneToOne
    private Garantia garantia;
    @OneToMany
    private List<Manutencao> historicoManutencoes;
    @OneToOne
    private StatusAplicacao status;
}
