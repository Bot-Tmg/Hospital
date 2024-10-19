package com.hospital.hospital.entitys.repository;

import com.hospital.hospital.entitys.Diagnostico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DiagnosticoRepository extends JpaRepository<Diagnostico, Long  > {

    @Query(value = "SELECT * FROM diagnostico", nativeQuery = true)
    List<Diagnostico>listPersonas();

    @Override
    List<Diagnostico> findAll();
}
