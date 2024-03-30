package com.akash.low.level.design.designpatterns.Behavioral.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(new Book(100, "a"),
                new Book(100, "b"),
                new Book(600, "c"),
                new Book(200, "d"),
                new Book(300, "e"));

        Aggrigator library = new LibraryAggregator(bookList);
        Iterator iterator = library.creatIterator();

        while (iterator.hasNext()) {
            Book b = (Book) iterator.next();
            System.out.println(b.getBookName());
        }

    }
}
