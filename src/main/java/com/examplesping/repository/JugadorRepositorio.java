package com.examplesping.repository;

import com.examplesping.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

@SuppressWarnings("JpaQlInspection")
public interface JugadorRepositorio extends JpaRepository<Jugador, Long> {


    List<Jugador> findByNombre(String nombre);
    List<Jugador> findByCanastoGreaterThanEqual(int canastas);
    List<Jugador> findByAsistoBetween(int min, int max);
    List<Jugador> findByPosicion(String posicion);
    List<Jugador> findByNacimientoBefore(LocalDate fecha);

    @Query("SELECT jugador.posicion,  AVG(jugador.canasto), AVG(jugador.asisto), " +
            "AVG(jugador.reboto)" +
            "FROM Jugador jugador " +
            "GROUP BY jugador.posicion")
    List<Object[]> AvgCanastoAndAvgAsistoAndAvgRebotoGroupbyPosicion();


   /* @Query("SELECT car.brand, AVG(car.price), MIN(car.price), MAX(car.price) " +
            "FROM Car car " +
            "GROUP BY car.brand " +
            "ORDER BY AVG(car.price) DESC ")
    List<Object[]> AvgAndMaxAndMinPricesPerBrandOrderedByAVGPrice(); */

   @Query("SELECT jugador.posicion,  AVG(jugador.canasto), AVG(jugador.asisto), " +
           "AVG(jugador.reboto)," +
           "MAX(jugador.canasto),"+
           "MAX(jugador.asisto),"+
           "MAX(jugador.reboto),"+

           "MIN(jugador.canasto),"+
           "MIN(jugador.reboto),"+
           "MIN(jugador.asisto)"+
           "FROM Jugador jugador " +
           "GROUP BY jugador.posicion")
   List<Object[]> AvgCanastoAndAvgAsistoAndAvgRebotoGroupbyPosicion2();

    //equipos

    //List<Jugador>findByEquipo(Integer equipo);
    //List<Jugador>findByEquipoAndPosicion(String equipo, String posicion);
    //List<Jugador>findByEquipoWhereCanastoMax(String equipo);
}
