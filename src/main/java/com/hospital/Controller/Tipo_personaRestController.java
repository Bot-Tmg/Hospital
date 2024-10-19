package com.hospital.Controller;


import com.hospital.Service.Services.PersonasServices;
import com.hospital.Service.Services.Tipo_personasService;
import com.hospital.hospital.entitys.Persona;
import com.hospital.hospital.entitys.Tipo_personas;
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
public class Tipo_personaRestController {

    private final Tipo_personasService tipoPersonasService;

    @GetMapping
    public ResponseEntity<List<Tipo_personas>> listTipo_personasApi(){
        List<Tipo_personas> tipoPersonasList = tipoPersonasService.getListTipo_persona();
        return new ResponseEntity<>(tipoPersonasList, HttpStatus.ACCEPTED);

    }

    @GetMapping(name = "/delete")
    public ResponseEntity<String> Deletetipo_personas(@RequestParam(name = "id") Long id) {
        tipoPersonasService.DeleteTipo_persona(id);
        return ResponseEntity.accepted().body("La accion solicitada fue un exito");
    }
    }































