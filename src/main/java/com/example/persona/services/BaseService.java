package com.example.persona.services;

import com.example.persona.entities.audit.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

//de solo ver la interface tenemos una idea clara de que metodos implementa servicio
//podemos pasarle una persona, modelo, autor, domicilio
public interface BaseService<E extends Base, ID extends Serializable> {
    //regresa una lista de todas las entidades que estan en la base de datos
    public List<E> findAll() throws Exception;
    public Page<E> findAll(Pageable pageable) throws Exception;
    //traernos una entidad por id
    public E findById(ID id) throws Exception;
    //crea una entidad
    public E save (E entity) throws Exception;
    //entidad actualizada
    public E update(ID id, E entity) throws Exception;
    public boolean delete(ID id) throws Exception;
}
