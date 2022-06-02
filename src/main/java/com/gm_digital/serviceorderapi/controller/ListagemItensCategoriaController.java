package com.gm_digital.serviceorderapi.controller;

import com.gm_digital.serviceorderapi.model.output.ListagemItensCategoriaOutput;
import com.gm_digital.serviceorderapi.Service.ListagemItensCategoriaService;
import com.gm_digital.serviceorderapi.core.crud.CrudController;
import com.gm_digital.serviceorderapi.model.entity.ListagemItensCategoria;
import com.gm_digital.serviceorderapi.model.filter.ListagemItensCategoriaFilter;
import com.gm_digital.serviceorderapi.model.input.ListagemItensCategoriaInput;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/listagem-itens-categoria")
public class ListagemItensCategoriaController extends CrudController<ListagemItensCategoria, ListagemItensCategoriaService, Integer, ListagemItensCategoriaFilter, ListagemItensCategoriaInput, ListagemItensCategoriaOutput> {

}

