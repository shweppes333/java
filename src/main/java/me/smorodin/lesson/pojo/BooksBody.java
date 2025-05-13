package me.smorodin.lesson.pojo;

import me.smorodin.lesson.entity.Author;

import java.time.LocalDate;

public class BooksBody {

    private String title;
    private Long authorId;
    private String isbn;
    private LocalDate publishedDate;

    public BooksBody() {
    }

    public BooksBody(String title, Long authorId, String isbn, LocalDate publishedDate) {
        this.title = title;
        this.authorId = authorId;
        this.isbn = isbn;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

}

