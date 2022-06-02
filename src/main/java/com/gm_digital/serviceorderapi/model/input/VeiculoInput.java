package com.gm_digital.serviceorderapi.model.input;

import com.gm_digital.serviceorderapi.core.spec.Input;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VeiculoInput implements Serializable, Input {
    private Integer id;
    private String modelo;
    private Integer tipo;
    private String placa;
}
