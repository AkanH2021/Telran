package task2;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String nameShortage() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            result.append((i < 1) ? getFirstName().charAt(i) : '.');
        }
        return result.toString();
    }
}
