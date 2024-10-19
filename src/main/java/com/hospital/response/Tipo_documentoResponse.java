package com.hospital.response;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Tipo_documentoResponse {
    private Long id;
    private String sigla;
    private String descripcion;




}
