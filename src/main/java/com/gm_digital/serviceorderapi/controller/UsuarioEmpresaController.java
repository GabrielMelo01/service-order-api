package com.gm_digital.serviceorderapi.controller;

import com.gm_digital.serviceorderapi.Service.UsuarioEmpresaService;
import com.gm_digital.serviceorderapi.core.crud.CrudControllerEmbeddedId;
import com.gm_digital.serviceorderapi.model.entity.UsuarioEmpresa;
import com.gm_digital.serviceorderapi.model.entity.UsuarioEmpresaId;
import com.gm_digital.serviceorderapi.model.filter.UsuarioEmpresaFilter;
import com.gm_digital.serviceorderapi.model.input.UsuarioEmpresaInput;
import com.gm_digital.serviceorderapi.model.output.UsuarioEmpresaOutput;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="usurios-empresas")
public class UsuarioEmpresaController extends CrudControllerEmbeddedId<UsuarioEmpresa, UsuarioEmpresaService,
        UsuarioEmpresaId, UsuarioEmpresaFilter, UsuarioEmpresaInput, UsuarioEmpresaOutput> {

}
