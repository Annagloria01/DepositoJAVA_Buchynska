package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Location;
import com.example.demo.model.Run;

@Repository
public interface RunRepository extends JpaRepository<Run, Integer> {

    // Trova tutte le corse con un titolo specifico
    List<Run> findByTitle(String title);

    // Trova tutte le corse con miglia maggiori di una soglia
    List<Run> findByMilesGreaterThan(double miles);

    // Trova corse per location
    List<Run> findByLocation(Location location);

    // Combina condizioni con AND
    List<Run> findByLocationAndMilesGreaterThan(Location location, double miles);

    // Trova la prima corsa per titolo (Optional per sicurezza)
    Optional<Run> findFirstByTitle(String title);

    // Verifica se esiste una corsa con un certo titolo
    boolean existsByTitle(String title);

     // JPQL: usa "Run" (nome classe) e "r.location" (nome campo Java)
    @Query("SELECT r FROM Run r WHERE r.location = :location ORDER BY r.miles DESC")
    List<Run> findByLocationOrderedByMiles(@Param("location") Location location);
}