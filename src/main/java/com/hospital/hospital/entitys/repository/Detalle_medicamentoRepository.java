package com.hospital.hospital.entitys.repository;

import com.hospital.hospital.entitys.Detalle_medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Detalle_medicamentoRepository extends JpaRepository<Detalle_medicamento, Long  > {

    @Query(value = "SELECT * FROM detalle_medicamento", nativeQuery = true)
    List<Detalle_medicamento>listPersonas();

    @Override
    List<Detalle_medicamento> findAll();
}
