package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "qwe";
        Book book1 = new Book();

        book1.author = "Tolstoy";
        book1.title = "Voyna i mir";
        book1.year = 1988;

                Book book2 = new Book();
        book2.author = "Bulgakov";
        book2.title = "Master i MArgarita";
        book2.year = 2005;

        Book[] books = {book1, book2};
        for (int i = 0; i < books.length; i++) {
            printBook(books[i]);
            }

    //    printBook(book1);
     //   printBook(book2);
    }

    public static void printBook(Book book) {
        System.out.println("Author : " + book.author);
        System.out.println("Title: " + book.title);
        System.out.println("Year : " + book.year);
        System.out.println();
    }

}
