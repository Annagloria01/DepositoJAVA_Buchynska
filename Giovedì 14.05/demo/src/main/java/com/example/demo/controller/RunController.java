package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Run;
import com.example.demo.repository.RunRepository;

@RestController
@RequestMapping("/api/runs")
public class RunController {

    private final RunRepository runRepository;

    // Iniezione via costruttore (raccomandata)
    public RunController(RunRepository runRepository) {
        this.runRepository = runRepository;
    }

    // GET /api/runs → lista tutte le corse
    @GetMapping
    public List<Run> findAll() {
        return runRepository.findAll();
    }

    // GET /api/runs/{id} → singola corsa
    @GetMapping("/{id}")
    public ResponseEntity<Run> findById(@PathVariable Integer id) {
        Optional<Run> run = runRepository.findById(id);
        return run.map(ResponseEntity::ok)
                  .orElse(ResponseEntity.notFound().build());
    }

    // POST /api/runs → crea nuova corsa
    @PostMapping
    public ResponseEntity<Run> create(@RequestBody Run run) {
        Run saved = runRepository.save(run);
        return ResponseEntity.status(201).body(saved);
    }

    // PUT /api/runs/{id} → aggiorna corsa esistente
    @PutMapping("/{id}")
    public ResponseEntity<Run> update(@PathVariable Integer id, @RequestBody Run runDetails) {
        Optional<Run> existing = runRepository.findById(id);
        if (existing.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Run run = existing.get();
        run.setTitle(runDetails.getTitle());
        run.setStartedOn(runDetails.getStartedOn());
        run.setCompletedOn(runDetails.getCompletedOn());
        run.setMiles(runDetails.getMiles());
        run.setLocation(runDetails.getLocation());
        Run updated = runRepository.save(run);
        return ResponseEntity.ok(updated);
    }

    // DELETE /api/runs/{id} → elimina corsa
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!runRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        runRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}