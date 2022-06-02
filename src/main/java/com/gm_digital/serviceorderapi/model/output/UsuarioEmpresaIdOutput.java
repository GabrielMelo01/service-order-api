package com.gm_digital.serviceorderapi.model.output;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioEmpresaIdOutput implements Serializable {
    private Integer idUsuario;
    private Integer idEmpresa;
}
