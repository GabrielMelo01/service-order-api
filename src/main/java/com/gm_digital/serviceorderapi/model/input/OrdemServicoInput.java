package com.gm_digital.serviceorderapi.model.input;

import com.gm_digital.serviceorderapi.core.spec.Input;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrdemServicoInput implements Serializable, Input {
    private Integer id;
    private LocalDate dataAbertura;
    private Character status;
    private LocalDate dataFechamento;
    private Integer tipoServico;
    private UsuarioInput idUsuario;
    private EmpresaInput idEmpresa;
    private VeiculoInput idVeiculo;
    private ServicoInput idServico;
}
