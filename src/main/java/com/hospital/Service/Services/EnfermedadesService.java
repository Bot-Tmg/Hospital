package com.hospital.Service.Services;

import com.hospital.hospital.entitys.Detalle_medicamento;
import com.hospital.hospital.entitys.Diagnostico;
import com.hospital.hospital.entitys.Enfermedades;
import com.hospital.request.EnfermedadesRequest;
import com.hospital.response.Centro_atencionResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EnfermedadesService {

    List<Enfermedades> getListenfermedade();
    void DeleteEnfermedades(Long id);
    Centro_atencionResponse searchEnfermedades(Long id);
    void saveEnfermedades(EnfermedadesRequest enfermedadesRequest);
    void updateEnfermedades(EnfermedadesRequest enfermedadesRequest);
}
