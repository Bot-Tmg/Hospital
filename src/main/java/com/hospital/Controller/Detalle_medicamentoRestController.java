package com.hospital.Controller;


import com.hospital.Service.Services.Detalle_medicamentoService;
import com.hospital.Service.Services.PersonasServices;
import com.hospital.hospital.entitys.Detalle_medicamento;
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
public class Detalle_medicamentoRestController {

    private final Detalle_medicamentoService detalleMedicamentoService;

    @GetMapping
    public ResponseEntity<List<Detalle_medicamento>> listDetalle_medicamentoApi(){
        List<Detalle_medicamento> detalleMedicamentoList= detalleMedicamentoService.getListDetalleMedicamento();
        return new ResponseEntity<>(detalleMedicamentoList, HttpStatus.ACCEPTED);

    }

    @GetMapping(name = "/delete")
    public ResponseEntity<String> Deletedetalle_medicamento(@RequestParam(name = "id") Long id) {
        detalleMedicamentoService.DeleteDetalle_medicamento(id);
        return ResponseEntity.accepted().body("La accion solicitada fue un exito");
    }
    }































