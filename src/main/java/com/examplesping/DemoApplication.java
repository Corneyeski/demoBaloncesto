package com.examplesping;

import com.examplesping.domain.Jugadores;
import com.examplesping.repository.repositorio;
import com.examplesping.service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;
import com.examplesping.domain.Jugadores;
        import com.examplesping.repository.repositorio;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.context.ConfigurableApplicationContext;

        import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        JugadorService jugadorService = context.getBean(JugadorService.class);

        jugadorService.pruebaJugadores();

    }
}