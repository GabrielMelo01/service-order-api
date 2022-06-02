package com.gm_digital.serviceorderapi.core.crud;

import com.gm_digital.serviceorderapi.core.spec.Filter;
import com.gm_digital.serviceorderapi.core.spec.Input;
import com.gm_digital.serviceorderapi.core.spec.Output;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The type Crud controller embedded.
 *
 * @param <T>      the type parameter
 * @param <S>      the type parameter
 * @param <IDTYPE> the type parameter
 * @param <FILTER> the type parameter
 */
public abstract class
        CrudControllerEmbeddedId<T ,S extends CrudService,IDTYPE,FILTER extends Filter,INPUT extends Input,OUTPUT extends Output>
        extends CrudController<T ,S ,IDTYPE,FILTER,INPUT,OUTPUT>  {

    @GetMapping("/id")
    @Override
    public ResponseEntity<?> findById(IDTYPE id){
        return  ResponseEntity.ok(service.findById(id));
    }

    @DeleteMapping
    @Override
    public void delete(IDTYPE id){
        service.delete(id);
    }
}
