package com.hospital.request;

import lombok.*;

import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class MedicamentoRequest {

    private String descripcion;
    private Date fecha_creacion;
    private Date fecha_vencimiento;
    private Integer fk_detalle_medicamento;




}
