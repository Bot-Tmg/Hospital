package com.hospital.hospital.entitys.repository;


import com.hospital.hospital.entitys.Tipo_documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Tipo_documentoRepository extends JpaRepository<Tipo_documento, Long  > {

    @Query(value = "SELECT * FROM tipo_documentos", nativeQuery = true)
    List<Tipo_documento>listPersonas();

    @Override
    List<Tipo_documento> findAll();
}
