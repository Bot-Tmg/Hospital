package com.hospital.Service.Services;

import com.hospital.hospital.entitys.Detalle_medicamento;
import com.hospital.hospital.entitys.Diagnostico_enfermedades;
import com.hospital.request.Detalle_medicamenteRequest;
import com.hospital.request.Diagnostico_enfermedadesRequest;
import com.hospital.response.Centro_atencionResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Diagnostico_enfermedadesService {

    List<Diagnostico_enfermedades> getListDiagnosticEnfermedades();
    void DeleteDiagnostico_enfermedades(Long id);
    Centro_atencionResponse searchDiagnostico_enfermedades(Long id);
    void saveDiagnostico_enfermedades(Diagnostico_enfermedadesRequest diagnosticoEnfermedadesRequest);
    void updateDiagnostico_enfermedades(Diagnostico_enfermedadesRequest diagnosticoEnfermedadesRequest);
}
