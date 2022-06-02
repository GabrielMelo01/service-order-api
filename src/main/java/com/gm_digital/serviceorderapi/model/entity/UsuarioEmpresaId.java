package com.gm_digital.serviceorderapi.model.entity;

import lombok.Data;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
public class UsuarioEmpresaId implements Serializable {
    private static final long serialVersionUID = 3037507252194706205L;
    @Column(name = "id_usuario", nullable = false)
    private Integer idUsuario;

    @Column(name = "id_empresa", nullable = false)
    private Integer idEmpresa;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UsuarioEmpresaId entity = (UsuarioEmpresaId) o;
        return Objects.equals(this.idUsuario, entity.idUsuario) &&
                Objects.equals(this.idEmpresa, entity.idEmpresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, idEmpresa);
    }

}