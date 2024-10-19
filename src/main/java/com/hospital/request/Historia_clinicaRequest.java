package com.hospital.request;

import lombok.*;

import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Historia_clinicaRequest {

    private Integer fk_persona;
    private Integer fk_profesional;
    private Integer fk_diagnostico;
    private Date fecha_creacion;
    private Integer fk_centro_atencion;
    private Boolean estado_sistema;





}
