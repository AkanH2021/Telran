package task2;

import java.util.*;

public class Main {
    /* 2)     Дан список Book{String author, String title}. Необходимо сформировать map<String, List<String>> , где ключом будет автор, а
значением - список книг данного автора. */
    public static void main(String[] args) {

        Book book1 = new Book("M. Lermontov", "A Hero of Our Time");
        Book book2 = new Book("M. Lermontov", "Demon");
        Book book3 = new Book("M. Lermontov", "Angel of Death");
        Book book4 = new Book("M. Lermontov", "Mongo");
        Book book5 = new Book("M. Lermontov", "Death of the Poet");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);

        System.out.println(task2a(bookList));
    }

    public static Map<String, List<String>> task2a(List<Book> bookList) { //from Alena
        Map<String, List<String>> res = new HashMap<>();
        List<String> titleList = new ArrayList<>();
        if (bookList.isEmpty() || bookList.contains(null)) return res;

        for (Book book : bookList) {
            if (!res.containsKey(book.getAuthor())) {
                titleList.add(book.getTitle(bookList));
                res.put(book.getAuthor(), titleList);
            } else {
                titleList.add(book.getTitle(bookList));
            }
        }
        return res;
    }
}