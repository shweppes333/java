package me.smorodin.lesson.entity;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;

    @ManyToMany
    @JoinTable(
            name = "readers_books",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "reader_id")
    )
    private Set<Reader> readers;

    @Column(name = "published_date")
    private LocalDate publishedDate;


    public Books(String title, Author author, Reader reader, LocalDate publishedDate) {
        this.title = title;
        this.author = author;
        this.publishedDate = publishedDate;
    }

    public Books() {

    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Reader> getReaders() {
        return readers;
    }
    public void setReaders(Set<Reader> readers) {
        this.readers = readers;
    }



    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public String toString() {
        StringBuilder readersNames = new StringBuilder();
        if (readers != null && !readers.isEmpty()) {
            for (Reader reader : readers) {
                readersNames.append(reader.getFirstName()).append(" ").append(reader.getLastName()).append(", ");
            }
            // Удаляем последнюю запятую и пробел
            if (!readersNames.isEmpty()) {
                readersNames.setLength(readersNames.length() - 2);
            }

        } else {
            readersNames.append("none");
        }
        return "Books{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + (author != null ? author.getName() : "null") +
                ", readers=" + readersNames.toString() +
                ", publishedDate=" + publishedDate +
                '}';
    }
}


