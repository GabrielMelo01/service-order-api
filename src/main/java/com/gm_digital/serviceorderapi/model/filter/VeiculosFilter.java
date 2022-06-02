package com.gm_digital.serviceorderapi.model.filter;

import com.gm_digital.serviceorderapi.core.spec.Filter;
import org.springframework.data.jpa.domain.Specification;

public class VeiculosFilter implements Filter {
    private Integer id;
    private String modelo;
    private Integer tipo;
    private String placa;

    @Override
    public Specification<?> getSpecification() {
        return null;
    }
}
