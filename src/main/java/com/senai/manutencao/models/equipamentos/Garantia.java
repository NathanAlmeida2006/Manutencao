package com.senai.manutencao.models.equipamentos;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Garantia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dataInicio;
    private Date dataFim;
    private String numeroContrato;
    @OneToMany
    private List<CoberturaGarantia> coberturas;
}
