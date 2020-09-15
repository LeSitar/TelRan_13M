package de.telran.application;

import de.telran.dao.Library;
import de.telran.data.Book;

public class LibraryApp {
    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter", "Joan Rollings", 435, 2010);
        Book book2 = new Book("Winnie the Pooh", "Alex Milan", 256, 1957);
        Book book3 = new Book("Sherlock Holmes", "Artur Conan Doyle", 388, 1892);
        Book book4 = new Book("Little prince", "Antoine de Saint-Exupery", 200, 1943);

        Library myLib = new Library(100);

        System.out.println(myLib.getSize());
        myLib.addBook(book1);
        myLib.addBook(book2);
        myLib.addBook(book3);
        myLib.addBook(book4);
        System.out.println(myLib.getSize());
        myLib.addBook(new Book("War and Peace", "Lev Tolstoy", 678, 1886));

        myLib.deleteBook(book3);
        myLib.display();

        myLib.searchBookByAuthor("Alex Milan");
        myLib.searchBookByAuthor("Gogol");


    }
}
