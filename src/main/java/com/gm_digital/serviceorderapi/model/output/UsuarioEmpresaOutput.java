package com.gm_digital.serviceorderapi.model.output;

import com.gm_digital.serviceorderapi.core.spec.Output;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioEmpresaOutput implements Serializable, Output {
    private UsuarioEmpresaIdOutput id;
    private UsuarioOutput idUsuario;
    private EmpresaOutput idEmpresa;
}
