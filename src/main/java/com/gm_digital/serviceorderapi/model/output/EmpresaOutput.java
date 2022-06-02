package com.gm_digital.serviceorderapi.model.output;

import com.gm_digital.serviceorderapi.core.spec.Output;
import lombok.Data;

import java.io.Serializable;

@Data
public class EmpresaOutput implements Serializable, Output {
    private  Integer id;
    private  String nome;
    private  Integer cgcCpf;
}
