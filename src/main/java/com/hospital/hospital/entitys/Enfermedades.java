package com.hospital.hospital.entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "enfermedades")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Enfermedades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "descripcion_enfermedades")
    private String descripcion_enfermedades;

    @Column(name = "fk_tratamiento")
    private Integer fk_tratamiento;



}
