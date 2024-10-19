package com.hospital.hospital.entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "personas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String apellido;

    @ManyToOne
    @JoinColumn(name = "fk_tipo_documento", referencedColumnName = "id")
    private Tipo_documento fk_tipo_documento;





}
