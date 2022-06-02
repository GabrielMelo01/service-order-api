package com.gm_digital.serviceorderapi.model.repository;

import com.gm_digital.serviceorderapi.model.entity.ListagemItensCategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ListagemItensCategoriaRepository extends JpaRepository<ListagemItensCategoria, Integer>, JpaSpecificationExecutor<ListagemItensCategoria> {
}