package com.gm_digital.serviceorderapi.controller;

import com.gm_digital.serviceorderapi.Service.UsuarioService;
import com.gm_digital.serviceorderapi.core.crud.CrudController;
import com.gm_digital.serviceorderapi.model.entity.Usuario;
import com.gm_digital.serviceorderapi.model.filter.UsuarioFilter;
import com.gm_digital.serviceorderapi.model.input.UsuarioInput;
import com.gm_digital.serviceorderapi.model.output.UsuarioOutput;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping(value ="/usuarios")
public class UsuarioController extends CrudController<Usuario, UsuarioService, Integer, UsuarioFilter, UsuarioInput, UsuarioOutput> {

//    @Override
//    @GetMapping("/{id}")
//    public ResponseEntity<?> findById(@PathVariable Integer id){
//        return ResponseEntity.ok(service.findById(id));
//    }
}
