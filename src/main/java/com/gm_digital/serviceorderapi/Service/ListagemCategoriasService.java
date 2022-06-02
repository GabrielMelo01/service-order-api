package com.gm_digital.serviceorderapi.Service;

import com.gm_digital.serviceorderapi.model.output.ListagemCategoriaOutput;
import com.gm_digital.serviceorderapi.core.crud.CrudService;
import com.gm_digital.serviceorderapi.model.entity.ListagemCategoria;
import com.gm_digital.serviceorderapi.model.filter.ListagemCategoriaFilter;
import com.gm_digital.serviceorderapi.model.input.ListagemCategoriaInput;
import com.gm_digital.serviceorderapi.model.repository.ListagemCategoriaRepository;
import org.springframework.stereotype.Service;

@Service
public class ListagemCategoriasService extends CrudService<ListagemCategoria, ListagemCategoriaRepository, Integer, ListagemCategoriaFilter, ListagemCategoriaInput, ListagemCategoriaOutput> {
}
