package com.hospital.request;

import lombok.*;

import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Diagnostico_enfermedadesRequest {
    private Integer fk_diagnostico;
    private Integer fk_enfermedades;




}
