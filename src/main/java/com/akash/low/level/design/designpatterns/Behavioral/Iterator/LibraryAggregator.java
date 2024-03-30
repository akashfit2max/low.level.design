package com.akash.low.level.design.designpatterns.Behavioral.Iterator;

import java.util.List;

public class LibraryAggregator implements Aggrigator {
    private List<Book> books;

    public LibraryAggregator(List<Book> books) {
        this.books = books;
    }

    @Override
    public Iterator creatIterator() {
        return new BookIteratory(books);
    }
}
