package me.smorodin.lesson.pojo;

import me.smorodin.lesson.entity.Books;

public class ReaderBody {
    private String firstName;
    private String lastName;
    private String contactInfo;
    private Integer purchasedBooksCount;
    private Books book;

    public ReaderBody(String firstName, String lastName, String contactInfo, Integer purchasedBooksCount, Books book) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = contactInfo;
        this.purchasedBooksCount = purchasedBooksCount;
        this.book = book;
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
}
