package com.example.demo.model;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

// Record immutabile
public record RunRequest(

        @NotBlank(message = "Il titolo non può essere vuoto")
        @Size(min = 3, max = 100)
        String title,

        @NotNull(message = "La data di inizio è obbligatoria")
        LocalDateTime startedOn,

        @NotNull(message = "La data di fine è obbligatoria")
        LocalDateTime completedOn,

        @Positive(message = "Le miglia devono essere positive")
        int miles,

        @NotNull(message = "La location è obbligatoria")
        Location location
) {}