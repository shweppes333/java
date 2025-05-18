package me.smorodin.lesson.controller;

import me.smorodin.lesson.repo.BooksRepo;
import me.smorodin.lesson.repo.ReaderRepo;
import me.smorodin.lesson.pojo.ReaderBody;
import me.smorodin.lesson.entity.Reader;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
public class ReaderController {
    private final ReaderRepo readerRepo;
    private final BooksRepo booksRepo;

    public ReaderController(ReaderRepo readerRepo, BooksRepo booksRepo) {
        this.readerRepo = readerRepo;
        this.booksRepo = booksRepo;
    }

    @PostMapping("/reader/create")
    public ResponseEntity<Reader> createReader(@RequestBody ReaderBody readerBody) {
        Reader reader = new Reader();
        reader.setFirstName(readerBody.getFirstName());
        reader.setLastName(readerBody.getLastName());
        readerRepo.save(reader);
        return ResponseEntity.ok(reader);
    }

    @GetMapping("/reader/all")
    public ResponseEntity<List<Reader>> getReaders() {
        List<Reader> reader = (List<Reader>) readerRepo.findAll();
        return ResponseEntity.ok(reader);
    }
}
