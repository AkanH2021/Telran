package task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /* Предположим, дан список поступивших в библиотеку книг. Если пришло несколько экземпляров одной и той же книг, в
списке присутствует соответствующее количество одинаковых записей. Необходимо сформировать Map<Book, Integer>, где ключ
это книга, значение, сколько раз она встречается в списке, т.е. сколько пришло экземпляров. */

        Book book1 = new Book("M. Lermontov", "A Hero of Our Time");
        Book book2 = new Book("M. Lermontov", "Demon");
        Book book3 = new Book("M. Lermontov", "Angel of Death");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book2);
        bookList.add(book1);
        bookList.add(book1);
        System.out.println(bookList);

        System.out.println(task4a(bookList));
    }

    public static Map<Book, Integer> task4a(List<Book> bookList) {
        Map<Book, Integer> map = new HashMap<>();
        int counter = 1;
        for (Book book : bookList) {
            if (map.containsKey(book)) {
                map.replace(book, map.get(book) + counter);
            } else {
                map.put(book, counter);
            }
        }
        return map;
    }
}