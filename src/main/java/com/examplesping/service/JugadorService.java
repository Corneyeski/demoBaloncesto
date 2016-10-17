package com.examplesping.service;

import com.examplesping.domain.Jugadores;
        import com.examplesping.repository.repositorio;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

        import java.time.LocalDate;

@SpringBootApplication
public class JugadorService {

    @Autowired
    private repositorio jugadorRepositorio;

    public void pruebaJugadores(){

        Jugadores j1= new Jugadores("Alan", LocalDate.of(1992,12,10),10,20,50,"aleron");
        jugadorRepositorio.save(j1);

        Jugadores j2= new Jugadores("Alex",LocalDate.of(1992,12,10),20,100,32,"pichichi");
        jugadorRepositorio.save(j2);

        Jugadores j3= new Jugadores("ricard",LocalDate.of(1992,12,10),67,45,35,"lateral");
        jugadorRepositorio.save(j3);

        Jugadores j4= new Jugadores("metalero",LocalDate.of(1992,12,10),70,57,98,"defensa");
        jugadorRepositorio.save(j4);

        Jugadores j5= new Jugadores("algo",LocalDate.of(1992,12,10),76,12,45,"aleron");
        jugadorRepositorio.save(j5);

        System.out.print("Buscar jugadores por nombre");
        System.out.print(jugadorRepositorio.FindByNombre("Alan"));
    }
}