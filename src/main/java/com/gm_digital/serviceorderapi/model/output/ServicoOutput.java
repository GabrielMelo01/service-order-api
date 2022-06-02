package com.gm_digital.serviceorderapi.model.output;

import com.gm_digital.serviceorderapi.core.spec.Output;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ServicoOutput implements Serializable, Output {
    private Integer id;
    private String descricao;
    private Double valor;
    private Integer quantidade;
}
