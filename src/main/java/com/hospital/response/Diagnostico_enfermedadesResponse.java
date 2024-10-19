package com.hospital.response;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor




public class Diagnostico_enfermedadesResponse {
    private Long id;
    private Integer fk_diagnostico;
    private Integer fk_enfermedades;
}
