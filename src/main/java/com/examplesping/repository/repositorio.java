package com.examplesping.repository;

import com.examplesping.domain.Jugadores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

@SuppressWarnings("JpaQlInspection")
public interface repositorio extends JpaRepository<Jugadores, Long> {


    List<Jugadores> findByNombre(String nombre);
    List<Jugadores> findByCanastoGreaterThanEqual(int canastas);
    List<Jugadores> findByAsistoBetween(int min, int max);
    List<Jugadores> findByPosicion(String posicion);
    List<Jugadores> findByNacimientoBefore(LocalDate fecha);

    @Query("SELECT jugadores.posicion,  AVG(jugadores.canasto), AVG(jugadores.asisto), " +
            "AVG(jugadores.reboto)" +
            "FROM Jugadores jugadores " +
            "GROUP BY jugadores.posicion")
    List<Object[]> AvgCanastoAndAvgAsistoAndAvgRebotoGroupbyPosicion();


   /* @Query("SELECT car.brand, AVG(car.price), MIN(car.price), MAX(car.price) " +
            "FROM Car car " +
            "GROUP BY car.brand " +
            "ORDER BY AVG(car.price) DESC ")
    List<Object[]> AvgAndMaxAndMinPricesPerBrandOrderedByAVGPrice(); */
}
