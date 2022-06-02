package com.gm_digital.serviceorderapi.Service;

import com.gm_digital.serviceorderapi.core.crud.CrudService;
import com.gm_digital.serviceorderapi.model.entity.Veiculo;
import com.gm_digital.serviceorderapi.model.filter.VeiculosFilter;
import com.gm_digital.serviceorderapi.model.input.VeiculoInput;
import com.gm_digital.serviceorderapi.model.output.VeiculoOutput;
import com.gm_digital.serviceorderapi.model.repository.VeiculoRepository;
import org.springframework.stereotype.Service;

@Service
public class VeiculosService extends CrudService<Veiculo, VeiculoRepository, Integer, VeiculosFilter, VeiculoInput, VeiculoOutput> {
}
