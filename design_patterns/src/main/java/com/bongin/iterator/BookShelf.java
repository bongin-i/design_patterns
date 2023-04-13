package com.bongin.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate{

    private List<Book> books;

    public BookShelf() {
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        if(books == null) {
            books = new ArrayList<>();
        }
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
