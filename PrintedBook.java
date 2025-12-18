/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaan;

/**
 *
 * @author Sani Rahmatani
 */

public class PrintedBook extends Book implements Borrowable {

    // Atribut tambahan khusus PrintedBook
    private final int pages;
    private final double weight;
    private boolean available;

    // Constructor
    public PrintedBook(String title, String author, String isbn,
                       int pages, double weight) {
        super(title, author, isbn);
        this.pages = pages;
        this.weight = weight;
        this.available = true;
    }

    // Implementasi Borrowable
    @Override
    public void borrow() {
        if (available) {
            available = false;
            System.out.println("Buku cetak berhasil dipinjam.");
        } else {
            System.out.println("Buku cetak sedang tidak tersedia.");
        }
    }

    @Override
    public void returnBook() {
        available = true;
        System.out.println("Buku cetak berhasil dikembalikan.");
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    // Polymorphism: override display()
    @Override
    public void display() {
        System.out.println(getInfo());
        System.out.println("Jumlah Halaman: " + pages);
        System.out.println("Berat Buku: " + weight + " gram");
        System.out.println("Lokasi Rak: Rak A-3");
    }
}

