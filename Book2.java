/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.book;

/**
 *
 * @author Administrator
 */
public class Main {
   
 
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();

        // Adding books
        Book book1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
        Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");

        collection.addBook(book1);
        collection.addBook(book2);

        // Displaying books
        collection.displayBooks();

        // Removing a book
        collection.removeBook("The C Programming Language");

        // Displaying books after removal
        collection.displayBooks();
    }
}
