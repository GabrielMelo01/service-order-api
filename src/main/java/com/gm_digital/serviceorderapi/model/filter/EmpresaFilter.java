package com.gm_digital.serviceorderapi.model.filter;

import com.gm_digital.serviceorderapi.core.spec.Filter;
import lombok.Data;
import org.springframework.data.jpa.domain.Specification;

import java.io.Serializable;
import java.math.BigInteger;

@Data
public class EmpresaFilter implements Filter {
    private Integer id;
    private  String nome;
    private  Long cgcCpf;

    @Override
    public Specification<?> getSpecification() {
        return null;
    }
}
