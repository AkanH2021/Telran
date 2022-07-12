package task3;

import java.util.List;

public class Book {
    private String title;
    private List<Author> authors;
    private String ISBN;

    public Book(String title, List<Author> authors, String ISBN) {
        this.title = title;
        this.authors = authors;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthors() {
        return authors.toString();
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Author: " + getAuthors() + " title: " + getTitle() + ", ISBN= " + getISBN() + System.lineSeparator();
    }
}
