package com.gm_digital.serviceorderapi.model.filter;

import com.gm_digital.serviceorderapi.core.spec.Filter;
import org.springframework.data.jpa.domain.Specification;

public class ListagemItensCategoriaFilter implements Filter {
    private Integer id;
    private String descricaoItem;
    private Integer quantidade;

    @Override
    public Specification<?> getSpecification() {
        return null;
    }
}
