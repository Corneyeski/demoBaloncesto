package com.examplesping.repository;

import com.examplesping.domain.Jugadores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface repositorio extends JpaRepository<Jugadores, Long> {


    @Query("SELECT nombre FROM Jugadores jugador WHERE jugador.nombre LIKE CONCAT(:nombre,'*')")
    List<Jugadores> findCarByPlateNumberSubstring(@Param("nombre") String nombre);

    List<Jugadores> findByNombreStartingWith(String nombre);

    List<Jugadores> FindByNombre(String nombre);

}
