package com.example.library.controller;

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

import com.example.library.model.Book;
import com.example.library.repository.BookRepository;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookRepository bookRepository;

    //iniezione tramite costruttore
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // GET /api/books → lista di tutti i libri
    @GetMapping
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    // GET /api/books/{id} → singolo libro
    @GetMapping("/{id}")
    public ResponseEntity<Book> findById(@PathVariable Integer id) {
        Optional<Book> run = bookRepository.findById(id);
        return run.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // POST /api/books → crea nuovo libro
    @PostMapping
    public ResponseEntity<Book> create(@RequestBody Book book) {
        book.setId(null);
        Book saved = bookRepository.save(book);
        return ResponseEntity.status(201).body(saved);
    }

    // PUT /api/runs/{id} → aggiorna libro esistente
    @PutMapping("/{id}")
    public ResponseEntity<Book> update(@PathVariable Integer id, @RequestBody Book bookDetails) {
        Optional<Book> existing = bookRepository.findById(id);
        if (existing.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Book book = existing.get();
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        book.setPages(bookDetails.getPages());
        book.setGenre(bookDetails.getGenre());
        Book updated = bookRepository.save(book);
        return ResponseEntity.ok(updated);
    }

    // DELETE /api/runs/{id} → elimina corsa
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!bookRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        bookRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
