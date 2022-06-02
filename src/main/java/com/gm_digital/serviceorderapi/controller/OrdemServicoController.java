package com.gm_digital.serviceorderapi.controller;

import com.gm_digital.serviceorderapi.Service.OrdemServicoService;
import com.gm_digital.serviceorderapi.core.crud.CrudController;
import com.gm_digital.serviceorderapi.model.entity.OrdemServico;
import com.gm_digital.serviceorderapi.model.filter.OrdemServicoFilter;
import com.gm_digital.serviceorderapi.model.input.OrdemServicoInput;
import com.gm_digital.serviceorderapi.model.output.OrdemServicoOutput;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/ordem-servicos")
public class OrdemServicoController extends CrudController<OrdemServico, OrdemServicoService, Integer,
        OrdemServicoFilter, OrdemServicoInput, OrdemServicoOutput> {
}
