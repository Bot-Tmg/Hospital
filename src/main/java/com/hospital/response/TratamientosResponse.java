package com.hospital.response;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class TratamientosResponse {
    private Long id;
    private String descripcion;
    private String fk_medicamento;




}
