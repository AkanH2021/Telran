public class PracticePersons {
    String firstName;
    String lastName;

    public PracticePersons(String name, String surname) {
        firstName = name;
        lastName = surname;
    }

    public String toString() {
        String person = lastName + " " + firstName;
        return person;
    }
}
