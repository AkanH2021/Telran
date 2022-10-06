package task2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    //  Дан список Person (String firstName, String lastName, int age) используя Stream получить map<String, Integer>,
//  где ключ ФИО в формате Иванов.И, значение возраст.
    public static void main(String[] args) {
        Person p1 = new Person("John", "Lennon", 23);
        Person p2 = new Person("Paul", "McCartney", 21);
        Person p3 = new Person("Ringo", "Starr", 23);
        Person p4 = new Person("George", "Harrison", 20);
        List<Person> beatles = new ArrayList<>();
        beatles.add(p1);
        beatles.add(p2);
        beatles.add(p3);
        beatles.add(p4);

        System.out.println(task2(beatles));
    }

    public static Map<String, Integer> task2(List<Person> people) {
        return people.stream().collect(Collectors.toMap(
                s -> s.getLastName() + " " +
                        s.nameShortage(), Person::getAge, (a, b) -> b));
    }

}
