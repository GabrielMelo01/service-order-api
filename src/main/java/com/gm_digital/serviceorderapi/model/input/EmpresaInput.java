package com.gm_digital.serviceorderapi.model.input;

import com.gm_digital.serviceorderapi.core.spec.Input;
import lombok.Data;

import java.io.Serializable;

@Data
public class EmpresaInput implements Serializable, Input {
    private  Integer id;
    private  String nome;
    private  Integer cgcCpf;
}
