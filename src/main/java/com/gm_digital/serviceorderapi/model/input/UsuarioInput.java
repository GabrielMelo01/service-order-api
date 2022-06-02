package com.gm_digital.serviceorderapi.model.input;

import com.gm_digital.serviceorderapi.core.spec.Input;
import lombok.Data;

import java.io.Serializable;

@Data
public class UsuarioInput implements Serializable, Input {
    private  Integer id;
    private  Long cpf;
    private  String nome;
    private  String email;
    private  String senha;
}
