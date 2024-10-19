package com.hospital.request;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Detalle_medicamenteRequest {
    private String descripcion_diagnostico;
    private String fk_enfermedades;
    private String via_administracion;




}
