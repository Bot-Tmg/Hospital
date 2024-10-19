package com.hospital.hospital.entitys.repository;

import com.hospital.hospital.entitys.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long  > {

    @Query(value = "SELECT * FROM medicamento", nativeQuery = true)
    List<Medicamento>listPersonas();

    @Override
    List<Medicamento> findAll();
}
