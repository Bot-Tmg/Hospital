package com.hospital.Controller;


import com.hospital.Service.Services.Historia_clinicaService;
import com.hospital.Service.Services.PersonasServices;
import com.hospital.hospital.entitys.Historia_clinica;
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
public class Historia_clinicaRestController {

    private final Historia_clinicaService historiaClinicaService;

    @GetMapping
    public ResponseEntity<List<Historia_clinica>> listHistoria_clinicaApi(){
        List<Historia_clinica> historia_clinicaList = historiaClinicaService.getListHistoria_clinica();
        return new ResponseEntity<>(historia_clinicaList, HttpStatus.ACCEPTED);

    }

    @GetMapping(name = "/delete")
    public ResponseEntity<String> Deletehistoria_clinica(@RequestParam(name = "id") Long id) {
        historiaClinicaService.DeleteHistoria_clinica(id);
        return ResponseEntity.accepted().body("La accion solicitada fue un exito");
    }
    }































