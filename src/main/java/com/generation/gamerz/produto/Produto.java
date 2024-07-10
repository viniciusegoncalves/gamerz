package com.generation.gamerz.produto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.generation.gamerz.categoria.Categoria;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "tb_produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "preco", nullable = false)
    private Double preco;

    @ManyToOne
    @JsonIgnoreProperties("produtos")
    private Categoria categoria;
}
