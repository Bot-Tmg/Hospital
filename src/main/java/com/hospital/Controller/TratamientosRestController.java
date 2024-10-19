package com.hospital.Controller;


import com.hospital.Service.Services.PersonasServices;
import com.hospital.Service.Services.TratamientosService;
import com.hospital.hospital.entitys.Persona;
import com.hospital.hospital.entitys.Tratamientos;
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
public class TratamientosRestController {

    private final TratamientosService tratamientosService;

    @GetMapping
    public ResponseEntity<List<Tratamientos>> listTratamientodApi(){
        List<Tratamientos> tratamientosList = tratamientosService.getListTratamiento();
        return new ResponseEntity<>(tratamientosList, HttpStatus.ACCEPTED);

    }

    @GetMapping(name = "/delete")
    public ResponseEntity<String> DeletePersona(@RequestParam(name = "id") Long id) {
        tratamientosService.DeleteTratamiento(id);
        return ResponseEntity.accepted().body("La accion solicitada fue un exito");
    }
    }































