package com.hospital.hospital.entitys.repository;


import com.hospital.hospital.entitys.Tratamientos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TratamientosRepository extends JpaRepository<Tratamientos, Long  > {

    @Query(value = "SELECT * FROM tratamientos", nativeQuery = true)
    List<Tratamientos>listPersonas();

    @Override
    List<Tratamientos> findAll();
}
