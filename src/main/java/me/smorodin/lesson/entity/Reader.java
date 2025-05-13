package me.smorodin.lesson.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Reader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String firstName;

    @Column(nullable = false, length = 50)
    private String lastName;

    @Column(length = 100)
    private String contactInfo;

    private Integer purchasedBooksCount;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Books book;

    public Reader() {
    }

    public Reader(String firstName, String lastName, String contactInfo, Integer purchasedBooksCount, Books book) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = contactInfo;
        this.purchasedBooksCount = purchasedBooksCount;
        this.book = book;
    }

    public Long getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Integer getPurchasedBooksCount() {
        return purchasedBooksCount;
    }

    public void setPurchasedBooksCount(Integer purchasedBooksCount) {
        this.purchasedBooksCount = purchasedBooksCount;
    }

    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", purchasedBooksCount=" + purchasedBooksCount +
                ", book=" + (book != null ? book.getTitle() : "null") +
                '}';
    }
}


