package com.example.library.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "pages", nullable = false)
    private Integer pages;

    @Enumerated(EnumType.STRING)
     @Column(name = "genre", nullable = false)
    private Genre genre;

    // Costruttore no-arg richiesto da JPA/Hibernate
    protected Book() {
    }

    // Costruttore completo con validazione
    public Book(String title, String author, Integer pages, Genre genre) {
        if (title == null || title.isBlank()) throw new IllegalArgumentException("Il titolo è obbligatorio");
        if (author == null || author.isBlank()) throw new IllegalArgumentException("L'autore è obbligatorio");
        if (pages == null || pages <= 0) throw new IllegalArgumentException("Il numero di pagine deve essere positivo");
        if (genre == null) throw new IllegalArgumentException("Il genere è obbligatorio");

        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }

    // Getter e Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}