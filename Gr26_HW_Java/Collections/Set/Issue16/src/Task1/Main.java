package Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
/* 1.Дан лист Вook{String title, Task1.Author author}. Естественно, один автор Task1.Author{firstName, lastName} может
 быть автором нескольких книг. Необходимо получить список всех авторов. */

        Author author1 = new Author("Mihail", "Bulgakov");
        Author author2 = new Author("Nikolay", "Gogol");
        Author author3 = new Author("Fedor", "Dostoevsky");
        Author author4 = new Author("Alexander", "Griboedov");

        Book book1 = new Book("Master i Margarita", author1);
        Book book2 = new Book("Sobachye serdtse", author1);
        Book book3 = new Book("Mertvye dushi", author2);
        Book book4 = new Book("Revizor", author2);
        Book book5 = new Book("Prestuplenie i nakazanie", author3);
        Book book6 = new Book("Gore ot uma", author4);
        Book book7 = new Book("Mertvye dushi", author4); //test book with same title as book3 - testing for repeating title;
        Book book8 = new Book("Mertvye dushi", author2); //test book with same title&author as book3 - testing for repeating both;

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        bookList.add(book8);

        System.out.println(task1(bookList));
        System.out.println(task1a(bookList));

    }

    public static Set<Author> task1(List<Book> bookList) { // return authors name list;
        Set<Author> authorSet = new HashSet<>();
        for (Book b : bookList) {
            authorSet.add(b.getAuthor());
        }
        return authorSet;
    }

    public static Set<String> task1a(List<Book> bookList) { //return books title list;
        Set<String > titleSet = new TreeSet<>();  //chosen set type as Treeset for alphabetically  ordered result
        for (Book b : bookList) {
            titleSet.add(b.getTitle());
        }
        return titleSet;
    }


}
