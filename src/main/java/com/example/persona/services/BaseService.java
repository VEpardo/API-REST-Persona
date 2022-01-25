package com.example.persona.services;

import java.util.List;

//podemos pasarle una persona, modelo, autor, domicilio
public interface BaseService<E> {
    //regresa una lista de todas las entidades que estan en la base de datos
    public List<E> findAll() throws Exception;
    //traernos una entidad por id
    public E findById(Long id) throws Exception;
    //crea una entidad
    public E save (E entity) throws Exception;
    //entidad actualizada
    public E update(Long id, E entity) throws Exception;
    public boolean delete(Long id) throws Exception;
}
