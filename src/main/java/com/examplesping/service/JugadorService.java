package com.examplesping.service;

import com.examplesping.domain.Equipo;
import com.examplesping.domain.Jugador;
import com.examplesping.repository.EquipoRepository;
import com.examplesping.repository.JugadorRepositorio;
        import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class JugadorService {

    @Autowired
    private JugadorRepositorio jugadorRepositorio;
    @Autowired
    private EquipoRepository equipoRepositorio;

    public void pruebaJugadores(){

        Equipo e1= new Equipo("Bulls","chicago", LocalDate.of(1992,12,10));
        equipoRepositorio.save(e1);

        Equipo e2= new Equipo("Memphis","memphis",LocalDate.of(1992,12,10));
        equipoRepositorio.save(e2);

        Equipo e3= new Equipo("Yankies","nueva york",LocalDate.of(1992,12,10));
        equipoRepositorio.save(e3);

        Equipo e4= new Equipo("Lakers","LA",LocalDate.of(1992,12,10));
        equipoRepositorio.save(e4);

        Equipo e5= new Equipo("shocks","miami",LocalDate.of(1992,12,10));
        equipoRepositorio.save(e5);

        Jugador j1= new Jugador("Alan", LocalDate.of(1992,12,10),10,20,50,"aleron");
        j1.setEquipo(e1);
        jugadorRepositorio.save(j1);

        Jugador j2= new Jugador("Alex",LocalDate.of(1992,12,10),20,100,32,"pichichi");
        j2.setEquipo(e2);
        jugadorRepositorio.save(j2);

        Jugador j3= new Jugador("ricard",LocalDate.of(1992,12,10),67,45,35,"lateral");
        j3.setEquipo(e3);
        jugadorRepositorio.save(j3);

        Jugador j4= new Jugador("metalero",LocalDate.of(1992,12,10),70,57,98,"defensa");
        j4.setEquipo(e4);
        jugadorRepositorio.save(j4);

        Jugador j5= new Jugador("algo",LocalDate.of(1992,12,10),76,12,45,"aleron");
        j5.setEquipo(e5);
        jugadorRepositorio.save(j5);

        System.out.println("Buscar jugadores por nombre");
        System.out.println(jugadorRepositorio.findByNombre("Alan"));

        System.out.println("Buscar jugadores con mas de 10 canastas");
        System.out.println(jugadorRepositorio.findByCanastoGreaterThanEqual(10));

        System.out.println("Buscar jugadores con asistencias entre 5 y 10");
        System.out.println(jugadorRepositorio.findByAsistoBetween(5,10));

        System.out.println("Buscar a los bases");
        System.out.println(jugadorRepositorio.findByPosicion("aleron"));

        System.out.println("Buscar por fecha nacimiento");
        System.out.println(jugadorRepositorio.findByNacimientoBefore(LocalDate.of(1990,12,12)));

        System.out.println("Media jugadores agrupados");
        List<Object[]> carList = jugadorRepositorio.AvgCanastoAndAvgAsistoAndAvgRebotoGroupbyPosicion();

        for (Object[] jugador : carList)
        {
            System.out.print(jugador[0] + " ");
            System.out.print(jugador[1] + " ");
            System.out.print(jugador[2] + " ");
            System.out.print(jugador[3] + " ");
            System.out.println("");
        }

        List<Object[]> media = jugadorRepositorio.AvgCanastoAndAvgAsistoAndAvgRebotoGroupbyPosicion2();

        for (Object[] jugador : media)
        {
            System.out.print(jugador[0] + " ");
            System.out.print(jugador[1] + " ");
            System.out.print(jugador[2] + " ");
            System.out.print(jugador[3] + " ");
            System.out.print(jugador[4] + " ");
            System.out.print(jugador[5] + " ");
            System.out.print(jugador[6] + " ");
            System.out.print(jugador[7] + " ");
            System.out.print(jugador[8] + " ");
            System.out.print(jugador[9] + " ");


            System.out.println("");
        }

        System.out.println("Jugadores de una localidad");
        System.out.println(equipoRepositorio.findByLocalidad("chicago"));

        //Devuelve todos los jugadores de un equipo, a partir del nombre completo del equipo.

        System.out.println("Encontrar jugador segun el equipo");
        System.out.println(equipoRepositorio.findByEquipo("bulls"));

       // Devuelve todos los jugadores de un equipo, que además jueguen en la misma posición
        //(parámetro adicional de la consulta), por ejemplo, alero.

        System.out.println("Encontrar jugadores del mismo equipo y posicion");
        System.out.println(equipoRepositorio.findByEquipoAndPosicion("bulls","alero"));

        //Devuelve el jugador que más canastas ha realizado de un equipo determinado como
        //parámetro.

        System.out.println("Encontrar al jugador con mas canastas por equipo");
        System.out.println(equipoRepositorio.findByEquipoWhereCanastoMax("lakers"));
    }

}