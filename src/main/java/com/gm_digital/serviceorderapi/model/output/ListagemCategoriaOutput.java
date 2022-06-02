package com.gm_digital.serviceorderapi.model.output;

import com.gm_digital.serviceorderapi.core.spec.Output;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ListagemCategoriaOutput implements Serializable, Output {
    private Integer id;
    private String descricaoCategoria;
    private List<ListagemItensCategoriaOutput> itensCategoria = new ArrayList<>();
}
