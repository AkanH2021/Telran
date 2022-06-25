public class Book {

    //2. Make class Book. It should contain two fields: author and title. The author is a Class with the following field firstName, lastName, yearOfBirth.
// Implement the method of printing the Book

    String title;
    Author author;
    double price;

    public Book(String t, Author a, double p){
        title = t;
        author = a;
        price = p;
    }

    public void print(){
        System.out.println("Author:" + author.firstName + " " + author.lastName + " ");
        System.out.println("Title:" + title);
        System.out.println("Price:" + price);
    }

}