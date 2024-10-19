package com.hospital.hospital.entitys.repository;

import com.hospital.hospital.entitys.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface
PersonaRepository extends JpaRepository<Persona, Long  > {

    @Query(value = "SELECT * FROM personas", nativeQuery = true)
    List<Persona>listPersonas();

    @Query(value = "SELECT * FROM personas WHERE id=:id", nativeQuery = true)
    Persona searchPersonas(@Param(value = "id")Long id);

    @Override
    List<Persona> findAll();
}
