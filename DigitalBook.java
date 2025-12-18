/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaan;

/**
 *
 * @author Sani Rahmatani
 */
public class DigitalBook extends Book implements Borrowable {

    // Atribut tambahan khusus DigitalBook
    private final double fileSize;
    private final String format;
    private boolean available;

    // Constructor
    public DigitalBook(String title, String author, String isbn,
                       double fileSize, String format) {
        super(title, author, isbn); // panggil constructor Book
        this.fileSize = fileSize;
        this.format = format;
        this.available = true;
    }

    // Implementasi method dari interface Borrowable
    @Override
    public void borrow() {
        if (available) {
            available = false;
            System.out.println("Buku digital berhasil dipinjam.");
        } else {
            System.out.println("Buku digital sedang tidak tersedia.");
        }
    }

    @Override
    public void returnBook() {
        available = true;
        System.out.println("Buku digital berhasil dikembalikan.");
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    // Polymorphism: override method display()
    @Override
    public void display() {
        System.out.println(getInfo());
        System.out.println("Ukuran File: " + fileSize + " MB");
        System.out.println("Format: " + format);
        System.out.println("Link Download: www.downloadbook.com");
    }
}
