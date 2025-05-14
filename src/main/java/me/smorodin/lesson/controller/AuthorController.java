package me.smorodin.lesson.controller;

import me.smorodin.lesson.repo.AuthorRepo;
import me.smorodin.lesson.entity.Author;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/authors")
public class AuthorController {
    private final AuthorRepo authorRepo;
    public AuthorController(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }
    @PostMapping("authors/create")
    public ResponseEntity<Author> createAuthor(@RequestBody Author author) {
        Author savedAuthor = authorRepo.save(author);
        return ResponseEntity.ok(savedAuthor);
    }


    @GetMapping("authors/all")
    public ResponseEntity<List<Author>> getAllAuthors() {
        List<Author> authors = (List<Author>) authorRepo.findAll();
        return ResponseEntity.ok(authors);
    }

    @PutMapping("authors/update/{id}")
    public ResponseEntity<Author> updateAuthor(@PathVariable Long id, @RequestBody Author authorDetails) {
        return authorRepo.findById(id)
                .map(author -> {
                    author.setName(authorDetails.getName());
                    Author updatedAuthor = authorRepo.save(author);
                    return ResponseEntity.ok(updatedAuthor);
                })
                .orElse(ResponseEntity.notFound().build());
    }

}