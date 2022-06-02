package com.gm_digital.serviceorderapi.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "ordem_servico")
public class OrdemServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "data_abertura")
    private LocalDate dataAbertura;

    @Column(name = "status")
    private Character status;

    @Column(name = "data_fechamento")
    private LocalDate dataFechamento;

    @Column(name = "tipo_servico")
    private Integer tipoServico;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario idUsuario;

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa idEmpresa;

    @ManyToOne
    @JoinColumn(name = "id_veiculo")
    private Veiculo idVeiculo;

    @ManyToOne
    @JoinColumn(name = "id_servico")
    private Servico idServico;

}