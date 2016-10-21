package com.examplesping.repository;

import com.examplesping.domain.Equipo;
import com.examplesping.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Alan on 21/10/2016.
 */
public interface EquipoRepository extends JpaRepository<Equipo, Long> {

    List<Equipo>findByLocalidad(String localidad);
    List<Jugador>findByEquipo(String equipo);
    List<Jugador>findByEquipoAndPosicion(String equipo, String posicion);
    List<Jugador>findByEquipoWhereCanastoMax(String equipo);
}
