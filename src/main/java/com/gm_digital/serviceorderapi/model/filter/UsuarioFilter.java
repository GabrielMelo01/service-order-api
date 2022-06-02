package com.gm_digital.serviceorderapi.model.filter;

import com.gm_digital.serviceorderapi.core.spec.Filter;
import lombok.Data;
import org.springframework.data.jpa.domain.Specification;

import java.io.Serializable;

@Data
public class UsuarioFilter implements Serializable, Filter {
    private  Integer id;
    private  Integer cpf;
    private  String nome;
    private  String email;
    private  String senha;

    @Override
    public Specification<?> getSpecification() {
        return null;
    }
}
