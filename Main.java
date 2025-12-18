/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaan;

/**
 *
 * @author Sani Rahmatani
 */

public class Main {
    public static void main(String[] args) {

        // Polymorphism: objek subclass disimpan sebagai Book
        Book book1 = new DigitalBook(
                "Pemrograman Java",
                "Andi",
                "ISBN001",
                5.5,
                "PDF"
        );

        Book book2 = new PrintedBook(
                "Struktur Data",
                "Budi",
                "ISBN002",
                350,
                500
        );

        // Panggil method display()
        System.out.println("=== Digital Book ===");
        book1.display();

        System.out.println("\n=== Printed Book ===");
        book2.display();

        // Borrowable
        System.out.println("\n=== Proses Peminjaman ===");
        Borrowable borrow1 = (Borrowable) book1;
        borrow1.borrow();
        borrow1.returnBook();

        Borrowable borrow2 = (Borrowable) book2;
        borrow2.borrow();
    }
}

