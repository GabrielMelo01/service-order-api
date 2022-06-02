package com.gm_digital.serviceorderapi.Service;

import com.gm_digital.serviceorderapi.core.crud.CrudService;
import com.gm_digital.serviceorderapi.model.entity.Usuario;
import com.gm_digital.serviceorderapi.model.filter.UsuarioFilter;
import com.gm_digital.serviceorderapi.model.input.UsuarioInput;
import com.gm_digital.serviceorderapi.model.output.UsuarioOutput;
import com.gm_digital.serviceorderapi.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

@Service
public class UsuarioService extends CrudService<Usuario, UsuarioRepository, Integer, UsuarioFilter, UsuarioInput, UsuarioOutput> {


}
