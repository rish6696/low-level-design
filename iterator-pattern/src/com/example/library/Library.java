package com.example.library;

import com.example.book.Book;
import com.example.iterator.BookIterator;
import com.example.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;
import com.example.aggregator.Aggregator;

public class Library implements Aggregator {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(books);
    }
}
