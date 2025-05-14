package me.smorodin.lesson.controller;

import me.smorodin.lesson.entity.Books;
import me.smorodin.lesson.repo.BooksRepo;
import me.smorodin.lesson.repo.AuthorRepo;
import me.smorodin.lesson.pojo.BooksBody;
import me.smorodin.lesson.entity.Author;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class BookController {
    private final BooksRepo bookRepo;
    private final AuthorRepo authorRepo;
    public BookController(BooksRepo bookRepo, AuthorRepo authorRepo) {
        this.bookRepo = bookRepo;
        this.authorRepo = authorRepo;
    }



    @PostMapping("/books/create")
    public ResponseEntity<?> createBook(@RequestBody BooksBody bookBody) {

        Optional<Author> authorOpt = authorRepo.findById(bookBody.getAuthorId());
        if (authorOpt.isEmpty()) {
            return ResponseEntity.badRequest().body("Author with id " + bookBody.getAuthorId() + " not found");
        }

        Books book = new Books();
        book.setTitle(bookBody.getTitle());
        book.setAuthor(authorOpt.get());
        book.setReaders(book.getReaders());
        bookRepo.save(book);
        return ResponseEntity.ok(book);
    }

    @GetMapping("/books/all")
    public ResponseEntity<List<Books>> getAllBooks() {
        List<Books> booksList = (List<Books>) bookRepo.findAll();
        return ResponseEntity.ok(booksList);
    }

    @PutMapping("/books/update/{id}")
    public ResponseEntity<?> updateBook(@PathVariable Long id, @RequestBody BooksBody bookBody) {
        Optional<Books> bookOpt = bookRepo.findById(id);
        if (bookOpt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Optional<Author> authorOpt = authorRepo.findById(bookBody.getAuthorId());
        if (authorOpt.isEmpty()) {
            return ResponseEntity.badRequest().body("Author with id " + bookBody.getAuthorId() + " not found");
        }
        Books book = bookOpt.get();
        book.setTitle(bookBody.getTitle());
        book.setAuthor(authorOpt.get());
        book.setPublishedDate(bookBody.getPublishedDate());
        bookRepo.save(book);
        return ResponseEntity.ok(book);
    }
}