import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();

        Book b1 = new Book("Пушкин", "Евгений Онегин", 7.8, 20);
        Book b2 = new Book("Пушкин", "Пиковая дама", 6.3, 18);
        Book b3 = new Book("Лем", "Солярис", 9.34, 23);
        Book b4 = new Book("Булгаков", "Мастер и Маргарита", 19.00, 25);

        Book[] books = {b1, b2, b3, b4};
        Arrays.sort(books, new BookComparatorByRating());
        print(books);

        List<Book> bookList1 = new LinkedList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);

        System.out.println(bookList.size());
        System.out.println(bookList.get(3));

        System.out.println("---------- for");
        for (Book book:bookList) {
            System.out.println(book);
        }

        System.out.println(bookList);

    }
    public static void print(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);

        }
    }
}
