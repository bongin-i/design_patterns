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

    /**
     * 这样写的好处就是不需要知道BookShelf，也就是当前集合的具体实现方法是什么
     * 没有这样的方法就会有些耦合性，比如数组获取长度就是length，list就是size。
     * @return
     */
    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
