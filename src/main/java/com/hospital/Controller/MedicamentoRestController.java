package com.hospital.Controller;


import com.hospital.Service.Services.MedicamentoService;
import com.hospital.Service.Services.PersonasServices;
import com.hospital.hospital.entitys.Medicamento;
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
public class MedicamentoRestController {

    private final MedicamentoService medicamentoService;

    @GetMapping
    public ResponseEntity<List<Medicamento>> listMedicamentoApi(){
        List<Medicamento> medicamentoList = medicamentoService.getListMedicamento();
        return new ResponseEntity<>(medicamentoList, HttpStatus.ACCEPTED);

    }

    @GetMapping(name = "/delete")
    public ResponseEntity<String> Deletemedicamento(@RequestParam(name = "id") Long id) {
        medicamentoService.DeleteMedicamento(id);
        return ResponseEntity.accepted().body("La accion solicitada fue un exito");
    }
    }































