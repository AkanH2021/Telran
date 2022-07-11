package task4;

import java.util.List;

public class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle(List<Book> bookList) {
        return title;
    }

    @Override
    public String toString() {
        return author + ", " + title + System.lineSeparator();
    }
}