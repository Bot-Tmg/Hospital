package com.hospital.Controller;


import com.hospital.Service.Services.DiagnosticoService;
import com.hospital.Service.Services.EnfermedadesService;
import com.hospital.hospital.entitys.Diagnostico;
import com.hospital.hospital.entitys.Enfermedades;
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
public class EnfermedadesRestController {

    private final EnfermedadesService enfermedadesService;

    @GetMapping
    public ResponseEntity<List<Enfermedades>> listEnfermedadesApi(){
        List<Enfermedades> enfermedadesList = enfermedadesService.getListenfermedade();
        return new ResponseEntity<>(enfermedadesList, HttpStatus.ACCEPTED);

    }

    @GetMapping(name = "/delete")
    public ResponseEntity<String> Deleteenfermedades(@RequestParam(name = "id") Long id) {
        enfermedadesService.DeleteEnfermedades(id);
        return ResponseEntity.accepted().body("La accion solicitada fue un exito");
    }
    }































