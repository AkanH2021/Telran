import java.util.Arrays;

public class Main {
    // Create an array of Person (firstName, lastName, age). Sort the by Person’s age using the Arrays.sort() method.

    public static void main(String[] args) {

        Person p1 = new Person("Ivan", "Ivanov", 30);
        Person p2 = new Person("Mihail", "Petrov", 39);
        Person p3 = new Person("Maria", "Petrova", 29);
        Person p4 = new Person("Irina", "Mihaylova", 33);
        Person p5 = new Person("Irina", "Petrova", 29);
        Person p6 = new Person("Ivan", "Ivanov", 31);

        Person[] persons = new Person[] {p1,p2,p3,p4,p5,p6};
        System.out.println(Arrays.toString(persons));
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
    }
}
