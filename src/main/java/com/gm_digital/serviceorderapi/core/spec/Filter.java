package com.gm_digital.serviceorderapi.core.spec;

import org.springframework.data.jpa.domain.Specification;

/**
 * The interface Filter.
 */
public interface Filter {
    /**
     * Gets specification.
     *
     * @return the specification
     */
    public Specification<?> getSpecification();
}
