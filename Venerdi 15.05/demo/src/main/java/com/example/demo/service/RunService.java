package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.exception.RunNotFoundException;
import com.example.demo.model.Run;
import com.example.demo.model.RunRequest;
import com.example.demo.model.RunResponse;
import com.example.demo.repository.RunRepository;

@Service
public class RunService {

    private final RunRepository runRepository;

    // Iniezione via costruttore
    public RunService(RunRepository runRepository) {
        this.runRepository = runRepository;
    }

    public List<RunResponse> findAll() {
        return runRepository.findAll()
                .stream()
                .map(this::toResponse) // converte ogni Run in RunResponse
                .toList();
    }

    public RunResponse findById(Integer id) {
        Run run = runRepository.findById(id)
                .orElseThrow(() -> new RunNotFoundException(id));
        return toResponse(run);
    }

    public RunResponse save(RunRequest request) {
        Run run = toEntity(request);         // converte RunRequest in Run
        Run saved = runRepository.save(run); // salva nel DB
        return toResponse(saved);            // restituisce RunResponse
    }

    public void deleteById(Integer id) {
        // Verifica che la corsa esista prima di eliminarla
        if (!runRepository.existsById(id)) {
            throw new RunNotFoundException(id);
        }
        runRepository.deleteById(id);
    }

    public RunResponse update(Integer id, RunRequest request) {
        Run existing = runRepository.findById(id)
                .orElseThrow(() -> new RunNotFoundException(id));

        // Aggiorna i campi dell'entità esistente con i dati del DTO
        existing.setTitle(request.title());
        existing.setStartedOn(request.startedOn());
        existing.setCompletedOn(request.completedOn());
        existing.setMiles(request.miles());
        existing.setLocation(request.location());

        Run updated = runRepository.save(existing);
        return toResponse(updated);
    }

    // Mapping: RunRequest -> Run (entità JPA)
    private Run toEntity(RunRequest request) {
        Run run = new Run(); 
        run.setTitle(request.title());
        run.setStartedOn(request.startedOn());
        run.setCompletedOn(request.completedOn());
        run.setMiles(request.miles());
        run.setLocation(request.location());
        return run;
    }

    // Mapping: Run (entità JPA) -> RunResponse
    private RunResponse toResponse(Run run) {
        return new RunResponse(
                run.getId(),
                run.getTitle(),
                run.getStartedOn(),
                run.getCompletedOn(),
                run.getMiles(),
                run.getLocation() != null ? run.getLocation().name() : null // converte l'enum in stringa in sicurezza
        );
    }
}