package com.ttn.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {

    @Id
    Integer id;
    String firstName;
    String lastName;
    Integer roll;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Student_Book", joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    Set<Book> books = new HashSet<Book>();

    @OneToOne
    Address address;

    @ManyToMany
    Set<Course> courses = new HashSet<Course>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
