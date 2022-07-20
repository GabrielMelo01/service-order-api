package com.gm_digital.serviceorderapi.Service;

import com.gm_digital.serviceorderapi.core.crud.CrudService;
import com.gm_digital.serviceorderapi.model.filter.UsuarioFilter;
import com.gm_digital.serviceorderapi.model.input.UsuarioInput;
import com.gm_digital.serviceorderapi.model.output.UsuarioOutput;
import com.gm_digital.serviceorderapi.model.repository.UsuarioRepository;
import org.hibernate.criterion.NotEmptyExpression;
import org.hibernate.service.NullServiceException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.NullValueInNestedPathException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class UsuarioService extends CrudService<Optional<UsuarioOutput>, UsuarioRepository, Integer, UsuarioFilter, UsuarioInput, UsuarioOutput> {

    @Autowired private UsuarioRepository repository;

    @Override
    public Optional<UsuarioOutput> findById(Integer id){
        ModelMapper modelMapper = new ModelMapper();

        try {
            System.out.println("PASSEI AQUI");
            return repository.findById(id).map(content -> modelMapper.map(content, UsuarioOutput.class));
        } catch (EntityNotFoundException e) {
            throw new EntityNotFoundException("Tabela não encontrada");
        }
    }

}
