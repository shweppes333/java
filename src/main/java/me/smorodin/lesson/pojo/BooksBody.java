package me.smorodin.lesson.pojo;

import me.smorodin.lesson.entity.Author;
import me.smorodin.lesson.entity.Reader;

import java.time.LocalDate;
import java.util.Set;

public class BooksBody {

    private String title;
    private Long authorId;
    private LocalDate publishedDate;
    private Set<Reader> readers;

    public BooksBody() {
    }

    public BooksBody(String title, Long authorId, LocalDate publishedDate) {
        this.title = title;
        this.authorId = authorId;
        this.publishedDate = publishedDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getAuthorId() {
        return authorId;
    }
    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Set<Reader> getReaders() {
        return readers;
    }

    public void setReaders(Set<Reader> readers) {
        this.readers = readers;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

}

