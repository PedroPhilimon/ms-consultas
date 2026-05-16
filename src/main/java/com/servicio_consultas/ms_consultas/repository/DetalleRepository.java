package com.servicio_consultas.ms_consultas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicio_consultas.ms_consultas.model.DetalleConsulta;

public interface DetalleRepository extends JpaRepository<DetalleConsulta, Long>{

}
