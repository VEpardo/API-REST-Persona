package com.example.persona.controllers;

import com.example.persona.entities.Persona;
import com.example.persona.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
//desde cualquier origen podemos acceder a los datos
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {

//    private PersonaServiceImpl personaServiceImpl;
//
//    public PersonaController(PersonaServiceImpl personaServiceImpl) {
//        this.personaServiceImpl = personaServiceImpl;
//    }

    //estatus en JSON
//    @GetMapping("")
//    public ResponseEntity<?> getAll(){
//        try {
//            return ResponseEntity.status(HttpStatus.OK).body(personaServiceImpl.findAll());
//        } catch (Exception e){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
//        }
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<?> getOne(@PathVariable Long id){
//        try {
//            return ResponseEntity.status(HttpStatus.OK).body(personaServiceImpl.findById(id));
//        } catch (Exception e){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
//        }
//    }
//
//    @PostMapping("")
//    public ResponseEntity<?> save(@RequestBody Persona entity){
//        try {
//            return ResponseEntity.status(HttpStatus.OK).body(personaServiceImpl.save(entity));
//        } catch (Exception e){
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
//        }
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Persona entity){
//        try {
//            return ResponseEntity.status(HttpStatus.OK).body(personaServiceImpl.update(id, entity));
//        } catch (Exception e){
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable Long id){
//        try {
//            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(personaServiceImpl.delete(id));
//        } catch (Exception e){
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
//        }
//    }

}
