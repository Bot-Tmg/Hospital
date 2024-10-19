package com.hospital.response;

import lombok.*;

import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor




public class DiagnosticoResponse {
    private String descripcion_diagnostico;
    private Integer fk_enfermedades;
    private Date fecha_creacion;
    private Date fecha_actualizacion;
}
