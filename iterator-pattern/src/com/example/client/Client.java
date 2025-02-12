package com.example.client;

import com.example.aggregator.Aggregator;
import com.example.book.Book;
import com.example.iterator.Iterator;
import com.example.library.Library;

public class Client {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Design Patterns"));
        library.addBook(new Book("Clean Code"));
        library.addBook(new Book("Head First Java"));

        Aggregator libAggregator = library;
        Iterator iterator = libAggregator.createIterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
