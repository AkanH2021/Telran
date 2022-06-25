//Create a class Person with following fields: String firstName, String lastName, MyDate birthday.
// a. Implement the constructor method.
// b. Implement String toString() method, that returns the String something like “Ivanov Ivan [21-15-2022]”

public class Person {
    String firstName;
    String lastName;
    MyDate myDate;

    public Person(String name, String surname, MyDate birth) {
        firstName = name;
        lastName = surname;
        myDate = birth;
    }

    public String toString() {
        String person = lastName + " " + firstName + " [" + myDate+ "]";
        return person;
    }
}