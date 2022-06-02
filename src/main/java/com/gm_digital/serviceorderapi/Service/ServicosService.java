package com.gm_digital.serviceorderapi.Service;

import com.gm_digital.serviceorderapi.core.crud.CrudService;
import com.gm_digital.serviceorderapi.model.entity.Servico;
import com.gm_digital.serviceorderapi.model.filter.ServicosFilter;
import com.gm_digital.serviceorderapi.model.input.ServicoInput;
import com.gm_digital.serviceorderapi.model.output.ServicoOutput;
import com.gm_digital.serviceorderapi.model.repository.ServicoRepository;
import org.springframework.stereotype.Service;

@Service
public class ServicosService extends CrudService<Servico, ServicoRepository, Integer, ServicosFilter, ServicoInput, ServicoOutput> {
}
