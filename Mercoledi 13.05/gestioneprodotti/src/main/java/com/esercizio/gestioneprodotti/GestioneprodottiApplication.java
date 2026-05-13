package com.esercizio.gestioneprodotti;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.esercizio.gestioneprodotti.service.ProdottoService;

@SpringBootApplication
public class GestioneprodottiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestioneprodottiApplication.class, args);
    }

    //CommandLineRunner
    @Bean
    public CommandLineRunner avvia(ProdottoService prodottoService) {
        return args -> {
            prodottoService.stampaCatalogo(20);
        };
    }
}
