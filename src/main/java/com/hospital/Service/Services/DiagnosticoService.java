package com.hospital.Service.Services;

import com.hospital.hospital.entitys.Detalle_medicamento;
import com.hospital.hospital.entitys.Diagnostico;
import com.hospital.request.Centro_atencionRequest;
import com.hospital.request.DiagnosticoRequest;
import com.hospital.request.Diagnostico_enfermedadesRequest;
import com.hospital.response.Centro_atencionResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DiagnosticoService {

    List<Diagnostico> getListdiagnostico();
    void DeleteDiagnostico(Long id);
    Centro_atencionResponse searchDiagnostico(Long id);
    void saveDiagnostico(DiagnosticoRequest diagnosticoRequest);
    void updateDiagnostico(DiagnosticoRequest diagnosticoRequest);
}
