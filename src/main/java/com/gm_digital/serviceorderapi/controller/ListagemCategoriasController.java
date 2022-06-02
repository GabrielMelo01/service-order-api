package com.gm_digital.serviceorderapi.controller;

import com.gm_digital.serviceorderapi.model.output.ListagemCategoriaOutput;
import com.gm_digital.serviceorderapi.Service.ListagemCategoriasService;
import com.gm_digital.serviceorderapi.core.crud.CrudController;
import com.gm_digital.serviceorderapi.model.entity.ListagemCategoria;
import com.gm_digital.serviceorderapi.model.filter.ListagemCategoriaFilter;
import com.gm_digital.serviceorderapi.model.input.ListagemCategoriaInput;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/listagem-categorias")
public class ListagemCategoriasController extends CrudController<ListagemCategoria, ListagemCategoriasService, Integer, ListagemCategoriaFilter, ListagemCategoriaInput, ListagemCategoriaOutput> {
}
