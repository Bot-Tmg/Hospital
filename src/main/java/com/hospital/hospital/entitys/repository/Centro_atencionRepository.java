package com.hospital.hospital.entitys.repository;

import com.hospital.hospital.entitys.Centro_atencion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Centro_atencionRepository extends JpaRepository<Centro_atencion, Long  > {

    @Query(value = "SELECT * FROM centro_atencion", nativeQuery = true)
    List<Centro_atencion>listPersonas();

    @Query(value = "SELECT * FROM centro_atencion WHERE id=:id", nativeQuery = true)
    Centro_atencion searchCentro_atencions(@Param(value = "id")Long id);

    @Override
    List<Centro_atencion> findAll();
}
