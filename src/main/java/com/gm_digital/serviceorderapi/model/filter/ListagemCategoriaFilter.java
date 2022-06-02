package com.gm_digital.serviceorderapi.model.filter;

import com.gm_digital.serviceorderapi.core.spec.Filter;
import org.springframework.data.jpa.domain.Specification;

public class ListagemCategoriaFilter implements Filter {
    private Integer id;
    private String descricaoCategoria;

    @Override
    public Specification<?> getSpecification() {
        return null;
    }
}
