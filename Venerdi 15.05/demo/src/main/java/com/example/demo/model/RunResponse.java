package com.example.demo.model;

import java.time.LocalDateTime;

// Espone solo i campi che il client deve vedere
public record RunResponse(
        Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        int miles,
        String location  // String invece di enum: più leggibile per il client
) {}