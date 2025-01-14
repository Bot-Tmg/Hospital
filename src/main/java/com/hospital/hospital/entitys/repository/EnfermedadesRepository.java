package com.hospital.hospital.entitys.repository;

import com.hospital.hospital.entitys.Enfermedades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EnfermedadesRepository extends JpaRepository<Enfermedades, Long  > {

    @Query(value = "SELECT * FROM enfermedades", nativeQuery = true)
    List<Enfermedades>listPersonas();

    @Override
    List<Enfermedades> findAll();
}
