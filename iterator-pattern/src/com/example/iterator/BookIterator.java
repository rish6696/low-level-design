package com.example.iterator;

import java.util.List;

import com.example.book.Book;

public class BookIterator implements Iterator {

    List<Book> books;
    int index = 0;

    public BookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Object next() {
        return books.get(index++);
    }

}
