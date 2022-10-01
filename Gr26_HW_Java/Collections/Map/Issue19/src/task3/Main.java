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
        books.add(new Book("book1", "0-553-35448-5", allAuthors));          // Authors: a1 & a2
        books.add(new Book("book2", "0-553-56548-6", allAuthors));          // Authors: a1 & a2
        books.add(new Book("book3", "1-612-03103-X", singleAuthor1));       // Author:  a1
        books.add(new Book("book4", "0-451-02223-8", singleAuthor1));       // Author:  a1
        books.add(new Book("book5", "0-671-69874-5", singleAuthor2));       // Author:  a2
        books.add(new Book("book6", "0-441-37469-7", singleAuthor2));       // Author:  a2

        System.out.println(books);
        System.out.println(task3(books));

        Map<Author, List<Book>> map = task3(books);
        for (Map.Entry e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

    public static Map<Author, List<Book>> task3(List<Book> list) {
        Map<Author, List<Book>> res = new HashMap<>();
        if (list != null && !list.isEmpty()) {
            for (Book book : list) {   //бежим по списку книг, берем каждого автора,
                List<Author> authors = book.getAuthors();  // создаем список авторов, взяв каждого автора из цикла
                if (authors != null) { //если автор естъ
                    for (Author author : authors) {  //бежим по списку авторов
                        List<Book> books = res.getOrDefault(author, new ArrayList<>());  //делаем список из книг каждого автора отделъно
                        //getOrDefault - если значение естъ, то добавляет его, если нет значения, делает новое поле
                        books.add(book);
                        res.put(author, books);
                    }
                } else {
                    List<Book> books = res.getOrDefault(null, new ArrayList<>());
                    books.add(book);
                    res.put(null, books);
                }
            }
        }
        return res;
    }
}
