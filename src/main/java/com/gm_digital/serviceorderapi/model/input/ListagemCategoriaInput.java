package com.gm_digital.serviceorderapi.model.input;

import com.gm_digital.serviceorderapi.core.spec.Input;
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
public class ListagemCategoriaInput implements Serializable, Input {
    private Integer id;
    private String descricaoCategoria;
    private List<ListagemItensCategoriaInput> itensCategoria = new ArrayList<>();
}
