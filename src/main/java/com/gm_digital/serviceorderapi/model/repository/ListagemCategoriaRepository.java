package com.gm_digital.serviceorderapi.model.repository;

import com.gm_digital.serviceorderapi.model.entity.ListagemCategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ListagemCategoriaRepository extends JpaRepository<ListagemCategoria, Integer>, JpaSpecificationExecutor<ListagemCategoria> {
}