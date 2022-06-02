package com.gm_digital.serviceorderapi.model.input;

import com.gm_digital.serviceorderapi.core.spec.Input;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioEmpresaInput implements Serializable, Input {
    private UsuarioEmpresaIdInput id;
    private UsuarioInput idUsuario;
    private EmpresaInput idEmpresa;
}
