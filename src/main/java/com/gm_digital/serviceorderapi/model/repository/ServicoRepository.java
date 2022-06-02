package com.gm_digital.serviceorderapi.model.repository;

import com.gm_digital.serviceorderapi.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ServicoRepository extends JpaRepository<Servico, Integer>, JpaSpecificationExecutor<Servico> {
}