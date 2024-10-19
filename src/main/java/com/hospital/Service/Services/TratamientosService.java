package com.hospital.Service.Services;

import com.hospital.hospital.entitys.Detalle_medicamento;
import com.hospital.hospital.entitys.Historia_clinica;
import com.hospital.hospital.entitys.Tratamientos;
import com.hospital.request.TratamientosRequest;
import com.hospital.response.Centro_atencionResponse;

import java.util.List;

public interface TratamientosService {

    List<Tratamientos> getListTratamiento();
    void DeleteTratamiento(Long id);
    Centro_atencionResponse searchTratamiento(Long id);
    void saveTratamiento(TratamientosRequest tratamientosRequest);
    void updateTratamiento(TratamientosRequest tratamientosRequest);
}
