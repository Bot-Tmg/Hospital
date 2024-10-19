package com.hospital.response;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor




public class EnfermedadesResponse {
    private Long id;
    private String descripcion_enfermedades;
    private Integer fk_tratamiento;
}
