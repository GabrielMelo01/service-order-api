package com.gm_digital.serviceorderapi.controller;

import com.gm_digital.serviceorderapi.Service.VeiculosService;
import com.gm_digital.serviceorderapi.core.crud.CrudController;
import com.gm_digital.serviceorderapi.model.entity.Veiculo;
import com.gm_digital.serviceorderapi.model.filter.VeiculosFilter;
import com.gm_digital.serviceorderapi.model.input.VeiculoInput;
import com.gm_digital.serviceorderapi.model.output.VeiculoOutput;
import com.gm_digital.serviceorderapi.model.repository.VeiculoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/veiculos")
public class VeiculoController extends CrudController<Veiculo, VeiculosService, Integer, VeiculosFilter, VeiculoInput, VeiculoOutput> {
}
