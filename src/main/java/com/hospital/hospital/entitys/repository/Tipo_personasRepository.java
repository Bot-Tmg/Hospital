package com.hospital.hospital.entitys.repository;


import com.hospital.hospital.entitys.Tipo_personas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Tipo_personasRepository extends JpaRepository<Tipo_personas, Long  > {

    @Query(value = "SELECT * FROM tipo_personas", nativeQuery = true)
    List<Tipo_personas>listPersonas();

    @Override
    List<Tipo_personas> findAll();
}
