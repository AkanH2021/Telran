package task3;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        /*Предположим, что дан список Book, но в отличие от предыдущей задачи Author – класс {String fName, String lName}
        и книга более сложный объект, у которого есть список авторов, название и ISBN (International Standard Book Number)
        т.е. {String title, List<Author> authors, String ISBN}. Необходимо сформировать map<Author, List<Book>>,
        где ключ - автор, а значение список его книг.
        Естественно, если у книги несколько авторов, то книга должна отразиться в списке книг всех авторов данной книги.*/
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
        books.add(new Book("book1", allAuthors, "0-553-35448-5"));          // Authors: a1 & a2
        books.add(new Book("book2", allAuthors, "0-553-56548-6"));          // Authors: a1 & a2
        books.add(new Book("book3", singleAuthor1, "1-612-03103-X"));       // Author:  a1
        books.add(new Book("book4", singleAuthor1, "0-451-02223-8"));       // Author:  a1
        books.add(new Book("book5", singleAuthor2, "0-671-69874-5"));       // Author:  a2
        books.add(new Book("book6", singleAuthor2, "0-441-37469-7"));       // Author:  a2

        System.out.println(task3(books));
    }

    public static Map<List<Author>, List<String>> task3 (List<Book> list) {
        Map<List<Author>, List<String>> result = new HashMap<>();
        if (list!=null && !list.isEmpty()) {
            for (Book book : list) {
                List<String> value = result.get(book.getAuthors());
                if (value==null) {
                    value = new ArrayList<>();
                }
                value.add(book.getTitle());
                result.put(book.getAuthors(), value);
            }
        }
        return result;
    }
}
