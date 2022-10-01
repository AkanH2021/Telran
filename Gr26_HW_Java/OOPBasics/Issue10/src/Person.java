public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + " " + firstName + " " + lastName + " " + age + '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.age != o.age) {
            return this.age - o.age;
        }
        return 0;
    }

}
