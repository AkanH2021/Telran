package task5;

import java.util.*;

public class Main {
    /* 5)      Дан map<Author, List<Book>> (например, сформированный в задаче №3). Но в него вкрались ошибки, в список книг некоторых авторов попали книги, которые они не писали.
Необходимо: a) написать метод, который проверит, есть ли в map такие ошибки.
b)      написать метод, который исправит ошибки в исходном map.     */
    public static void main(String[] args) {
        Author a1 = new Author("Ivan", "Ivanov");
        Author a2 = new Author("Irina", "Ivanova");

        List<Author> allAuthors = new ArrayList<>();
        allAuthors.add(a1);
        allAuthors.add(a2);
        List<Author> singleAuthor1 = new ArrayList<>();
        singleAuthor1.add(a1);

        List<Author> singleAuthor2 = new ArrayList<>();
        singleAuthor2.add(a2);

        List<Book> books = new ArrayList<>();
        Book book1 = new Book("book1", "0-553-35448-5", allAuthors);   // Authors: a1 & a2
        Book book2 = new Book("book2", "0-553-56548-6", allAuthors);   //Authors: a1 & a2
        Book book3 = new Book("book3", "1-612-03103-X", singleAuthor1);   // Author:  a1
        Book book4 = new Book("book4", "0-451-02223-8", singleAuthor1);   // Author:  a1
        Book book5 = new Book("book5", "0-671-69874-5", singleAuthor2);   // Author:  a2
        Book book6 = new Book("book6", "0-441-37469-7", singleAuthor2);   // Author:  a2
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        System.out.println(books);
        System.out.println(task5(books));

        Map<Author, List<Book>> map = task5(books);
        map.get(new Author("Petr", "Petrov")).add(book2);

    }

    public static void correctAuthorsMap(Map<Author, List<Book>> map) {
        Set<Book> errorBooks = errorBookFindAndRemove(map);


    }

    private static Set<Book> errorBookFindAndRemove(Map<Author, List<Book>> map) {
        Set<Book> res = new HashSet<>();
        for (Map.Entry<Author, List<Book>> e : map.entrySet()) {
            List<Book> books = e.getValue();
            for (Book book : books) {
                if (isAuthor(book, e.getKey())) {
                        res.add(book);
                        books.remove(book);
                }
            }
        }
    }

    public static isAuthor()


}
