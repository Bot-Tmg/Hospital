package com.hospital.response;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor




public class Detalle_medicamentoResponse {
    private Long id;
    private String descripcion_diagnostico;
    private String fk_enfermedades;
    private String via_administracion;
}
