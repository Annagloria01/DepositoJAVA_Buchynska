package com.esercizio.gestioneprodotti.RestController;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esercizio.gestioneprodotti.Run.Run;



@RestController
@RequestMapping("/api/runs")
public class RunController {

   // Lista in memoria per simulare un database
    private final List<Run> runs = new ArrayList<>();

    // GET /api/runs -> Recupera la lista completa
    @GetMapping
    public ResponseEntity<List<Run>> findAll() {
        return ResponseEntity.ok(runs);
    }

    // GET /api/runs/{id} -> Recupera una singola corsa 
    @GetMapping("/{id}")
    public ResponseEntity<Run> findById(@PathVariable int id) {
          if (id < 0 || id >= runs.size()) {
            return ResponseEntity.notFound().build(); 
            }

             return ResponseEntity.ok(runs.get(id));
        }

    // POST /api/runs -> Crea una nuova corsa
    @PostMapping
    public ResponseEntity<Run> create(@RequestBody Run newRun) {
        runs.add(newRun);
        return ResponseEntity.status(HttpStatus.CREATED).body(newRun); // 201 Created
    }

    // PUT /api/runs/{id} -> Aggiorna una corsa esistente
    @PutMapping("/{id}")
    public ResponseEntity<Run> update(@PathVariable int id, @RequestBody Run updatedRun) {
        for (int i = 0; i < runs.size(); i++) {
            if (runs.get(i).id().equals(id)) {
                runs.set(i, updatedRun); // Sostituisce il record
                return ResponseEntity.ok(updatedRun); // 200 OK
            }
        }
        return ResponseEntity.notFound().build();
    }

    // DELETE /api/runs/{id} -> Elimina una corsa
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        for (int i = 0; i < runs.size(); i++) {
            if (runs.get(i).id().equals(id)) {
                runs.remove(i);
                return ResponseEntity.noContent().build(); // 204 No Content
            }
        }
        return ResponseEntity.notFound().build();
    }
}