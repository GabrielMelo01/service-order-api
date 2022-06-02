package com.gm_digital.serviceorderapi.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "usuario_empresa")
public class UsuarioEmpresa {
    @EmbeddedId
    private UsuarioEmpresaId id;

    @MapsId("idUsuario")
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario idUsuario;

    @MapsId("idEmpresa")
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_empresa", nullable = false)
    private Empresa idEmpresa;


}