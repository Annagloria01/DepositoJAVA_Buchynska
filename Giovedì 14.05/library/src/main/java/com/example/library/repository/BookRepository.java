package com.example.library.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.library.model.Book;
import com.example.library.model.Genre;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    
    // 1. Trova libri per autore (esatto)
    List<Book> findByAuthor(String author);

    // 2. Trova libri che contengono una determinata parola nel titolo (Case Insensitive)
    List<Book> findByTitleContainingIgnoreCase(String titlePart);

    // 3. Trova libri di un certo genere con un numero di pagine superiore a una soglia
    List<Book> findByGenreAndPagesGreaterThan(Genre genre, Integer minPages);

    // 4. Trova il libro con il maggior numero di pagine (Restituisce il primo risultato della lista ordinata)
    Optional<Book> findFirstByOrderByPagesDesc();

    // 5. Trova libri il cui autore inizia con un prefisso specifico
    List<Book> findByAuthorStartingWith(String prefix);

    // 6. Query personalizzata in JPQL: Cerca libri per genere e li ordina per titolo
    @Query("SELECT b FROM Book b WHERE b.genre = :genre ORDER BY b.title ASC")
    List<Book> findAllBooksInGenreOrderedByTitle(@Param("genre") Genre genre);
}