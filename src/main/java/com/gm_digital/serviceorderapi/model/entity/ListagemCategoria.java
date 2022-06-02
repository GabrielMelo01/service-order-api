package com.gm_digital.serviceorderapi.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "listagem_categorias")
public class ListagemCategoria {
    @Id
    @Column(name = "id_categoria", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "descricao_categoria", length = 100)
    private String descricaoCategoria;

    @OneToMany(mappedBy = "categoria")
    private List<ListagemItensCategoria> itensCategoria = new ArrayList<>();


}