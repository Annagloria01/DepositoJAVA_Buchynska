package com.example.demo;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class WelcomeMessage {

    private String msg;

    public String getWelcomeMessage() {

        return "Welcome to my Spring Boot App";
    }

    @PostConstruct
    public void init() {
        msg = "Applicazione avviata con successo";
    }

    @PreDestroy
    public void destroy() {

    }

    //LIFE CYCLE DEI BEAN
    //
}
