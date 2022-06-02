package com.gm_digital.serviceorderapi.Service;

import com.gm_digital.serviceorderapi.core.crud.CrudService;
import com.gm_digital.serviceorderapi.model.entity.OrdemServico;
import com.gm_digital.serviceorderapi.model.filter.OrdemServicoFilter;
import com.gm_digital.serviceorderapi.model.input.OrdemServicoInput;
import com.gm_digital.serviceorderapi.model.output.OrdemServicoOutput;
import com.gm_digital.serviceorderapi.model.repository.OrdemServicoRepository;
import org.springframework.stereotype.Service;

@Service
public class OrdemServicoService extends CrudService<OrdemServico, OrdemServicoRepository, Integer,
        OrdemServicoFilter, OrdemServicoInput, OrdemServicoOutput> {
}
