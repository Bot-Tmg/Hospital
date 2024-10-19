package com.hospital.Service.Services;

import com.hospital.hospital.entitys.Detalle_medicamento;
import com.hospital.request.Centro_atencionRequest;
import com.hospital.request.Detalle_medicamenteRequest;
import com.hospital.response.Centro_atencionResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Detalle_medicamentoService {

    List<Detalle_medicamento> getListDetalleMedicamento();
    void DeleteDetalle_medicamento(Long id);
    Centro_atencionResponse searchDetalle_medicamento(Long id);
    void saveDetalle_medicamento(Detalle_medicamenteRequest detalleMedicamenteRequest);
    void updateDetalle_medicamento(Detalle_medicamenteRequest detalleMedicamenteRequest);
}
