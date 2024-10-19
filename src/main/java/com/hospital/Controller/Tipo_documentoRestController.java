package com.hospital.Controller;


import com.hospital.Service.Services.PersonasServices;
import com.hospital.Service.Services.Tipo_documentoService;
import com.hospital.hospital.entitys.Persona;
import com.hospital.hospital.entitys.Tipo_documento;
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
public class Tipo_documentoRestController {

    private final Tipo_documentoService tipoDocumentoService;

    @GetMapping
    public ResponseEntity<List<Tipo_documento>> listTipo_documentoApi(){
        List<Tipo_documento> tipoDocumentoList = tipoDocumentoService.getListTipo_documento();
        return new ResponseEntity<>(tipoDocumentoList, HttpStatus.ACCEPTED);

    }

    @GetMapping(name = "/delete")
    public ResponseEntity<String> Deletetipo_documento(@RequestParam(name = "id") Long id) {
        tipoDocumentoService.DeleteTipo_documento(id);
        return ResponseEntity.accepted().body("La accion solicitada fue un exito");
    }
    }































