package com.gm_digital.serviceorderapi.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "listagem_itens_categoria")
public class ListagemItensCategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_item", nullable = false)
    private Integer id;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_categoria")
    private ListagemCategoria categoria;

    @Column(name = "descricao_item", length = 100)
    private String descricaoItem;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "tp_medida")
    private String tpMedida;


}