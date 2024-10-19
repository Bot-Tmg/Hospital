package com.hospital.Service.Services;

import com.hospital.hospital.entitys.Detalle_medicamento;
import com.hospital.hospital.entitys.Historia_clinica;
import com.hospital.hospital.entitys.Tipo_documento;
import com.hospital.request.Tipo_documentoRequest;
import com.hospital.response.Centro_atencionResponse;

import java.util.List;

public interface Tipo_documentoService {

    List<Tipo_documento> getListTipo_documento();
    void DeleteTipo_documento(Long id);
    Centro_atencionResponse searchTipo_documento(Long id);
    void saveTipo_documento(Tipo_documentoRequest tipoDocumentoRequest);
    void updateTipo_documento(Tipo_documentoRequest tipoDocumentoRequest);
}
