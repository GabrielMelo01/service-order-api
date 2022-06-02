package com.gm_digital.serviceorderapi.controller;

import com.gm_digital.serviceorderapi.Service.EmpresaService;
import com.gm_digital.serviceorderapi.core.crud.CrudController;
import com.gm_digital.serviceorderapi.model.entity.Empresa;
import com.gm_digital.serviceorderapi.model.filter.EmpresaFilter;
import com.gm_digital.serviceorderapi.model.input.EmpresaInput;
import com.gm_digital.serviceorderapi.model.output.EmpresaOutput;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/empresas")
public class EmpresaController extends CrudController<Empresa, EmpresaService, Integer, EmpresaFilter, EmpresaInput, EmpresaOutput> {
}
