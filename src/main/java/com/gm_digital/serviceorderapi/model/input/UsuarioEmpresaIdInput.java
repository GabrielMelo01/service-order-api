package com.gm_digital.serviceorderapi.model.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioEmpresaIdInput implements Serializable {
    private Integer idUsuario;
    private Integer idEmpresa;
}
