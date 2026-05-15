package com.example.demo.exception;

// Estende RuntimeException: eccezione non verificata (unchecked)
public class RunNotFoundException extends RuntimeException {

    public RunNotFoundException(Integer id) {
        super("Corsa con id " + id + " non trovato");
    }
}