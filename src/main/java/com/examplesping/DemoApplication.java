package com.examplesping;

import com.examplesping.service.JugadorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        JugadorService jugadorService = context.getBean(JugadorService.class);

        jugadorService.pruebaJugadores();

    }
}