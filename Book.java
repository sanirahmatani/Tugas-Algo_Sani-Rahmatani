/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaan;

/**
 *
 * @author Sani Rahmatani
 */
public class Book {
     // Encapsulation: atribut dibuat private
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter dan Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Method untuk menampilkan info buku
    public String getInfo() {
        return "Judul: " + title +
               "\nPenulis: " + author +
               "\nISBN: " + isbn;
    }

    // Method display (akan dioverride nanti)
    public void display() {
        System.out.println(getInfo());
    }
}
