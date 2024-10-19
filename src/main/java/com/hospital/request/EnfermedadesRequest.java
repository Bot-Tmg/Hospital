package com.hospital.request;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class EnfermedadesRequest {

    private String descripcion_enfermedades;
    private Integer fk_tratamiento;




}
