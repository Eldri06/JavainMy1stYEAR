/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.book;

/**
 *
 * @author Administrator
 */
class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return title + " by " + author + ", ISBN: " + ISBN;
    }
}

class BookCollection {
    private Book[] books;
    private int size;
    private static final int MAX_SIZE = 10;

    public BookCollection() {
        this.books = new Book[MAX_SIZE];
        this.size = 0;
    }

    public void addBook(Book book) {
        if (size < MAX_SIZE) {
            books[size] = book;
            size++;
        } else {
            System.out.println("Cannot add more books. Collection is full.");
        }
    }

    public void removeBook(String titleToRemove) {
        int indexToRemove = -1;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(titleToRemove)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            System.out.println("Removed: " + books[indexToRemove]);
            for (int i = indexToRemove; i < size - 1; i++) {
                books[i] = books[i + 1];
            }
            books[size - 1] = null;
            size--;
        } else {
            System.out.println("Book with title " + titleToRemove + " not found.");
        }
    }

    public void displayBooks() {
        System.out.println("List of books:");
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
}

