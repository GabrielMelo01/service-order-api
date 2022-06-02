package com.gm_digital.serviceorderapi.model.repository;

import com.gm_digital.serviceorderapi.model.entity.UsuarioEmpresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UsuarioEmpresaRepository extends JpaRepository<UsuarioEmpresa, Integer>, JpaSpecificationExecutor<UsuarioEmpresa> {
}