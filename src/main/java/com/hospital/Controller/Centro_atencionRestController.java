package com.hospital.Controller;


import com.hospital.Service.Services.Centro_atencionService;
import com.hospital.hospital.entitys.Centro_atencion;
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
public class Centro_atencionRestController {

    private final Centro_atencionService centroAtencionService;

    @GetMapping
    public ResponseEntity<List<Centro_atencion>> listCentro_atencionApi(){
        List<Centro_atencion> centroAtencionList = centroAtencionService.getListCenterAtention();
        return new ResponseEntity<>(centroAtencionList, HttpStatus.ACCEPTED);

    }

    @GetMapping(name = "/delete")
    public ResponseEntity<String> Deletecentro_atencion(@RequestParam(name = "id") Long id) {
        centroAtencionService.DeleteCentro_atencion(id);
        return ResponseEntity.accepted().body("La accion solicitada fue un exito");
    }
    }































