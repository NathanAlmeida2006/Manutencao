package com.senai.manutencao.models.equipamentos;

import com.senai.manutencao.models.pessoas.Contato;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Fabricante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String site;
    @OneToMany
    private List<Contato> suporte;
}
