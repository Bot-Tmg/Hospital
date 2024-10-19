package com.hospital.Service.Services;

import com.hospital.hospital.entitys.Centro_atencion;
import com.hospital.hospital.entitys.Persona;
import com.hospital.request.Centro_atencionRequest;
import com.hospital.response.Centro_atencionResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Centro_atencionService {

    List<Centro_atencion> getListCenterAtention();
    void DeleteCentro_atencion(Long id);
    Centro_atencionResponse searchCentro_atencion(Long id);
    void saveCentro_atencion(Centro_atencionRequest centroAtencionRequest);
    void updateCentro_atencion(Centro_atencionRequest centroAtencionRequest);

}
