package com.hospital.request;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Centro_atencionRequest {

    private String nit;
    private String razon_social;
    private Boolean estado_sistema;




}
