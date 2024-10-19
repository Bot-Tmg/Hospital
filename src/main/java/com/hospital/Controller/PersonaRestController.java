package com.hospital.Controller;


import com.hospital.Service.Services.PersonasServices;
import com.hospital.hospital.entitys.Persona;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class PersonaRestController {

    private final PersonasServices personasServices;

    @GetMapping
    public ResponseEntity<List<Persona>> listPersonsApi(){
        List<Persona> personaList = personasServices.getListPerson();
        return new ResponseEntity<>(personaList, HttpStatus.ACCEPTED);

    }

    @GetMapping(name = "/delete")
    public ResponseEntity<String> DeletePersona(@RequestParam(name = "id") Long id) {
        personasServices.DeletePersona(id);
        return ResponseEntity.accepted().body("La accion solicitada fue un exito");
    }
    }































