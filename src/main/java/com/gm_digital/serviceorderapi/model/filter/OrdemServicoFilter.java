package com.gm_digital.serviceorderapi.model.filter;

import com.gm_digital.serviceorderapi.core.spec.Filter;
import com.gm_digital.serviceorderapi.model.input.EmpresaInput;
import com.gm_digital.serviceorderapi.model.input.ServicoInput;
import com.gm_digital.serviceorderapi.model.input.UsuarioInput;
import com.gm_digital.serviceorderapi.model.input.VeiculoInput;
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDate;

public class OrdemServicoFilter implements Filter {
    private Integer id;
    private LocalDate dataAbertura;
    private Character status;
    private LocalDate dataFechamento;
    private Integer tipoServico;
    private UsuarioInput idUsuario;
    private EmpresaInput idEmpresa;
    private VeiculoInput idVeiculo;
    private ServicoInput idServico;

    @Override
    public Specification<?> getSpecification() {
        return null;
    }
}
