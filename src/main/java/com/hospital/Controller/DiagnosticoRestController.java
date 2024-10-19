package com.hospital.Controller;


import com.hospital.Service.Services.DiagnosticoService;
import com.hospital.Service.Services.Diagnostico_enfermedadesService;
import com.hospital.hospital.entitys.Diagnostico;
import com.hospital.hospital.entitys.Diagnostico_enfermedades;
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
public class DiagnosticoRestController {

    private final DiagnosticoService diagnosticoService;

    @GetMapping
    public ResponseEntity<List<Diagnostico>> listDiagnosticoApi(){
        List<Diagnostico> diagnosticoList = diagnosticoService.getListdiagnostico();
        return new ResponseEntity<>(diagnosticoList, HttpStatus.ACCEPTED);

    }

    @GetMapping(name = "/delete")
    public ResponseEntity<String> Deletediagnostico(@RequestParam(name = "id") Long id) {
        diagnosticoService.DeleteDiagnostico(id);
        return ResponseEntity.accepted().body("La accion solicitada fue un exito");
    }
    }































