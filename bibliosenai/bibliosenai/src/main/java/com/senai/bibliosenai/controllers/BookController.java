package com.senai.bibliosenai.controllers;

import com.senai.bibliosenai.dtos.request.response.CreateBookDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    // Lista para armazenar os livros em memória
    private List<CreateBookDto> books = new ArrayList<>();

    // Método para criar um livro (POST)
    @PostMapping
    public ResponseEntity<String> createBook(@RequestBody CreateBookDto book) {
        books.add(book);
        return ResponseEntity.status(HttpStatus.CREATED).body("Book created successfully: " + book.getTitle());
    }

    // Método para obter todos os livros (GET)
    @GetMapping
    public ResponseEntity<List<CreateBookDto>> getBooks() {
        return ResponseEntity.ok(books);
    }

    // Método para deletar um livro (DELETE)
    @DeleteMapping
    public ResponseEntity<String> deleteBook(@RequestBody CreateBookDto book) {
        books.remove(book);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Book deleted successfully");
    }
}
