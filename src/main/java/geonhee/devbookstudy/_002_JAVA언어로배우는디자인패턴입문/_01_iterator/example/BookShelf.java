package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._01_iterator.example;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {

    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        books[last++] = book;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
