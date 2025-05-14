package me.smorodin.lesson.pojo;

import me.smorodin.lesson.entity.Books;

import java.util.Set;

public class ReaderBody {
    private String firstName;
    private String lastName;

    public ReaderBody(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

}
