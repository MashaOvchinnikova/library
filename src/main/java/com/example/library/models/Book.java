package com.example.library.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="table_books")
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    public String author;
    public String name;

    public Book (String name, String author)
    {
        this.name = name;
        this.author = author;
    }
    public Book () {}
}
