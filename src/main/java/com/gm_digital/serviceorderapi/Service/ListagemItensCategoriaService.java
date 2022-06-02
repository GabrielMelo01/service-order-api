package com.gm_digital.serviceorderapi.Service;

import com.gm_digital.serviceorderapi.model.output.ListagemItensCategoriaOutput;
import com.gm_digital.serviceorderapi.core.crud.CrudService;
import com.gm_digital.serviceorderapi.model.entity.ListagemItensCategoria;
import com.gm_digital.serviceorderapi.model.filter.ListagemItensCategoriaFilter;
import com.gm_digital.serviceorderapi.model.input.ListagemItensCategoriaInput;
import com.gm_digital.serviceorderapi.model.repository.ListagemItensCategoriaRepository;
import org.springframework.stereotype.Service;

@Service
public class ListagemItensCategoriaService extends CrudService<ListagemItensCategoria, ListagemItensCategoriaRepository, Integer, ListagemItensCategoriaFilter, ListagemItensCategoriaInput, ListagemItensCategoriaOutput> {

}

