package com.examplesping.repository;

import com.examplesping.domain.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Alan on 21/10/2016.
 */
public interface EquipoRepository extends JpaRepository<Equipo, Long> {

    List<Equipo>findByLocalidad(String localidad);

}
