package com.hospital.Service.Services;

import com.hospital.hospital.entitys.Detalle_medicamento;
import com.hospital.hospital.entitys.Medicamento;
import com.hospital.request.MedicamentoRequest;
import com.hospital.response.Centro_atencionResponse;

import java.util.List;

public interface MedicamentoService {

    List<Medicamento> getListMedicamento();
    void DeleteMedicamento(Long id);
    Centro_atencionResponse searchMedicamento(Long id);
    void saveMedicamento(MedicamentoRequest medicamentoRequest);
    void updateMedicamento(MedicamentoRequest medicamentoRequest);
}
