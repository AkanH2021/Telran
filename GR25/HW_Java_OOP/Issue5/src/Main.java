import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Computer computer1 = new Computer("Computer1", "AMD Ryzen 7 5700x", 16, 256, 505.50);
        Computer computer2 = new Computer("Computer2", "Intel Core i-7 8705G", 32, 512, 880.00);

        computer1.printComputerDetails();
        computer2.printComputerDetails();

        Computer[] computers = {computer1, computer2};

        Author author1 = new Author("Alexander","Pushkin", 1799 );
        Book book1 = new Book("Ruslan and Ludmila", author1, 2.38);

        Author author2 = new Author("Lev", "Tolstoy", 1828);
        Book book2 = new Book("Voina i mir", author2, 3.35);

        String assa = new String("qwertyu");
        String str = "ooiyoio";

     /*   author1.firstName = "Alexander";
        author1.lastName = "Pushkin";
        author1.yearOfBirth = 1799;
                                        */
     /*   book1.author = author1;
        book1.title = "Ruslan and Ludmila";
                                        */
        book1.print();
        book2.print();
    }
}