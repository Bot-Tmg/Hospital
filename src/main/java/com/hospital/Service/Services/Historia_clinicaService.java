package com.hospital.Service.Services;

import com.hospital.hospital.entitys.Detalle_medicamento;
import com.hospital.hospital.entitys.Diagnostico;
import com.hospital.hospital.entitys.Historia_clinica;
import com.hospital.request.Historia_clinicaRequest;
import com.hospital.response.Centro_atencionResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Historia_clinicaService   {

    List<Historia_clinica> getListHistoria_clinica();
    void DeleteHistoria_clinica(Long id);
    Centro_atencionResponse searchHistoria_clinica(Long id);
    void saveHistoria_clinica(Historia_clinicaRequest historiaClinicaRequest);
    void updateHistoria_clinica(Historia_clinicaRequest historiaClinicaRequest);
}
