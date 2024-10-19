package com.hospital.response;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor




public class Centro_atencionResponse {
    private Long id;
    private String nit;
    private String razon_social;
    private Boolean estado_sistema;
}
