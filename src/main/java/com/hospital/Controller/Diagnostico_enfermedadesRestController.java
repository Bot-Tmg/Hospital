package com.hospital.Controller;


import com.hospital.Service.Services.Diagnostico_enfermedadesService;
import com.hospital.Service.Services.PersonasServices;
import com.hospital.hospital.entitys.Diagnostico_enfermedades;
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
public class Diagnostico_enfermedadesRestController {

    private final Diagnostico_enfermedadesService diagnosticoEnfermedadesService;

    @GetMapping
    public ResponseEntity<List<Diagnostico_enfermedades>> listDiagnostico_enfermedadesApi(){
        List<Diagnostico_enfermedades> diagnostico_enfermedadesList = diagnosticoEnfermedadesService.getListDiagnosticEnfermedades();
        return new ResponseEntity<>(diagnostico_enfermedadesList, HttpStatus.ACCEPTED);

    }

    @GetMapping(name = "/delete")
    public ResponseEntity<String> Deletediagnostcio_enfermedades(@RequestParam(name = "id") Long id) {
        diagnosticoEnfermedadesService.DeleteDiagnostico_enfermedades(id);
        return ResponseEntity.accepted().body("La accion solicitada fue un exito");
    }
    }































