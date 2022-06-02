package com.gm_digital.serviceorderapi.model.output;

import com.gm_digital.serviceorderapi.core.spec.Output;
import com.gm_digital.serviceorderapi.model.entity.ListagemCategoria;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ListagemItensCategoriaOutput implements Serializable, Output {
    private Integer id;
    private String descricaoItem;
    private Integer quantidade;
    private String tpMedida;
}
