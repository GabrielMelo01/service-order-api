package com.gm_digital.serviceorderapi.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "veiculos")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "modelo", length = 45)
    private String modelo;

    @Column(name = "tipo")
    private Integer tipo;

    @Column(name = "placa", length = 7)
    private String placa;

    @OneToMany(mappedBy = "idVeiculo")
    private Set<OrdemServico> ordemServicos = new LinkedHashSet<>();

}