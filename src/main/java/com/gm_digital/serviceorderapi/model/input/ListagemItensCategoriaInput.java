package com.gm_digital.serviceorderapi.model.input;

import com.gm_digital.serviceorderapi.core.spec.Input;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ListagemItensCategoriaInput implements Serializable, Input {
    private Integer id;
    private String descricaoItem;
    private Integer quantidade;
    private Integer idCategoria;
    private String tpMedida;
}
