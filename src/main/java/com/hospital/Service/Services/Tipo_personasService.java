package com.hospital.Service.Services;

import com.hospital.hospital.entitys.Detalle_medicamento;
import com.hospital.hospital.entitys.Historia_clinica;
import com.hospital.hospital.entitys.Tipo_personas;
import com.hospital.request.Tipo_personasRequest;
import com.hospital.response.Centro_atencionResponse;

import java.util.List;

public interface Tipo_personasService {

    List<Tipo_personas> getListTipo_persona();
    void DeleteTipo_persona(Long id);
    Centro_atencionResponse searchTipo_persona(Long id);
    void saveTipo_persona(Tipo_personasRequest tipoPersonasRequest);
    void updateTipo_persona(Tipo_personasRequest tipoPersonasRequest);
}
