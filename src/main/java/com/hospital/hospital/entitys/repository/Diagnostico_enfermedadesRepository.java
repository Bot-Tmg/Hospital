package com.hospital.hospital.entitys.repository;

import com.hospital.hospital.entitys.Diagnostico_enfermedades;
import com.hospital.hospital.entitys.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Diagnostico_enfermedadesRepository extends JpaRepository<Diagnostico_enfermedades, Long  > {

    @Query(value = "SELECT * FROM diagnostico_enfermedades", nativeQuery = true)
    List<Diagnostico_enfermedades>listPersonas();

    @Override
    List<Diagnostico_enfermedades> findAll();
}
