package com.example.persona.services;

import com.example.persona.entities.Persona;
import com.example.persona.repositories.BaseRepository;
import com.example.persona.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository){
        super(baseRepository);
    }

//    @Override
//    @Transactional
//    public List<Persona> findAll() throws Exception {
//        try{
//            List<Persona> entities = personaRepository.findAll();
//            return entities;
//        }catch (Exception e){
//            throw new Exception(e.getMessage());
//        }
//    }
//
//    @Override
//    @Transactional
//    public Persona findById(Long id) throws Exception {
//        try{
//            Optional<Persona> entityOptional = personaRepository.findById(id);
//            //va a regresar una entity si la encuentra
//            return entityOptional.get();
//        }catch (Exception e){
//            throw new Exception(e.getMessage());
//        }
//    }
//
//    @Override
//    @Transactional
//    public Persona save(Persona entity) throws Exception {
//        try{
//            entity = personaRepository.save(entity);
//            return entity;
//        }catch (Exception e){
//            throw new Exception(e.getMessage());
//        }
//    }
//
//    @Override
//    @Transactional
//    public Persona update(Long id, Persona entity) throws Exception {
//        try{
//            Optional<Persona> entityOptional = personaRepository.findById(id);
//            Persona persona = entityOptional.get();
//            persona = personaRepository.save(entity);
//            return persona;
//        }catch (Exception e){
//            throw new Exception(e.getMessage());
//        }
//    }
//
//    @Override
//    @Transactional
//    public boolean delete(Long id) throws Exception {
//        try{
//            if(personaRepository.existsById(id)){
//                personaRepository.deleteById(id);
//                return true;
//            } else {
//                throw new Exception();
//            }
//        }catch (Exception e){
//            throw new Exception(e.getMessage());
//        }
//    }
}
