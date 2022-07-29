package task8;

public class Person implements Comparable<Person> {
    private String name;
    private MyDate birthday;

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return this.name;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(getBirthday().getYear(), person.getBirthday().getYear());
    }
}
