package com.examplesping.repository;

import com.examplesping.domain.Jugadores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface repositorio extends JpaRepository<Jugadores, Long> {


    List<Jugadores> findByNombre(String nombre);
    List<Jugadores> findByCanastoGreaterThanEqual(int canastas);
    List<Jugadores> findByAsistoBetween(int min, int max);
    List<Jugadores> findByPosicion(String posicion);
    List<Jugadores> findByNacimientoBefore(LocalDate fecha);
}
