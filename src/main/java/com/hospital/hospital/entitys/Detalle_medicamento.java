package com.hospital.hospital.entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "detalle_medicamento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Detalle_medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "descripcion")
    private String descripcion_diagnostico;

    @Column(name = "farmaceutica")
    private String fk_enfermedades;

    @Column(name = "via_administracion")
    private String via_administracion;



}
