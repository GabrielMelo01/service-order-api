package com.gm_digital.serviceorderapi.model.output;

import com.gm_digital.serviceorderapi.core.spec.Output;
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
public class OrdemServicoOutput implements Serializable, Output {
    private Integer id;
    private LocalDate dataAbertura;
    private Character status;
    private LocalDate dataFechamento;
    private Integer tipoServico;
    private UsuarioOutput idUsuario;
    private EmpresaOutput idEmpresa;
    private VeiculoOutput idVeiculo;
    private ServicoOutput idServico;
}
