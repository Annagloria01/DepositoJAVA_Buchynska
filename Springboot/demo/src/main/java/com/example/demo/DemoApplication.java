package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.Run.RunRecord;
import com.example.demo.Service.OrderService;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        WelcomeMessage message = new WelcomeMessage();
        System.out.println(message.getWelcomeMessage());

        // Ora funzionerà perché Location.OUTDOOR si riferisce al tuo Enum
        RunRecord r = new RunRecord(1,
                "Corsa Mattutina",
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(1),
                10,
                Location.OUTDOOR
        );

        System.out.println(r);
    }

    @Bean
    CommandLineRunner runner(OrderService orderService) {
        return args -> {
            orderService.processOrder("200");
            orderService.processOrder("500");
        };
    }
}
