package com.hospital.request;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class TratamientosRequest {

    private String descripcion;
    private String fk_medicamento;




}
