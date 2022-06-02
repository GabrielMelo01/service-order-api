package com.gm_digital.serviceorderapi.Service;

import com.gm_digital.serviceorderapi.core.crud.CrudService;
import com.gm_digital.serviceorderapi.model.entity.Empresa;
import com.gm_digital.serviceorderapi.model.filter.EmpresaFilter;
import com.gm_digital.serviceorderapi.model.input.EmpresaInput;
import com.gm_digital.serviceorderapi.model.output.EmpresaOutput;
import com.gm_digital.serviceorderapi.model.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService extends CrudService<Empresa, EmpresaRepository, Integer, EmpresaFilter, EmpresaInput, EmpresaOutput> {

}
