package com.gm_digital.serviceorderapi.controller;

import com.gm_digital.serviceorderapi.Service.ServicosService;
import com.gm_digital.serviceorderapi.core.crud.CrudController;
import com.gm_digital.serviceorderapi.model.entity.Servico;
import com.gm_digital.serviceorderapi.model.filter.ServicosFilter;
import com.gm_digital.serviceorderapi.model.input.ServicoInput;
import com.gm_digital.serviceorderapi.model.output.ServicoOutput;
import com.gm_digital.serviceorderapi.model.repository.ServicoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/servicos")
public class ServicosController extends CrudController<Servico, ServicosService, Integer, ServicosFilter, ServicoInput, ServicoOutput> {
}
