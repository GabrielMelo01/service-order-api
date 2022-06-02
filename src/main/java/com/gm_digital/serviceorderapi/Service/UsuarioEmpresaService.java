package com.gm_digital.serviceorderapi.Service;

import com.gm_digital.serviceorderapi.core.crud.CrudService;
import com.gm_digital.serviceorderapi.model.entity.UsuarioEmpresa;
import com.gm_digital.serviceorderapi.model.entity.UsuarioEmpresaId;
import com.gm_digital.serviceorderapi.model.filter.UsuarioEmpresaFilter;
import com.gm_digital.serviceorderapi.model.input.UsuarioEmpresaInput;
import com.gm_digital.serviceorderapi.model.output.UsuarioEmpresaOutput;
import com.gm_digital.serviceorderapi.model.repository.UsuarioEmpresaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UsuarioEmpresaService extends CrudService<UsuarioEmpresa, UsuarioEmpresaRepository, UsuarioEmpresaId, UsuarioEmpresaFilter, UsuarioEmpresaInput, UsuarioEmpresaOutput> {

}
