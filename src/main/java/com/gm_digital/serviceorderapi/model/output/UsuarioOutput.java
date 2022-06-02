package com.gm_digital.serviceorderapi.model.output;

import com.gm_digital.serviceorderapi.core.spec.Output;
import lombok.Data;

import java.io.Serializable;

@Data
public class UsuarioOutput implements Serializable, Output {
    private  Integer id;
    private  Long cpf;
    private  String nome;
    private  String email;
    private  String senha;
}
